package com.youtube.jovemtranquilao;

public class EstruturaDeDecisao {


    public static void main(String[] args) {
//        stringIgual();
        stringComeca();

    }


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

    private static void stringComeca(){
        String stringComecaCom = "a lorem";
        if(stringComecaCom.startsWith("a")){
            System.out.println("A frase começa com a");
        } else {
            System.out.println("A frase não começa com a");
        }
    }
}
