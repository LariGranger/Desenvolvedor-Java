package livro;
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
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
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
        return quantidadePaginas / 2; // tempo estimado de leitura em minutos
    }

    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Quantidade de Páginas: " + quantidadePaginas);
        System.out.println("Tempo estimado de leitura (min): " + calcularTempoLeitura());
    }
}
