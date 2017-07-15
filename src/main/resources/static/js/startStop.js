var module = angular.module("myAng", []);

module.controller("cntr", function ($scope, $http) {
    var self = $scope;

    self.loadData = function () {
        $http.get("/refresh").then(function (response) {
            self.ticker = response.data;
        });
    }

});


















