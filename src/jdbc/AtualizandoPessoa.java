package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizandoPessoa {

    public static void main(String[] args) {

        int id = 1;
        String novoNome = "Hugo Atualizado";

        try(Connection conexao = FabricaConexao.getConexao("curso_java")){
            String sql = "UPDATE pessoas SET nome  = ? WHERE codigo = ? ";

            try(PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1,novoNome);
                stmt.setInt(2, id);

                stmt.execute();
            }

            System.out.println("Atualizado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
