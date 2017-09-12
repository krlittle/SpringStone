springStoneApplication.service('CardSearchService', ['$http', function ($http) {

    this.search = function (cardName) {
        return $http.get("/cards/" + cardName);
    };
}]);