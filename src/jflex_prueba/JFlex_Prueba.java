/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jflex_prueba;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Eric
 */
public class JFlex_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try{
 
            // Asignación del nombre de archivo por defecto que usará la aplicación
            // El path del archivo esta justo en la carpeta del proyecto, sino descomentar la sig linea
            //System.out.print(System.getProperty("user.dir"));
            File archivo = new File("prueba.txt");
            
            // Se trata de leer el archivo y analizarlo en la clase que se ha creado con JFlex
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            AnalizadorLexico analizadorJFlex = new AnalizadorLexico(buffer);

            while(true){

            // Obtener el token analizado y mostrar su información
            TokenPersonalizado token = analizadorJFlex.yylex();

            if (!analizadorJFlex.existenTokens())
             break;

            System.out.println(token.toString());
           }
           }
           catch (Exception e){
             System.out.println(e.toString());
           }
    }
    
}
