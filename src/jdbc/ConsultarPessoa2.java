package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma parte do nome");
        String nome = entrada.nextLine();

        try(Connection con = FabricaConexao.getConexao("curso_java")){
            String sql = "SELECT * FROM pessoas p WHERE p.nome LIKE ? ";

            try(PreparedStatement stmt = con.prepareStatement(sql)){
                stmt.setString(1, "%"+nome+"%");
                ResultSet resultado = stmt.executeQuery();

                while (resultado.next()){
                    pessoas.add(new Pessoa(resultado.getInt("codigo"),resultado.getString("nome")));
                }
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
