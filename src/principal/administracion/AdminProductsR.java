package principal.administracion;

import java.sql.*;
import java.util.Objects;
import javax.swing.*;
import javax.swing.table.*;
import principal.logANDres.*;

public class AdminProductsR extends javax.swing.JPanel {

    public AdminProductsR() {
        initComponents();
        comboProveedor();
        rellenarTablaProducto();
        txtProveedor.setEditable(false);
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
        txtProveedor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        cbxProveedor = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarAgregar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnNo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnPr.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/proveedorBTN.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 680, 50));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 680, 50));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 680, 50));
        jPanel1.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 680, 50));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 120, 50));

        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 850, 270));

        cbxProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProveedorItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 590, 140, 30));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1. Granolas", "2. Cereales", "3. Avenas", "4. Bebidas", "5. Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, 140, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Productos.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCa.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 680, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Agrega los productos a la tabla y al archivo de texto
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtCode.getText().isEmpty() && !txtName.getText().isEmpty() && !txtPrice.getText().isEmpty() && !txtProveedor.getText().isEmpty() && !txtProveedor.getText().isEmpty()) {
            if (validarCodigo(txtCode.getText()) && validarNombre(txtName.getText()) && validarPrecio(txtPrice.getText()) && validarCantidad(txtAmount.getText())) {
                try {
                    PreparedStatement ps = null;

                    Conexion objCon = new Conexion();
                    Connection conn = objCon.getConection();

                    ps = conn.prepareStatement("INSERT INTO productos (id_producto, nombre, precio, cantidad, id_proveedor) VALUES (?,?,?,?,?)");
                    ps.setString(1, txtCode.getText());
                    ps.setString(2, txtName.getText());
                    ps.setString(3, txtPrice.getText());
                    ps.setString(4, txtAmount.getText());
                    ps.setString(5, txtProveedor.getText());

                    ps.execute();

                    JOptionPane.showMessageDialog(null, "Producto Guardado");

                    if (Objects.equals(comboTipo.getSelectedItem(), "Todos")) {
                        rellenarTablaProducto();
                    } else if (Objects.equals(comboTipo.getSelectedItem(), "1. Granolas")) {
                        rellenarTabla("1");
                    } else if (Objects.equals(comboTipo.getSelectedItem(), "2. Cereales")) {
                        rellenarTabla("2");
                    } else if (Objects.equals(comboTipo.getSelectedItem(), "3. Avenas")) {
                        rellenarTabla("3");
                    } else if (Objects.equals(comboTipo.getSelectedItem(), "4. Bebidas")) {
                        rellenarTabla("4");
                    } else if (Objects.equals(comboTipo.getSelectedItem(), "5. Otros")) {
                        rellenarTabla("5");
                    }
                    limpiar();
                    cbxProveedor.setSelectedIndex(0);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al Guardar Producto");
                    System.out.println(ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite bien los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Cambia el tipo de producto en la tabla
    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged

        //Opciones del comboBox
        if (Objects.equals(comboTipo.getSelectedItem(), "Todos")) {
            rellenarTablaProducto();
            txtBuscar.setText(null);
        } else if (Objects.equals(comboTipo.getSelectedItem(), "1. Granolas")) {
            rellenarTabla("1");
        } else if (Objects.equals(comboTipo.getSelectedItem(), "2. Cereales")) {
            rellenarTabla("2");
        } else if (Objects.equals(comboTipo.getSelectedItem(), "3. Avenas")) {
            rellenarTabla("3");
        } else if (Objects.equals(comboTipo.getSelectedItem(), "4. Bebidas")) {
            rellenarTabla("4");
        } else if (Objects.equals(comboTipo.getSelectedItem(), "5. Otros")) {
            rellenarTabla("5");
        }
    }//GEN-LAST:event_comboTipoItemStateChanged

    //Advierte al usuario que digito mal un dato
    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (!validarNombre(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "Mayúscula inicial y sin espacios");
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String campo = txtBuscar.getText();
        if ("".equals(campo)) {
            comboTipo.setSelectedIndex(0);
            rellenarTablaProducto();
        } else {
            rellenarTablaProducto();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbxProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProveedorItemStateChanged
        if (Objects.equals(cbxProveedor.getSelectedItem(), "Proveedor")) {
            txtProveedor.setText("");
        } else {
            String idProveedor = (String) cbxProveedor.getSelectedItem();
            String[] idProveedorSplit;
            idProveedorSplit = idProveedor.split(" \\| ");

            txtProveedor.setText(idProveedorSplit[0]);
        }
    }//GEN-LAST:event_cbxProveedorItemStateChanged
    //"SELECT codigo, nombre, precio, cantidad from productos where codigo LIKE '%" + tabla + "'"
    //Escribe los datos en el txt
    private void rellenarTabla(String tabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblProducts.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            String sql = "SELECT pro.id_producto, pro.nombre, pro.precio, pro.cantidad, concat(prov.id_proveedor, ' | ', prov.nombre_proveedor, ' | ', prov.tipo_producto) as proveedor from proveedor as prov inner join productos as pro on prov.id_proveedor = pro.id_proveedor where id_producto LIKE '%" + tabla + "'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Nombre Proveedor");

            int[] anchos = {50, 50, 50, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                tblProducts.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
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

    private void rellenarTablaProducto() {
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

            String sql = "SELECT pro.id_producto, pro.nombre, pro.precio, pro.cantidad, concat(prov.id_proveedor, ' | ', prov.nombre_proveedor, ' | ', prov.tipo_producto) as proveedor from proveedor as prov inner join productos as pro on prov.id_proveedor = pro.id_proveedor " + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Código");
            modelo.addColumn("Producto");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Proveedor");

            int[] anchos = {50, 50, 50, 50, 50};

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

    private void comboProveedor() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion conn = new Conexion();
        Connection con = conn.getConection();

        try {
            String sql = "SELECT id_proveedor, nombre_proveedor, tipo_producto FROM proveedor";

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            cbxProveedor.addItem("Proveedor");

            while (rs.next()) {
                String idProveedor = rs.getString("id_proveedor");
                String nombreProveedor = rs.getString("nombre_proveedor");
                String tipoProducto = rs.getString("tipo_producto");
                cbxProveedor.addItem(idProveedor + " | " + nombreProveedor + " | " + tipoProducto);
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("Error consulta: " + ex.getMessage());
        }
    }

    //Limpia los Label de datos
    private void limpiar() {
        txtCode.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtAmount.setText("");
        txtProveedor.setText("");
    }

    //Verifican que el usuario no digite mal un dato
    public static boolean validarCodigo(String codigo) {
        return codigo.matches("^[A-Za-z0-9]+[-]{1}[1-5]{1}");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-ZÁ-Ú]{1}[a-z0-9A-ZñÑá-ú ]+)$");
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
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
