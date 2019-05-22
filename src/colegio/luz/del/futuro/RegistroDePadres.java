
package colegio.luz.del.futuro;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        nombre1 = new javax.swing.JLabel();
        apellidos1 = new javax.swing.JLabel();
        direccion1 = new javax.swing.JLabel();
        telefono1 = new javax.swing.JLabel();
        cedula1 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        txt_nombre2 = new javax.swing.JTextField();
        txt_apellidos2 = new javax.swing.JTextField();
        txt_direccion2 = new javax.swing.JTextField();
        txt_numTelefono2 = new javax.swing.JTextField();
        txt_cedula2 = new javax.swing.JTextField();
        txt_ccorreo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo_JPanel = new javax.swing.JPanel();

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
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 90, 30));

        txt_cancelar.setText("Cancelar");
        txt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 90, 30));

        nombre1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombre1.setText("Nombre:");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 70, 20));

        apellidos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        apellidos1.setText("Apellidos ");
        getContentPane().add(apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 70, 20));

        direccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        direccion1.setText("Direccion:");
        getContentPane().add(direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        telefono1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono1.setText("Teléfono:");
        getContentPane().add(telefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 70, 20));

        cedula1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula1.setText("Cedula");
        getContentPane().add(cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        correo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correo1.setText("Correo:");
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 80, 20));

        txt_nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, -1));

        txt_apellidos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidos2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellidos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 200, -1));

        txt_direccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccion2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 200, -1));

        txt_numTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numTelefono2ActionPerformed(evt);
            }
        });
        txt_numTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numTelefono2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_numTelefono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 200, -1));

        txt_cedula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedula2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 200, -1));

        txt_ccorreo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ccorreo2ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ccorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 200, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Registro de padre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Registro de madre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        fondo_JPanel.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(fondo_JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

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
        //validacion de los campos del formulario
        if (txt_nombre.getText().equals("") || txt_direccion.getText().equals("") || txt_cedula.getText().equals("")
                || txt_numTelefono.getText().equals("") || txt_ccorreo.getText().equals("") || txt_nombre2.getText().equals("")
                || txt_apellidos2.getText().equals("") || txt_direccion2.getText().equals("") || txt_numTelefono2.getText().equals("") 
                || txt_cedula2.getText().equals("") || txt_ccorreo2.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son oblicatorios\n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }else{       
        
        //declaraciones de variables de tipo string para cuando se haga la coneccion a la base de datos
        try {
            PreparedStatement pps;
            pps = cn.prepareStatement("INSERT INTO registro_padres(Nombre_Padre,Apellidos_Padre,Direccion_Padre,Telefono_Padre,Cedula_Padre,Correo_Padre,Nombre_Madre,Apellidos_Madre,Direccion_Madre,Telefono_Madre,Cedula_Madre,Correo_Madre)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            pps.setString(1, txt_nombre.getText());
            pps.setString(2, txt_apellidos.getText());
            pps.setString(3, txt_direccion.getText());
            pps.setString(4, txt_numTelefono.getText());
            pps.setString(5, txt_cedula.getText());
            pps.setString(6, txt_ccorreo.getText());
            pps.setString(7, txt_nombre2.getText());
            pps.setString(8, txt_apellidos2.getText());
            pps.setString(9, txt_direccion2.getText());
            pps.setString(10, txt_numTelefono2.getText());
            pps.setString(11, txt_cedula2.getText());
            pps.setString(12, txt_ccorreo2.getText());
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
        txt_numTelefono.setText("");
        txt_cedula.setText("");
        txt_ccorreo.setText("");
        txt_nombre2.setText("");
        txt_apellidos2.setText("");
        txt_direccion2.setText("");
        txt_numTelefono2.setText("");
        txt_cedula2.setText("");
        txt_ccorreo2.setText("");
        
        
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
            int x = JOptionPane.showConfirmDialog(this, "¿Deseas SALIR?\n", "AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == x) {
            System.exit(0);
        } 
    }//GEN-LAST:event_txt_cancelarActionPerformed

    private void txt_ccorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ccorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ccorreoActionPerformed

    private void txt_nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre2KeyTyped
         char n = evt.getKeyChar();
        if ((n < 'a' || n > 'z') && (n < 'A' || n > 'Z') && (n < ' ' || n > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombre2KeyTyped

    private void txt_apellidos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidos2KeyTyped
        char n = evt.getKeyChar();
        if ((n < 'a' || n > 'z') && (n < 'A' || n > 'Z') && (n < ' ' || n > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellidos2KeyTyped

    private void txt_direccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccion2ActionPerformed

    private void txt_numTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numTelefono2ActionPerformed

    private void txt_numTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numTelefono2KeyTyped
           char c = evt.getKeyChar();
           if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_numTelefono2KeyTyped

    private void txt_cedula2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedula2KeyTyped
           char c = evt.getKeyChar();
           if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cedula2KeyTyped

    private void txt_ccorreo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ccorreo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ccorreo2ActionPerformed

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
    private javax.swing.JLabel apellidos1;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula1;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion1;
    private javax.swing.JPanel fondo_JPanel;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_apellidos2;
    private javax.swing.JButton txt_cancelar;
    private javax.swing.JTextField txt_ccorreo;
    private javax.swing.JTextField txt_ccorreo2;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_cedula2;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_direccion2;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombre2;
    private javax.swing.JTextField txt_numTelefono;
    private javax.swing.JTextField txt_numTelefono2;
    // End of variables declaration//GEN-END:variables
}
