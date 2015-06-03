'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .controller('MainCtrl', function ($scope, serviceMain) {
    $scope.machine = [];


    $scope.init= function(){

      serviceMain.getMachine(callbackMachine);
    }

    var callbackMachine = function(data){
      $scope.machine = data;
    }

    $scope.redirection= function(idMachine){


      location.href ='http://localhost:9000/detail/'+idMachine;

      serviceMain.getMachine(callbackMachine);
    }

    $scope.init();

  });


