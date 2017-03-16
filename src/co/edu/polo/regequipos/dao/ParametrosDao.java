/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.Parametros;
import co.edu.poli.regequipos.entidades.ParametrosPK;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class ParametrosDao {

    private Connection con;
    private Conexion conexion;

    public List<Parametros> consultaParametros(String idParam, String valorParam, String descParam) throws Exception {
        List<Parametros> lstParametros = new ArrayList<>();
        Parametros p = new Parametros();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {
            sql = "select ID_PARAM, VALOR_PARAM, DESC_PARAM from PARAMETROS where  1=1 ";
            if (idParam != null && idParam.length() > 0) {
                sql += "AND UPPER(id_param) like '%" + idParam + "%'";
            }
            if (valorParam != null && valorParam.length() > 0) {
                sql += "AND UPPER(valor_param)like '%" + valorParam + "%'";
            }
            if (descParam != null && descParam.length() > 0) {
                sql += "AND UPPER(desc_param) like '%" + descParam + "%'";
            }
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                p = new Parametros();
                ParametrosPK pk = new ParametrosPK();
                pk.setIdParam(rs.getString("id_param"));
                pk.setValorParam(rs.getString("valor_param"));
                p.setParametrosPK(pk);
                p.setDescParam(rs.getString("desc_param"));
                lstParametros.add(p);
            }
            return lstParametros;

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }

    }

    public void insertarParametro(Parametros parametro) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("insert into parametros values (?,?,?)");
            pstm.setString(1, parametro.getParametrosPK().getIdParam());
            pstm.setString(2, parametro.getParametrosPK().getValorParam());
            pstm.setString(3, parametro.getDescParam());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

    public void actualizarParametro(Parametros parametro) throws Exception{
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("update parametros set desc_param = ? "
                    + "where id_param = ? and valor_param = ?");
            pstm.setString(1, parametro.getDescParam());
            pstm.setString(2, parametro.getParametrosPK().getIdParam());
            pstm.setString(3, parametro.getParametrosPK().getValorParam());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }
    
    public void eliminarParametro(Parametros parametro) throws Exception{
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("delete from parametros "
                    + "where id_param = ? and valor_param = ?");            
            pstm.setString(1, parametro.getParametrosPK().getIdParam());
            pstm.setString(2, parametro.getParametrosPK().getValorParam());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }
}
