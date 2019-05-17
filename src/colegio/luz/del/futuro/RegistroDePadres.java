
package colegio.luz.del.futuro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Rafelis
 */
public class RegistroDePadres extends javax.swing.JFrame {

    Conectar conn = new Conectar();
    Connection cn = conn.conexion();

    public RegistroDePadres() {
        initComponents();
        dispose();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_numTelefono = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_ccorreo = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        txt_cancelar = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Padres");
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

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setText("Teléfono:");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 70, 20));

        cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula.setText("Cedula");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correo.setText("Correo:");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 80, 20));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, -1));

        txt_apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, -1));

        txt_numTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numTelefonoActionPerformed(evt);
            }
        });
        txt_numTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_numTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, -1));

        txt_ccorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ccorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ccorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 80, 30));

        txt_cancelar.setText("Cancelar");
        txt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 80, 30));

        label_fondo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoFormulario.jpg"))); // NOI18N
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

        char n = evt.getKeyChar();
        if ((n < 'a' || n > 'z') && (n < 'A' || n > 'Z') && (n < ' ' || n > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_numTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numTelefonoKeyTyped
        char t = evt.getKeyChar();
        if ((t < '0' || t > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numTelefonoKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        //declaraciones de variables de tipo string para cuando se haga la coneccion a la base de datos

        try {
            CallableStatement pps = cn.prepareCall("INSERT INTO registro_padres(Nombre,Apellidos,Direccion,Cedula,Telefono,Correo)VALUES (?,?,?,?,?,?)");
            pps.setString(1, txt_nombre.getText());
            pps.setString(2, txt_apellidos.getText());
            pps.setString(3, txt_direccion.getText());
            pps.setString(4, txt_cedula.getText());
            pps.setString(5, txt_numTelefono.getText());
            pps.setString(6, txt_ccorreo.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sus datos han sido guardados");

        } catch (SQLException ex) {
            Logger.getLogger(RegistroDeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }

        //validacion de los campos del formulario
        if (txt_nombre.getText().equals("") || txt_direccion.getText().equals("") || txt_cedula.getText().equals("")
                || txt_numTelefono.getText().equals("") || txt_ccorreo.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son oblicatorios\n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped

        char apellidos = evt.getKeyChar();
        if ((apellidos < 'a' || apellidos > 'z') && (apellidos < 'A' || apellidos > 'Z') && (apellidos < ' ' || apellidos > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_numTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numTelefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txt_cancelarActionPerformed

    private void txt_ccorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ccorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ccorreoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDePadres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JButton txt_cancelar;
    private javax.swing.JTextField txt_ccorreo;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numTelefono;
    // End of variables declaration//GEN-END:variables
}
