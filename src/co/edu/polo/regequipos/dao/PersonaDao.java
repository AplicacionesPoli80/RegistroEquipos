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
                //p.setTipoIdentificacion(rs.getString"tipo_identificacion"); Linea por corregir
                p.setIdentificacion(Long.valueOf(rs.getString("identificacion")));
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

    public void insertarPersona(Persona persona) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("insert into persona values (?,?,?,?,?)");
            pstm.setString(1, persona.getTipoIdentificacion());
            pstm.setLong(2, persona.getIdentificacion());
            pstm.setString(3, persona.getApellidos());
            pstm.setString(4, persona.getNombres());
            pstm.setString(5, persona.getTipoPersona());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

    public void actualizarPersona(Persona persona) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("update persona set Tipo_identificacion = ?, "
                    + "apellidos = ?, nombres = ?, tipo_persona = ? "
                    + "where identificacion = ?");
            pstm.setString(1, persona.getTipoIdentificacion());
            pstm.setString(2, persona.getApellidos());
            pstm.setString(3, persona.getNombres());
            pstm.setString(4, persona.getTipoPersona());
            pstm.setLong(5, persona.getIdentificacion());

            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

    public void eliminarPersona(Persona persona) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("delete persona where identificacion = ?");

            pstm.setLong(1, persona.getIdentificacion());

            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }

    }
}
