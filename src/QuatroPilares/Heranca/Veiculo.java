package QuatroPilares.Heranca;

public abstract class Veiculo {
    private String chassi;

    public String getChassi(){
        return chassi;
    }
    public void setChassi(String newChassi){
        this.chassi = newChassi;
    }
    public abstract void ligar();

}
