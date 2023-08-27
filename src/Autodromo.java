import QuatroPilares.Encapsulamento.Carro;
import QuatroPilares.Encapsulamento.Moto;

public class Autodromo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligar();

        Moto moto = new Moto();
        moto.ligar();
    }
}