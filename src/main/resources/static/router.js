angular.module("QBMS.router", ['ui.router'])

    .config(function ($stateProvider, $urlRouterProvider) {
        //
        // For any unmatched url, redirect to /state1
        // $urlRouterProvider.otherwise("/view1");
        //
        // Now set up the states
        $stateProvider
            .state('overview', {
                url: "/overview",
                templateUrl: "pages/overview/overview.html",
                controller: "OverviewController",
            })
            .state('category', {
                url: "/category",
                templateUrl: "pages/category/papercategory.html",
                controller: "CategoryController",
            })
            .state('subjectDifficulty', {
                url: "/subjectDifficulty",
                templateUrl: "pages/subjectDifficulty/subjectDifficulty.html",
                controller: "SubjectDifficultyController",
            })
    });
