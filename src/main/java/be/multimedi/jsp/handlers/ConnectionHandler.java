package be.multimedi.jsp.handlers;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionHandler implements Closeable, AutoCloseable {
    private static final String URL = "jdbc:mariadb://noelvaes.eu/javaeewondelgemDB";
    private static final String LOGIN = "javaeewondelgem";
    private static final String PSW = "java$$wond$lg$m2019";
    private static final String DRIVER = "org.mariadb.jdbc.Driver";

    private static Connection connection;
    private static ConnectionHandler self;


    private ConnectionHandler() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PSW);

        } catch (SQLException | ClassNotFoundException exc) {
            throw new RuntimeException(exc);
        }
    }

    public static ConnectionHandler getInstance() {
        if (self == null) {
            self = new ConnectionHandler();
        }
        return self;
    }

    public Connection getConnection() {
        return connection;
    }

    public PreparedStatement prepareStatement(String query) {
        try {
            return connection.prepareStatement(query);
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            connection.close();
        } catch (SQLException sqle) {
            throw new IOException(sqle);
        }
    }
}
