;(function() {
    angular
        .module('app', ['ngRoute', 'ui.bootstrap', 'oitozero.ngSweetAlert'])
        .config(['$routeProvider', function($routeProvider) {
            addRoutes($routeProvider);
        }]);

    function addRoutes($routeProvider) {
        $routeProvider
            .when('/movimentos/lista', {
                templateUrl: 'views/listarMovimentos.html',
                controller: 'MovimentosController',
                controllerAs: 'vm'
            })
            .otherwise({
                redirectTo: '/movimentos/lista'
            });
    }
})();
