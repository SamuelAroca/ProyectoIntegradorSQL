package principal.logANDres;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import principal.*;
import principal.administracion.Tienda.*;
import principal.admins.Admins;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        rootPane.setDefaultButton(btnLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContac = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        butonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        comboTipoUser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContac.setBackground(new java.awt.Color(235, 197, 30));
        btnContac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/txtContac.png"))); // NOI18N
        btnContac.setBorder(null);
        btnContac.setBorderPainted(false);
        btnContac.setContentAreaFilled(false);
        btnContac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContacActionPerformed(evt);
            }
        });
        getContentPane().add(btnContac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Ingreso Usuario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/BIENVENIDO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        butonRegresar.setBackground(new java.awt.Color(235, 197, 30));
        butonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/regresar.png"))); // NOI18N
        butonRegresar.setToolTipText("");
        butonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonRegresar.setBorderPainted(false);
        butonRegresar.setContentAreaFilled(false);
        butonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(butonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Rectangle 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/LogoV.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        txtName.setBackground(new java.awt.Color(229, 229, 229));
        txtName.setToolTipText("Nombre registrado");
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 470, 50));

        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/sesion.png"))); // NOI18N
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 220, -1));

        lblTitle1.setForeground(new java.awt.Color(163, 156, 156));
        lblTitle1.setText("Ingresa tus credenciales");
        jPanel2.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtPassword.setBackground(new java.awt.Color(229, 229, 229));
        txtPassword.setToolTipText("Contraseña");
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 470, 50));

        jLabel4.setText("Identificacion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel6.setText("Contraseña");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        txtId.setBackground(new java.awt.Color(229, 229, 229));
        txtId.setToolTipText("ID Registrado");
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 470, 50));

        labelNombre.setText("Nombre");
        jPanel2.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        comboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Cliente", "Administrador" }));
        jPanel2.add(comboTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 580, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inicion de Sesión
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String tabla = "";

        if (Objects.equals(comboTipoUser.getSelectedItem(), "Cliente")) {
            tabla = "users";
            loguear(tabla);
        } else if (Objects.equals(comboTipoUser.getSelectedItem(), "Administrador")) {
            tabla = "admins";
            loguear(tabla);
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor Selecciona un tipo de usuario");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    public void loguear(String tabla) {
        try {
            String id = txtId.getText();
            String nombre = txtName.getText();
            String cantraseña = txtPassword.getText();
            
            if (!id.isEmpty() && !nombre.isEmpty() && !cantraseña.isEmpty()) {
                PreparedStatement ps;
                ResultSet rs;
                
                Conexion objCon = new Conexion();
                Connection conn = objCon.getConection();
                
                ps = conn.prepareStatement("SELECT identificacion,nombre,contraseña FROM " + tabla + " WHERE identificacion = ? AND nombre = ? AND contraseña = ?");
                ps.setString(1, id);
                ps.setString(2, nombre);
                ps.setString(3, cantraseña);
                System.out.println(ps);

                rs = ps.executeQuery();

                if (rs.next()) {
                    if (Objects.equals(comboTipoUser.getSelectedItem(), "Cliente")) {
                        usuarioActual(id, nombre, cantraseña);
                        dispose();
                        JFrame frameTienda = new Tienda();
                        frameTienda.setResizable(false);
                        frameTienda.setSize(1346, 805);
                        frameTienda.setLocationRelativeTo(null);
                        frameTienda.setVisible(true);
                    } else if (Objects.equals(comboTipoUser.getSelectedItem(), "Administrador")) {
                        usuarioActual(id, nombre, cantraseña);
                        dispose();
                        JFrame frameAdmin = new Admins();
                        frameAdmin.setResizable(false);
                        frameAdmin.setSize(1346, 805);
                        frameAdmin.setLocationRelativeTo(null);
                        frameAdmin.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Porfavor Selecciona un tipo de usuario");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nombre y/o contraseña y/o identificacion incorrectos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Porfavor Rellene todos los espacios");
            }
        } catch (SQLException ex) {

        }
    }
    
    public void usuarioActual(String id, String nombre, String contraseña) {
        try {
            PreparedStatement ps = null;
            
            Conexion objCon = new Conexion();
            Connection con = objCon.getConection();
            
            ps = con.prepareStatement("INSERT INTO usuario_actual (id_usuario, nombre, contraseña) VALUES (?,?,?)");
            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, contraseña);
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                System.out.println("Usuario actual registrado");
            } else {
                System.out.println("Usuario actual no registrado");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    
    //Dirige al Frame Contactos
    private void btnContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacActionPerformed
        dispose();
        JFrame frameContacto = new Contactos();
        frameContacto.setResizable(false);
        frameContacto.setSize(1073, 767);
        frameContacto.setLocationRelativeTo(null);
        frameContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameContacto.setVisible(true);
    }//GEN-LAST:event_btnContacActionPerformed
    //Redirecciona a la pagina oficial de Vitarrico
    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblLogoMouseClicked
    //Regresa a PantallaMain
    private void butonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();
        frameMain.setResizable(false);
        frameMain.setSize(1073, 767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContac;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton butonRegresar;
    private javax.swing.JComboBox<String> comboTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
