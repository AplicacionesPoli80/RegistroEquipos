/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.menu;

import co.edu.poli.regequipos.interfaz.marca.MarcaPpal;
import co.edu.poli.regequipos.interfaz.parametros.ParametrosPpal;
import co.edu.poli.regequipos.interfaz.persona.PersonaPpal;
import co.edu.poli.regequipos.interfaz.registro.RegistroPpal;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    RegistroPpal registroPpal;
    PersonaPpal personaPpal;
    ParametrosPpal parametrosPpal;
    MarcaPpal marcaPpal;
    
    public Menu() {
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

        pnl_Ppal = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_registro = new javax.swing.JLabel();
        lbl_parametros = new javax.swing.JLabel();
        btn_registro = new javax.swing.JButton();
        btn_equipos = new javax.swing.JButton();
        btn_tipo_equipos = new javax.swing.JButton();
        btn_marcas = new javax.swing.JButton();
        btn_personas = new javax.swing.JButton();
        btn_parametros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_titulo.setText("Menú Opciones");

        lbl_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_registro.setText("Registro");

        lbl_parametros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_parametros.setText("Parametros");

        btn_registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_registro.setText("Registro");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        btn_equipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_equipos.setText("Equipos");
        btn_equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equiposActionPerformed(evt);
            }
        });

        btn_tipo_equipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_tipo_equipos.setText("Tipo Equipos");

        btn_marcas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_marcas.setText("Marcas");
        btn_marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcasActionPerformed(evt);
            }
        });

        btn_personas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_personas.setText("Personas");
        btn_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personasActionPerformed(evt);
            }
        });

        btn_parametros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_parametros.setText("Parametros");
        btn_parametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_parametrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_PpalLayout = new javax.swing.GroupLayout(pnl_Ppal);
        pnl_Ppal.setLayout(pnl_PpalLayout);
        pnl_PpalLayout.setHorizontalGroup(
            pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PpalLayout.createSequentialGroup()
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_PpalLayout.createSequentialGroup()
                            .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_PpalLayout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(btn_registro))
                                .addGroup(pnl_PpalLayout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(lbl_registro))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PpalLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btn_equipos)))
                            .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_PpalLayout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_tipo_equipos)
                                        .addComponent(btn_marcas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PpalLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_parametros)
                                    .addGap(21, 21, 21)))))
                    .addGroup(pnl_PpalLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lbl_titulo)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnl_PpalLayout.setVerticalGroup(
            pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PpalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_parametros, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registro)
                    .addComponent(btn_tipo_equipos))
                .addGap(18, 18, 18)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_equipos)
                    .addComponent(btn_marcas))
                .addGap(18, 18, 18)
                .addComponent(btn_personas)
                .addGap(18, 18, 18)
                .addComponent(btn_parametros)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Ppal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Ppal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        try{
        registroPpal = new RegistroPpal();
        registroPpal.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error consultando Datos: " + e.getMessage(),
                    "Error en consulta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_equiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equiposActionPerformed
        
    }//GEN-LAST:event_btn_equiposActionPerformed

    private void btn_marcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcasActionPerformed
        marcaPpal = new MarcaPpal();
        marcaPpal.setVisible(true);
    }//GEN-LAST:event_btn_marcasActionPerformed

    private void btn_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personasActionPerformed
        personaPpal = new PersonaPpal();
        personaPpal.setVisible(true);
    }//GEN-LAST:event_btn_personasActionPerformed

    private void btn_parametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_parametrosActionPerformed
        parametrosPpal = new ParametrosPpal();
        parametrosPpal.setVisible(true);
    }//GEN-LAST:event_btn_parametrosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_equipos;
    private javax.swing.JButton btn_marcas;
    private javax.swing.JButton btn_parametros;
    private javax.swing.JButton btn_personas;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_tipo_equipos;
    private javax.swing.JLabel lbl_parametros;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_Ppal;
    // End of variables declaration//GEN-END:variables
}
