package com.youtube.jovemtranquilao;

import java.util.ArrayList;

public class RepeticaoEdecisaoJuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for(int posicao = 1; posicao < 10; posicao++){
            listaDeUmADez.add(posicao);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for(Integer numero : listaDeUmADez) {
            if(numero % 2 == 0) {
                numerosPares.add(numero);
                System.out.println(numerosPares);
            };
        }
    }
}
