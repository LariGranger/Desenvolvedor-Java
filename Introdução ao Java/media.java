import java.util.Scanner;
public class media
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Média");
		
		System.out.print("Digite a nota 1: ");
		double nota1 = sc.nextInt();
		
		System.out.print("Digite a nota 2: ");
		double nota2 = sc.nextInt();
		
		System.out.print("Digite a nota 3: ");
		double nota3 = sc.nextInt();
		
		
		double media = (nota1 + nota2 + nota3)/3;
		
		System.out.print("A média do aluno é " + media);

		sc.close();
	}
}