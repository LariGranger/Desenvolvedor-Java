
class Carro {
    String marca;
    String modelo;
    int ano;
    
    // Construtor padrão (sem parâmetros)
    public Carro() {
        marca = "Não definida";
        modelo = "Não definido";
        ano = 0;
    }
    
    // Construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;  // 'this' refere-se ao atributo da classe
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void exibir() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ")");
    }
}

// Uso:
public class metodosConstrutores {
    public static void main(String[] args) {
        // Usando construtor padrão
        Carro carro1 = new Carro();
        carro1.exibir();  // Carro: Não definida Não definido (0)
        
        // Usando construtor com parâmetros
        Carro carro2 = new Carro("Toyota", "Corolla", 2023);
        carro2.exibir();  // Carro: Toyota Corolla (2023)
        
        Carro carro3 = new Carro("Honda", "Civic", 2024);
        carro3.exibir();  // Carro: Honda Civic (2024)
    }
}
