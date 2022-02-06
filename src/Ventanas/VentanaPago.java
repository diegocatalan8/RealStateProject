/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Connecion.ConnectDB;
import Dtos.PagosRegistro;
import Dtos.Propiedades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author diegocatalan
 */
public class VentanaPago extends javax.swing.JFrame {
    PagosRegistro persona1;
    //RETORNAR OBJETO DE PAGOS DE LA TABLA REGISTRO PAGOS
 private PagosRegistro retornarPesona(String codigo){
          
           PagosRegistro persona = null;
            //se crea una nueva conexion hacia la BD
            ConnectDB conexion = new ConnectDB(); // conexion
            Connection CONEXION = conexion.connect(); // obtenemos conexion
            //SE ARMA LA INSTRUCCION SQL
            String SQL = "SELECT codigo, totalpagado, porcentajeinteres, cuotas, valordepropiedad, cuotaspagadas FROM propiedades WHERE codigo='"+codigo+"';";
            Statement statement; // sentencia
            
            
            
            try {
                persona =new PagosRegistro();
                statement = CONEXION.createStatement(); // creamos sentencia
                ResultSet rs = statement.executeQuery(SQL); // ejecuta consulta
                
                 while (rs.next()) { 
             persona.setCodigo(rs.getString("codigo"));
             persona.setTotalPagado(rs.getFloat("totalpagado"));
             persona.setPorcentajeDeInteres(rs.getFloat("porcentajeinteres"));
             persona.setCantidaCuotas(rs.getInt("cuotas"));
             persona.setValorPropiedad(rs.getFloat("valordepropiedad"));
             persona.setNumeroCuota(rs.getInt("cuotaspagadas"));
             
        }
                
                CONEXION.close();//SIEMPRE SE CIERRA LA CONEXION
                CONEXION = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
                conexion = null;
                
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPago.class.getName()).log(Level.SEVERE, null, ex);
            }
 return persona;
 }
 //METODO ACTUALIZAR LA TABLA REGISTRAR PROPIEDAD
public void actualizar(PagosRegistro persona){
        //creamos la connecion
        ConnectDB conn = new ConnectDB();
        Connection CONN = conn.connect();
        
        
        //Instruccion sql
        String SQL = "UPDATE propiedades SET  totalpagado=?, cuotaspagadas=? WHERE codigo='"+persona.getCodigo()+"';";
        
         PreparedStatement st;    
         
         
        try {
            st = CONN.prepareStatement(SQL);
            
        
            st.setFloat(1, persona.getTotalPagado());
            st.setInt(2, persona.getNumeroCuota());
            
           
            
            
            
            int filasActualizadas = st.executeUpdate(); // SE EJECUTA EL INSERT
            System.out.println("Actualizado: "+ filasActualizadas );//se muestra las filas insertadas
             JOptionPane.showMessageDialog(null, "Datos Actualizados correctamente"); // muestra mensaje al usaurio
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + ex); //muestra mensaje al usaurio
            Logger.getLogger(VentanaPago.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        try {
            CONN.close();//SIEMPRE SE CIERRA LA CONEXION
            CONN = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conn = null;
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
        
    }
//METODO PARA INSERTAR PAGOS
public void guardarPago(PagosRegistro persona){
        //se crea una nueva connecion
        ConnectDB conect = new ConnectDB();
        Connection CONNECT = conect.connect();
        
        
        //SE ARMA LA INSTRUCCION SQL, LOS VALUES VAN ?
        String SQL = "INSERT INTO pagos(codigo, fechadepago, numerodecuotapagar, totaldelacuota, totalpagado) "
                + "VALUES(?,?,?,?,?)";
      //HACEMOS SU DECLARACION///
        PreparedStatement st;    
        
        try {
            
            st = CONNECT.prepareStatement(SQL);
            st.setString(1, persona.getCodigo());
            st.setString(2, persona.getFecha());
            st.setInt(3, persona.getNumeroCuota());
            st.setFloat(4, persona.getTotalDeLaCuota());
            st.setFloat(5, persona.getTotalPagado());
            
           
     
            
            
            
            int filasInsertadas = st.executeUpdate(); // SE EJECUTA EL INSERT
            System.out.println("Insertado: "+ filasInsertadas );//se muestra las filas insertadas
             JOptionPane.showMessageDialog(null, "Datos guardados correctamente"); // muestra mensaje al usaurio
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex); //muestra mensaje al usaurio
            Logger.getLogger(VentanaPago.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        try {
            CONNECT.close();//SIEMPRE SE CIERRA LA CONEXION
            CONNECT = null; // SE COLOCA A NULL LA CONEXION PARA QUE EL GC TOME ESTE OBJETO Y LO ELIMINE DE MEMORIA
            conect = null;
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * Creates new form VentanaPago
     */
    public VentanaPago() {
        initComponents();
        btnGuardar.setEnabled(false);
        cuotapagar.setEnabled(false);
        totalcuotapagar.setEnabled(false);
       
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
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cuotapagar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totalcuotapagar = new javax.swing.JTextField();
        panel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("PAGOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(java.awt.Color.white);

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("FECHA DE PAGO:");

        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("No. CUOTA A PAGAR:");

        cuotapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuotapagarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("CODIGO DE PROPIEDAD:");

        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        confirmar.setText("CONFIRMAR");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.black);
        jLabel5.setText("CUOTA A PAGAR:");

        totalcuotapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcuotapagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(cuotapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(totalcuotapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(139, 139, 139))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cuotapagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalcuotapagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        panel1.setBackground(java.awt.Color.gray);

        btnGuardar.setBackground(java.awt.Color.white);
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.jpg"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnSalir.setBackground(java.awt.Color.white);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir2.jpg"))); // NOI18N
        btnSalir.setText("ATRAS");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed

    private void cuotapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuotapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuotapagarActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     persona1 = this.retornarPesona(codigo.getText());
     //actualizamos la tabla de propiedad en la columna totalPagado
     actualizar(persona1);
     //insertamos nuevos datos en la tabla de pagos
     persona1.setFecha(fecha.getText());
     guardarPago(persona1);
     //seteamos valores nulos en los campos
     codigo.setText("");
        fecha.setText("");
        cuotapagar.setText("");
        totalcuotapagar.setText("");
        totalcuotapagar.setEnabled(false);
        cuotapagar.setEnabled(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        codigo.setText("");
        fecha.setText("");
        cuotapagar.setText("");
        totalcuotapagar.setText("");
        totalcuotapagar.setEnabled(false);
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
       persona1 = this.retornarPesona(codigo.getText());
        System.out.println(persona1.getNumeroCuota());
        
       if(persona1.getNumeroCuota()<= persona1.getCantidaCuotas()){
           
             JOptionPane.showMessageDialog(null, "LA CANTIDAD A PAGAR ES DE: Q"+persona1.getTotalDeLaCuota());
       btnGuardar.setEnabled(true);
       totalcuotapagar.setEnabled(true);
       cuotapagar.setEnabled(true);
       cuotapagar.setText(String.valueOf(persona1.getNumeroCuota()));
       totalcuotapagar.setText(String.valueOf(persona1.getTotalDeLaCuota()));
       }
       else{
          
       JOptionPane.showMessageDialog(null, "TODAS LAS CUOTAS ESTAN SALDADAS");
       }
        
     
    }//GEN-LAST:event_confirmarActionPerformed

    private void totalcuotapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcuotapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcuotapagarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPago().setVisible(true);
                
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField codigo;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cuotapagar;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField totalcuotapagar;
    // End of variables declaration//GEN-END:variables
}
