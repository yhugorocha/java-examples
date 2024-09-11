package enums;

public class Formulario {

    private String nome;
    private String sobrenome;
    private Genero Genero;

    public Formulario(String nome, String sobrenome, Formulario.Genero genero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        Genero = genero;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", Genero=" + Genero +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Formulario.Genero getGenero() {
        return Genero;
    }

    public void setGenero(Formulario.Genero genero) {
        Genero = genero;
    }

    enum Genero{
        FEMININO('F'), MASCULINO('M');

        private char genero;

        Genero(char genero){
            this.genero = genero;
        }
    }


}
