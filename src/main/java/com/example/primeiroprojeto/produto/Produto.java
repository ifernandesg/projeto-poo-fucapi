package com.example.primeiroprojeto.produto;



public class Produto {
    private Long id;
    private String nome;
    private double preco;

    // Construtor
    public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
