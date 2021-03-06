'use strict';

angular.module('expressoApp').controller('IngredientsDialogController',
    ['$scope', '$stateParams', '$uibModalInstance', 'entity', 'Ingredients', 'UnitOfMeasure', 'DrinkRecipe',
        function($scope, $stateParams, $uibModalInstance, entity, Ingredients, UnitOfMeasure, DrinkRecipe) {

        $scope.ingredients = entity;
        $scope.unitofmeasures = UnitOfMeasure.query();
        $scope.drinkrecipes = DrinkRecipe.query();
        $scope.load = function(id) {
            Ingredients.get({id : id}, function(result) {
                $scope.ingredients = result;
            });
        };

        var onSaveSuccess = function (result) {
            $scope.$emit('expressoApp:ingredientsUpdate', result);
            $uibModalInstance.close(result);
            $scope.isSaving = false;
        };

        var onSaveError = function (result) {
            $scope.isSaving = false;
        };

        $scope.save = function () {
            $scope.isSaving = true;
            if ($scope.ingredients.id != null) {
                Ingredients.update($scope.ingredients, onSaveSuccess, onSaveError);
            } else {
                Ingredients.save($scope.ingredients, onSaveSuccess, onSaveError);
            }
        };

        $scope.clear = function() {
            $uibModalInstance.dismiss('cancel');
        };
}]);
