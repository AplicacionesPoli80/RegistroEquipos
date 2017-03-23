package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarcaDao {

    private Connection con;
    private Conexion conexion;

    public List<Marca> consultaMarca(String nomMarca) throws Exception {
        List<Marca> lstMarca = new ArrayList<>();
        Marca m = new Marca();
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {
            sql = "select id_marca, nom_marca, id_tipo_equipo from marca where 1=1";
            if (nomMarca != null) {
                sql += " AND UPPER(nom_marca) like '%" + nomMarca + "%' ";
            }
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                m = new Marca();
                m.setNomMarca(rs.getString("nom_Marca"));
                lstMarca.add(m);
            }
            return lstMarca;

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            rs.close();
            con.close();
        }

    }

    public void insertarMarca(Marca marca) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            //int marca = (TipoEquipo)marca.getIdTipoEquipo();
            pstm = con.prepareStatement("insert into parametros values (?,?,?)");
            pstm.setInt(1, marca.getIdMarca());
            pstm.setString(2, marca.getNomMarca());
            // pstm.setInt(3, marca.getIdTipoEquipo());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

    public void actualizarMarca(Marca marca) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("update Marca set nom_marca = ? "
                    + "where id_marca = ? and id_tipo_equipo = ?");
            pstm.setString(1, marca.getNomMarca());
            pstm.setInt(2, marca.getIdMarca());
            // pstm.setInt(3, marca.getIdTipoEquipo());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

    public void eliminarMarca(Marca marca) throws Exception {
        conexion = new Conexion();
        con = conexion.conectarBD();
        PreparedStatement pstm = null;
        try {
            pstm = con.prepareStatement("delete from Marca "
                    + "where id_marca = ? and nom_marca = ?");
            pstm.setString(1, marca.getNomMarca());
            pstm.setInt(2, marca.getIdMarca());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

}
