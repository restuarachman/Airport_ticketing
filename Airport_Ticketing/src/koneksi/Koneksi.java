package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    public static Connection connection;
    public static Connection getConnection() throws SQLException{
        if (connection == null){
            try {
    
                connection = DriverManager.getConnection("jdbc:mysql://localhost/airport_ticketing","root","rootme");
                System.out.println("Berhasil KONAK");
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return connection;
    }
}
