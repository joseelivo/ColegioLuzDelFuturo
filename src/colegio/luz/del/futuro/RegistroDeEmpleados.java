/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.luz.del.futuro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author juan Paredes G.
 */
public class RegistroDeEmpleados extends javax.swing.JFrame {
    
    Conectar conn = new Conectar ();
    Connection cn = conn.conexion();
            
    /**
     * Creates new form RegistroDeEmpleados
     */
    public RegistroDeEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        posicionOPuesto = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        fechaInicio = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        sueldo = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_posicion = new javax.swing.JTextField();
        txt_fechaDeInicio = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_numTelefono = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        txt_cancelar = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        fondoJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Empleados Administrativos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombre.setText("Nombre:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 20));

        apellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidos.setText("Apellidos ");
        getContentPane().add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 20));

        direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        direccion.setText("Direccion:");
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        posicionOPuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        posicionOPuesto.setText("Posicion o puesto:");
        getContentPane().add(posicionOPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula.setText("Cédula:");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, 20));

        fechaInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fechaInicio.setText("Fecha de inicio:");
        getContentPane().add(fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setText("Teléfono:");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 70, 20));

        sueldo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sueldo.setText("Sueldo:");
        getContentPane().add(sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        txt_posicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_posicionKeyTyped(evt);
            }
        });
        getContentPane().add(txt_posicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));
        getContentPane().add(txt_fechaDeInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, -1));

        txt_numTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_numTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, -1));

        txt_sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sueldoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 200, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 90, 30));

        txt_cancelar.setText("Cancelar");
        txt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 90, 30));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, -1));

        fondoJPanel.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(fondoJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char c = evt.getKeyChar();
        if ((c<'0' || c>'9'))evt.consume();
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_numTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numTelefonoKeyTyped
        char t = evt.getKeyChar();
        if ((t<'0' || t>'9'))evt.consume();
    }//GEN-LAST:event_txt_numTelefonoKeyTyped

    private void txt_posicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_posicionKeyTyped
        char p = evt.getKeyChar();
        if((p<'a' || p>'z' ) && ( p<'A' || p>'Z') && (p<' ' || p>' ') ) evt.consume();
    }//GEN-LAST:event_txt_posicionKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
         //validacion de los campos del formulario
        if (txt_nombre.getText().equals("") || txt_direccion.getText().equals("") || txt_cedula.getText().equals("") ||
                txt_numTelefono.getText().equals("") || txt_posicion.getText().equals("") || txt_fechaDeInicio.getText().equals("") ||
                txt_sueldo.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los campos son oblicatorios\n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }else{
        try {
            PreparedStatement pps;
            pps = cn.prepareStatement("INSERT INTO administrativo(Nombre, Apellidos, Direccion, Posicion_o_puesto, Fecha_de_inicio, Cedula, Telefono, Sueldo)VALUES (?,?,?,?,?,?,?,?)");
            pps.setString(1,txt_nombre.getText());
            pps.setString(2,txt_apellidos.getText());
            pps.setString(3,txt_direccion.getText());
            pps.setString(4,txt_posicion.getText());
            pps.setString(5,txt_fechaDeInicio.getText());
            pps.setString(6,txt_cedula.getText());
            pps.setString(7,txt_numTelefono.getText());
            pps.setString(8,txt_sueldo.getText());
          int a =  pps.executeUpdate();
          if (a > 0){
            JOptionPane.showMessageDialog(null, "Sus datos han sido guardados\n", "GUARDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
          } 
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
         txt_nombre.setText("");
         txt_apellidos.setText("");
         txt_direccion.setText("");
         txt_posicion.setText("");
         txt_fechaDeInicio.setText("");
         txt_cedula.setText("");
         txt_numTelefono.setText("");
         txt_sueldo.setText("");
    }//GEN-LAST:event_guardarActionPerformed

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped

         char apellidos = evt.getKeyChar();
        if((apellidos<'a' || apellidos>'z' ) && ( apellidos<'A' || apellidos>'Z') && (apellidos<' ' || apellidos>' ') ) evt.consume();
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sueldoKeyTyped
        
        char sueldo = evt.getKeyChar();
        if ((sueldo<'0' || sueldo>'9'))evt.consume();
    }//GEN-LAST:event_txt_sueldoKeyTyped

    private void txt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cancelarActionPerformed
           int x = JOptionPane.showConfirmDialog(this, "¿Deseas SALIR?\n", "AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == x) {
            System.exit(0);
        } 
    }//GEN-LAST:event_txt_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel fechaInicio;
    private javax.swing.JPanel fondoJPanel;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel posicionOPuesto;
    private javax.swing.JLabel sueldo;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JButton txt_cancelar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fechaDeInicio;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numTelefono;
    private javax.swing.JTextField txt_posicion;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables
}
