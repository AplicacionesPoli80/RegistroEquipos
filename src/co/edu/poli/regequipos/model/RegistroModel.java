/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.Registro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jlrodriguez
 */
public class RegistroModel extends AbstractTableModel{
    public static final int OBJECT_COL=-1;
    public static final int COL_SERIAL_EQUIPO=0;
    public static final int COL_DESC_EQUIPO=1;    
    public static final int COL_INGRESO=2;
    public static final int COL_SALIDA=3;
    public static final int COL_REG_INGRESO=4;
    public static final int COL_REG_SALIDA=5;
    public static final int COL_OBSERVACION=6;
    
    private String[] columnNames={"SERIAL EQUIPO", "DESCRIPCIÓN EQUIPO", "INGRESO", "SALIDA", "REGISTRA INGRESO", "REGISTRA SALIDA", "OBSERVACIONES"};
    private List<Registro> lstRegistro;
    
    public RegistroModel(List<Registro> lstRegistro){
        this.lstRegistro= lstRegistro;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        if(lstRegistro != null && lstRegistro.size() > 0){
            return lstRegistro.size();
        }else{
            return 0;
        }
    }
    public String getColumnName(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        Registro r = lstRegistro.get(row);
        switch(col){
        case COL_SERIAL_EQUIPO:
            return r.getSerial().getSerial();
        case COL_DESC_EQUIPO:
            return r.getSerial().getIdMarca().getIdTipoEquipo().getNomTipoEquipo()+" - "+r.getSerial().getIdMarca().getNomMarca();
        case COL_INGRESO:
            return r.getFechaIngreso();
        case COL_SALIDA:
            return r.getFechaSalida() != null ? r.getFechaSalida() : "";
        case COL_REG_INGRESO:
            return r.getUsuarioIngreso();
        case COL_REG_SALIDA:
            return r.getUsuarioSalida() != null ? r.getUsuarioSalida() : "";
        case COL_OBSERVACION:
            return r.getObservacion() != null ? r.getObservacion() : "";
        case OBJECT_COL:
            return r;
        default:
            return r;
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}
