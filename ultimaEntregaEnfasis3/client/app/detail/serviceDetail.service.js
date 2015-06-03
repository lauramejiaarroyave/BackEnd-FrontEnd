'use strict';

angular.module('ultimaEntregaEnfasis3App')
  .service('serviceDetail', function ($http) {


    var self = this;
    var data = [];


    self.getIdMachine = function (callback, idMachine){

      $http.get('http://localhost:8080/trabajo1/machines/ReadMachine?id='+ idMachine).
        success(function(data, status, headers, config) {

          callback(data);

        }).
        error(function(data, status, headers, config) {
          console.log('Error :(');
        });

    };


    self.getDelete = function (idMachine){

     //location.href=('http://localhost:8080/trabajo1/machines/DeleteMachine?id='+ idMachine);

      $http.get('http://localhost:8080/trabajo1/machines/DeleteMachine?id='+ idMachine).
      success(function(data, status, headers, config) {

        if(status.toString() == "200" || status.toString() == "206"){

          alert("Successfully Removed");

          location.href ='http://localhost:9000';

        }else{

          alert("Error Removing");
        }

      }).
        error(function(data, status, headers, config) {
          console.log('Error :(');
        });

    };

  });
