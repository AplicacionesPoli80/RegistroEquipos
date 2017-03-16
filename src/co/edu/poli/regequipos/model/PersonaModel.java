/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.Persona;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author admin
 */
public class PersonaModel extends AbstractTableModel{
    public static final int OBJECT_COL=-1;
    public static final int COL_TIPO_IDENT=0;
    public static final int COL_IDENTIFICACION=1;
    public static final int COL_APELLIDOS=2;
    public static final int COL_NOMBRES=3;
    public static final int COL_TIPO_PERSONA=4;
    private String[] columnNames={"TIPO IDENTIFICACION", "IDENTIFICACION", "APELLIDOS", "NOMBRES", "TIPO PERSONA"};
    private List<Persona> lstPersona;
    public PersonaModel(List<Persona> lstPersona){
        this.lstPersona= lstPersona;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return lstPersona.size();
    }
    public String getColumnNames(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        Persona p = lstPersona.get(row);
        switch(col){
        case COL_TIPO_IDENT:
            return p.getTipoIdentificacion();
        case COL_IDENTIFICACION:
            return p.getIdentificacion();
        case COL_APELLIDOS:
            return p.getApellidos();
        case COL_NOMBRES:
            return p.getNombres();
        case COL_TIPO_PERSONA:
            return p.getTipoPersona();
        default:
            return p.getTipoIdentificacion();
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}
