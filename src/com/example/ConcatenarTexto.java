package com.example;


public class ConcatenarTexto {

    public static void main(String[] args) {

        String[] palabras = {"Hola", "buenos", "días"};

        //con for
        String concatenar = "";
        for(int i = 0; i < palabras.length; i++){
            concatenar += palabras[i] + " ";
        }
        System.out.println(concatenar);

        //con for each
        concatenar = "";
        for(String palabra : palabras){
            concatenar += palabra + " ";
        }
        System.out.println(concatenar);

        //con while
        concatenar = "";
        int contador = 0;
        while(contador < palabras.length){
            concatenar += palabras[contador] + " ";
            contador++;
        }
        System.out.println(concatenar);



    }



}
