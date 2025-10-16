import livro.Livro;
public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 2001, 350);
        livro.exibirInformacoes();
    }
}
