'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .service('serviceMain', function ($http) {


    var self = this;
    var data = [];


    self.getMachine = function (callback){

      $http.get('http://localhost:8080/trabajo1/machines/MachinesList').
        success(function(data, status, headers, config) {

          callback(data);

        }).
        error(function(data, status, headers, config) {
          console.log('Error :(');
        });

    };

  });
