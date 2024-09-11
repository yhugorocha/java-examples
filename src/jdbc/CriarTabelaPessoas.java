package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void main(String[] args) {

        try(Connection con = FabricaConexao.getConexao("curso_java")){

            String sql = "CREATE TABLE pessoas (" +
                    "codigo SERIAL PRIMARY KEY, " +
                    "nome VARCHAR(80) NOT NULL " +
                    ")";

            Statement stmt = con.createStatement();
            stmt.execute(sql);

        }catch (Exception e){
            e.getMessage();
        }
    }
}
