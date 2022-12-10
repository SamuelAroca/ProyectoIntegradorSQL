package principal.administracion.Tienda.panelsShop;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.administracion.AdminProductsEC;
import principal.administracion.AdminProductsR;

public class PanelTienda extends javax.swing.JPanel {

    DefaultTableModel dtm;
    Object[] o = new Object[4];
    
    public PanelTienda() {
        initComponents();
        
        //Cargamos la tabla granolas y evitamos que el usuario pueda modificar datos ya definidos
        dtm = (DefaultTableModel) tblProducts.getModel();
        cargarDatos("granolas.txt");
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
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/TitleBarProductos.png"))); // NOI18N
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

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 130, 50));

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

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granolas", "Cereales", "Avenas", "Bebidas", "Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 130, 30));

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

    //Guarda los productos seleccionados en el carrito
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validarCantidad(txtAmount.getText())) {
            File file = new File("carrito.txt");
            String codigo;
            String nombre;
            String precio;
            String cantidad;

            try {
                FileWriter fw = new FileWriter(file,true);
                BufferedWriter bw = new BufferedWriter(fw);

                codigo = txtCode.getText();
                nombre = txtName.getText();
                precio = txtPrice.getText();
                cantidad = txtAmount.getText();

                if (!txtCode.getText().isEmpty() && !txtName.getText().isEmpty() && !txtPrice.getText().isEmpty() && !txtAmount.getText().isEmpty()) {
                    bw.write(codigo + " " + nombre + " " + precio + " " + cantidad);
                    bw.newLine();

                    JOptionPane.showMessageDialog(null, "¡¡¡Producto agregado al carrito Satisfactoriamente!!!");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Porfavor ponga la cantidad a comprar","WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                }
                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite la cantidad en números","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Carga el producto seleccionado en los Label excepto la cantidad
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int seleccionar = tblProducts.rowAtPoint(evt.getPoint());
        txtCode.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 0)));
        txtName.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 1)));
        txtPrice.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tblProductsMouseClicked

    //Cambia el contenido de la tabla
    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        dtm.getDataVector().removeAllElements();
        tblProducts.updateUI();

        if(Objects.equals(comboTipo.getSelectedItem(), "Granolas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("granolas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Cereales")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("cereales.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Avenas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("avenas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("bebidas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Otros")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("otros.txt");
        }
        limpiar();
    }//GEN-LAST:event_comboTipoItemStateChanged
    
    //Carga los datos de la tabla
    private void cargarDatos(String filePath){
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
            Logger.getLogger(AdminProductsR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Limpia los Label
    private void limpiar(){
        txtCode.setText(null);
        txtName.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }
    
    //Valida que la catidad sea un número
    public static boolean validarCantidad(String cantidad) {
        return cantidad.matches("^[0-9]+$");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
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
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
