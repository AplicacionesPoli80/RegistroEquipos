/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.marca;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.entidades.TipoEquipo;
import co.edu.polo.regequipos.dao.MarcaDao;
import co.edu.polo.regequipos.dao.TipoEquipoDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Duban Ruiz
 */
public class GestionMarca extends javax.swing.JDialog {

   private MarcaDao marcaDao;
    private MarcaPpal marcaPpal;
    private Marca marcaAnt = null;
    private boolean updateMode = false;
    
    private TipoEquipoDao tipoEquipoDao;
    
    public GestionMarca(MarcaDao ip_marcaDao, MarcaPpal ip_marcaPpal,
            Marca ip_marcaAnt, boolean ip_updateMode) {
        initComponents();        
        this.marcaDao = ip_marcaDao;
        this.marcaPpal = ip_marcaPpal;
        this.marcaAnt = ip_marcaAnt;
        this.updateMode = ip_updateMode;
        if (updateMode) {
            this.setTitle("Actualizar Marcas");
            this.lblTitulo.setText("Actualizar Marca");
            llenarFormulario(this.marcaAnt);
        } else {
            this.cmbIdTipoEquipo.setEditable(true);
            this.txtNomMarca.setEditable(true);
        }
        llenarListaTipoEquipos();
    }
   public void llenarFormulario(Marca marca) {
        //this.cmbIdTipoEquipo.setText(marca.getIdTipoEquipo());
        this.txtNomMarca.setText(marca.getNomMarca());
        this.cmbIdTipoEquipo.setEditable(false);
    }
    
   public void llenarListaTipoEquipos(){
        List<TipoEquipo> lstTipoEquipos = new ArrayList<>();
        try{
            this.cmbIdTipoEquipo.addItem("0 - Seleccione");
            tipoEquipoDao = new TipoEquipoDao();
            lstTipoEquipos = tipoEquipoDao.consultaTipoEquipo(null);
            if(lstTipoEquipos!=null && lstTipoEquipos.size()>0){
                for(TipoEquipo t : lstTipoEquipos){                    
                    this.cmbIdTipoEquipo.addItem(t.getIdTipoEquipo()+" - "+t.getNomTipoEquipo());
                }                    
            }
            this.cmbIdTipoEquipo.setEditable(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public GestionMarca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        initComponents();
        llenarListaTipoEquipos();
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
        lblNomMarca = new javax.swing.JLabel();
        lblIdeTiEquipo = new javax.swing.JLabel();
        txtNomMarca = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbIdTipoEquipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitulo.setText("Registrar marcas");

        lblNomMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomMarca.setText("Nombre marca:");

        lblIdeTiEquipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIdeTiEquipo.setText("Identificador tipo equipo:");

        txtNomMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(26, 84, 147));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(26, 84, 147));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbIdTipoEquipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomMarca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnGuardar))
                            .addComponent(lblIdeTiEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbIdTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnCancelar)))))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdeTiEquipo)
                    .addComponent(cmbIdTipoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomMarca)
                    .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
/*
        String nomMarca = this.txtNomMarca.getText();
        int idTipoEquipo = this.cmbIdTipoEquipo.getSelectedItem();
         Marca marca = null;
        if (updateMode) {
            marca = marcaAnt;
            marca.setIdTipoEquipo(idTipoEquipo);
            marca.setNomMarca(nomMarca);
        } else {
            marca = new Marca();
            marca.setIdTipoEquipo(idTipoEquipo);
            marca.setNomMarca(nomMarca);
            
        }

        try {
            if (updateMode) {
                marcaDao.actualizarMarca(marca);
            } else {
                marcaDao.insertarMarca(marca);
            }
            this.setVisible(false);
            marcaPpal.refrescarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }


*/

        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionMarca dialog = new GestionMarca(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbIdTipoEquipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIdeTiEquipo;
    private javax.swing.JLabel lblNomMarca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNomMarca;
    // End of variables declaration//GEN-END:variables
}
