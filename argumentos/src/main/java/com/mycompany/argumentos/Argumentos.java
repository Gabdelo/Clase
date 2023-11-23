package com.mycompany.argumentos;


public class Argumentos {

    public static void main(String[] args) {
        String argumento1;
        String argumento2;
        
        argumento1 =args[0];
        //argumento2= args[1];
        System.out.println("Argumento1: "+ argumento1);
        //System.out.println("Argumento2: "+ argumento2);
        
        switch(argumento1){
        
            case "1":{
                System.out.println("idioma español");
                break;
            
            }
            case "2":{
                System.out.println("Hi! I'm Muzzy");
                break;
            }
            default:{
                System.out.println("Argumento invalido");
            
            }
        }
              
    }
}
