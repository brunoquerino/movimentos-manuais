;(function() {
    angular
        .module('app')
        .service('ProdutoService', ['$http','$q', function($http,$q) {
            return {
                lista: function() {
                    var deferred = $q.defer();
                    $http.get('/api/produtos').then(function(response){
                        deferred.resolve(response.data.map(function(produto){
                            return {
                                'codigo':produto.codigo_produto,
                                'descricao':produto.descricao_produto
                            };
                        }));
                    },function(responseError){
                        deferred.reject(responseError);
                    });
                    return deferred.promise;
                },
                getListCosif: function(codigo_produto) {
                    var deferred = $q.defer();
                    $http.get('/api/produtos/'+codigo_produto+'/cosifs').then(function(response){
                        deferred.resolve(response.data.map(function(cosif){
                            return {
                                'codigo':cosif.codCosif,
                                'classificacao':cosif.codClassificacao
                            };
                        }));
                    },function(responseError){
                        deferred.reject(responseError);
                    });
                    return deferred.promise;
                }
            };
        }]);
})();
