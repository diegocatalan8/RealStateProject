/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Connecion.ConnectDB;
import Dtos.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diegocatalan
 */
public class ActualizarClientes extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarClientes
     */
    public ActualizarClientes() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNombres = new javax.swing.JTextField();
        tApellidos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tDpi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("ACTUALIZACIÓN DE CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("NIT:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        tNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNitActionPerformed(evt);
            }
        });
        jPanel2.add(tNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 112, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("NOMBRES:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("APELLIDOS:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        tDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(tDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 112, -1));

        tTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(tTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 112, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("DIRECCION:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("TELEFONO:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        tNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNombresActionPerformed(evt);
            }
        });
        jPanel2.add(tNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 112, -1));

        tApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tApellidosActionPerformed(evt);
            }
        });
        jPanel2.add(tApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 112, -1));

        jPanel3.setBackground(java.awt.Color.lightGray);

        jLabel8.setText("Persona a actualizar");

        tDpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDpiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("DPI:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(tDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBackground(java.awt.Color.gray);

        btnSalir.setBackground(java.awt.Color.white);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir2.jpg"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReset.setBackground(java.awt.Color.white);
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.jpg"))); // NOI18N
        btnReset.setText("RESETEAR CAMPOS");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(java.awt.Color.white);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.jpg"))); // NOI18N
        btnGuardar.setText("ACTUALIZAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(btnGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDpiActionPerformed

    private void tNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNitActionPerformed

    private void tNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNombresActionPerformed

    private void tApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tApellidosActionPerformed

    private void tDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDireccionActionPerformed

    private void tTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTelefonoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        
        tNit.setText("");
        tNombres.setText("");
        tApellidos.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Clientes persona = new Clientes();

        String nit = tNit.getText();
        String nit2 = nit.replace('_', ' ');
        String nit3 = nit2.replace('-', ' ');
        String nit4 = nit3.replace(" ", "");
        String nit5 = null;
        if(nit4.length()==13){
            nit5 = nit4;
        }
        else{
            JOptionPane.showConfirmDialog(null, "EL NIT DEBE CONTENER 13 DIGITOS");
        }

        String dpi = null;
        if(tDpi.getText().length()==13){
            dpi = tDpi.getText();
        }
        else{
            JOptionPane.showMessageDialog(null, "EL DPI DEBE CONTENER 13 DIGITOS");
        }

        String telefono = null;
        boolean bandera = false;
        if(tTelefono.getText().length()==8){

            telefono = tTelefono.getText();
            bandera = true;
        }
        else{
            JOptionPane.showMessageDialog(null, "EL TELEFONO DEBE CONTENER 8 DIGITOS");
        }

        persona.setDpi(dpi);
        persona.setNit(nit5);
        persona.setNombres(tNombres.getText());
        persona.setApellidos(tApellidos.getText());
        persona.setDireccion(tDireccion.getText());
        persona.setTelefono(telefono);
        
        if(bandera == true){
            tDpi.setText("");
            tNit.setText("");
        tNombres.setText("");
        tApellidos.setText("");
        tDireccion.setText("");
        tTelefono.setText("");
        
        actualizar(persona);
        }

       
    }//GEN-LAST:event_btnGuardarActionPerformed
 public void actualizar(Clientes persona){
        //creamos la connecion
        ConnectDB conn = new ConnectDB();
        Connection CONN = conn.connect();
        
        
        //Instruccion sql
        String SQL = "UPDATE clientes SET nombres=?, apellidos=?, direccion=?, telefono=?, nit=?"
                + "WHERE dpi= ?";
        
         PreparedStatement statement;    
         
         
        try {
            statement = CONN.prepareStatement(SQL);
            
            statement.setString(1, persona.getNombres()); 
            statement.setString(2, persona.getApellidos()); 
            statement.setString(3, persona.getDireccion()); 
            statement.setString(4, persona.getTelefono()); 
            statement.setString(5, persona.getNit()); 
            statement.setString(6, persona.getDpi()); 
            
            
            
            
            int filasActualizadas = statement.executeUpdate(); // SE EJECUTA EL INSERT
            System.out.println("Actualizado: "+ filasActualizadas );//se muestra las filas insertadas
             JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente"); // muestra mensaje al usaurio
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + ex); //muestra mensaje al usaurio
            Logger.getLogger(ActualizarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        try {
            CONN.close();//SIEMPRE SE CIERRA LA CONEXION
            CONN = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
        
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
            java.util.logging.Logger.getLogger(ActualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tApellidos;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tDpi;
    private javax.swing.JTextField tNit;
    private javax.swing.JTextField tNombres;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables
}
