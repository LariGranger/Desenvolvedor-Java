import java.util.Scanner;
import java.util.List;
import cadastroDeProdutos.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int qntdDeProdutos;
        Scanner sc = new Scanner(System.in);
        List<ProdutoEletronico> produtos = new ArrayList<>();


        System.out.println("Digite quantos produtos deseja cadastrar: ");
        qntdDeProdutos = sc.nextInt();
        while(qntdDeProdutos >= 1){
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite o preço produto: ");
            double preco = sc.nextDouble();
            System.out.println("Digite o tempo de garantia do produto: ");
            int tempoDeGarantia = sc.nextInt();

            produtos.add(new ProdutoEletronico(nome, preco, tempoDeGarantia));
            qntdDeProdutos--;
        }

        for (ProdutoEletronico produtoEletronico : produtos) {
            produtoEletronico.exibirDetalhes();
        }

        sc.close();
    }

}
