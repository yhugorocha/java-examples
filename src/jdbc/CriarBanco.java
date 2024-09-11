package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) {
        final String StringDeConexao = "jdbc:postgresql://host.docker.internal:5432/";
        final String usuario = "postgres";
        final String senha = "123";

        try(Connection conexao = DriverManager.getConnection(StringDeConexao,usuario,senha)) {

            Statement stmt = conexao.createStatement();
            stmt.execute("CREATE DATABASE curso_java");

            System.out.println("Banco criado com suacesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
