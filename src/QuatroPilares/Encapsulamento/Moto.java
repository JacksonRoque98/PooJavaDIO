package QuatroPilares.Encapsulamento;

import QuatroPilares.Heranca.Veiculo;

                 //Extendendo atributos da classe Veiculo (HERANÇA)
public class Moto extends Veiculo {

    public void ligar(){
        verificarMarcha();
        verificarCombustivel();
        System.out.println("Ligando a moto");
    }
    private void verificarMarcha(){
        System.out.println("Verificando se a marcha da moto está em Neutro");
    }
    private void verificarCombustivel(){
        System.out.println("Verificando se a moto tem combustivel.");
    }

}
