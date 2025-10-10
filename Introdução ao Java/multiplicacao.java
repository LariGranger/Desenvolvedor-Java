import java.util.Scanner;
public class multiplicacao
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Scanner teclado = new Scanner(System.in);
	   String nome, continuar;
	   float n1, n2, n3, multiplicacao;
	  
	  
	   
	   System.out.print("Digite seu nome: ");
	   nome = sc.nextLine();
	   System.out.print("Digite o primeiro número: ");
	   n1 = sc.nextFloat();
	   System.out.print("Digite o segundo número: ");
	   n2 = sc.nextFloat();
	   System.out.print("Digite o terceiro número: ");
	   n3 = sc.nextFloat();
	   
	   multiplicacao = n1 * n2 * n3;
	   
	   System.out.println("Ola, " + nome + ". A multiplicação dos números é: " + multiplicacao);
	   System.out.print("Deseja continuar? ");
	   continuar = teclado.nextLine();
	   
	   if(continuar.equals("Sim") || continuar.equals("sim")){
	       System.out.print("Até a próxima");
	   }
	   sc.close();
	   teclado.close();
	}
}
