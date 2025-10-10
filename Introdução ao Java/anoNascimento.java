import java.util.Scanner;
public class anoNascimento
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Descubra seu ano de nascimento");
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		int anoNascimento = anoAtual - idade;
		
		System.out.print("Você nasceu em " + anoNascimento);
		sc.close();
	}
}