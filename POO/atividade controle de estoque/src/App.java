 /* ● Crie um programa com menu do-while para:
    1. Cadastrar novo produto
    2. Adicionar estoque
    3. Remover estoque
    4. Calcular valor total do estoque
    5. Sair do programa */
import java.util.Scanner;
import controleEstoque.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Adicionar estoque");
            System.out.println("3. Remover estoque ");
            System.out.println("4. Calcular valor total do estoque");
            System.out.println("5. Sair do programa");
            opcao = sc.nextInt();
        } while (opcao != 5);
        sc.close();
    }
}

