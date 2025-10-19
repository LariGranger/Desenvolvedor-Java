package funcionarios; 

public class AssistentedePadaria extends Funcionarios{
    private boolean experiencia;

    public boolean getExperiencia(){
        return experiencia;
    } 

    public void setExperiencia(boolean experiencia){
        this.experiencia = experiencia;
    }

    public AssistentedePadaria(String nome, String matricula, String setor, boolean experiencia){
        super(nome, matricula, setor);
        this.experiencia = experiencia;
    }

    public void exibeInformacoesExperiencia(){
        if(!experiencia){
            System.out.println("Não tem experiência");
        }else{
            System.out.println("Tem experiência");

        }
    }

    @Override
    public void tempoDePausa(){
        System.out.println("1h30 de pausa");
    }
}