package calculoHoras;

public class Comissionado extends Funcionarios implements Pagamento{
    private int totalVendas;
    private double txComissao;

    public Comissionado(String nome, Strind id, String cargo, String setor, int totalVendas, double txComissao, double salario){
        super(nome, id, cargo, setor, salario);
        this.totalVendas = totalVendas;
        this.txComissao = txComissao;
    }

    public int getTotalVendas(){
        return totalVendas;
    }
    public void setTotalVendas(int totalVendas){
        this.totalVendas = totalVendas;
    }

    public double getTxComissao(){
        return txComissao;
    }
    public void setTxComissao(double txComissao){
        this.txComissao = txComissao;
    }

    @Override
    public void calcularPagamento(){
            salario = totalVendas * (txComissao / 100);
    }
    
}