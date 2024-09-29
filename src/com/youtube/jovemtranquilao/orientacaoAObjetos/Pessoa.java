package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataDeNascimento;
    private String sexo;

    void mudarSexo(String novoSexo, String novoNome){
        sexo = novoSexo;
        nome = novoNome;
    }

    void casar(String antigoSobrenome, String novoSobrenome){
        nome = nome.replace(antigoSobrenome, novoSobrenome);
    }
}
