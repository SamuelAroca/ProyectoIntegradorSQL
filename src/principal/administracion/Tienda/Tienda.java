package principal.administracion.Tienda;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import principal.administracion.Tienda.panelsShop.*;
import principal.logANDres.*;

public class Tienda extends javax.swing.JFrame {

    public Tienda() {
        initComponents();
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
        cerrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productos = new javax.swing.JButton();
        carrito = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        butonRegresar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        rectangulo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
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
        confirmarRegresar();
        eliminarUsuarioActual();
        dispose();
        JFrame frameMain = new Login();
        frameMain.setResizable(false);
        frameMain.setSize(1073, 767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed

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
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    eliminarUsuarioActual();
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    //Confirma la salida del usuario
    public void confirmarSalida() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cerrar la aplicación?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION) {
            eliminarCarrito();
            System.exit(0);
        } else if (valor == JOptionPane.NO_OPTION) {
            PanelTienda pt = new PanelTienda();
            showPanel(pt);
        }
    }

    public void confirmarRegresar() {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cerrar la sesion?", "Advertencia", JOptionPane.YES_NO_OPTION);

        if (valor == JOptionPane.YES_OPTION) {
            eliminarCarrito();
        } else if (valor == JOptionPane.NO_OPTION) {
            PanelTienda pt = new PanelTienda();
            showPanel(pt);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonRegresar;
    private javax.swing.JButton carrito;
    private javax.swing.JPanel content;
    public javax.swing.JLabel labelLogo;
    private javax.swing.JButton productos;
    private javax.swing.JLabel rectangulo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
