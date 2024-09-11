package jdbc_especification.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static String url = "jdbc:postgresql://localhost:5432/curso_java";
    private static String user = "postgres";
    private static String password = "postgres";


    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
