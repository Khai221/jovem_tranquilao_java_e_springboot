package com.youtube.jovemtranquilao;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Chuva");
        palavraList.add("Vento");
        palavraList.add("Sol");

        for(String palavra : palavraList) { // o : já separa a váriavel da outra e ja incrementa ++
            System.out.println(palavra);
        }

    }
}
