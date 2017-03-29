/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.Equipo;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.entidades.Persona;
import co.edu.poli.regequipos.entidades.TipoEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jlrodriguez
 */
public class EquipoDao {
    private Connection con;
    private Conexion conexion;
    public List<Equipo> consultaEquipos(Long identificacion) throws Exception {
        List<Equipo> lstEquipo = new ArrayList<>();
        Equipo e = new Equipo();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {            
            sql = "select e.serial, e.observaciones, e.id_marca, e.identificacion, m.nom_marca, nom_tipo_equipo "
                    + " from equipo e inner join marca m on (e.id_marca = m.id_marca) "
                    + "inner join tipo_equipo t on (m.id_tipo_equipo=t.id_tipo_equipo) "
                    + "inner join persona p on (e.identificacion = p.identificacion) "
                    + "where 1=1 ";
            
            if (identificacion != null) {
                sql += "AND e.identificacion = " + identificacion;
            }
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                e = new Equipo();
                Marca m = new Marca();
                m.setNomMarca(rs.getString("nom_marca"));
                TipoEquipo t = new TipoEquipo();
                t.setNomTipoEquipo(rs.getString("nom_tipo_equipo"));
                m.setIdTipoEquipo(t);
                e.setIdMarca(m);
                Persona p = new Persona();
                p.setIdentificacion(rs.getLong("identificacion"));
                e.setIdentificacion(p);
                e.setSerial(rs.getString("serial"));
                e.setObservaciones(rs.getString("observaciones"));
                lstEquipo.add(e);
            }
            return lstEquipo;

        }catch(Exception ex) {
            throw new Exception(ex);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }
    }
    public void insertarEquipo(Equipo equipo) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("insert into equipo values (?,?,?,?)");
            pstm.setString(1, equipo.getSerial());
            pstm.setString(2, equipo.getObservaciones());
            pstm.setInt(3, equipo.getIdMarca().getIdMarca());
            pstm.setLong(4, equipo.getIdentificacion().getIdentificacion());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }
}
