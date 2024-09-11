package jdbc_especification;

import jdbc_especification.dao.CursoDao;
import jdbc_especification.entidade.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args)  {
        CursoDao dao = new CursoDao();

        //Curso curso = new Curso(2L, "Curso de Sistemas", 400);
        //dao.salvar(curso);
        List<Curso> cursos = dao.listar();

        for(Curso curso: cursos){
            System.out.println(curso.toString());
        }
    }
}
