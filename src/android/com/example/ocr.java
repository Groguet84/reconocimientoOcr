/**
 */
package com.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;


public class ocr extends CordovaPlugin {
  private static final String TAG = "ocr";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Inicializando Reconocimiento OCR");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("saludar")) {
      // An example of returning data back to the web layer
       String phrase = args.getString(0);
      // Echo back the first argument      
      final PluginResult result = new PluginResult(PluginResult.Status.OK, "Hola todo el... "+phrase);
      callbackContext.sendPluginResult(result);
    }else if(action.equals("reconoce")){

    //  Base64 imagenB64=new Base64(args.getString(0));

      /*String[] datos=reconocerImagenBase();
      String salida="";
      for (int i=0; i<datos.lenght; i++) {
          salida+=datos[i]+"; ";
      }*/
      String salida="Nombre: yo; apellidos: x; dni: 123132131a";
      final PluginResult result = new PluginResult(PluginResult.Status.OK, salida);
      callbackContext.sendPluginResult(result);

    }
    return true;
  }

private String[] reconocerImagenBase(){
  // TRATAR IMAGEN Y RECONOCER DATOS
  String[] datos=new String[3];
  datos[0]="Critian";
  datos[1]="dadfa";
  datos[2]="Crit";
  return datos;
}
}
