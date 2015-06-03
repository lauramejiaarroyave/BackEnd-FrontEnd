'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .controller('DetailCtrl', function ($scope, serviceDetail) {

    var idMachine= location.href.split('detail')[1].split('/')[1];


    $scope.init= function(){

      serviceDetail.getIdMachine(callbackId, idMachine);
    }

    var callbackId = function(data){

      $scope.machine = data;

      console.log( $scope.machine);
    }


    $scope.delete= function(){

      serviceDetail.getDelete(idMachine);
    }


    $scope.init();

  });
