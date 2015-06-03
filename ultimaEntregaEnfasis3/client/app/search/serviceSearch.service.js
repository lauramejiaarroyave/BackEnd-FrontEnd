'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .service('serviceSearch', function ($http) {


    var self = this;
    var data = [];


    self.getWord = function (callback, wordMachine){

      $http.get('http://localhost:8080/trabajo1/machines/SearchWord?wordMachine='+ wordMachine).
        success(function(data, status, headers, config) {

          callback(data);

        }).
        error(function(data, status, headers, config) {
          console.log('Error :(');
        });

    };

  });
