
var exec = require('cordova/exec');

var PLUGIN_NAME = 'ocr';

var ReconocimientoOcr = {
  saludo: function (name, successCallback, errorCallback){
        exec(successCallback, errorCallback, PLUGIN_NAME, "saludar", [name]);
  },
  reconoce: function(name, successCallback, errorCallback){
        exec(successCallback, errorCallback, PLUGIN_NAME, "reconoce", [name]);
  }
};

module.exports = ReconocimientoOcr;
