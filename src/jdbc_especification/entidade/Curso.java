package jdbc_especification.entidade;

public class Curso {

    private long id;
    private String nome;
    private int horas;

    public Curso(long id, String nome, int horas) {
        this.id = id;
        this.nome = nome;
        this.horas = horas;
    }

    public Curso() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", horas=" + horas +
                '}';
    }
}
