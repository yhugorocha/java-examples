package orientacaoObjetos;

//Criação de objetos
public class Carro{

    String marca;
    String modelo;
    int numPassageiro;
    double camCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiro, double camCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro;
        this.camCombustivel = camCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiro() {
        return numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    public double getCamCombustivel() {
        return camCombustivel;
    }

    public void setCamCombustivel(double camCombustivel) {
        this.camCombustivel = camCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia desse carro é :"+ camCombustivel * consumoCombustivel);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPassageiro=" + numPassageiro +
                ", camCombustivel=" + camCombustivel +
                ", consumoCombustivel=" + consumoCombustivel +
                '}';
    }
}
