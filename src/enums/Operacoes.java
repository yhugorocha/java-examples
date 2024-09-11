package enums;

public enum Operacoes {

    ADICAO("+") {
        @Override
        public Double executarOperacao(double x, double y) {
            return x + y;
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public Double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    SUBTRACAO("-") {
        @Override
        public Double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    DIVISAO("/") {
        @Override
        public Double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String valor;

    Operacoes(String valor){
        this.valor = valor;
    }

    public abstract Double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return valor;
    }
}
