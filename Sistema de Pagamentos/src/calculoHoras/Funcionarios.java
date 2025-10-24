package calculoHoras;

public interface Pagamento{
    void calcularPagamento();
}

abstract public class Funcionarios{
    protected String nome;
    protected Strind id;
    protected String cargo;
    protected String setor;
    protected double salario;
    public Funcionarios(String nome, Strind id, String cargo, String setor, double salario){
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getId(){
        return id;
    }
    public void setId(String cargo){
        this.id = id;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String nome){
        this.nome = nome;
    }

    public String getSetor(){
        return setor;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void exibirInformacoes(){};
    
}