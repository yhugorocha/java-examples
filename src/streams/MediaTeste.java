package streams;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media();
		m1.adicionar(8.3).adicionar(6.7); 
		
		System.out.println(m1.getValor());
	}
}
