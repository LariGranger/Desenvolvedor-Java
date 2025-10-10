import java.util.Scanner;
public class temperatura
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    float temperatura;

		System.out.print("Digite a temperatura: ");
		temperatura = sc.nextFloat();
		
		if(temperatura >= 30){
		    System.out.print("Está muito quente!");
		}else if(temperatura >= 20){
		    System.out.print("Temperatura agradável");
		}else{
		    System.out.print("Está frio!");
		} 
		sc.close();
	}
}