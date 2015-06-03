'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .controller('SearchCtrl', function ($scope, serviceSearch) {
    $scope.machine = [];
    $scope.word = [];

    $scope.init= function(){

      serviceSearch.getWord(callbackWord, $scope.word);
    }

    var callbackWord = function(data){
      $scope.machine = data;
    }

    $scope.redirection= function(idMachine){


      location.href ='http://localhost:9000/detail/'+idMachine;

     // serviceMain.getMachine(callbackMachine);
    }

    $scope.init();

  });
