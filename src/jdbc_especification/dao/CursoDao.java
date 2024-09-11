package jdbc_especification.dao;

import jdbc_especification.entidade.Curso;
import jdbc_especification.util.DbUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDao {

    public void salvar(Curso curso){

        try(Connection connection = DbUtil.getConnection()) {
            String sql = "insert into cursos (id, nome, horas) values (? , ?, ?)";

            try(PreparedStatement ps = connection.prepareStatement(sql)){
                ps.setLong(1, curso.getId());
                ps.setString(2, curso.getNome());
                ps.setInt(3, curso.getHoras());

                ps.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Curso> listar(){

        try(Connection connection = DbUtil.getConnection()) {
            String sql = "select * from cursos";

            try(Statement stmt = connection.createStatement()){
                ResultSet rs = stmt.executeQuery(sql);

                List<Curso> cursos = new ArrayList<>();

                while (rs.next()){
                    cursos.add(new Curso(rs.getInt("id"), rs.getString("nome"), rs.getInt("horas")));
                }

                return cursos;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void atualizar(Curso curso){

    }

    public void excluir(Curso curso){

    }
}
