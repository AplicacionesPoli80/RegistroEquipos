/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.Parametros;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author Usuario
 */
public class ParametrosModel extends AbstractTableModel{
    public static final int OBJECT_COL=-1;
    public static final int COL_ID_PARAM=0;
    public static final int COL_VALOR_PARAM=1;
    public static final int COL_DESC_PARAM=2;
    private String[] columnNames={"ID PARAMETRO", "VALOR PARAMETRO", "DESCRIPCION PARAMETRO"};
    private List<Parametros> lstParametros;
    public ParametrosModel(List<Parametros> lstParametros){
        this.lstParametros= lstParametros;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return lstParametros.size();
    }
    public String getColumnName(int col){
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        Parametros p = lstParametros.get(row);
        switch(col){
        case COL_ID_PARAM:
            return p.getParametrosPK().getIdParam();
        case COL_VALOR_PARAM:
            return p.getParametrosPK().getValorParam();
        case COL_DESC_PARAM:
            return p.getDescParam();
        case OBJECT_COL:
            return p;
        default:
            return p.getDescParam();
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
    
}

     

