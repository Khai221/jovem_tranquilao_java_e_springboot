package com.youtube.jovemtranquilao.orientacaoAObjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CadastroDePessoa {
    ArrayList<Pessoa> pessoaList = new ArrayList<>();
    Maternidade maternidade = new Maternidade();

    public static void main(String[] args) throws ParseException {
        new CadastroDePessoa().rodar();

    }

    private void rodar() throws ParseException {
        Pessoa julio = maternidade.nascer("Júlio", "Masculino");
        Pessoa maria = maternidade.nascer("Mária", "Feminino");
        Pessoa gabriel = maternidade.nascer("Gabriel", "Masculino");
        Pessoa robo = maternidade.nascer("Robo Android", "Robo");

        pessoaList.add(julio);
        pessoaList.add(maria);
        pessoaList.add(gabriel);
        pessoaList.add(robo);

        ArrayList<Pessoa> homemList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();
        ArrayList<Pessoa> outrosGeneros = new ArrayList<>();

        for(Pessoa pessoa : pessoaList){
            if(pessoa.getSexo().equals("Masculino")) {
                homemList.add(pessoa);
            } else if(pessoa.getSexo().equals("Feminino")){
                mulherList.add(pessoa);
            } else {
                outrosGeneros.add(pessoa);
            }
        }

        System.out.println("");
    }

}
