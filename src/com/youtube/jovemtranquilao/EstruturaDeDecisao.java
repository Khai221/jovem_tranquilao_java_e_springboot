package com.youtube.jovemtranquilao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {


    public static void main(String[] args) {
//        stringIgual();
//        stringComeca();
        datas();

    }

    // ESTRUTURAS CONDICIONAIS

    //        Integer numero = 2;
    //
    //        if(numero % 2 == 0){
    //            // executo codigo daqui quando verdadeiro
    //            System.out.println("par");
    //        }else{
    //            // executo aqui quando falso
    //            System.out.println("impar");
    //        }


    //    private static void stringIgual() {
    //        String frase = "Hoje é sabado";
    //
    //        if(frase.contains("segunda feira")){
    //            System.out.println("Tristeza");
    //        } else if(frase.contains("sexta feira") || frase.contains("sabado") || frase.contains("domingo")){
    //            System.out.println("felicidade");
    //        } else{
    //            System.out.println("dia normal");
    //        }
    //    }

    //    private static void stringComeca(){
    //        String stringComecaCom = "a lorem";
    //        if(stringComecaCom.startsWith("a")){
    //            System.out.println("A frase começa com a");
    //        } else {
    //            System.out.println("A frase não começa com a");
    //        }
    //    }

    private static void datas(){
        try {
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2024");
            Date hoje = new Date();

            if(data.before(new Date())){
                System.out.println("Essa data já passou");
            } else if(data.equals(hoje)){
                System.out.println("Essa data condiz com o dia de hoje");
            } else {
                System.out.println("Essa data ainda não chegou");
            }
        } catch(ParseException e) {
            System.err.println("Erro ao analisar a data: " + e.getMessage());
        }

    }
}
