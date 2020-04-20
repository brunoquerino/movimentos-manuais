;
(function () {
    angular
            .module('app')
            .controller('MovimentosController', ['SweetAlert', 'MovimentoService', 'ProdutoService', '$scope', '$timeout', function (SweetAlert, MovimentoService, ProdutoService, $scope, $timeout) {
                    var vm = this;
                    vm.produtos = [];
                    vm.listaCosif = [];
                    vm.movimentos = [];
                    vm.novoHabilitado = false;
                    vm.formMovimento = {};
                    ProdutoService.lista().then(function (dataProduto) {
                        vm.produtos = dataProduto;
                    });
                    carregaMovimentos();
                    vm.incluir = function (formData) {
                        formData.valor = formData.valor.replace(/[^0-9,]/g, "");
                        formData.valor = formData.valor.replace(/,/g, ".");
                        MovimentoService.save(formData).then(function (response) {
                            vm.novoHabilitado = false;
                            vm.formMovimento = {};
                            carregaMovimentos();
                        }, function (response) {
                            carregaMovimentos();
                            SweetAlert.swal({
                                title: 'Erro na Inclusão',
                                text: response.data.mensagem,
                                type: 'error'
                            });
                        });
                    };
                    vm.habilitarNovo = function(){
                            vm.novoHabilitado = true;
                    };


                    $scope.$watch('vm.formMovimento.codigo_produto', function (newCodigoProd, oldCodigoProd) {
                        vm.listaCosif = [];
                        if (angular.isDefined(newCodigoProd) && newCodigoProd) {
                            ProdutoService.getListCosif(newCodigoProd).then(function (listaCosif) {
                                vm.listaCosif = listaCosif;
                            }, function (response) {
                                SweetAlert.swal({
                                    title: 'Erro ao carregar lista de COSIF',
                                    text: response.data.mensagem,
                                    type: 'error'
                                });
                            });
                        }
                    });
                    function carregaMovimentos() {
                        MovimentoService.get().then(function (response) {
                            vm.movimentos = response.data;
                        }, function (response) {
                            SweetAlert.swal({
                                title: 'Erro ao carregar lista de Movimentos',
                                text: response.data.mensagem,
                                type: 'error'
                            });
                        });
                    }

                    return vm;
                }]);
})();
