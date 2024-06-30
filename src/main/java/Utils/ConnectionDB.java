package Utils;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionDB {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;databaseName=DOM;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123";
    private static Connection conn;

    public static Connection getDataSource() throws SQLException {
        if (conn != null && !conn.isClosed()) return conn;
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setURL(JDBC_URL);
        dataSource.setUser(USERNAME);
        dataSource.setPassword(PASSWORD);
        conn = dataSource.getConnection();
        return conn;
    }
}
