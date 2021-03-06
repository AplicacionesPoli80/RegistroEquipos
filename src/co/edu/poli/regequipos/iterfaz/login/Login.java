/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.iterfaz.login;

import co.edu.poli.regequipos.interfaz.menu.Menu;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Login extends javax.swing.JFrame {
    private static final String IMG_PATH = "src/imagenes/logo.png";

    Menu menu;
    public Login() {
        initComponents();
        this.lbl_titulo.setText("<html><center>SISTEMA DE REGISTRO Y CONTROL<br>DE EQUIPOS</center></html>");
        BufferedImage img;
        try {
            img = ImageIO.read(new File(IMG_PATH));
            ImageIcon icon = new ImageIcon(img);  
            icon.setDescription("Registro de equipos");            
            this.lblLogo.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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

        pnl_Ppal = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_Ppal.setBackground(new java.awt.Color(255, 255, 255));

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        lbl_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_usuario.setText("Usuario:");

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbl_contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbl_contraseña.setText("Contraseña:");

        btn_ingresar.setBackground(new java.awt.Color(26, 84, 147));
        btn_ingresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("INGRESAR");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblLogo.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout pnl_PpalLayout = new javax.swing.GroupLayout(pnl_Ppal);
        pnl_Ppal.setLayout(pnl_PpalLayout);
        pnl_PpalLayout.setHorizontalGroup(
            pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PpalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PpalLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usuario)
                    .addComponent(lbl_contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ingresar)
                    .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txt_usuario)))
                .addGap(70, 70, 70))
        );
        pnl_PpalLayout.setVerticalGroup(
            pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PpalLayout.createSequentialGroup()
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_PpalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_PpalLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contraseña)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btn_ingresar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Ppal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Ppal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        menu= new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btn_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_Ppal;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
