package principal.administracion.Tienda.panelsShop;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import principal.logANDres.*;

public class Carrito extends javax.swing.JPanel {

    public Carrito() {
        initComponents();
        rellenarTablaCarrito();
        txtPrice.setEditable(false);
        txtCode.setEditable(false);
        txtName.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/TitleBarCarritoTienda.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnCo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnNo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnPr.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/BtnCa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 680, 50));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 680, 50));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 680, 50));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 680, 50));

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/btnComprar.png"))); // NOI18N
        btnComprar.setToolTipText("");
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setContentAreaFilled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 120, 50));

        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 850, 300));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/btnActualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 120, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 120, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1075, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

    }//GEN-LAST:event_btnComprarActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            int fila = tblProducts.getSelectedRow();
            String codigo = tblProducts.getValueAt(fila, 0).toString();
            ps = conn.prepareStatement("SELECT id_producto, nombre, precio, cantidad FROM carrito WHERE id_producto = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                txtCode.setText(rs.getString(1));
                txtName.setText(rs.getString(2));
                txtPrice.setText(rs.getString(3));
                txtAmount.setText(rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (!txtAmount.getText().isEmpty() && validarCantidad(txtAmount.getText())) {
            try {
                PreparedStatement ps = null;
                Conexion objCon = new Conexion();
                Connection con = objCon.getConection();

                String sql = "UPDATE carrito SET cantidad = ? where id_producto = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, txtAmount.getText());
                ps.setString(2, txtCode.getText());

                int res = ps.executeUpdate();

                if (res > 0) {
                    System.out.println("Producto Actualizado");
                    limpiar();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error con la cantidad");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            PreparedStatement ps = null;

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            int fila = tblProducts.getSelectedRow();
            String codigo = tblProducts.getValueAt(fila, 0).toString();

            if (actualizarCantidad(codigo)) {
                String sql = "DELETE FROM carrito WHERE id_producto = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, codigo);

                int res = ps.executeUpdate();

                if (res > 0) {
                    System.out.println("Producto eliminado del carrito");
                    rellenarTablaCarrito();
                    limpiar();
                } else {
                    System.out.println("Error al eliminar");
                }
            } else {
                System.out.println("Error al actualizar");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        rellenarTablaCarrito();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rellenarTablaCarrito() {
        String campo = txtBuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE id_producto = '" + campo + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblProducts.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();

            String sql = "SELECT id_producto, nombre, precio, cantidad FROM carrito " + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Código");
            modelo.addColumn("Producto");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");

            int[] anchos = {50, 200, 50, 50};

            for (int i = 0; i < tblProducts.getColumnCount(); i++) {
                tblProducts.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    public boolean actualizarCantidad(String codigo) {
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = conn.prepareStatement("SELECT id_producto, cantidad FROM carrito WHERE id_producto = ?");
            ps.setString(1, codigo);
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
                            System.out.println("Producto eliminado o actualizado");
                            return true;
                        }
                    } catch (SQLException ex) {
                        System.out.println("Error 3: " + ex);
                    }
                } catch (SQLException ex1) {
                    System.out.println("Error 2: " + ex1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error 1: " + e);
        }
        return false;
    }

    public void limpiar() {
        txtCode.setText(null);
        txtName.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }

    public static boolean validarCantidad(String cantidad) {
        return cantidad.matches("^[0-9]+$");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
