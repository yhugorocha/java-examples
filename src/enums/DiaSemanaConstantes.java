package enums;

public enum DiaSemanaConstantes {

    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int valor;

    DiaSemanaConstantes(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
