package generics;

public class CaixaObjetoTeste {
    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(1.2);

        Double coisa = (Double) caixaA.abrir();

    }
}
