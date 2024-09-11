package jdbc;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluirDAO(sql, "Francisca"));
        System.out.println(dao.incluirDAO(sql, "Igor Rocha"));
        System.out.println(dao.incluirDAO(sql, "Solud"));

        dao.close();

    }
}
