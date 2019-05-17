
package colegio.luz.del.futuro;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Rafelis 
 */
public class RegistroDeEstudiantes extends javax.swing.JFrame {
    
    Conectar conn = new Conectar ();
    Connection cn = conn.conexion();
    
    public RegistroDeEstudiantes() {
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
        fechaDeNacimiento = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        padre = new javax.swing.JLabel();
        madre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_numTelefono = new javax.swing.JTextField();
        txt_fechaDeNacimiento = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_padre = new javax.swing.JTextField();
        txt_madre = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        txt_cancelar = new javax.swing.JButton();
        label_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Estuantes");
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
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 20));

        fechaDeNacimiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fechaDeNacimiento.setText("Fecha de nacimiento:");
        getContentPane().add(fechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        correo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        correo.setText("Correo:");
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 80, 20));

        padre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        padre.setText("Padre");
        getContentPane().add(padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        madre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        madre.setText("Madre");
        getContentPane().add(madre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 50, 20));

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
        getContentPane().add(txt_numTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, -1));

        txt_fechaDeNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaDeNacimientoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_fechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 200, -1));

        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, -1));

        txt_padre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_padreActionPerformed(evt);
            }
        });
        txt_padre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_padreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 200, -1));

        txt_madre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_madreActionPerformed(evt);
            }
        });
        txt_madre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_madreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_madre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 200, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 80, 30));

        txt_cancelar.setText("Cancelar");
        txt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 80, 30));

        label_fondo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoFormulario.jpg"))); // NOI18N
        getContentPane().add(label_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        
        char n = evt.getKeyChar();
        if((n<'a' || n>'z' ) && ( n<'A' || n>'Z') && (n<' ' || n>' ') ) evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
        char correo = evt.getKeyChar();
        
        if((correo<'a' || correo>'z' ) && ( correo<'A' || correo>'Z') && (correo<' ' || correo>' ') ) evt.consume();
    }//GEN-LAST:event_txt_correoKeyTyped

    private void txt_numTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numTelefonoKeyTyped
        char t = evt.getKeyChar();
        if ((t<'1' || t>'9'))evt.consume();
    }//GEN-LAST:event_txt_numTelefonoKeyTyped

    private void txt_madreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_madreKeyTyped
        char madre = evt.getKeyChar();
        if((madre<'a' || madre>'z' ) && ( madre<'A' || madre>'Z') && (madre<' ' || madre>' ') ) evt.consume();
    }//GEN-LAST:event_txt_madreKeyTyped
    
    
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
         //declaraciones de variables de tipo string para cuando se haga la coneccion a la base de datos
      
        try {
            PreparedStatement pps;
            pps = cn.prepareStatement("INSERT INTO registro_estudiantes(Nombre,Apellidos,Direccion,Telefono,Fecha_de_nacimiento,Correo,Padre,Madre)VALUES (?,?,?,?,?,?,?,?)");
            pps.setString(1,txt_nombre.getText());
            pps.setString(2,txt_apellidos.getText());
            pps.setString(3,txt_direccion.getText());
            pps.setString(4,txt_numTelefono.getText());
            pps.setString(5,txt_fechaDeNacimiento.getText());
            pps.setString(6,txt_correo.getText());
            pps.setString(7,txt_padre.getText());
            pps.setString(8,txt_madre.getText());
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Sus datos han sido guardados");
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //validacion de los campos del formulario
        if (txt_nombre.getText().equals("") || txt_direccion.getText().equals("") || txt_correo.getText().equals("") ||
                txt_numTelefono.getText().equals("") || txt_madre.getText().equals("") || txt_fechaDeNacimiento.getText().equals("") ||
                txt_padre.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this,"Todos los campos son oblicatorios\n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void txt_apellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidosKeyTyped

         char apellidos = evt.getKeyChar();
        if((apellidos<'a' || apellidos>'z' ) && ( apellidos<'A' || apellidos>'Z') && (apellidos<' ' || apellidos>' ') ) evt.consume();
    }//GEN-LAST:event_txt_apellidosKeyTyped

    private void txt_padreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_padreKeyTyped
        
        char padre = evt.getKeyChar();
        if((padre<'a' || padre>'z' ) && ( padre<'A' || padre>'Z') && (padre<' ' || padre>' ') ) evt.consume();
    }//GEN-LAST:event_txt_padreKeyTyped

    private void txt_madreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_madreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_madreActionPerformed

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

    private void txt_fechaDeNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaDeNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaDeNacimientoActionPerformed

    private void txt_padreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_padreActionPerformed
       
    }//GEN-LAST:event_txt_padreActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed
  
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel fechaDeNacimiento;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel label_fondo;
    private javax.swing.JLabel madre;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel padre;
    private javax.swing.JLabel telefono;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JButton txt_cancelar;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fechaDeNacimiento;
    private javax.swing.JTextField txt_madre;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numTelefono;
    private javax.swing.JTextField txt_padre;
    // End of variables declaration//GEN-END:variables
}
