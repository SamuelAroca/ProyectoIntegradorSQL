package principal.logANDres;

import java.sql.*;

public class Conexion {

    public final String BASE = "prointegrador";
    public final String USERNAME = "root";
    public final String PASSWORD = "tobygemimo345";
    public final String URL = "jdbc:mysql://localhost:3306/" + BASE;
    private Connection con = null;

    public Connection getConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("e");
        }
        return con;
    }
}
