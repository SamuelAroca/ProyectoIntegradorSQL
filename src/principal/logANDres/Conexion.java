package principal.logANDres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static final String BASE = "prointegrador";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "tobygemimo345";
    public static final String URL = "jdbc:mysql://localhost:3306/" + BASE;
    private Connection con = null;
    
    public Connection getConection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("e");
        } 
        return con;
    }
}
