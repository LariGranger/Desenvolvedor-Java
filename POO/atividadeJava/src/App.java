import funcionarios.Estagiario;
import funcionarios.Funcionarios;
import funcionarios.AssistentedePadaria;
public class App {
    public static void main(String[] args) throws Exception {
        Estagiario estag1 = new Estagiario("Liane", "E242010", "T.I", "ADS");
        estag1.baterPonto();
        estag1.tempoDePausa();
        estag1.fazerCafe();

        AssistentedePadaria assis1 = new AssistentedePadaria("Maria", "AP86545", "Geral", true);
        assis1.baterPonto();
        assis1.tempoDePausa();
        assis1.exibeInformacoesExperiencia();
    }
}


