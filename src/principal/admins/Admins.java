package principal.admins;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import principal.administracion.*;
import principal.logANDres.*;

public class Admins extends javax.swing.JFrame {

    public Admins() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        JPanel p1 = new AdminProductsR();
        changePanels(p1);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegis = new javax.swing.JButton();
        btnModicar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        btnAdminPE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/RegresarVerde.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        btnRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/ResP.png"))); // NOI18N
        btnRegis.setToolTipText("");
        btnRegis.setBorder(null);
        btnRegis.setBorderPainted(false);
        btnRegis.setContentAreaFilled(false);
        btnRegis.setFocusPainted(false);
        btnRegis.setFocusable(false);
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, -1));

        btnModicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Modificar.png"))); // NOI18N
        btnModicar.setBorderPainted(false);
        btnModicar.setContentAreaFilled(false);
        btnModicar.setFocusable(false);
        btnModicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/energia.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, -1, -1));

        btnAdminPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/ResPE.png"))); // NOI18N
        btnAdminPE.setBorderPainted(false);
        btnAdminPE.setContentAreaFilled(false);
        btnAdminPE.setFocusPainted(false);
        btnAdminPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPEActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/vitarrico_logo 2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Dashboard.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 1070, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Llama al panel AdminProductsR
    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        JPanel p1 = new AdminProductsR();
        changePanels(p1);
    }//GEN-LAST:event_btnRegisActionPerformed

    //Llama al panel AdminProductsEC
    private void btnModicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModicarActionPerformed
        JPanel p2 = new AdminProductsEC();
        changePanels(p2);
    }//GEN-LAST:event_btnModicarActionPerformed

    //Nos regresa al Login
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        cerrar();
        dispose();
        JFrame frameLogin = new Login();
        frameLogin.setResizable(false);
        frameLogin.setSize(1089, 795);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    //Nos cierra el programa
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        cerrar();
        dispose();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    //Llama al panel AdminProveedores
    private void btnAdminPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPEActionPerformed
        JPanel p3 = new AdminProveedores();
        changePanels(p3);
    }//GEN-LAST:event_btnAdminPEActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    //Metodo para cambiar los paneles del Frame
    private void changePanels(JPanel p) {
        p.setSize(1075, 767);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void cerrar() {
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion?", "Titulo", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {
            eliminarUsuarioActual();
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
    }

    private void eliminarUsuarioActual() {
        try {
            PreparedStatement ps = null;

            Conexion objCon = new Conexion();
            Connection con = objCon.getConection();

            ps = con.prepareStatement("DELETE FROM usuario_actual");

            int res = ps.executeUpdate();

            if (res > 0) {
                System.out.println("Usuario actual eliminado");
            } else {
                System.out.println("Error al eliminar el usuario actual");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminPE;
    private javax.swing.JButton btnModicar;
    private javax.swing.JButton btnRegis;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
