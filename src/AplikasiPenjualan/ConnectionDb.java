package AplikasiPenjualan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDb {
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost:5432/PenjualanRumah";
    static final String DB_USER = "postgres";
    static final String DB_PASS = "RizalGanteng";
    
    static Connection conn;
    
    public static Connection connectDatabase() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (ClassNotFoundException cnf) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + cnf.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi database gagal: " + e.getMessage());            
        } catch (HeadlessException e){
            JOptionPane.showMessageDialog(null, "Terjadi error: " + e.getMessage());                        
        }

        return conn;
    }
}
