package DBConfig;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@AllArgsConstructor
public class PostgreConnector {

    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "Guko";
    public static final String URL = "jdbc:postgresql://localhost:5432/northwind";

    static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static Statement getStatement() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection.createStatement();
    }
}