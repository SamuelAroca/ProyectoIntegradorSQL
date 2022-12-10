package principal.administracion;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import principal.logANDres.*;

public class AdminProductsEC extends javax.swing.JPanel {
    
    public AdminProductsEC() {
        initComponents();
        rellenarTablaProducto();
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
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarModificar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnNo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnPr.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 680, 50));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 680, 50));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 680, 50));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 680, 50));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/btnActualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, 130, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 130, 50));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 850, 300));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Granolas", "Cereales", "Avenas", "Bebidas", "Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, 140, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Buscar.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, -1, -1));

        txtBuscar.setToolTipText("Solo Codigo");
        txtBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 530, 120, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Actualiza la tabla
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Elimina productos de la tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        PreparedStatement ps = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();
            
            int fila = tblProducts.getSelectedRow();
            String codigo = tblProducts.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("DELETE FROM productos WHERE codigo=?");
            ps.setString(1, codigo);
            ps.execute();
            
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            limpiar();
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Carga los datos del producto seleccionado en los Label de los datos
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();
            
            int fila = tblProducts.getSelectedRow();
            String codigo = tblProducts.getValueAt(fila, 0).toString();
            
            ps = conn.prepareStatement("SELECT codigo, nombre, precio, cantidad FROM productos WHERE codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                txtCode.setText(rs.getString("Codigo"));
                txtName.setText(rs.getString("Nombre"));
                txtPrice.setText(rs.getString("Precio"));
                txtAmount.setText(rs.getString("Cantidad"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_tblProductsMouseClicked

    //Cambia la tabla dependiendo el tipo de producto que elijan
    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        //Opciones del comboBox
        if(Objects.equals(comboTipo.getSelectedItem(), "Todos")) {
            rellenarTablaProducto();
            txtBuscar.setText(null);
        }
        else if(Objects.equals(comboTipo.getSelectedItem(), "Granolas")) {
            rellenarTabla("1");
        }
        else if(Objects.equals(comboTipo.getSelectedItem(), "Cereales")) {
            rellenarTabla("2");
        }
        else if(Objects.equals(comboTipo.getSelectedItem(), "Avenas")) {
           rellenarTabla("3"); 
        }
        else if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas")) {
            rellenarTabla("4");
        }
        else if(Objects.equals(comboTipo.getSelectedItem(), "Otros")) {
            rellenarTabla("5");
        }
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        rellenarTablaProducto();
    }//GEN-LAST:event_btnBuscarActionPerformed
    //Carga los datos en la tabla
    private void rellenarTabla(String tabla){
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            tblProducts.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();
            
            String sql = "SELECT codigo, nombre, precio, cantidad from productos where codigo LIKE '%" + tabla + "'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            
            int[] anchos = {50,200,50,50}; 
            
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
    private void rellenarTablaProducto(){
        DefaultTableModel modelo = new DefaultTableModel();
        String campo = txtBuscar.getText();
        String where = "";
        
        if(!"".equals(campo)) {
            where = "WHERE codigo = '" + campo + "'";
        } 
        
        try {
            tblProducts.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion objCon = new Conexion();
            Connection conn = objCon.getConection();
            
            String sql = "SELECT codigo, nombre, precio, cantidad from productos " + where;
            System.out.println(sql);
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Precio");
            modelo.addColumn("Cantidad");
            
            int[] anchos = {50,200,50,50}; 
            
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
    
    //Actualiza la tabla
    private void actualizar() {
        
        if (!txtCode.getText().isEmpty() && !txtName.getText().isEmpty() && !txtPrice.getText().isEmpty() && !txtAmount.getText().isEmpty()) {
            if (validarCodigo(txtCode.getText()) && validarNombre(txtName.getText()) && validarPrecio(txtPrice.getText()) && validarCantidad(txtAmount.getText())) {

                try {
                    PreparedStatement ps = null;
                    Conexion objCon = new Conexion();
                    Connection conn = objCon.getConection();
                    ps = conn.prepareStatement("UPDATE productos set codigo=?, nombre=?, precio=?, cantidad=? where codigo=?");
                    ps.setString(1, txtCode.getText());
                    ps.setString(2, txtName.getText());
                    ps.setString(3, txtPrice.getText());
                    ps.setString(4, txtAmount.getText());
                    ps.setString(5, txtCode.getText());

                    int res = ps.executeUpdate();

                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Producto Modificado");
                        if(Objects.equals(comboTipo.getSelectedItem(), "Todos")) {
                            rellenarTablaProducto();
                            txtBuscar.setText(null);
                        }
                        else if(Objects.equals(comboTipo.getSelectedItem(), "Granolas")) {
                            rellenarTabla("1");
                        }
                        else if(Objects.equals(comboTipo.getSelectedItem(), "Cereales")) {
                            rellenarTabla("2");
                        }
                        else if(Objects.equals(comboTipo.getSelectedItem(), "Avenas")) {
                           rellenarTabla("3"); 
                        }
                        else if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas")) {
                            rellenarTabla("4");
                        }
                        else if(Objects.equals(comboTipo.getSelectedItem(), "Otros")) {
                            rellenarTabla("5");
                        }
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Modificar");
                        limpiar();
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite bien los datos");
            }
        } else {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        }
    }
    
    //Limpia los Label de datos
    public void limpiar(){
        txtCode.setText(null);
        txtName.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> comboTipo;
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
