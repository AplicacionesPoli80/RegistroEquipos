package co.edu.polo.regequipos.dao;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.entidades.TipoEquipo;
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
        Marca m;
        TipoEquipo t;
        String sql;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conexion = new Conexion();
        con = conexion.conectarBD();
        try {
            sql = "select m.id_marca, m.nom_marca, m.id_tipo_equipo, t.nom_tipo_equipo from marca m inner join tipo_equipo t on "
                    + "(m.id_tipo_equipo=t.id_tipo_equipo) where 1=1";
            if (nomMarca != null) {
                sql += " AND UPPER(nom_marca) like '%" + nomMarca + "%' ";
            }
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                m = new Marca();
                m.setIdMarca(rs.getInt("id_marca"));
                m.setNomMarca(rs.getString("nom_marca"));
                t = new TipoEquipo();
                t.setIdTipoEquipo(rs.getInt("id_tipo_equipo"));
                t.setNomTipoEquipo(rs.getString("nom_tipo_equipo"));
                m.setIdTipoEquipo(t);                
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
            pstm = con.prepareStatement("insert into marca (nom_marca, id_tipo_equipo) values (?,?)");
            pstm.setString(1, marca.getNomMarca());
            pstm.setInt(2, marca.getIdTipoEquipo().getIdTipoEquipo());
            
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
            pstm = con.prepareStatement("update Marca set nom_marca = ?, id_tipo_equipo = ? "
                    + "where id_marca = ? ");
            pstm.setString(1, marca.getNomMarca());
            pstm.setInt(2, Integer.parseInt(marca.getIdTipoEquipo().getIdTipoEquipo().toString()));
            pstm.setInt(3, marca.getIdMarca());
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
                    + "where id_marca = ?");
            pstm.setInt(1, marca.getIdMarca());
            pstm.executeUpdate();/*Ejecutar el cambio en la base de datos*/

        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            pstm.close();
            con.close();
        }
    }

}
