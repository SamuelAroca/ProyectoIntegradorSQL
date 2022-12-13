package principal.logANDres;

import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.*;
import principal.*;

public class PantallaMain extends javax.swing.JFrame {

    public PantallaMain() {
        initComponents();
    }

    //Metodos para abrir los enlaces 
    public void enlace(String enlaceAAceder) throws IOException {
        Desktop enlace = Desktop.getDesktop();
        try {
            enlace.browse(new URI(enlaceAAceder));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PantallaMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enlacePubli(String enlaceAAceder) {
        Desktop enlace = Desktop.getDesktop();
        try {
            enlace.browse(new URI(enlaceAAceder));

        } catch (IOException | URISyntaxException e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelVideo = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        botonLogin = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonContactos = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/marco.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 390, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/cereal-milk.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 340, 240));

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Titulo Main.png"))); // NOI18N
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/LogoV.png"))); // NOI18N
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        labelVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/BtnVideo.png"))); // NOI18N
        labelVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVideoMouseClicked(evt);
            }
        });
        jPanel1.add(labelVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 560, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/energia.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 730, -1, -1));

        botonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Boton Inicio.png"))); // NOI18N
        botonLogin.setBorder(null);
        botonLogin.setBorderPainted(false);
        botonLogin.setContentAreaFilled(false);
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));
        botonLogin.getAccessibleContext().setAccessibleName("botonLogin");

        botonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/boton registro.png"))); // NOI18N
        botonRegistro.setBorder(null);
        botonRegistro.setBorderPainted(false);
        botonRegistro.setContentAreaFilled(false);
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        botonContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/txtContac.png"))); // NOI18N
        botonContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonContactosMouseClicked(evt);
            }
        });
        jPanel1.add(botonContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Rectangle 2.png"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Abre el Frame Login
    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        dispose();
        JFrame frameLog = new Login();
        frameLog.setResizable(false);
        frameLog.setSize(1073, 767);
        frameLog.setLocationRelativeTo(null);
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.setVisible(true);
    }//GEN-LAST:event_botonLoginActionPerformed

    //Abre el Frame Registro
    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        dispose();
        JFrame frameRegistro = new Registro();
        frameRegistro.setResizable(false);
        frameRegistro.setSize(1073, 767);
        frameRegistro.setLocationRelativeTo(null);
        frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegistro.setVisible(true);
    }//GEN-LAST:event_botonRegistroActionPerformed

    //Redirecciona a la pagina oficial de Vitarrico
    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelLogoMouseClicked

    //Abre un video de Vitarrico
    private void labelVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVideoMouseClicked
        enlacePubli("https://youtu.be/WWbjMbjcvt0");
    }//GEN-LAST:event_labelVideoMouseClicked

    //Abre el Frame Contactos
    private void botonContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonContactosMouseClicked
        dispose();
        JFrame frameContacto = new Contactos();
        frameContacto.setResizable(false);
        frameContacto.setSize(1035, 767);
        frameContacto.setLocationRelativeTo(null);
        frameContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameContacto.setVisible(true);
    }//GEN-LAST:event_botonContactosMouseClicked

    //Cierra el programa
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonContactos;
    private javax.swing.JButton botonLogin;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVideo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
