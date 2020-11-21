package com.company;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;



public class Main {


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("j");
        lista.add("i");
        lista.add("h");
        lista.add("g");
        lista.add("fsd");
        lista.add("e");
        lista.add("d");
        lista.add("c");
        lista.add("b");
        lista.add("a");



//clase anonima
        System.out.println("Ordenacion alfabeticamente por metodo anonimo");
        anonimoAlfa claseAnonima = new anonimoAlfa(){
           public void ordenar(){
               Collections.sort(lista);
               for (String letra:lista){
                   System.out.println(letra);

               } ordenar();
           }

        };


        System.out.println("Ordenacion alfabeticamente por metodo lamba");
//metodo lamba
        Ordenar lambaAlfa=()-> {
            Collections.sort(lista);

            for (String letra:lista){
                System.out.println(letra);
            }

        };

        lambaAlfa.ordenarAlfabetoLamba();
//por referencia
        System.out.println("Ordenacion por referencia");
        OrdenacionSort lissta = new OrdenacionSort(lista);
        lissta.ordenar(lista);



    }

    public static void imprimir(ArrayList<String> lista){
        System.out.println(lista);
    }


}

