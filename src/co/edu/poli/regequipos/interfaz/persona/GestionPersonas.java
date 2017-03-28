/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.persona;

import co.edu.poli.regequipos.conexion.Conexion;
import co.edu.poli.regequipos.constantes.ConstantesApp;
import co.edu.poli.regequipos.entidades.Parametros;
import co.edu.poli.regequipos.entidades.Persona;
import co.edu.polo.regequipos.dao.ParametrosDao;
import co.edu.polo.regequipos.dao.PersonaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class GestionPersonas extends javax.swing.JDialog {

    private Connection con;
    private Conexion conexion;
    private PersonaDao personaDao;
    private PersonaPpal personaPpal;
    private Persona personaAnt = null;
    private boolean updateMode = false;
    //Otros objetos
    private ParametrosDao paramDao;

    public GestionPersonas(PersonaDao ip_personaDao, PersonaPpal ip_personaPpal,
            Persona ip_personaAnt, boolean ip_updateMode)throws Exception{

        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.personaDao = ip_personaDao;
        this.personaPpal = ip_personaPpal;
        this.personaAnt = ip_personaAnt;
        this.updateMode = ip_updateMode;        
        
        if (updateMode) {
            this.setTitle("Actualizar Persona");
            this.lbl_titulo.setText("Actualizar Persona");
            llenarFormulario(this.personaAnt);
        } else {
            this.txt_iden.setEditable(true);
            
        }
        //Cargar combo de tipos de identificación
        llenarTipoIdentificacion();
        llenarTipoPersona();
    }

    public void llenarFormulario(Persona persona) {
        this.cmb_tipo_iden.setSelectedItem(persona.getTipoIdentificacion());
        this.txt_iden.setText(persona.getIdentificacion().toString());
        this.txt_apellidos.setText(persona.getApellidos());
        this.txt_nombres.setText(persona.getNombres());
        this.cmb_tipo_persona.setSelectedItem(persona.getTipoPersona());
        this.txt_iden.setEditable(false);
        
    }
    public void llenarTipoIdentificacion(){
        List<Parametros> lstParam = new ArrayList();
        paramDao = new ParametrosDao();
        try{
            lstParam = paramDao.consultaParametros(ConstantesApp.PARAM_TIPOS_ID, null, null);
            for(Parametros p : lstParam){
                this.cmb_tipo_iden.addItem(p.getParametrosPK().getValorParam()+" - "+p.getDescParam());
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void llenarTipoPersona(){
        List<Parametros> lstParam= new ArrayList();
        try{
            lstParam = paramDao.consultaParametros(ConstantesApp.PARAM_TIPO_PERSONA, null, null);
            for(Parametros p : lstParam)
                this.cmb_tipo_persona.addItem(p.getParametrosPK().getValorParam()+" - "+p.getDescParam());            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    
    }
    

    public GestionPersonas(java.awt.Frame parent, boolean modal) {
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

        pnl_frm_persona = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_tipo_iden = new javax.swing.JLabel();
        lbl_iden = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_tipo_persona = new javax.swing.JLabel();
        cmb_tipo_iden = new javax.swing.JComboBox();
        txt_iden = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        cmb_tipo_persona = new javax.swing.JComboBox();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("Gestion   Personas");

        lbl_tipo_iden.setText("Tipo de Identificacion:");

        lbl_iden.setText("Identificacion:");

        lbl_apellidos.setText("Apellidos:");

        lbl_nombres.setText("Nombres:");

        lbl_tipo_persona.setText("Tipo de Persona:");

        cmb_tipo_iden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_idenActionPerformed(evt);
            }
        });

        cmb_tipo_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_tipo_personaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnl_frm_personaLayout = new javax.swing.GroupLayout(pnl_frm_persona);
        pnl_frm_persona.setLayout(pnl_frm_personaLayout);
        pnl_frm_personaLayout.setHorizontalGroup(
            pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_frm_personaLayout.createSequentialGroup()
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_frm_personaLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(lbl_titulo))
                    .addGroup(pnl_frm_personaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tipo_iden)
                            .addComponent(lbl_iden)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_nombres)
                            .addComponent(lbl_tipo_persona))
                        .addGap(28, 28, 28)
                        .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_iden)
                            .addComponent(txt_apellidos)
                            .addComponent(txt_nombres)
                            .addComponent(cmb_tipo_persona, 0, 110, Short.MAX_VALUE)
                            .addComponent(cmb_tipo_iden, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_frm_personaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_guardar)
                        .addGap(33, 33, 33)
                        .addComponent(btn_cancelar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnl_frm_personaLayout.setVerticalGroup(
            pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_frm_personaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo_iden)
                    .addComponent(cmb_tipo_iden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iden)
                    .addComponent(txt_iden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipo_persona)
                    .addComponent(cmb_tipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_frm_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_cancelar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_frm_persona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_frm_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_tipo_idenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_idenActionPerformed
        
    }//GEN-LAST:event_cmb_tipo_idenActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_iden!=null){
        String tipoIden = this.cmb_tipo_iden.getSelectedItem().toString().split(" - ")[0];
        Long identificacion=Long.parseLong(this.txt_iden.getText());
        String apellidos = this.txt_apellidos.getText();
        String nombres = this.txt_nombres.getText();
        String tipoPersona = this.cmb_tipo_persona.getSelectedItem().toString().split(" - ")[0];
        Persona persona = null;        
        if (updateMode) {
            persona = personaAnt;
            persona.setTipoIdentificacion(tipoIden);
            persona.setApellidos(apellidos);
            persona.setNombres(nombres);
            persona.setTipoPersona(tipoPersona);
        } else {
            persona = new Persona();            
            persona.setTipoIdentificacion(tipoIden);
            persona.setIdentificacion(identificacion);
            persona.setApellidos(apellidos);
            persona.setNombres(nombres);
            persona.setTipoPersona(tipoPersona);
        }

        try {
            if (updateMode) {
                personaDao.actualizarPersona(persona);
            } else {
                personaDao.insertarPersona(persona);
            }
            this.setVisible(false);
            personaPpal.refrescarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
        JOptionPane.showMessageDialog(this, "Debe digitar un numero de Identificacion",
                "Error ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void cmb_tipo_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_tipo_personaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_tipo_personaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionPersonas dialog = new GestionPersonas(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cmb_tipo_iden;
    private javax.swing.JComboBox cmb_tipo_persona;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_iden;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_tipo_iden;
    private javax.swing.JLabel lbl_tipo_persona;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_frm_persona;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_iden;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
