package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) {

        final String StringDeConexao = "jdbc:postgresql://host.docker.internal:5432/";
        final String usuario = "postgres";
        final String senha = "123";

        try(Connection conexao = DriverManager.getConnection(StringDeConexao,usuario,senha)) {
            System.out.println("Conexão feita com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
