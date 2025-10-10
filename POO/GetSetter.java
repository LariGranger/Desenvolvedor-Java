public class ContaBancaria {
    // Atributos privados (encapsulados)
    private String titular;
    private double saldo;
    private String numeroConta;
    
    // Construtor
    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    
    // Getter - permite LER o valor
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    // Setter - permite MODIFICAR o valor (com validação)
    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome inválido!");
        }
    }
    
    // Métodos públicos para manipular o saldo de forma controlada
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    
    public void exibirExtrato() {
        System.out.println("=== EXTRATO ===");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}

// Uso:
public class GetSetter {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");
        
        // Não podemos acessar diretamente: conta.saldo = 1000; // ERRO!
        // Devemos usar métodos públicos:
        conta.depositar(1000);
        conta.sacar(300);
        
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
        conta.exibirExtrato();
    }
}