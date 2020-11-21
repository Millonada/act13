package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class OrdenacionSort
{
    ArrayList<String> lista= new ArrayList<String>();

    public OrdenacionSort(ArrayList<String> lista){

        this.lista=lista;
    }
    public void ordenar(){

        for(int i =1;i<10;i++){
            int maxValue=0;
            for(int j=0;j<10;j++){

                if (lista.get(j+1).length() > lista.get(maxValue).length()){
                    maxValue=j+1;
                }
            }

        }


    }

    public void imprimir(){

        for(int i=0;i<10;i++){
            System.out.println(":"+lista.get(i));
        }
    }

    public void ordenar(ArrayList<String> lista){
        Collections.sort(lista);
        for (String letra:lista){
            System.out.println(letra);
        }
    }


}
