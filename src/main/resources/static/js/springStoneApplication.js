var springStoneApplication = angular.module('springStoneApplication', ['ngRoute']);

springStoneApplication.config(['$routeProvider',
  function ($routeProvider) {
        $routeProvider.
        when('/', {
            templateUrl: 'partials/home.html',
            controller: 'SpringStoneHomeController'
        }).otherwise({
            redirectTo: '/'
        });
}]);