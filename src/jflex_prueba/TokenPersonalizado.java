/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflex_prueba;

import java.util.Arrays;

/**
 *
 * @author Eric
 */
public class TokenPersonalizado {
  String _token;
  String _lexema;
 
  public String getLexema(){
    return this._lexema;
  }
 
  public String getToken(){
    return this._token;
  }
  
  TokenPersonalizado (String lexema, String token){
    this._lexema = lexema;
    String[] palabras_claves = {"if","else","do","for"};
    if (token == "ID" && Arrays.asList(palabras_claves).contains(lexema)){
        this._token = "Palabra_Clave";
    }
    else{
        this._token = token;
    }
  }
 
  public String toString(){
    return "Lexema: " + this._lexema + " Token: " + this._token + ";";
  }
}
