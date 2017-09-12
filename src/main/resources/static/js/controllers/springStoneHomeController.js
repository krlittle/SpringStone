springStoneApplication.controller('SpringStoneHomeController', ['$scope', '$http', 'CardSearchService', function($scope, $http, CardSearchService) {
    $scope.cardSearchResponse = '';

    $scope.cardName = '';

    $scope.search = function() {
        CardSearchService.search($scope.cardName).then(function(response) {
            $scope.cardSearchResponse = response.data;
            console.log($scope.cardSearchResponse);
        });
    }
}]);