'use strict';

describe('Service: serviceMain', function () {

  // load the service's module
  beforeEach(module('ultimaEntregaEnfasis3App'));

  // instantiate service
  var serviceMain;
  beforeEach(inject(function (_serviceMain_) {
    serviceMain = _serviceMain_;
  }));

  it('should do something', function () {
    expect(!!serviceMain).toBe(true);
  });

});
