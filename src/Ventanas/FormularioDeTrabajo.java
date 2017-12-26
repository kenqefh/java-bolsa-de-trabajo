/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Modelos.Trabajo;
import Operaciones.testTrabajo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Ventanas.inicio.prin;

/**
 *
 * @author Frank
 */
public class FormularioDeTrabajo extends javax.swing.JFrame {

    /**
     * Creates new form FormularioDeTrabajo
     */
    public FormularioDeTrabajo() {
        initComponents();
        this.setBounds(300, 100, 700, 561);
        this.Empresa.setText(prin.getEmpleador().get(prin.getPosActiv()).getEmpresa());
        SNum(Personal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CarrerasProfesioanales = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Personal = new javax.swing.JTextField();
        AreaLaboral = new javax.swing.JComboBox();
        Empresa = new javax.swing.JTextField();
        Enviar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelMenPersonal = new javax.swing.JLabel();
        jLabelMenEmpresas = new javax.swing.JLabel();
        jLabelMenCanti = new javax.swing.JLabel();
        jLabelMenRequisitos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Requisitos = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Esta usted por publicar una oprtunidad de empleo, llene el siguiente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 20, 530, 19);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("formulario con datos veridicos por favor...");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 40, 350, 19);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 236, 243));
        jLabel3.setText("Personal:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(25, 89, 94, 20);
        getContentPane().add(CarrerasProfesioanales);
        CarrerasProfesioanales.setBounds(140, 82, 180, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(6, 236, 243));
        jLabel4.setText("Cantidad:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 90, 100, 16);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(6, 236, 243));
        jLabel5.setText("Area Laboral:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 142, 94, 16);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(6, 236, 243));
        jLabel6.setText("Empresas:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(25, 187, 64, 27);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(6, 236, 243));
        jLabel7.setText("REquisitos");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(25, 236, 80, 16);

        Personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonalActionPerformed(evt);
            }
        });
        getContentPane().add(Personal);
        Personal.setBounds(460, 82, 140, 30);

        AreaLaboral.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administración", "Call Center", "Comercio Exterior", "Comunicación", "Construcción", "Diseño", "Educación", "Finanzas", "Gastronomía y Turismo", "Gerencia", "Ingeniería", "Legales", "Logística", "Marketing", "Medicina", "Minería", "Oficios", "Producción", "RRHH", "Secretaria", "Seguros", "Tecnología", "Ventas" }));
        getContentPane().add(AreaLaboral);
        AreaLaboral.setBounds(137, 135, 130, 30);

        Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(Empresa);
        Empresa.setBounds(137, 183, 295, 35);

        Enviar.setText("Publicar");
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Enviar);
        Enviar.setBounds(20, 490, 101, 35);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(590, 490, 100, 35);

        jLabelMenPersonal.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jLabelMenPersonal);
        jLabelMenPersonal.setBounds(140, 110, 260, 20);

        jLabelMenEmpresas.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jLabelMenEmpresas);
        jLabelMenEmpresas.setBounds(140, 220, 480, 20);

        jLabelMenCanti.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jLabelMenCanti);
        jLabelMenCanti.setBounds(460, 110, 230, 20);

        jLabelMenRequisitos.setForeground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jLabelMenRequisitos);
        jLabelMenRequisitos.setBounds(30, 454, 600, 20);

        Requisitos.setColumns(20);
        Requisitos.setRows(5);
        Requisitos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RequisitosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Requisitos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(26, 266, 660, 190);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/FormularioTrabajo_580p.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 0, 720, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonalActionPerformed

    private void EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_EmpresaActionPerformed

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        // TODO add your handling code here
        borrar();
        if (CarrerasProfesioanales.getText().equalsIgnoreCase("")) {
            jLabelMenPersonal.setText("Ingrese el personal que requiere");
            return;
        } else {
            if (CarrerasProfesioanales.getText().length() <= 3) {
                jLabelMenPersonal.setText("Ingrese datos validos");
                return;
            } else {
                if (Personal.getText().equalsIgnoreCase("")) {
                    jLabelMenCanti.setText("Inserte un numero");
                    return;
                } else {
                    int num=-1;
                    try {
                        num=Integer.parseInt(Personal.getText());
                    } catch (Exception e) {
                        jLabelMenCanti.setText("Numeros por favor");
                        return;
                    }
                    if (Integer.parseInt(Personal.getText()) >= 10000) {
                        jLabelMenCanti.setText("Cantidad muy elevado");
                        return;
                    } else {
                        if (Empresa.getText().equalsIgnoreCase("")) {
                            jLabelMenEmpresas.setText("Ingrese la empresa");
                            return;
                        } else {
                            if (Requisitos.getText().equalsIgnoreCase("")) {
                                jLabelMenRequisitos.setText("Ingrese a lo menos un requisito");
                                return;
                            } else {
                                if (LecturaTexArea().length() >= 900) {
                                    jLabelMenRequisitos.setText("Sobrepaso el limite");
                                    return;
                                } else {
                                    prin.getTrabajo().add(new Trabajo(prin.getEmpleador().get(prin.getPosActiv()).getNombre(), CarrerasProfesioanales.getText(), Integer.parseInt(Personal.getText()), String.valueOf(AreaLaboral.getSelectedItem()),Empresa.getText(), LecturaTexArea()));
                                    new  testTrabajo().guardarTrabajo(prin.getTrabajo(), prin.getDirtTrabajos());
                                    this.setVisible(false);
                                    this.dispose();
                                    JOptionPane.showMessageDialog(null, "se creo y publico correctamente su aviso","Mensaje",1);
                                    prin.getVentCuentEmp().setVisible(true);
                                }

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_EnviarActionPerformed

    private void borrar() {
        jLabelMenCanti.setText("");
        jLabelMenEmpresas.setText("");
        jLabelMenPersonal.setText("");
        jLabelMenRequisitos.setText("");
    }

    private void SNum(JTextField tex) {
        tex.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

    private String LecturaTexArea() {
        //  tamaño maximo que soporta una linea de un bloc de notas 1024
        //  
        String cad = "", cadTem = Requisitos.getText();
        String cadVecRequisitos[] = cadTem.split("\n");
        for (int i = 0; i < cadVecRequisitos.length - 1; i++) {
            cadVecRequisitos[i] += "/:";
        }
        for (String c : cadVecRequisitos) {
            cad += c;
        }
        return cad;
    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (0 == JOptionPane.showConfirmDialog(null, "Desea Cancelar el llenado del formulario", "Mensaje", 1)) {
            this.setVisible(false);
            this.dispose();
            prin.getVentCuentEmp().setVisible(true);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void RequisitosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RequisitosKeyPressed

    }//GEN-LAST:event_RequisitosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AreaLaboral;
    private javax.swing.JTextField CarrerasProfesioanales;
    private javax.swing.JTextField Empresa;
    private javax.swing.JButton Enviar;
    private javax.swing.JTextField Personal;
    private javax.swing.JTextArea Requisitos;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMenCanti;
    private javax.swing.JLabel jLabelMenEmpresas;
    private javax.swing.JLabel jLabelMenPersonal;
    private javax.swing.JLabel jLabelMenRequisitos;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}