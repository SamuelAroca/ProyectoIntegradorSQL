package principal.administracion;

import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class AdminProveedores extends javax.swing.JPanel {

    DefaultTableModel dtm;
    int filaSeleccionada;
    Object[] o = new Object[5];
    
    public AdminProveedores() {
        initComponents();
        dtm = (DefaultTableModel) tblProducts.getModel();
        cargarDatos();
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
        txtProduct = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarPE.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel2.add(lblCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lblProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/lblNProducto.png"))); // NOI18N
        jPanel2.add(lblProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblPrice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnPr.png"))); // NOI18N
        jPanel2.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        lblAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCa.png"))); // NOI18N
        jPanel2.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));
        jPanel2.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 680, 50));
        jPanel2.add(txtProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 680, 50));
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

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnModificar.png"))); // NOI18N
        btnChange.setBorderPainted(false);
        btnChange.setContentAreaFilled(false);
        btnChange.setFocusPainted(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel2.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1080, 690));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Carga datos seleccionados en los Label
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int seleccionar = tblProducts.rowAtPoint(evt.getPoint());
        txtCode.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 0)));
        txtName.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 1)));
        txtProduct.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 2)));
        txtPrice.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 3)));
        txtAmount.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_tblProductsMouseClicked

    //Agrega los proveedores a la tabla y al archivo de texto
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validarNombre(txtName.getText()) && validarNombre(txtProduct.getText()) && validarPrecio(txtPrice.getText()) && validarCantidad(txtAmount.getText())) {
            o[0] = txtCode.getText();
            o[1] = txtName.getText();
            o[2] = txtProduct.getText();
            o[3] = txtPrice.getText();
            o[4] = txtAmount.getText();

            dtm.addRow(o);
            escribiArchivo();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Mayúscula inicial y sin espacios" + "\n,el precio o la cantidad");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Elimina del Archivo y tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblProducts.getSelectedRow();
        if (fila >= 0){
            dtm.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
        actualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Actualiza los datos del proveedor
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        filaSeleccionada = tblProducts.getSelectedRow();
        if (filaSeleccionada != -1) {
            tblProducts.setValueAt(txtCode.getText(), filaSeleccionada, 0);
            tblProducts.setValueAt(txtName.getText(), filaSeleccionada, 1);
            tblProducts.setValueAt(txtProduct.getText(), filaSeleccionada, 2);
            tblProducts.setValueAt(txtPrice.getText(), filaSeleccionada, 3);
            tblProducts.setValueAt(txtAmount.getText(), filaSeleccionada, 4);
            limpiar();
            filaSeleccionada = -1;
        }else{
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun dato");
        }
        actualizarTabla();
    }//GEN-LAST:event_btnChangeActionPerformed
    
    //Metodo para actualizar la tabla
    private void actualizarTabla(){
        String filePath = "proveedores.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < tblProducts.getRowCount(); i++){
                for(int j = 0; j < tblProducts.getColumnCount(); j++){
                    bw.write(tblProducts.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para cargar los datos en la tabla
    private void cargarDatos(){
        String filePath = "proveedores.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)tblProducts.getModel();
            Object[] lines = br.lines().toArray();
            
            for (Object line : lines) {
                String[] row = line.toString().split(" ");
                model.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Limpia los Label
    public void limpiar(){
        txtCode.setText(null);
        txtName.setText(null);
        txtProduct.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }
    
    //Escribe en la base de datos
    private void escribiArchivo(){
        String filePath = "proveedores.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < tblProducts.getRowCount(); i++){
                for(int j = 0; j < tblProducts.getColumnCount(); j++){
                    bw.write(tblProducts.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnEliminar;
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
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProduct;
    // End of variables declaration//GEN-END:variables
}
