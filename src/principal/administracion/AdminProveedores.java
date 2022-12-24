package principal.administracion;

import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import principal.logANDres.Conexion;

public class AdminProveedores extends javax.swing.JPanel {

    public AdminProveedores() {
        initComponents();
        txtTipoProducto.setEditable(false);
        rellenarTablaProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCode = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtTipoProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        cbxTipoProducto = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarProveedores.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel2.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/lbl_tipo_producto.png"))); // NOI18N
        jPanel2.add(lblProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel2.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 680, 50));
        jPanel2.add(txtTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 680, 50));

        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);
        if (tblProveedor.getColumnModel().getColumnCount() > 0) {
            tblProveedor.getColumnModel().getColumn(0).setResizable(false);
            tblProveedor.getColumnModel().getColumn(1).setResizable(false);
            tblProveedor.getColumnModel().getColumn(2).setResizable(false);
            tblProveedor.getColumnModel().getColumn(3).setResizable(false);
            tblProveedor.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 850, 340));

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
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 680, 50));

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
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 120, 30));

        cbxTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Granola", "Cereal", "Avena", "Bebida", "Otro" }));
        cbxTipoProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoProductoItemStateChanged(evt);
            }
        });
        jPanel2.add(cbxTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 420, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 690));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Carga datos seleccionados en los Label
    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked

    }//GEN-LAST:event_tblProveedorMouseClicked

    //Agrega los proveedores a la tabla y al archivo de texto
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!txtCode.getText().isEmpty() && !txtName.getText().isEmpty() && !txtTipoProducto.getText().isEmpty()) {
            if (validarCodigo(txtCode.getText()) && validarNombre(txtName.getText())) {
                try {
                    PreparedStatement ps = null;

                    Conexion conn = new Conexion();
                    Connection con = conn.getConection();

                    ps = con.prepareStatement("INSERT INTO proveedor (id_proveedor, nombre_proveedor, tipo_producto) VALUES (?,?,?)");
                    ps.setString(1, txtCode.getText());
                    ps.setString(2, txtName.getText());
                    ps.setString(3, txtTipoProducto.getText());
                    ps.execute();

                    JOptionPane.showMessageDialog(null, "Proovedor Guardado");
                    cbxTipoProducto.setSelectedIndex(0);
                    rellenarTablaProveedor();
                    limpiar();

                } catch (SQLException ex) {
                    System.out.println("Error al agregar: " + ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor digite bien los datos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        }
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

    private void cbxTipoProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoProductoItemStateChanged
        if (Objects.equals(cbxTipoProducto.getSelectedItem(), "Seleccione")) {
            txtTipoProducto.setText("");
        } else {
            txtTipoProducto.setText((String) cbxTipoProducto.getSelectedItem());
        }
    }//GEN-LAST:event_cbxTipoProductoItemStateChanged

    //Metodo para actualizar la tabla
    private void actualizarTabla() {

    }

    //Metodo para cargar los datos en la tabla
    private void cargarDatos() {

    }

    //Limpia los Label
    //Escribe en la base de datos
    private void rellenarTablaProveedor() {
        String campo = txtBuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "WHERE id_proveedor = '" + campo + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblProveedor.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConection();

            String sql = "SELECT id_proveedor, nombre_proveedor, tipo_producto FROM proveedor " + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Código");
            modelo.addColumn("Nombre");
            modelo.addColumn("Tipo de Producto");

            int[] anchos = {50, 50, 50};
            for (int i = 0; i < tblProveedor.getColumnCount(); i++) {
                tblProveedor.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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

    public void limpiar() {
        txtCode.setText(null);
        txtName.setText(null);
        txtTipoProducto.setText(null);
    }

    //Verifican que el usuario no digite mal un dato
    public static boolean validarCodigo(String codigo) {
        return codigo.matches("^[A-Za-z0-9]+[-]{1}[6]{1}");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-ZÁ-Ú]{1}[a-z0-9A-ZñÑá-ú ]+)$");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTipoProducto;
    // End of variables declaration//GEN-END:variables
}
