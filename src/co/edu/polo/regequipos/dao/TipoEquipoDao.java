/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.TipoEquipo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TipoEquipoDao {
     private Connection con;
    private Conexion conexion;

    public List<TipoEquipo> consultaTipoEquipo(String nomTipoEquipo) throws Exception {
        List<TipoEquipo> lstTipoEquipo = new ArrayList<>();
        TipoEquipo p = new TipoEquipo();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {
            sql = "select ID_TIPO_EQUIPO, NOM_TIPO_EQUIPO from tipo_equipo ";
            if ((nomTipoEquipo != null && nomTipoEquipo.length() > 0)) {
                sql += "where UPPER(nom_tipo_equipo) like '%" + nomTipoEquipo + "%'";                             
            }
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                p = new TipoEquipo();     
                p.setIdTipoEquipo(rs.getInt("id_tipo_equipo"));
                p.setNomTipoEquipo(rs.getString("nom_tipo_equipo"));
                lstTipoEquipo.add(p);
            }
            return lstTipoEquipo;

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }

    }
    
}
