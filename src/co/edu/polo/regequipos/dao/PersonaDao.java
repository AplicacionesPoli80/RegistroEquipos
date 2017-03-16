/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Software
 */
public class PersonaDao {

    private Connection con;
    private Conexion conexion;

    public List<Persona> consultaPersona(Long identificacion, String apellido, String nombre) throws Exception {
        List<Persona> lstPersona = new ArrayList<>();
        Persona p = new Persona();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {
            sql = "select IDENTIFICACION, APELLIDOS, NOMBRES from PERSONA where 1=1 ";
            if (identificacion != null) {
                sql += "AND UPPER(identificacion) like '%" + identificacion + "%'";
            }
            if (apellido != null && apellido.length() > 0) {
                sql += "AND UPPER(apellidos) like '%" + apellido + "%'";
            }
            if (nombre != null && nombre.length() > 0) {
                sql += "AND UPPER(nombres) like '%" + nombre + "%'";
            }

            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                p = new Persona();
                p.setIdentificacion(Long.valueOf(rs.getString("id_param")));
                p.setApellidos(rs.getString("apellidos"));
                p.setNombres(rs.getString("nombres"));

                lstPersona.add(p);
            }
            return lstPersona;

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }

    }
}
