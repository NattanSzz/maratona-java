package academy.devdojo.maratonajava.javacore.ZZJcrud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/book_store";
        String username = "root";
        String password = "avatar1,2,3@#";

        return DriverManager.getConnection(url, username, password);
    }

}
