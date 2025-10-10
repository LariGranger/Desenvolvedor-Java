import java.util.Scanner; 
public class contaBancaria
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float saldo = 1000, deposito, saque;
		int opcao;
		
		do{
		    System.out.println("=== CONTA BANCÁRIA ===");
		    System.out.println("Opção 1: Consultar Saldo");
		    System.out.println("Opção 2: Depositar");
		    System.out.println("Opção 3: Sacar");
		    System.out.println("Opção 4: Sair");
		    opcao = sc.nextInt();
		    
		    switch(opcao){
		        case 1: 
		            System.out.println("Seu saldo atual é: R$" + saldo);
		            break;
		        case 2:
		            System.out.print("Digite o valor que deseja depositar: ");
		            deposito = sc.nextFloat();
		            if(deposito >= 0){
		                saldo = saldo + deposito;
		                System.out.println("Seu saldo atual, após o depósito, é: R$" + saldo);
		            }else{
		                System.out.println("Não é possível depositar valores negativos");
		            }
		            break;
		         case 3: 
		            System.out.print("Digite o valor que deseja sacar: ");
		            saque = sc.nextFloat();
		            if(saque >= 0 && saque <= saldo){
		                saldo = saldo - saque;
		                System.out.println("Seu saldo atual, após o saque, é: R$" + saldo);
		            }else{
		                System.out.println("Não é possível sacar, verifique seu saldo na conta e tente novamente");
		            }
		            break;
		         case 4: 
		            System.out.print("Até logo!");
		            break;
		    }
		}while(opcao != 4);
		sc.close();
	}
}
