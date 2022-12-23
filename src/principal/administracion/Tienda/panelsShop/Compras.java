package principal.administracion.Tienda.panelsShop;

import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import principal.logANDres.Conexion;

public class Compras extends javax.swing.JPanel {

    public Compras() {
        initComponents();
        rellenarTablaCompras();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/TitleBarCompras.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 850, 620));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "1. Granolas", "2. Cereales", "3. Avenas", "4. Bebidas", "5. Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 120, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo del producto");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 370, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
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

    //Cambia el contenido de la tabla
    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        if (Objects.equals(comboTipo.getSelectedItem(), "Todos")) {
            rellenarTablaCompras();
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String campo = txtBuscar.getText();
        if ("".equals(campo)) {
            comboTipo.setSelectedIndex(0);
            rellenarTablaCompras();
        } else {
            rellenarTablaCompras();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void rellenarTabla(String tabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblProducts.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();

            PreparedStatement ps1 = null;
            ResultSet rs1 = null;

            ps1 = conn.prepareStatement("SELECT id_usuario FROM usuario_actual");
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                int idCliente = rs1.getInt(1);

                String sql = "SELECT id_producto, nombre_producto, cantidad, precio_total, id_cliente, fecha FROM compras where id_producto LIKE '%" + tabla + "' AND id_cliente = ?";
                System.out.println(ps);
                ps = conn.prepareStatement(sql);
                ps.setInt(1, idCliente);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("ID Producto");
                modelo.addColumn("Nombre Producto");
                modelo.addColumn("Cantidad");
                modelo.addColumn("Precio total");
                modelo.addColumn("ID Cliente");
                modelo.addColumn("Fecha");

                int[] anchos = {50, 50, 50, 50, 50, 50};

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
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    //Carga los datos de la tabla
    private void rellenarTablaCompras() {
        System.out.println("Entra");
        String campo = txtBuscar.getText();
        String where = "";
        if (!"".equals(campo)) {
            where = "AND id_producto = '" + campo + "'";
        }
        try {
            System.out.println("Dentro del try");
            DefaultTableModel modelo = new DefaultTableModel();
            tblProducts.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            Conexion objCon = new Conexion();
            Connection con = objCon.getConection();

            PreparedStatement ps1 = null;
            ResultSet rs1 = null;

            ps1 = con.prepareStatement("SELECT id_usuario FROM usuario_actual");
            rs1 = ps1.executeQuery();

            while (rs1.next()) {
                int idCliente = 0;
                idCliente = rs1.getInt(1);

                String sql = "SELECT id_producto, nombre_producto, cantidad, precio_total, id_cliente, fecha FROM compras WHERE id_cliente = ? " + where;
                ps = con.prepareStatement(sql);
                ps.setInt(1, idCliente);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("ID Producto");
                modelo.addColumn("Nombre Producto");
                modelo.addColumn("Cantidad");
                modelo.addColumn("Precio total");
                modelo.addColumn("ID Cliente");
                modelo.addColumn("Fecha");

                int[] anchos = {50, 50, 50, 50, 50, 50};
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
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
