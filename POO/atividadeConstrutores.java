//classe, com 5 atributos, 2 métodos, 1 construtor

class Maquiagem{
    private String produto;
    String marca;
    double valor; 
    int quantidadeEstoque;
    int classificacao;

    public String getProduto(){
        return produto;
    };

    public Maquiagem(String produto, String marca, double valor, int quantidadeEstoque, int classificacao){
        this.produto = produto;
        this.marca = marca;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.classificacao = classificacao;
    }
    public void mostrarProduto(){            
        System.out.println("Produto: " + produto);
        System.out.println("Marca: " + marca);
        System.out.println("Valor: R$" + valor);
        System.out.println("Classificação do Produto: " + classificacao);
    }
    public void calculaLucro(){
        double lucro = quantidadeEstoque * valor;
        System.out.println("Seu lucro com esse produto será de: R$" + lucro);
        System.out.println();
    }
}
public class atvMetodosConstrutores2 {
    public static void main(String[] args) {

        Maquiagem blush = new Maquiagem("Blush", "Ruby Rose", 14.99, 5, 3);
        blush.mostrarProduto();
        blush.calculaLucro();

        Maquiagem gloss = new Maquiagem("Gloss", "Franciny", 54.99, 8, 4);
        gloss.mostrarProduto();
        gloss.calculaLucro();
    }
}
