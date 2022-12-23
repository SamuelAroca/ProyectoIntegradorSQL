package principal.administracion.Tienda;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import principal.administracion.Tienda.panelsShop.*;
import principal.logANDres.*;

public class Tienda extends javax.swing.JFrame {

    public Tienda() {
        initComponents();
        mostrarSaldo();
        cbxSaldo.setSelectedIndex(0);
        btnAgregarSaldo.setVisible(false);
        txtSaldo.setEditable(false);
        txtAñadirSaldo.setVisible(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productos = new javax.swing.JButton();
        carrito = new javax.swing.JButton();
        compras = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        txtAñadirSaldo = new javax.swing.JTextField();
        actualizarSaldo = new javax.swing.JButton();
        cbxSaldo = new javax.swing.JComboBox<>();
        btnAgregarSaldo = new javax.swing.JButton();
        butonRegresar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        rectangulo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnProductos.png"))); // NOI18N
        productos.setBorder(null);
        productos.setBorderPainted(false);
        productos.setContentAreaFilled(false);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnCarrito.png"))); // NOI18N
        carrito.setBorder(null);
        carrito.setBorderPainted(false);
        carrito.setContentAreaFilled(false);
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        getContentPane().add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnCompras.png"))); // NOI18N
        compras.setBorder(null);
        compras.setBorderPainted(false);
        compras.setContentAreaFilled(false);
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/energia.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/saldo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));
        getContentPane().add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 80, -1));
        getContentPane().add(txtAñadirSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 80, -1));

        actualizarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/actualizar.png"))); // NOI18N
        actualizarSaldo.setToolTipText("Actualizar Saldo");
        actualizarSaldo.setBorder(null);
        actualizarSaldo.setBorderPainted(false);
        actualizarSaldo.setContentAreaFilled(false);
        actualizarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(actualizarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, -1, -1));

        cbxSaldo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saldo", "Agregar Saldo" }));
        cbxSaldo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSaldoItemStateChanged(evt);
            }
        });
        getContentPane().add(cbxSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, -1, -1));

        btnAgregarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/plus-pequeno.png"))); // NOI18N
        btnAgregarSaldo.setToolTipText("Agregar Saldo");
        btnAgregarSaldo.setBorder(null);
        btnAgregarSaldo.setBorderPainted(false);
        btnAgregarSaldo.setContentAreaFilled(false);
        btnAgregarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 20, 20));

        butonRegresar.setBackground(new java.awt.Color(235, 197, 30));
        butonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/regresar.png"))); // NOI18N
        butonRegresar.setToolTipText("");
        butonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonRegresar.setBorderPainted(false);
        butonRegresar.setContentAreaFilled(false);
        butonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(butonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 130, 40));

        labelLogo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/vitarrico_logo 2.png"))); // NOI18N
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Dashboard.png"))); // NOI18N
        getContentPane().add(rectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 1070, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Llama al panel Tienda
    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
    }//GEN-LAST:event_productosActionPerformed

    //Llama al panel Carrito
    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        Carrito p2 = new Carrito();
        showPanel(p2);
    }//GEN-LAST:event_carritoActionPerformed

    //Llama al metodo cerrar
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        cerrar();
    }//GEN-LAST:event_salirActionPerformed

    //Regresa al Login borrando el archivo carrito.txt
    private void butonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRegresarActionPerformed
        regresar();
        eliminarUsuarioActual();
        dispose();
        JFrame frameMain = new Login();
        frameMain.setResizable(false);
        frameMain.setSize(1073, 767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        Compras cr = new Compras();
        showPanel(cr);
    }//GEN-LAST:event_comprasActionPerformed

    private void btnAgregarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSaldoActionPerformed
        if (validarSaldo(txtAñadirSaldo.getText()) && !txtAñadirSaldo.getText().isEmpty()) {    
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;

                Conexion objCon = new Conexion();
                Connection con = objCon.getConection();

                ps = con.prepareStatement("SELECT id_usuario FROM usuario_actual");
                rs = ps.executeQuery();

                while (rs.next()) {
                    int idUsuario = rs.getInt(1);
                    int saldo = Integer.parseInt(txtAñadirSaldo.getText());

                    PreparedStatement ps1 = null;
                    ResultSet rs1 = null;

                    ps1 = con.prepareStatement("SELECT saldo FROM users WHERE identificacion = ?");
                    ps1.setInt(1, idUsuario);
                    rs1 = ps1.executeQuery();
                    rs1.next();
                    int saldoUser = rs1.getInt(1);
                    saldo += saldoUser;

                    PreparedStatement ps2 = null;

                    ps2 = con.prepareStatement("UPDATE users SET saldo = ? WHERE identificacion = ?");
                    ps2.setInt(1, saldo);
                    ps2.setInt(2, idUsuario);
                    int res = ps2.executeUpdate();

                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Dinero agregado");
                        txtAñadirSaldo.setText(null);
                        camposSaldo(false, true, false);
                        cbxSaldo.setSelectedIndex(0);
                        mostrarSaldo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al agregar dinero");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifique o agregue el saldo");
        }
    }//GEN-LAST:event_btnAgregarSaldoActionPerformed

    private void cbxSaldoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSaldoItemStateChanged
        if (Objects.equals(cbxSaldo.getSelectedItem(), "Saldo")) {
            mostrarSaldo();
            camposSaldo(false, true, false);
        } else if (Objects.equals(cbxSaldo.getSelectedItem(), "Agregar Saldo")) {
            camposSaldo(true, false, true);
        }
    }//GEN-LAST:event_cbxSaldoItemStateChanged

    private void actualizarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSaldoActionPerformed
        mostrarSaldo();
        cbxSaldo.setSelectedIndex(0);
        camposSaldo(false, true, false);
    }//GEN-LAST:event_actualizarSaldoActionPerformed
    
    private void mostrarSaldo() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            Conexion objCon = new Conexion();
            Connection con = objCon.getConection();
            
            ps = con.prepareStatement("SELECT id_usuario FROM usuario_actual");
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt(1);
                
                PreparedStatement ps1 = null;
                ResultSet rs1 = null;
                
                ps1 = con.prepareStatement("SELECT saldo FROM users WHERE identificacion = ?");
                ps1.setInt(1, id);
                rs1 = ps1.executeQuery();
                rs1.next();
                String saldo = rs1.getString(1);
                txtSaldo.setText(saldo);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
    //Cambia los paneles de la tienda
    private void showPanel(JPanel p) {
        p.setSize(1078, 767);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    //Metodo para borrar o no el carrito
    private void cerrar() {
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion?", "Titulo", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {
            eliminarUsuarioActual();
            eliminarCarrito();
            System.exit(0);
        } else if (eleccion == JOptionPane.NO_OPTION) {
            System.out.println("Se cancelo el cierre");
        }
    }

    private void regresar() {
        String botones[] = {"Cerrar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion?", "Titulo", 0, 0, null, botones, this);

        if (eleccion == JOptionPane.YES_OPTION) {
            eliminarUsuarioActual();
            eliminarCarrito();
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

    public void eliminarCarrito() {
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = conn.prepareStatement("SELECT id_producto, cantidad FROM carrito");
            rs = ps.executeQuery();
            System.out.println(rs);

            while (rs.next()) {
                String idCarrito = rs.getString(1);
                int cantidadCarrito = rs.getInt(2);
                try {
                    PreparedStatement ps2 = null;
                    ResultSet rs2 = null;

                    ps2 = conn.prepareStatement("SELECT cantidad FROM productos where id_producto = ?");
                    ps2.setString(1, idCarrito);
                    rs2 = ps2.executeQuery();
                    rs2.next();
                    int cantidadProducto = rs2.getInt(1);

                    int cantidadUpdate = cantidadProducto + cantidadCarrito;
                    System.out.println(cantidadUpdate);
                    try {
                        PreparedStatement ps3 = null;
                        ps3 = conn.prepareStatement("UPDATE productos SET cantidad = ? WHERE id_producto = ?");
                        ps3.setInt(1, cantidadUpdate);
                        ps3.setString(2, idCarrito);

                        int res = ps3.executeUpdate();

                        if (res > 0) {
                            try {
                                PreparedStatement ps4 = null;

                                ps4 = conn.prepareStatement("DELETE FROM carrito");

                                int res2 = ps4.executeUpdate();
                                if (res2 > 0) {
                                    System.out.println("Carrito eliminado");
                                } else {
                                    System.out.println("Error al eliminar");
                                }
                            } catch (SQLException ex) {
                                System.out.println("Error 1: " + ex);
                            }
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error 4: " + ex);
                    }
                } catch (SQLException ex1) {
                    System.out.println("Error 3: " + ex1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error 1: " + e);
        }
    }
    
    private void camposSaldo(boolean txtAñadirSaldoVisible, boolean saldoVisible, boolean btnSaldoVisible) {
        txtAñadirSaldo.setVisible(txtAñadirSaldoVisible);
        txtSaldo.setVisible(saldoVisible);
        btnAgregarSaldo.setVisible(btnSaldoVisible);
    }
    
    public static boolean validarSaldo(String precio) {
        return precio.matches("^[0-9]{1}[0-9]+$");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarSaldo;
    private javax.swing.JButton btnAgregarSaldo;
    private javax.swing.JButton butonRegresar;
    private javax.swing.JButton carrito;
    private javax.swing.JComboBox<String> cbxSaldo;
    private javax.swing.JButton compras;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel labelLogo;
    private javax.swing.JButton productos;
    private javax.swing.JLabel rectangulo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtAñadirSaldo;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
