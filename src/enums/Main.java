package enums;

public class Main {
    public static void main(String[] args) {

        //DiaSemanaConstantes dia = DiaSemanaConstantes.DOMINGO;
        //System.out.println(dia.toString() + "--"+ dia.getValor());

        //Formulario form = new Formulario("Hugo", "Rocha", Formulario.Genero.MASCULINO);

        //System.out.println(form.toString());

        System.out.println(Operacoes.ADICAO.executarOperacao(5,9));
        System.out.println(Operacoes.DIVISAO.executarOperacao(15,3));
        System.out.println(Operacoes.MULTIPLICACAO.executarOperacao(5,9));
        System.out.println(Operacoes.SUBTRACAO.executarOperacao(9,5));
    }
}
