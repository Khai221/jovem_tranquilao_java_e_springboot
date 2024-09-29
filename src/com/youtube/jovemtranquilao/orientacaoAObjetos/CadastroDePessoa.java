package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroDePessoa {
    public static void main(String[] args) {
        Pessoa julio = new Pessoa();
        julio.setNome("Júlio");

        try {
            julio.setDataDeNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("11/11/2002"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        julio.setSexo("Masculino");
        julio.mudarSexo("Feminino", "Júlia");
        julio.casar("Narciso", "Oestreich");
        System.out.println(julio);
    }

}
