;(function() {
    angular
        .module('app')
        .service('MovimentoService', ['$http', function($http) {
            return {
                get: function() {
                    return $http.get('/api/movimentos');
                },
                save: function(data) {
                    return $http.post('/api/movimentos', data);
                }
            };
        }]);
})();
