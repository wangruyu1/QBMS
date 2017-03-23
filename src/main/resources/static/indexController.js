// get ag-Grid to create an Angular module and register the ag-Grid directive
agGrid.initialiseAgGridWithAngular1(angular);

// create your module with ag-Grid as a dependency
angular.module("QBMS", ['toaster', 'ngAnimate', 'QBMS.services',"QBMS.controllers", "QBMS.router", 'agGrid', 'ui.bootstrap'])

    .controller("IndexController", function ($rootScope, $scope, toaster,$window, Service) {
        $scope.user = {};
        $scope.menus = [];

        queryUser();

        //获取用户信息
        function queryUser() {
            Service.user.get(function (data) {
                if (data.menus == undefined) {
                    $window.location.href = "/login.html";
                } else if (data.result == undefined) {
                    $scope.user = data;
                    $scope.menus = data.menus;
                } else {
                    toaster.pop('error', data.message);
                }
            });
        }

    })
