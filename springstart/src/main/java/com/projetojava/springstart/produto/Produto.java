package com.projetojava.springstart.produto;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Produto(){}

    public Produto(String nome, double preco, String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return "Produto{" +
                "nome ='" + nome + '\'' +
                ", preço =" + preco +
                ", descrição =" + descricao +
                '}';
    }


}
