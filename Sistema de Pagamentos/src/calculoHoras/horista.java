package calculoHoras;

public class Horista extends Funcionarios implements Pagamento{
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, Strind id, String cargo, String setor, double horasTrabalhadas, double valorHora, double salario){
        super(nome, id, cargo,setor, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora(){
        return valorHora;
    }
    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }

    @Override
    public void calcularPagamento(){
        if(horasTrabalhadas > 160){
            salario = horasTrabalhadas * valorHora + ((horasTrabalhadas * valorHora)*0.1);
        }else{
            salario = horasTrabalhadas * valorHora;
        }
    }
    
}