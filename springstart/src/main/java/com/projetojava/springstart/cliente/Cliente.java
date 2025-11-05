package com.projetojava.springstart.cliente;

public class Cliente {
    private String nome;
    private int idade;
    private String email;
    private String telefone;

    // Construtor vazio (necessário para JSON)
    public Cliente(){}

    public Cliente(String nome, int idade, String email, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Cliente{" + 
        "nome = '" + nome + '\'' +
        ", idade = '" + idade + '\'' +
        ", email = '" + email + '\'' +
        
        '}';
    }
}
