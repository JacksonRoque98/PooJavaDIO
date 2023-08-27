package QuatroPilares.Encapsulamento;

import QuatroPilares.Heranca.Veiculo;

                  //Extendendo atributos da classe Veiculo (HERANÇA)
public class Carro extends Veiculo {

    public void ligar(){
        verificarCambio();
        verificarCombustivel();
        System.out.println("Ligando o carro!");
    }
    private void verificarCombustivel(){
        System.out.println("Carro com combustivel");
    }
    private void verificarCambio(){
        System.out.println("Verificando cambio se está na posição P");
    }
}
