package br.com.ariany.enhancedstarwarsapi.models;

public class Greeting {
    private static final String MESSAGE_PATTERN = "Olá, %s!";

    public String nome;
    public String mensagem;


    public Greeting(String nome) {
        this.nome = nome;
        this.mensagem = MESSAGE_PATTERN.formatted(nome);
    }

    public Greeting() {
        this.nome = "desconhecido";
        this.mensagem = MESSAGE_PATTERN.formatted(this.nome);
    }
}
