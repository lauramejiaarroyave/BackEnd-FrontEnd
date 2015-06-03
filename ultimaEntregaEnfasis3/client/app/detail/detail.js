'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .config(function ($stateProvider) {
    $stateProvider
      .state('detail', {
        url: '/detail/{code}',
        templateUrl: 'app/detail/detail.html',
        controller: 'DetailCtrl'
      });
  });
