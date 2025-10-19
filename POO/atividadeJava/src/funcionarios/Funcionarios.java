package funcionarios; 

public class Funcionarios{
    private String nome;
    private String matricula;
    private String setor;

    public Funcionarios(String nome, String matricula, String setor){
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void baterPonto(){
        System.out.println("Bater ponto");
    }

    public void tempoDePausa(){
        System.out.println("Horário de almoço de pausa");

    }
}