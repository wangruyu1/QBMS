angular.module("QBMS.services", ['ngResource'])

    .config(['$resourceProvider', function ($resourceProvider) {
        // Don't strip trailing slashes from calculated URLs
        $resourceProvider.defaults.stripTrailingSlashes = false;
    }])

    .factory("Service", function ($resource) {
        var service = {
            user: $resource("/user", {}, {}),
            logout: $resource("user/logout", {}, {}),

            //试卷分类
            paperCategory: $resource("/paper/category/:id", {}, {modify: {method: "PUT", isArray: false}}),
            paperCategories: $resource("/paper/categories", {}, {}),

            //试卷难度
            subjectDifficulty: $resource("/paper/subjectdifficulty/:id", {}, {modify: {method: "PUT"}}),
            subjectDifficulties: $resource("/paper/subjectdifficulties", {}, {}),
        };
        return service;
    })
