/*
    Atividade 1: Classe Livro com Encapsulamento
    Crie uma classe Livro com as seguintes características:
    ● Atributos privados:
    ○ titulo (String)
    ○ autor (String)
    ○ anoPublicacao (int)
    ○ quantidadePaginas (int)
    ● Métodos:
    ○ Construtor completo que receba todos os atributos
    ○ Métodos getters e setters para todos os atributos
    ○ Método calcularTempoLeitura() que retorne o tempo estimado de
    leitura
    ○ Método exibirInformacoes() que imprima todos os detalhes do livro */
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int quantidadePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadePaginas = quantidadePaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = autor;
    }

    public String getAutor(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public int calcularTempoLeitura(){
        return quantidadePaginas;
        System.out.print("O tempo de leitura é de: " + quantidadePaginas);
    }

    public void exibirInformacoes(String titulo, String autor, int anoPublicacao, int quantidadePaginas){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de Páginas: " + quantidadePaginas);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
    
}
