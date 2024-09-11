package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome = entrada.next();
        System.out.println(nome);
        entrada.close();

        try(Connection con = FabricaConexao.getConexao("curso_java")){
            String sql = "INSERT INTO pessoas (nome) VALUES (?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString( 1 , nome);

            stmt.execute();
            System.out.println("Pessoa incluida com sucesso");
        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }
}
