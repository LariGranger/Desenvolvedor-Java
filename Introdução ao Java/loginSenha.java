import java.util.Scanner;
public class loginSenha
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String usuario = "aluno", senha = "senai123";
	   String usuarioDigitado = "", senhaDigitada = "";
	   
	   System.out.print("Digite seu usuário: ");
	   usuarioDigitado = sc.nextLine();
	   System.out.print("Digite sua senha: ");
	   senhaDigitada = sc.nextLine();
	   
	   if(usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)){
	       System.out.print("Login bem-sucedido");
	   }else{
	       System.out.print("Verifique suas informações e tente novamente");
	   }
	   sc.close();
	}
}