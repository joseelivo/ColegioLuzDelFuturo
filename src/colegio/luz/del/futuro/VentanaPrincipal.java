package colegio.luz.del.futuro;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Image imagen = null;
                try {
                    super.paintComponent(g);
                    imagen = ImageIO.read(getClass().getResource("/imagenes/fondo.jpg"));
                    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        };
        this.add(panel, BorderLayout.CENTER);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        registro = new javax.swing.JMenu();
        estudiantes_Padres = new javax.swing.JMenu();
        estudiantes = new javax.swing.JMenuItem();
        padres = new javax.swing.JMenuItem();
        horarios = new javax.swing.JMenuItem();
        empleados = new javax.swing.JMenu();
        docente = new javax.swing.JMenuItem();
        administrativo = new javax.swing.JMenuItem();
        cursos = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(60, 20));
        setSize(new java.awt.Dimension(0, 0));

        inicio.setText("Inicio");
        menu.add(inicio);

        registro.setText("Registro");

        estudiantes_Padres.setText("Registros de Estudiantes y Padres");

        estudiantes.setText("Registros de Estudiantes");
        estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantesActionPerformed(evt);
            }
        });
        estudiantes_Padres.add(estudiantes);

        padres.setText("Registro de Padres");
        padres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                padresActionPerformed(evt);
            }
        });
        estudiantes_Padres.add(padres);

        registro.add(estudiantes_Padres);

        horarios.setText("Registro de Horarios");
        horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horariosActionPerformed(evt);
            }
        });
        registro.add(horarios);

        empleados.setText("Registros de Empleados");

        docente.setText("Docentes");
        docente.setActionCommand("Docente");
        docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteActionPerformed(evt);
            }
        });
        empleados.add(docente);

        administrativo.setText("Administrativo");
        administrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administrativoActionPerformed(evt);
            }
        });
        empleados.add(administrativo);

        registro.add(empleados);

        cursos.setText("Registro de Cursos");
        cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursosActionPerformed(evt);
            }
        });
        registro.add(cursos);

        menu.add(registro);

        ayuda.setText("Ayuda");
        menu.add(ayuda);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

//conectar las ventanas
    private void estudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantesActionPerformed
       RegistroDeEstudiantes obj = new RegistroDeEstudiantes();
        obj.setVisible(true);
    }//GEN-LAST:event_estudiantesActionPerformed
     
    private void docenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteActionPerformed
        // TODO add your handling code here:
        RegistroDeDocentes obj = new RegistroDeDocentes();
        obj.setVisible(true);
        
    }//GEN-LAST:event_docenteActionPerformed

    private void cursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursosActionPerformed
        // TODO add your handling code here:
                RegistroDeCurso obj = new RegistroDeCurso();
                  obj.setVisible(true);
                                    
        
    }//GEN-LAST:event_cursosActionPerformed

    private void administrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administrativoActionPerformed
        // Conecta la ventana princpal con el formulario de empleados administrativos
         RegistroDeEmpleados obj = new RegistroDeEmpleados();
        obj.setVisible(true);
        
        
    }//GEN-LAST:event_administrativoActionPerformed

    private void padresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_padresActionPerformed
        // TODO add your handling code here:
        RegistroDePadres obj = new RegistroDePadres();
        obj.setVisible(true);
    }//GEN-LAST:event_padresActionPerformed

    private void horariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horariosActionPerformed
      //Conecta la ventana principal con el registro de horarios
        RegistroDeHorarios obj = new RegistroDeHorarios();
        obj.setVisible(true);
    }//GEN-LAST:event_horariosActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem administrativo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem cursos;
    private javax.swing.JMenuItem docente;
    private javax.swing.JMenu empleados;
    private javax.swing.JMenuItem estudiantes;
    private javax.swing.JMenu estudiantes_Padres;
    private javax.swing.JMenuItem horarios;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem padres;
    private javax.swing.JMenu registro;
    // End of variables declaration//GEN-END:variables
}
