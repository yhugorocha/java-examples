package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {

    public static void main(String[] args) {

        try(Connection con = FabricaConexao.getConexao("curso_java")){
            String sql = "SELECT * FROM pessoas";

            Statement stmt = con.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);

            List<Pessoa> pessoas = new ArrayList<>();

            while (resultado.next()){
                pessoas.add(new Pessoa(resultado.getInt("codigo"),resultado.getString("nome")));
            }

            for(Pessoa pessoa: pessoas){
                System.out.println(pessoa.getCodigo());
                System.out.println(pessoa.getNome());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
