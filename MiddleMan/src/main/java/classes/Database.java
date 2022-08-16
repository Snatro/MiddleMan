package classes;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Database {



    public Connection getConnection() throws SQLException, IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("database.properties"));
        String url = properties.getProperty("databaseURL");
        String user = properties.getProperty("username");
        String pass = properties.getProperty("password");
        Connection connection = DriverManager
                .getConnection(url,user,pass);

        return connection;
    }
}
