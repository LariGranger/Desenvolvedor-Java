package funcionarios; 

public class Estagiario extends Funcionarios{
    private String graduacao;

    public String getGraduacao(){
        return graduacao;
    } 

    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }

    public Estagiario(String nome, String matricula, String setor, String graduacao){
        super(nome, matricula, setor);
        this.graduacao = graduacao;
    }

    public void fazerCafe(){
        System.out.println("Eu faço café");
    }

    @Override
    public void tempoDePausa(){
        System.out.println("15 minutos de pausa");
    }
}