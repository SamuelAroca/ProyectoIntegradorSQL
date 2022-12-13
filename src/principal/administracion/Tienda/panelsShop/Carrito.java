package principal.administracion.Tienda.panelsShop;

import java.io.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import principal.administracion.AdminProductsEC;

public class Carrito extends javax.swing.JPanel {

    DefaultTableModel dtm;
    int filaSeleccionada;

    public Carrito() {
        initComponents();
        dtm = (DefaultTableModel) tblProducts.getModel();
        cargarDatos();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/TitleBarCarrito.png"))); // NOI18N
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

        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Comprar.png"))); // NOI18N
        btnComprar.setToolTipText("");
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setContentAreaFilled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 130, 50));

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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, 130, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/tienda/Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 130, 50));

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

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        String filePath = "carrito.txt";
        String linea;
        String[] linea2 = null;
        File file = new File(filePath);
        int resultado = 0;
        int sumador = 0;

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) {
                linea2 = linea.split(" ");
                int total = Integer.parseInt(linea2[2]);
                int total2 = Integer.parseInt(linea2[3]);
                resultado = total * total2;
                sumador += resultado;
            }
            JOptionPane.showMessageDialog(null, """
                                                \u00a1\u00a1\u00a1Gracias por su compra!!!
                                                  Su total es: """ + sumador + " Pesos");

            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("");
            bw.close();
            dtm.getDataVector().removeAllElements();
            tblProducts.updateUI();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Carrito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int seleccionar = tblProducts.rowAtPoint(evt.getPoint());
        txtCode.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 0)));
        txtName.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 1)));
        txtPrice.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 2)));
        txtAmount.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validarCantidad(txtAmount.getText())) {
            filaSeleccionada = tblProducts.getSelectedRow();
            if (filaSeleccionada != -1) {
                tblProducts.setValueAt(txtCode.getText(), filaSeleccionada, 0);
                tblProducts.setValueAt(txtName.getText(), filaSeleccionada, 1);
                tblProducts.setValueAt(txtPrice.getText(), filaSeleccionada, 2);
                tblProducts.setValueAt(txtAmount.getText(), filaSeleccionada, 3);
                limpiar();
                filaSeleccionada = -1;
            } else {
                JOptionPane.showMessageDialog(null, "No has seleccionado ningun dato");
            }
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Digite la cantidad en números", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblProducts.getSelectedRow();
        if (fila >= 0) {
            dtm.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
        actualizarTabla();
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void actualizarTabla() {
        String filePath = "carrito.txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < tblProducts.getRowCount(); i++) {
                for (int j = 0; j < tblProducts.getColumnCount(); j++) {
                    bw.write(tblProducts.getValueAt(i, j).toString() + " ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarDatos() {
        String filePath = "carrito.txt";
        File file = new File(filePath);

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
            Object[] lines = br.lines().toArray();

            for (Object line : lines) {
                String[] row = line.toString().split(" ");
                model.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
