package exercicio;

public class Exercicio {
    public static void main(String[] args) {
        Conta contaUser1 = new Conta(1L, 1, 500.0);
        Usuario usuario1 = new Usuario(1L,"Hugo Silva", "yhugorocha","yhugorocha@gmail.com", "123456789", contaUser1);

        Conta contaUser2 = new Conta(2L, 2, 500.0);
        Usuario usuario2 = new Usuario(2L,"Igor Silva", "yigorrocha","igorrocha@gmail.com", "123456789", contaUser2);

        Double valor = 200.0;

        if(usuario1.getConta().getSaldo() >= valor){
            System.out.println("Ele tem dinheiro");
            contaUser2.setSaldo(contaUser2.getSaldo()+valor);
            contaUser1.setSaldo(contaUser1.getSaldo()-valor);
        }

        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());



    }
}
