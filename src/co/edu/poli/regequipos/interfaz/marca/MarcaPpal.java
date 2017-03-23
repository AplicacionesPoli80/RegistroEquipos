/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package co.edu.poli.regequipos.interfaz.marca;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.model.MarcaModel;
import co.edu.polo.regequipos.dao.MarcaDao;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Duban Ruiz
 */ 
public class MarcaPpal extends javax.swing.JFrame {

    private MarcaDao marcaDao= new MarcaDao();
    
    /**
     * Creates new form MarcaPpal
     */
    public MarcaPpal() {
        
       try {
            marcaDao = new MarcaDao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
    }
        
    public void refrescarTabla() {
        try {
            List<Marca> lstMarca = marcaDao.consultaMarca(null);
            MarcaModel model = new MarcaModel(lstMarca);
            this.tblMarca.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(),
                    " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblmarca = new javax.swing.JLabel();
        txtIdMarca = new javax.swing.JTextField();
        lblNomMarca = new javax.swing.JLabel();
        lblIdTipoEquipo = new javax.swing.JLabel();
        txtIdTipoEquipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        btn_N_marca = new javax.swing.JButton();
        btn_M_marca = new javax.swing.JButton();
        btn_E_marca = new javax.swing.JButton();
        txtNomMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("MARCAS GENERALES");

        lblmarca.setText("IDENTIFICADOR MARCA: ");

        txtIdMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMarcaActionPerformed(evt);
            }
        });

        lblNomMarca.setText("NOMBRE MARCA: ");

        lblIdTipoEquipo.setText("IDENTIFICADOR TIPO EQUIPO: ");

        btnBuscar.setText("BUSCAR");

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMarca);

        btn_N_marca.setText("NUEVA MARCA");
        btn_N_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_N_marcaActionPerformed(evt);
            }
        });

        btn_M_marca.setText("MODIFICAR MARCA");
        btn_M_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_M_marcaActionPerformed(evt);
            }
        });

        btn_E_marca.setText("ELIMINAR MARCA");
        btn_E_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_E_marcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNomMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtIdTipoEquipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(txtIdMarca, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_N_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btn_M_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btn_E_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmarca)
                    .addComponent(txtIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomMarca)
                    .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdTipoEquipo)
                    .addComponent(txtIdTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_N_marca)
                    .addComponent(btn_M_marca)
                    .addComponent(btn_E_marca))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMarcaActionPerformed

    private void btn_N_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_N_marcaActionPerformed
       
   /**     GestionMarca gm = new GestionMarca(marcaDao,false);
        gm.setVisible(true);
        **/
    }//GEN-LAST:event_btn_N_marcaActionPerformed

    private void btn_M_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_M_marcaActionPerformed
       
        int row = this.tblMarca.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un parametro", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    /**    Marca tmpMarca = (Marca) this.tblMarca.getValueAt(row, MarcaModel.OBJECT_COL);
        GestionMarca gp = new GestionMarca(marcaDao, this, tmpMarca, true);
        gp.setVisible(true);
        
       **/ 
    }//GEN-LAST:event_btn_M_marcaActionPerformed

    private void btn_E_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_E_marcaActionPerformed
        
        try {
            int row = this.tblMarca.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Debe Seleccionar un parametro", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }int rta = JOptionPane.showConfirmDialog(this, "¿Está seguro de ELIMINAR este parametro?",
                    "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(rta!= JOptionPane.YES_OPTION){
                return;
            }
            Marca tmpMarca = (Marca) this.tblMarca.getValueAt(row, MarcaModel.OBJECT_COL);
            marcaDao.eliminarMarca(tmpMarca);
            refrescarTabla();
            JOptionPane.showMessageDialog(this, "Marca Eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
}       catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error eliminando Datos: " + e.getMessage(),
                                          "Error en proceso", JOptionPane.ERROR_MESSAGE);
        }    
            
    }//GEN-LAST:event_btn_E_marcaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_E_marca;
    private javax.swing.JButton btn_M_marca;
    private javax.swing.JButton btn_N_marca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdTipoEquipo;
    private javax.swing.JLabel lblNomMarca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblmarca;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTextField txtIdMarca;
    private javax.swing.JTextField txtIdTipoEquipo;
    private javax.swing.JTextField txtNomMarca;
    // End of variables declaration//GEN-END:variables
}
