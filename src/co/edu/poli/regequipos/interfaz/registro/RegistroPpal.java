/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.registro;

import co.edu.poli.interfaz.equipos.GestionEquipos;
import co.edu.poli.regequipos.constantes.ConstantesApp;
import co.edu.poli.regequipos.entidades.Equipo;
import co.edu.poli.regequipos.entidades.Persona;
import co.edu.poli.regequipos.entidades.Registro;
import co.edu.poli.regequipos.interfaz.menu.Menu;
import co.edu.poli.regequipos.interfaz.persona.GestionPersonas;
import co.edu.poli.regequipos.iterfaz.login.Login;
import co.edu.poli.regequipos.model.EquipoModel;
import co.edu.poli.regequipos.model.RegistroModel;
import co.edu.polo.regequipos.dao.EquipoDao;
import co.edu.polo.regequipos.dao.PersonaDao;
import co.edu.polo.regequipos.dao.RegistroDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author jlrodriguez
 */
public class RegistroPpal extends javax.swing.JFrame {

    PersonaDao personaDao;
    GestionPersonas gestionPer;
    EquipoDao equipoDao;
    RegistroDao registroDao;
    
    List<Equipo> lstEquipo = new ArrayList<>();
    /**
     * Creates new form RegistroPpal
     */
    public RegistroPpal() {
        initComponents();
        this.txt_iden.setFocusable(true);
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_registro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlDatosPersona = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTipoPersona = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTipoIden = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_iden = new javax.swing.JTextField();
        pnlEquipos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        btnAdicionarEquipo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_tab_registro = new javax.swing.JTabbedPane();
        pnl_ingresos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIngresos = new javax.swing.JTable();
        pnl_historico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Administración de Ingreso y Salida de Equipos");

        pnlDatosPersona.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Persona", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos: ");

        lblApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellidos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Persona: ");

        lblTipoPersona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoPersona.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tipo ID: ");

        lblTipoIden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoIden.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Identificación: ");

        txt_iden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosPersonaLayout = new javax.swing.GroupLayout(pnlDatosPersona);
        pnlDatosPersona.setLayout(pnlDatosPersonaLayout);
        pnlDatosPersonaLayout.setHorizontalGroup(
            pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipoIden, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_iden, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        pnlDatosPersonaLayout.setVerticalGroup(
            pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDatosPersonaLayout.createSequentialGroup()
                                .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_iden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5))
                            .addComponent(lblTipoIden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(lblTipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mis Equipos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tblEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipos);

        btnAdicionarEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdicionarEquipo.setLabel("Adicionar Equipo");
        btnAdicionarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEquiposLayout = new javax.swing.GroupLayout(pnlEquipos);
        pnlEquipos.setLayout(pnlEquiposLayout);
        pnlEquiposLayout.setHorizontalGroup(
            pnlEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEquiposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        pnlEquiposLayout.setVerticalGroup(
            pnlEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEquiposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdicionarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
        );

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        pnl_tab_registro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnl_ingresos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tblIngresos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblIngresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIngresosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblIngresos);

        javax.swing.GroupLayout pnl_ingresosLayout = new javax.swing.GroupLayout(pnl_ingresos);
        pnl_ingresos.setLayout(pnl_ingresosLayout);
        pnl_ingresosLayout.setHorizontalGroup(
            pnl_ingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ingresosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ingresosLayout.setVerticalGroup(
            pnl_ingresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ingresosLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_tab_registro.addTab("Equipos Ingresados", pnl_ingresos);

        pnl_historico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnl_historico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jScrollPane3.setViewportView(tblHistorico);

        javax.swing.GroupLayout pnl_historicoLayout = new javax.swing.GroupLayout(pnl_historico);
        pnl_historico.setLayout(pnl_historicoLayout);
        pnl_historicoLayout.setHorizontalGroup(
            pnl_historicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_historicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1107, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_historicoLayout.setVerticalGroup(
            pnl_historicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_historicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_tab_registro.addTab("Histórico de Ingresos", pnl_historico);

        javax.swing.GroupLayout pnl_registroLayout = new javax.swing.GroupLayout(pnl_registro);
        pnl_registro.setLayout(pnl_registroLayout);
        pnl_registroLayout.setHorizontalGroup(
            pnl_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_registroLayout.createSequentialGroup()
                .addGroup(pnl_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(pnl_registroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl_tab_registro)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_registroLayout.createSequentialGroup()
                                .addComponent(pnlDatosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(pnlEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(pnl_registroLayout.createSequentialGroup()
                .addGap(402, 402, 402)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_registroLayout.setVerticalGroup(
            pnl_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDatosPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnl_tab_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void consultarPersona() {
        Persona per = new Persona();
        List<Persona> lstPer = new ArrayList<>();
        personaDao = new PersonaDao();
        Long ident = null;
        try {
            if (this.txt_iden.getText() != null && this.txt_iden.getText().length() > 0) {
                ident = Long.parseLong(this.txt_iden.getText());
                lstPer = personaDao.consultaPersona(ident, null, null);
                if (lstPer != null && lstPer.size() > 0) {
                    this.lblNombre.setText(lstPer.get(0).getNombres());
                    this.lblApellidos.setText(lstPer.get(0).getApellidos());
                    this.lblTipoPersona.setText(lstPer.get(0).getTipoPersona());
                    this.lblTipoIden.setText(lstPer.get(0).getTipoIdentificacion());
                } else {
                    gestionPer = new GestionPersonas(personaDao, this, ident, false);
                    gestionPer.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void txt_idenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idenActionPerformed
        limpiarDatos();
        consultarPersona();
        consultarEquipos();
        consultarRegistro(ConstantesApp.TIPO_CONSULTA_ING);
        consultarRegistro(ConstantesApp.TIPO_CONSULTA_HIST);
    }//GEN-LAST:event_txt_idenActionPerformed

    private void tblIngresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIngresosMouseClicked
        
    }//GEN-LAST:event_tblIngresosMouseClicked

    private void tblEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiposMouseClicked
       int row = this.tblEquipos.getSelectedRow();
       Equipo e = this.lstEquipo.get(row);
       String mensaje = "Dar ingreso a "+e.getIdMarca().getIdTipoEquipo().getNomTipoEquipo()+" "+
               e.getIdMarca().getNomMarca()+" con Serial "+e.getSerial();
       int rta = JOptionPane.showConfirmDialog(this, mensaje, "Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(rta != JOptionPane.NO_OPTION){
           try {
               //Dar Ingreso al Equipo
               Registro r = new Registro();
               r.setSerial(e);
               registroDao.insertarRegistro(r);
               
               consultarRegistro(ConstantesApp.TIPO_CONSULTA_ING);
           } catch (Exception ex) {
               JOptionPane.showMessageDialog(this, "Error: "+ex.getCause().getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           }
       }
    }//GEN-LAST:event_tblEquiposMouseClicked

    private void btnAdicionarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEquipoActionPerformed
        GestionEquipos ge = new GestionEquipos(equipoDao, this, false, Long.parseLong(this.txt_iden.getText()));
        ge.setVisible(true);
    }//GEN-LAST:event_btnAdicionarEquipoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public void consultarRegistro(String tipoConsulta){
        List<Registro> lstRegistro = new ArrayList<>();
        registroDao = new RegistroDao();
        try{
            lstRegistro = registroDao.consultarRegistro(tipoConsulta, Long.parseLong(this.txt_iden.getText()));
            if(lstRegistro != null && lstRegistro.size() > 0){
                RegistroModel model = new RegistroModel(lstRegistro);
                if(ConstantesApp.TIPO_CONSULTA_ING.equals(tipoConsulta)){
                    this.tblIngresos.setModel(model);
                }
                if(ConstantesApp.TIPO_CONSULTA_HIST.equals(tipoConsulta)){
                    this.tblHistorico.setModel(model);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getCause().getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void consultarEquipos() {        
        Long ident = null;
        EquipoModel model;
        equipoDao = new EquipoDao();
        try {
            if (this.txt_iden.getText() != null && this.txt_iden.getText().length() > 0) {
                ident = Long.parseLong(this.txt_iden.getText());
                lstEquipo = equipoDao.consultaEquipos(ident);
                model = new EquipoModel(lstEquipo);
                this.tblEquipos.setModel(model);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void limpiarDatos() {
        this.lblApellidos.setText("");
        this.lblNombre.setText("");
        this.lblTipoPersona.setText("");
        this.lblTipoIden.setText("");
        this.tblEquipos.setModel(new EquipoModel(new ArrayList<Equipo>()));
        this.tblHistorico.setModel(new RegistroModel(new ArrayList<Registro>()));
        this.tblIngresos.setModel(new RegistroModel(new ArrayList<>()));
    }

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
            java.util.logging.Logger.getLogger(RegistroPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipoIden;
    private javax.swing.JLabel lblTipoPersona;
    private javax.swing.JPanel pnlDatosPersona;
    private javax.swing.JPanel pnlEquipos;
    private javax.swing.JPanel pnl_historico;
    private javax.swing.JPanel pnl_ingresos;
    private javax.swing.JPanel pnl_registro;
    private javax.swing.JTabbedPane pnl_tab_registro;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTable tblIngresos;
    private javax.swing.JTextField txt_iden;
    // End of variables declaration//GEN-END:variables
}
