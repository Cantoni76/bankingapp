package repository;

import model.User;

import java.sql.*;


public class UserRepository {

    private String dbUserName = "root";
    private String dbPassword = "Hanna2008";
    private String dbUrl = "jdbc:mysql://localhost:3306/banking_app?serverTimezone=UTC";

    public User findUserById(int id) throws SQLException {

        User user = null;

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM  user WHERE id = ?");
        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            user = new User (
                    rs.getInt("id"),
                    rs.getString("password"),
                    rs.getString("firstName"),
                    rs.getString("lastName")
            );
        }

        return user;
    }
}
