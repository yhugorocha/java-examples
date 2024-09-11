package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection con;

    private Connection getConexao(){
        try {
            if(con != null && !con.isClosed()){
                return con;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        con = FabricaConexao.getConexao("curso_java");
        return con;
    }

    public int incluirDAO(String sql, Object... atributos) {

        try(PreparedStatement stmt = getConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
            adicionarAtributos(stmt, atributos);

            if(stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();
                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }

            return -1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int index = 1;
        for(Object atributo: atributos){
            if(atributo instanceof String){
                stmt.setString(index, (String) atributo);
            }else if(atributo instanceof Integer){
                stmt.setInt(index, (Integer) atributo);
            }
            //
            index++;
        }
    }

    public void close(){
        try {
            getConexao().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            con = null;
        }
    }



}
