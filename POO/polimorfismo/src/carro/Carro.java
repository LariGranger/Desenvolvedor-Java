package carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String rodas;

    public void ligar(){
        System.out.println("ligado");
    }

    public void acelerar(){
        System.out.println("acelerar");
    }

    public void desligar(){
        System.out.println("desligado");
    }
}
