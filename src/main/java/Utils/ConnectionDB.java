package Utils;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionDB {
    private static Connection conn;
    public static Connection getDataSource() throws SQLException {
        if(conn != null && !conn.isClosed()) return conn;
        SQLServerDataSource dataSource = new SQLServerDataSource();
        Properties properties = new Properties();
        try(FileInputStream fileInputStream = new FileInputStream("db.properties")) {
            properties.load(fileInputStream);
            String jdbcUrl = (String) properties.get("jdbcUrl");
            String userName = (String) properties.get("userName");
            String password = (String) properties.get("password");

            dataSource.setURL(jdbcUrl);
            dataSource.setUser(userName);
            dataSource.setPassword(password);

        } catch (IOException e) {
            e.printStackTrace();
        }
        conn = dataSource.getConnection();
        return conn;
    }
}
