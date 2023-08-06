package br.com.abc.javacore.ZZFpadroesdeprojeto.test;

import br.com.abc.javacore.ZZFpadroesdeprojeto.classes.Pessoa;


public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Gian")
                .nomeDoMeio("Suane")
                .ultimoNome("Queiroz")
                .nomeDoPai("Gian")
                .apelido("JirayaBolado")
                .build();
        System.out.println(p);
    }
}
