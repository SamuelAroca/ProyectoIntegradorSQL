package principal.administracion;

import java.sql.*;
import java.util.*;
import javax.swing.table.*;
import principal.logANDres.*;

public class ComprasRealizadas extends javax.swing.JPanel {

    public ComprasRealizadas() {
        initComponents();
        rellenarTablaProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 850, 620));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1. Granolas", "2. Cereales", "3. Avenas", "4. Bebidas", "5. Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 120, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 120, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarComprasRealizadas.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Productos.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 767));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String campo = txtBuscar.getText();
        if ("".equals(campo)) {
            comboTipo.setSelectedIndex(0);
            rellenarTablaProducto();
        } else {
            rellenarTablaProducto();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //Cambia la tabla dependiendo el tipo de producto que elijan
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

    //Carga los datos en la tabla
    private void rellenarTabla(String tabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblProducts.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            String sql = "SELECT id_compra, id_producto, nombre_producto, cantidad, precio_total, id_cliente, fecha FROM compras where id_producto LIKE '%" + tabla + "'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID Compra");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio Total");
            modelo.addColumn("ID Cliente");
            modelo.addColumn("Fecha de Compra");

            int[] anchos = {50, 50, 50, 50, 50, 50, 70};

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

            String sql = "SELECT id_compra, id_producto, nombre_producto, cantidad, precio_total, id_cliente, fecha FROM compras " + where;
            System.out.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID Compra");
            modelo.addColumn("ID Producto");
            modelo.addColumn("Nombre Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio Total");
            modelo.addColumn("ID Cliente");
            modelo.addColumn("Fecha de Compra");

            int[] anchos = {50, 50, 50, 50, 50, 50, 70};

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
