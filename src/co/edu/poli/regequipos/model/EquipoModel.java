/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.Equipo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jlrodriguez
 */
public class EquipoModel extends AbstractTableModel{
    public static final int OBJECT_COL=-1;
    public static final int COL_SERIAL=0;
    public static final int COL_MARCA=1;
    public static final int COL_TIPO_EQUIPO=2;
    public static final int COL_OBSERVACION=3;
        
    private String[] columnNames={"SERIAL", "MARCA", "TIPO EQUIPO", "OBSERVACIONES"};
    private List<Equipo> lstEquipo;
    public EquipoModel(List<Equipo> lstEquipo){
        this.lstEquipo = lstEquipo;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return lstEquipo.size();
    }
    public String getColumnName(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        Equipo e = lstEquipo.get(row);
        switch(col){
        case COL_SERIAL:
            return e.getSerial();
        case COL_MARCA:
            return e.getIdMarca().getNomMarca();
        case COL_TIPO_EQUIPO:
            return e.getIdMarca().getIdTipoEquipo().getNomTipoEquipo();
        case COL_OBSERVACION:
            return e.getObservaciones();
        case OBJECT_COL:
            return e;
        default:
            return e;
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}
