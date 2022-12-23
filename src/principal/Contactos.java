package principal;

import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import principal.logANDres.*;

public class Contactos extends javax.swing.JFrame {

    public Contactos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        face2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        direccion2 = new javax.swing.JLabel();
        direccion1 = new javax.swing.JLabel();
        face = new javax.swing.JLabel();
        insta = new javax.swing.JLabel();
        insta2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        whatsa = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Fijo 1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Comunicate desde cualquier lugar del país_.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        face2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/facebook 1.png"))); // NOI18N
        jPanel1.add(face2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Dirigete a nuestras instalaciones.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

        direccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Dirección 1.png"))); // NOI18N
        jPanel1.add(direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        direccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Calle 34 # 85 C – 1, Medellín, Antioquia.png"))); // NOI18N
        direccion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccion1MouseClicked(evt);
            }
        });
        jPanel1.add(direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, -1, -1));

        face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/@vitarricooficial.png"))); // NOI18N
        face.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faceMouseClicked(evt);
            }
        });
        jPanel1.add(face, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        insta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/@vitarricooficial.png"))); // NOI18N
        insta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instaMouseClicked(evt);
            }
        });
        jPanel1.add(insta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, -1, -1));

        insta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Insta 1.png"))); // NOI18N
        jPanel1.add(insta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Busca nuestras Redes Sociales.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/correo 1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/servicio.al.cliente@vitarrico.com.co.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Escríbenos al correo electrónico_.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/(604) 250 5106.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Wpp 1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        whatsa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/WhatsApp 315 366 58 14.png"))); // NOI18N
        whatsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                whatsaMouseClicked(evt);
            }
        });
        jPanel1.add(whatsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/CONTACTOS.png"))); // NOI18N
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/vitarrico_logo 2.png"))); // NOI18N
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/regresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/principal/Rectangle 2.png"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1079, 766));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Regresa a PantallaMain
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();
        frameMain.setResizable(false);
        frameMain.setSize(1073, 807);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed
    //Redirecciona a la pagina oficial de Vitarrico
    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelLogoMouseClicked
    //Redirecciona a Goggle Maps con la direccion de VItarrico
    private void direccion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccion1MouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://goo.gl/maps/6MyDnA4diGVJcFer8");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_direccion1MouseClicked
    //Redirecciona la Pagina oficial de Instagran de Vitarrico
    private void instaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instaMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://www.instagram.com/vitarricooficial/");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_instaMouseClicked
    //Redirecciona la Pagina oficial de Facebook 
    private void faceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faceMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://www.facebook.com/vitarricooficial");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_faceMouseClicked
    //Abre chat de WhastApp con Vitarrico
    private void whatsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_whatsaMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://wa.me/573153665814");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_whatsaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel direccion1;
    private javax.swing.JLabel direccion2;
    private javax.swing.JLabel face;
    private javax.swing.JLabel face2;
    private javax.swing.JLabel insta;
    private javax.swing.JLabel insta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel whatsa;
    // End of variables declaration//GEN-END:variables
}
