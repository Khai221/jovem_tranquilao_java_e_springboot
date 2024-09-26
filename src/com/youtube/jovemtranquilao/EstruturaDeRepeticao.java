package com.youtube.jovemtranquilao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        listadePalavras();
    }

    public static void listadePalavras() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Chuva");
        palavraList.add("Vento");
        palavraList.add("Sol");

        for(String palavra : palavraList) { // o : já separa a váriavel da outra e ja incrementa ++
            System.out.println(palavra);
        }


        palavraList.forEach(palavra -> System.out.println(palavra));
    }

    public static void forClassico(){
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Chuva");
        palavraList.add("Vento");
        palavraList.add("Sol");

        for(int i = 0; i < palavraList.size(); i++) { // for clássico
            System.out.println(palavraList.get(i));

            // nesse for clássico, é usado um método size(), que são usados em coleções como List, Set e Map e outras classes que implementam a interface Collection.
            // o length não é usado nesse caso pois ele retorna um número de elementos no array. e pra strings ele retorna o número de caracteres.
        }
    }
}
