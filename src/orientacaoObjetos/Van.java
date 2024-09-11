package orientacaoObjetos;

public class Van extends Carro{

    int portas;

    public Van(String marca, String modelo, int numPassageiro, double camCombustivel, double consumoCombustivel, int portas) {
        super(marca, modelo, numPassageiro, camCombustivel, consumoCombustivel);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
