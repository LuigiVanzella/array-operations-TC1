package org.example;

public class Ex03 {

    private int[] lista;
    private int contador;

    public Ex03(int[] iniciallista){
        this.lista = new int[10];
        System.arraycopy(iniciallista, 0, lista, 0, 5);
        contador = 5;
    }

    public String print(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<contador; i++){
            stringBuilder.append(array[i]).append(", ");
        }
        return stringBuilder.toString();
    }

    public String compareNumber(int number){
        for(int i = 0; i<contador; i++){
            if(lista[i] == number){
                for(int y = i; y<contador-1; y++){
                    lista[y] = lista[y+1];
                }
                lista[contador] = 0;
                contador--;
                return print(lista);
            }
        }
        lista[contador] = number;
        contador ++;
        return print(lista);

    }


    public int getArrayLength(){
        return contador;
    }



}
