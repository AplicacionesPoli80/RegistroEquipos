/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.TipoEquipo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class TipoEquipoModel extends AbstractTableModel{
    public static final int OBJECT_COL=-1;
    public static final int COL_ID_TIPO_EQUIPO=0;
    public static final int COL_NOM_TIPO_EQUIPO=1;
   
    private String[] columnNames={"ID TIPO EQUIPO", "NOMBRE TIPO DE EQUIPO"};
    private List<TipoEquipo> lstTipoEquipo;
    public TipoEquipoModel(List<TipoEquipo> lstTipoEquipo){
        this.lstTipoEquipo= lstTipoEquipo;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return lstTipoEquipo.size();
    }
    public String getColumnNames(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        TipoEquipo p = lstTipoEquipo.get(row);
        switch(col){
        case COL_ID_TIPO_EQUIPO:
            return p.getIdTipoEquipo();
        case COL_NOM_TIPO_EQUIPO:
            return p.getNomTipoEquipo();
        case OBJECT_COL:
            return p;
        default:
            return p.getNomTipoEquipo();
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}
