/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.parametros;

import co.edu.poli.regequipos.entidades.Parametros;
import co.edu.poli.regequipos.entidades.ParametrosPK;
import co.edu.polo.regequipos.dao.ParametrosDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GestionParametros extends javax.swing.JDialog {

    private ParametrosDao paramDao;
    private ParametrosPpal parametrosPpal;
    private Parametros paramAnt = null;
    private boolean updateMode = false;

    public GestionParametros(ParametrosDao ip_paramDao, ParametrosPpal ip_parametroPpal,
            Parametros ip_paramAnt, boolean ip_updateMode) {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.paramDao = ip_paramDao;
        this.parametrosPpal = ip_parametroPpal;
        this.paramAnt = ip_paramAnt;
        this.updateMode = ip_updateMode;
        if (updateMode) {
            this.setTitle("Actualizar Parámetros");
            this.lbl_titulo.setText("Actualizar Parámetros");
            llenarFormulario(this.paramAnt);
        } else {
            this.txt_idParam.setEditable(true);
            this.txt_vlrParam.setEditable(true);
        }
    }

    public void llenarFormulario(Parametros parametro) {
        this.txt_idParam.setText(parametro.getParametrosPK().getIdParam());
        this.txt_vlrParam.setText(parametro.getParametrosPK().getValorParam());
        this.txt_desc_param.setText(parametro.getDescParam());
        this.txt_idParam.setEditable(false);
        this.txt_vlrParam.setEditable(false);
    }

    public GestionParametros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_frm_param = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_idParam = new javax.swing.JTextField();
        lbl_vlrParam = new javax.swing.JLabel();
        txt_vlrParam = new javax.swing.JTextField();
        txt_desc_param = new javax.swing.JTextField();
        lbl_desc_param = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_frm_param.setPreferredSize(new java.awt.Dimension(399, 231));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("GESTIONAR PARAMETROS");

        jLabel1.setText("Identificador Parametro:");

        lbl_vlrParam.setText("Valor Parametro:");

        lbl_desc_param.setText("Descripcion:");

        btn_guardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_frm_paramLayout = new javax.swing.GroupLayout(pnl_frm_param);
        pnl_frm_param.setLayout(pnl_frm_paramLayout);
        pnl_frm_paramLayout.setHorizontalGroup(
            pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_frm_paramLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(lbl_vlrParam)
                        .addComponent(lbl_desc_param))
                    .addComponent(btn_guardar))
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_frm_paramLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_desc_param, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_vlrParam, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idParam, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_frm_paramLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btn_cancelar)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_frm_paramLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(98, 98, 98))
        );
        pnl_frm_paramLayout.setVerticalGroup(
            pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_frm_paramLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_titulo)
                .addGap(26, 26, 26)
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_idParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vlrParam)
                    .addComponent(txt_vlrParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_desc_param, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_desc_param))
                .addGap(43, 43, 43)
                .addGroup(pnl_frm_paramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_frm_param, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_frm_param, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String idParam = this.txt_idParam.getText();
        String valorParam = this.txt_vlrParam.getText();
        String descParam = this.txt_desc_param.getText();
        Parametros param = null;
        if (updateMode) {
            param = paramAnt;
            param.setDescParam(descParam);
        } else {
            param = new Parametros();
            ParametrosPK paramPk = new ParametrosPK();
            paramPk.setIdParam(idParam);
            paramPk.setValorParam(valorParam);
            param.setParametrosPK(paramPk);
            param.setDescParam(descParam);
        }

        try {
            if (updateMode) {
                paramDao.actualizarParametro(param);
            } else {
                paramDao.insertarParametro(param);
            }
            this.setVisible(false);
            parametrosPpal.refrescarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionParametros dialog = new GestionParametros(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_desc_param;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_vlrParam;
    private javax.swing.JPanel pnl_frm_param;
    private javax.swing.JTextField txt_desc_param;
    private javax.swing.JTextField txt_idParam;
    private javax.swing.JTextField txt_vlrParam;
    // End of variables declaration//GEN-END:variables
}