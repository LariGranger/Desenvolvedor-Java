package POO;
class Pessoa {
    // Atributos (características)
    String nome;
    int idade;
    double altura;
    
    // Métodos (comportamentos)
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos");
    }
    
    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora tenho " + idade + " anos");
    }
}

public class pooBasico {
    public static void main(String[] args) {
        // Criando objetos (instâncias da classe Pessoa)
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 25;
        pessoa1.altura = 1.75;
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 30;
        pessoa2.altura = 1.68;
        
        // Usando os métodos dos objetos
        pessoa1.apresentar();
        pessoa1.fazerAniversario();
        
        System.out.println("\n---\n");
        
        pessoa2.apresentar();
    }
}