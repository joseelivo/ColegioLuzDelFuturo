// Creamos la 
package colegio.luz.del.futuro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * @author Leonardo Ant. Liriano
 */
public class RegistroDeCurso extends javax.swing.JFrame {
    Conectar conn = new Conectar ();
    Connection cn = conn.conexion();
  
    public RegistroDeCurso() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListadoDeEstudiantes = new javax.swing.JLabel();
        Aula = new javax.swing.JLabel();
        Tanda = new javax.swing.JLabel();
        AsignaturaCorrepondiente = new javax.swing.JLabel();
        txt_cantidadAlumno = new javax.swing.JTextField();
        txt_aula = new javax.swing.JTextField();
        txt_tanda = new javax.swing.JTextField();
        txt_asignaturaCorrespondiente = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        txt_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_hora = new javax.swing.JTextField();
        txt_curso = new javax.swing.JTextField();
        fondoJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de curso");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListadoDeEstudiantes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ListadoDeEstudiantes.setText("Cantidad_Alumnos");
        getContentPane().add(ListadoDeEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 20));

        Aula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aula.setText("Aula");
        getContentPane().add(Aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        Tanda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tanda.setText("Tanda");
        getContentPane().add(Tanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        AsignaturaCorrepondiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AsignaturaCorrepondiente.setText("Asignatura Correpondiente");
        getContentPane().add(AsignaturaCorrepondiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        txt_cantidadAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadAlumnoActionPerformed(evt);
            }
        });
        txt_cantidadAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadAlumnoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cantidadAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        txt_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aulaActionPerformed(evt);
            }
        });
        txt_aula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, -1));
        getContentPane().add(txt_tanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        txt_asignaturaCorrespondiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_asignaturaCorrespondienteActionPerformed(evt);
            }
        });
        txt_asignaturaCorrespondiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_asignaturaCorrespondienteKeyTyped(evt);
            }
        });
        getContentPane().add(txt_asignaturaCorrespondiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 140, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 30));

        txt_cancelar.setText("Cancelar");
        txt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 90, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Hora");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Curso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, -1));
        getContentPane().add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, -1));
        getContentPane().add(txt_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 110, -1));

        fondoJPanel.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(fondoJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cantidadAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadAlumnoKeyTyped

    }//GEN-LAST:event_txt_cantidadAlumnoKeyTyped

    private void txt_asignaturaCorrespondienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_asignaturaCorrespondienteKeyTyped
        char materia = evt.getKeyChar();
        if ((materia < 'a' || materia > 'z') && (materia < 'A' || materia > 'Z') && (materia < ' ' || materia > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_asignaturaCorrespondienteKeyTyped

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
     
        //validacion de los campos del formulario
       
        if (txt_cantidadAlumno.getText().equals("") || txt_tanda.getText().equals("") || txt_asignaturaCorrespondiente.getText().equals("")
            || txt_hora.getText().equals("") || txt_curso.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son oblicatorios\n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_cantidadAlumno.requestFocus();
        } else{
           //declaraciones de variables de tipo string para cuando se haga la coneccion a la base de datos
          try {
            PreparedStatement pps;
            pps = cn.prepareStatement("INSERT INTO registro_curso(Cantidad_Alumno,Aula,Tanda,Asignatura_Correspondiente,Hora,Curso)VALUES (?,?,?,?,?,?)");
            pps.setString(1,txt_cantidadAlumno.getText());
            pps.setString(2,txt_aula.getText());
            pps.setString(3,txt_tanda.getText());
            pps.setString(4,txt_asignaturaCorrespondiente.getText());
            pps.setString(5,txt_hora.getText());
            pps.setString(6,txt_curso.getText());
            int a =  pps.executeUpdate();
            if (a > 0){
            JOptionPane.showMessageDialog(null, "Sus datos han sido guardados\n", "GUARDADO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
          }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroDeEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        txt_cantidadAlumno.setText("");
        txt_aula.setText("");
        txt_tanda.setText("");
        txt_asignaturaCorrespondiente.setText("");
        txt_hora.setText("");
        txt_curso.setText("");
        
    }//GEN-LAST:event_guardarActionPerformed

    private void txt_aulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aulaKeyTyped

        char apellidos = evt.getKeyChar();
        if ((apellidos < 'a' || apellidos > 'z') && (apellidos < 'A' || apellidos > 'Z') && (apellidos < ' ' || apellidos > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_aulaKeyTyped

    private void txt_asignaturaCorrespondienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_asignaturaCorrespondienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_asignaturaCorrespondienteActionPerformed

    private void txt_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aulaActionPerformed

    private void txt_cantidadAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadAlumnoActionPerformed

    private void txt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cancelarActionPerformed
           int x = JOptionPane.showConfirmDialog(this, "¿Deseas SALIR?\n", "AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            if (JOptionPane.OK_OPTION == x) {
            System.exit(0);
        }
            
    }//GEN-LAST:event_txt_cancelarActionPerformed

    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AsignaturaCorrepondiente;
    private javax.swing.JLabel Aula;
    private javax.swing.JLabel ListadoDeEstudiantes;
    private javax.swing.JLabel Tanda;
    private javax.swing.JPanel fondoJPanel;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_asignaturaCorrespondiente;
    private javax.swing.JTextField txt_aula;
    private javax.swing.JButton txt_cancelar;
    private javax.swing.JTextField txt_cantidadAlumno;
    private javax.swing.JTextField txt_curso;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_tanda;
    // End of variables declaration//GEN-END:variables
}
