/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.constantes.ConstantesApp;
import co.edu.poli.regequipos.entidades.Equipo;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.entidades.Registro;
import co.edu.poli.regequipos.entidades.TipoEquipo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author jlrodriguez
 */
public class RegistroDao {

    private Connection con;
    private Conexion conexion;

    public List<Registro> consultarRegistro(String tipoConsulta, Long identificacion) throws Exception {
        List<Registro> lstRegistro= new ArrayList<>();
        Registro r = new Registro();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        
        try {
            con = conexion.conectarBD();
            sql = "select r.id_registro, r.fecha_ingreso, r.fecha_salida, r.observacion, r.serial, r.usuario_ingreso,"
                    + " r.usuario_salida, t.nom_tipo_equipo, m.nom_marca from registro r inner join equipo e on (r.serial = e.serial) "
                    + " inner join marca m on (e.id_marca = m.id_marca) inner join tipo_equipo t on (m.id_tipo_equipo = t.id_tipo_equipo) "
                    + " inner join persona p on (e.identificacion = p.identificacion) where  1=1 ";
            if (identificacion != null) {
                sql += " AND e.identificacion = " + identificacion;
            }
            if (ConstantesApp.TIPO_CONSULTA_ING.equals(tipoConsulta)) {
                sql += " AND r.fecha_salida is null ";
            }
            sql += " ORDER BY r.fecha_ingreso DESC ";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                r = new Registro();
                r.setIdRegistro(rs.getInt("id_registro"));
                r.setFechaIngreso(rs.getDate("fecha_ingreso"));
                r.setFechaSalida(rs.getDate("fecha_salida"));
                r.setObservacion(rs.getString("observacion"));
                Equipo e = new Equipo();
                e.setSerial(rs.getString("serial"));                
                r.setUsuarioIngreso(rs.getString("usuario_ingreso"));
                r.setUsuarioSalida(rs.getString("usuario_salida"));
                TipoEquipo t = new TipoEquipo();
                t.setNomTipoEquipo(rs.getString("nom_tipo_equipo"));
                Marca m = new Marca();
                m.setNomMarca(rs.getString("nom_marca"));
                m.setIdTipoEquipo(t);
                e.setIdMarca(m);
                r.setSerial(e);
                lstRegistro.add(r);
            }
            return lstRegistro;

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }
    }
    
    public void insertarRegistro(Registro registro) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("insert into registro (fecha_ingreso, fecha_salida, observacion, serial, usuario_ingreso, usuario_salida) "
                    + " values (?,?,?,?,?,?)");            
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            java.sql.Date date = new java.sql.Date(currentDate.getTime());

            pstm.setDate(1, date);
            pstm.setDate(2, null);
            pstm.setString(3, null);
            pstm.setString(4, registro.getSerial().getSerial());
            pstm.setString(5, "user");
            pstm.setString(6, null);
            pstm.executeUpdate();
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }
    
    public void actualizarRegistro(Registro registro) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("update registro set fecha_salida = ?, usuario_salida = ? "
                    + " where id_registro = ?");            
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentDate = calendar.getTime();
            java.sql.Date date = new java.sql.Date(currentDate.getTime());

            pstm.setDate(1, date);
            pstm.setString(2, "admin");
            pstm.setInt(3, registro.getIdRegistro());
            pstm.executeUpdate();
            
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }
}
