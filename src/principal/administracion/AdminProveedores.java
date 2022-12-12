package principal.administracion;

import java.sql.*;
import java.util.Objects;
import principal.logANDres.Conexion;

public class AdminProveedores extends javax.swing.JPanel {

    public AdminProveedores() {
        initComponents();
        txt_id_product.setEditable(false);

        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion conn = new Conexion();
        Connection con = conn.getConection();

        try {
            String sql = "SELECT id_producto from productos";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            cbxId_productos.addItem("ID Productos");

            while (rs.next()) {
                cbxId_productos.addItem(rs.getString("id_producto"));
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error consulta: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txt_id_product = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cbxId_productos = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarProveedores.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel2.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/lblNProducto_1.png"))); // NOI18N
        jPanel2.add(lblProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblPrice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/lblNProducto.png"))); // NOI18N
        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCa.png"))); // NOI18N
        jPanel2.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel2.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 680, 50));
        jPanel2.add(txt_id_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 680, 50));
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 680, 50));
        jPanel2.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 680, 50));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Producto", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);
        if (tblProducts.getColumnModel().getColumnCount() > 0) {
            tblProducts.getColumnModel().getColumn(0).setResizable(false);
            tblProducts.getColumnModel().getColumn(1).setResizable(false);
            tblProducts.getColumnModel().getColumn(2).setResizable(false);
            tblProducts.getColumnModel().getColumn(3).setResizable(false);
            tblProducts.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 850, 250));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Agregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, -1, -1));

        lblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnNo.png"))); // NOI18N
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 680, 50));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnModificar.png"))); // NOI18N
        btnModificar.setBorder(null);
        btnModificar.setBorderPainted(false);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, -1, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, 120, 30));

        cbxId_productos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxId_productosItemStateChanged(evt);
            }
        });
        jPanel2.add(cbxId_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 690));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Carga datos seleccionados en los Label
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked

    }//GEN-LAST:event_tblProductsMouseClicked

    //Agrega los proveedores a la tabla y al archivo de texto
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    //Elimina del Archivo y tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    //Actualiza los datos del proveedor
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //rellenarTablaProducto();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxId_productosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxId_productosItemStateChanged
        if (Objects.equals(cbxId_productos.getSelectedItem(), "ID Productos")) {
            txt_id_product.setText("");
        } else {
            txt_id_product.setText((String) cbxId_productos.getSelectedItem());
        }
    }//GEN-LAST:event_cbxId_productosItemStateChanged

    //Metodo para actualizar la tabla
    private void actualizarTabla() {

    }

    //Metodo para cargar los datos en la tabla
    private void cargarDatos() {

    }

    //Limpia los Label
    //Escribe en la base de datos
    private void escribiArchivo() {

    }

    public void limpiar() {
        txtCode.setText(null);
        txtName.setText(null);
        txt_id_product.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }

    //Verifican que el usuario no digite mal un dato
    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-Z]{1}[a-z0-9A-ZñÑ]+)$");
    }

    public static boolean validarPrecio(String precio) {
        return precio.matches("^[0-9]{3}[0-9]+$");
    }

    public static boolean validarCantidad(String cantidad) {
        return cantidad.matches("^[0-9]+$");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxId_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txt_id_product;
    // End of variables declaration//GEN-END:variables
}
