package de.telran.database_connection;

import java.io.IOException;
import java.sql.*;

public class DB {
    public static final String NAME_USER = "root";
    public static final String PASSWORD = "CT&kRWp2xsth%r";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }
    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws ClassCastException, SQLException, IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        statement.executeUpdate("DROP TABLE IF EXISTS Persons ");
        statement.executeUpdate("CREATE TABLE Persons (" +
                "FirstName varchar(255)," +
                "City varchar(255))");

        statement.executeUpdate("INSERT INTO Persons (FirstName, City) value ('Alex', 'Goettingen')");
    }
}
