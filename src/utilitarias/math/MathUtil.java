package utilitarias.math;

public class MathUtil {
    public static void main(String[] args) {

        //Fazer elevação de numeros
        System.out.println(Math.pow(2,3));

        //ARREDONDAMENTO
        System.out.println(Math.round(4.7));
        //PRA CIMA
        System.out.println(Math.ceil(4.4));
        //PRA BAIXO
        System.out.println(Math.floor(4.8));

        //GERA NÚMERO ALEATRIO
        System.out.println(Math.round(Math.random() * 100));


    }
}
