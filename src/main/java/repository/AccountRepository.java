package repository;

import model.Account;
import model.User;

import java.sql.*;

public class AccountRepository {

    private String dbUserName = "root";
    private String dbPassword = "Hanna2008";
    private String dbUrl = "jdbc:mysql://localhost:3306/banking_app?serverTimezone=UTC";

    public Account getAccountById(int id) throws SQLException {
        Account account = null;

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM  account WHERE id = ?");
        ps.setInt(1,id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));

            account.setAccountNo(rs.getString("accountNo"));
            account.setUserId(rs.getInt("userId"));
            account.setBalance(rs.getBigDecimal("balance"));
            account.setAccountType(rs.getString("accountType"));
            account.setCurrency(rs.getString("currency"));

        };

        return account;
    }

    public Account getAccountByAccountNumber(String accountNumber) throws SQLException {
        Account account = null;

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM  account WHERE accontNo = ?");
        ps.setString(1, accountNumber);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setAccountNo(rs.getString("accountNo"));
            account.setUserId(rs.getInt("userId"));
            account.setBalance(rs.getBigDecimal("balance"));
            account.setAccountType(rs.getString("accountType"));
            account.setCurrency(rs.getString("currency"));

        };

        return account;
    }

    public Account getAccountByUserId(int userId) throws SQLException {
        Account account = null;

        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

        PreparedStatement ps = conn.prepareStatement("SELECT * FROM account WHERE userId=?");

        ps.setInt(1, userId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            account = new Account();
            account.setId(rs.getInt("id"));
            account.setAccountNo(rs.getString("accountNo"));
            account.setUserId(rs.getInt("userId"));
            account.setBalance(rs.getBigDecimal("balance"));
            account.setAccountType(rs.getString("accountType"));
            account.setCurrency(rs.getString("currency"));


        }
        return account;
    }
}
