/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Limitadores.LimitInresoDatos;
import Principal.Principal;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class inicio extends javax.swing.JFrame {
    
    public static Principal prin=new Principal();
    
    private static int cont01 = 0, cont02 = 0, contInicios = 0;

    public inicio() {
        initComponents();
        this.jTextFieldCorreo.setDocument(new LimitInresoDatos(35));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @gmail.com
     */
    public void reiniciarContInicios() {
        this.contInicios = 0;
    }

    public int getContInicios() {
        return this.contInicios;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagenInicio = new javax.swing.JLabel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelMensaje01 = new javax.swing.JLabel();
        jLabelMensaje02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonCrearCuenta = new javax.swing.JButton();
        jButtonIniciarSecion = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelImagenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GIF_INICIO.gif"))); // NOI18N
        jLabelImagenInicio.setName(""); // NOI18N

        jPanelInicio.setBackground(new java.awt.Color(0, 204, 204));
        jPanelInicio.setForeground(new java.awt.Color(0, 204, 204));

        jLabelMensaje01.setForeground(new java.awt.Color(0, 0, 102));
        jLabelMensaje01.setText("  BIENVENIDO AL SISTEMA DE");

        jLabelMensaje02.setForeground(new java.awt.Color(0, 0, 102));
        jLabelMensaje02.setText(" OPORTUNIDADES LABORALES");

        jLabel1.setText("Correo");

        jLabel2.setText("Contraseña");

        jTextFieldCorreo.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });

        jPasswordFieldContraseña.setForeground(new java.awt.Color(0, 0, 204));

        jButtonCrearCuenta.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCrearCuenta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonCrearCuenta.setForeground(new java.awt.Color(0, 0, 255));
        jButtonCrearCuenta.setText("Crear Cuenta");
        jButtonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCuentaActionPerformed(evt);
            }
        });

        jButtonIniciarSecion.setBackground(new java.awt.Color(204, 204, 255));
        jButtonIniciarSecion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonIniciarSecion.setForeground(new java.awt.Color(0, 0, 255));
        jButtonIniciarSecion.setText("Iniciar");
        jButtonIniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSecionActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 153));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/close_30p.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMensaje02)
                    .addComponent(jLabelMensaje01))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonIniciarSecion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)))
                .addContainerGap())
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelMensaje01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMensaje02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIniciarSecion, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jButtonCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelImagenInicio)
                .addGap(4, 4, 4)
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImagenInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonIniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSecionActionPerformed
        String Correo = jTextFieldCorreo.getText(), Contra = jPasswordFieldContraseña.getText();
        cont01++;
        if (cont01 == 3) {
            cont02++;
            cont01 = 0;
            jTextFieldCorreo.setText("");
            jPasswordFieldContraseña.setText("");
            if (cont02 == 3) {
                JOptionPane.showMessageDialog(null, "Cerrando el programa por muchos intentos erroneos", "Cierre de seguridad", 0);
                System.exit(EXIT_ON_CLOSE);
            }
        }
        if (Contra.equalsIgnoreCase("") || Correo.equalsIgnoreCase("")) {
            return;
        }
        try {
            if (contInicios == 0) {
                prin.ReiniciarCargarDatos();
                contInicios = 1;
            }
            for (int i = 0; i < prin.getEmpleado().size(); i++) {
                if (prin.getEmpleado().get(i).getCorreo().equals(Correo)) {
                    if (prin.getEmpleado().get(i).getContraceña().equals(Contra)) {
                        cont01 = 0;
                        cont02 = 0;
                        prin.setPosActiv(i);
                        prin.setActivo(false);
                        this.jPasswordFieldContraseña.setText("");
                        this.setVisible(false);
                        prin.setVentPrinci(new PrincipalVent());
                        prin.getVentPrinci().show(true);
                    }
                    return;
                }
            }
            for (int i = 0; i < prin.getEmpleador().size(); i++) {
                if (prin.getEmpleador().get(i).getCorreo().equals(Correo)) {
                    if (prin.getEmpleador().get(i).getContraceña().equals(Contra)) {
                        cont01 = 0;
                        cont02 = 0;
                        prin.setPosActiv(i);
                        prin.setActivo(true);
                        this.setVisible(false);
                        this.jPasswordFieldContraseña.setText("");
                        prin.setVentPrinci(new PrincipalVent());
                        prin.getVentPrinci().show(true);
                    }
                    return;
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_jButtonIniciarSecionActionPerformed

    private void jButtonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCuentaActionPerformed
        prin.getVentInicio().setVisible(false);
        new CuadroDialogo().show();
    }//GEN-LAST:event_jButtonCrearCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    prin.ReiniciarCargarDatos();
                } catch (IOException e) {
                }
                prin.setVentInicio(new inicio());
                prin.getVentInicio().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCrearCuenta;
    private javax.swing.JButton jButtonIniciarSecion;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImagenInicio;
    private javax.swing.JLabel jLabelMensaje01;
    private javax.swing.JLabel jLabelMensaje02;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    // End of variables declaration//GEN-END:variables

}