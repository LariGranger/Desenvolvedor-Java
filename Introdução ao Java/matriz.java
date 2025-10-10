import java.util.Scanner;
public class matriz
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	    int linha, coluna;
	    
	    System.out.print("Digite a linha que deseja esconder: ");
	    linha = sc.nextInt();
	    System.out.print("Digite a coluna que deseja esconder: ");
	    coluna = sc.nextInt();
	    
		for(int i = 1; i <=10; i++){
		    for(int j = 1; j <=10; j++){
		        if(i == linha || j == coluna){
		            System.out.print("X ");
		        }else{
		            System.out.print(j + " ");
		        }
		    }
		        System.out.println("");
		}
		sc.close();
	}
}
