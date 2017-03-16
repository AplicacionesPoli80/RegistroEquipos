/*
 *
 *
 *
 */
package co.edu.poli.regequipos.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Clase que contiene funciones de conexion a la BD
 *
 * @author juan manuel hoyos fuentes
 * @version 1.0 27/02/17
 * @see "CU-01 Conexion a BD.docx"
 */
public class Conexion {

    /**
     * objeto q guarda la conección a la base de datos
     */
    private Connection con;

    /**
     *
     * @return Conexión a BD
     * @throws Exception
     */
    public Connection conectarBD() throws Exception {
        Properties props = new Properties();
        props.load(getClass().getResourceAsStream("/co/edu/poli/regequipos/properties/Conexion.properties"));
        String user = props.getProperty("user");
        String password = props.getProperty("password");
        String url = props.getProperty("url");
        // Abrir COnexion
        con = DriverManager.getConnection(url, user, password);
        return con;
    }
}
