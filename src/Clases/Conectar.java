package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {

    Connection conn = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/citas?autoReconnect=true&useSSL=false", "root", "mariadb");
            //JOptionPane.showMessageDialog(null,"Conexion correcta");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conn = null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
            conn = null;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conn = null;
        } finally {
            //System.out.println("Conexión en linea");
            if (conn != null) {
                System.out.println("Conexion en linea");
            } else {
                System.out.println("Error de Conexion");
            }
            try {
                return conn;
            } catch (Exception e) {

            }
        }
        return null;
    }

    public void desconectar() {
        conn = null;
        System.out.println("Conexion Cerrada");
    }
}
