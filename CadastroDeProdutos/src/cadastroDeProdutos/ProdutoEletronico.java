package cadastroDeProdutos;

public class ProdutoEletronico extends Produto implements Exibicao {
    private int tempoDeGarantia;
    public ProdutoEletronico(String nome, double preco, int tempoDeGarantia){
        super(nome, preco);
        this.tempoDeGarantia = tempoDeGarantia;
    }

        public int getTempoDeGarantia(){
            return tempoDeGarantia;
        }

        public void setTempoDeGarantia(int tempoDeGarantia){
            this.tempoDeGarantia = tempoDeGarantia;
        }

        @Override
        public void exibirDetalhes(){
            System.out.println("Nome: " + getNome() + "\nPreço:" + getPreco() + "\nTempo de Garantia: " + getTempoDeGarantia());
        }
}
