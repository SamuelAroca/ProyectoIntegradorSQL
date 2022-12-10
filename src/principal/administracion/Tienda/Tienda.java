package principal.administracion.Tienda;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
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
        getContentPane().add(productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnCarrito.png"))); // NOI18N
        carrito.setBorder(null);
        carrito.setBorderPainted(false);
        carrito.setContentAreaFilled(false);
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });
        getContentPane().add(carrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

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
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/vitarrico_logo 4.png"))); // NOI18N
        labelLogo.setText("Vitarrico");
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Rectangle.png"))); // NOI18N
        getContentPane().add(rectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1100, 770));

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
        BufferedWriter bw;
        try {
            String filePath = "carrito.txt";
            bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("");
            bw.close();
            dispose();
            JFrame frameMain = new Login();
            frameMain.setResizable(false);
            frameMain.setSize(1073,767);
            frameMain.setLocationRelativeTo(null);
            frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameMain.setVisible(true);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_butonRegresarActionPerformed

    //Cambia los paneles de la tienda
    private void showPanel(JPanel p) {
        p.setSize(1078,767);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
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
                    try {
                        confirmarSalida();
                    } catch (IOException ex) {
                        Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    //Confirma la salida del usuario
    public void confirmarSalida() throws IOException {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cerrar la aplicación?","Advertencia",JOptionPane.YES_NO_OPTION);
        
        if (valor == JOptionPane.YES_OPTION) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("carrito.txt"))) {
                bw.write("");
                System.exit(0);
            }
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
