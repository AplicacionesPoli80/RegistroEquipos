
package co.edu.poli.regequipos.model;

import co.edu.poli.regequipos.entidades.Marca;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Duban Ruiz
 */
public class MarcaModel extends AbstractTableModel {
    public static final int OBJECT_COL = -1;
    public static final int OBJECT_ID_MARCA = 0;
    public static final int OBJECT_NOM_MARCA = 1;
    public static final int OBJECT_ID_TIPO_EQUIPO = 2;
    
    private final String[] columnNames = {"ID MARCA", "NOMBRE MARCA", "ID TIPO EQUIPO"};
    private List<Marca> lstMarca;
    public MarcaModel(List<Marca>lstMarca){
    this.lstMarca = lstMarca;
    }
    public int getColumnCount(){
    return columnNames.length;
    }
    
    public int getRowCount(){
    return lstMarca.size();
    }
    
    public String getColumnName(int col){
    return columnNames[col];
    }
    public Object getValueAt(int row, int col) {
        Marca m = lstMarca.get(row);
        switch (col) {
            case OBJECT_ID_MARCA:
                return m.getIdMarca();
            case OBJECT_NOM_MARCA:
                return m.getNomMarca();
            case OBJECT_ID_TIPO_EQUIPO:
                return m.getIdTipoEquipo();
            default:
                return m;

        }  
}
    public Class getColumnClass(int c){
    return getValueAt (0,c).getClass();
}
}
    
