import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, numero1, numero2, resultado;
        
        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            
            if (opcao >= 1 && opcao <= 4) {
				System.out.println("Digite o primeiro valor: ");
				numero1 = sc.nextInt();
				System.out.println("Digite o segundo valor: ");
				numero2 = sc.nextInt();
                if(opcao == 1){
					resultado = numero1 + numero2;
					System.out.println("A soma é: " + resultado);
				}else if(opcao == 2){
					resultado = numero1 - numero2;
					System.out.println("A subtração é: " + resultado);
				}else if(opcao == 3){
					resultado = numero1 * numero2;
					System.out.println("A multiplicação é: " + resultado);
				}else if(opcao == 4){
                    if(numero2 == 0){ 
                        System.out.println("Não se pode fazer divisão por zero");
                    }else{
                        float divisao = numero1 / numero2;
                        System.out.println("A divisão é: " + divisao);
                    }
				}
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        System.out.println("Até logo!");
        sc.close();
    }
}