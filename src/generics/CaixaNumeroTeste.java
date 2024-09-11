package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<Double>();

        caixaA.guardar(3.5);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();

        caixaB.guardar(3);
        System.out.println(caixaB.abrir());

    }
}
