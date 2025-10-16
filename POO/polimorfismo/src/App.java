import carro.Carro;
import carro.CarroMonstro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro(); 
        carro.ligar();
        carro.acelerar();
        carro.desligar();

        CarroMonstro carroMonstro = new CarroMonstro(); 
        carroMonstro.ligar();
        carroMonstro.acelerar();
        carroMonstro.desligar();
    }
}
