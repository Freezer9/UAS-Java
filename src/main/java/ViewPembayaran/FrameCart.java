package ViewPembayaran;

import Controller.RootController;
import Interface.Tabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameCart extends RootController implements Tabel {
    DefaultTableModel model;
    
    public FrameCart() {
        initComponents();
        model = (DefaultTableModel) TableCart.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonKeluar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 227, 206));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 300));

        TableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Menu", "Quantity", "Harga "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableCart);

        jLabel1.setText("Pembayaran ");

        ButtonKeluar.setText("Keluar");
        ButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonKeluarActionPerformed(evt);
            }
        });

        jButton2.setText("Bayar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonKeluar)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonKeluarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(model.getRowCount() != 0){
            FrameMetodePembelian metodeBuy = new FrameMetodePembelian();
            metodeBuy.openFrame(metodeBuy, this.getUser(), this.getCart());
            this.setVisible(false);

                metodeBuy.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    setVisible(true);
                    refreshTabel();
                    }

                public void refreshTabel(){
                    showTabel();
                }
            });
        }
        else{
            JOptionPane.showMessageDialog(this, "Keranjang Kosong! Pesan dulu!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public void showTabel() {
        model.setRowCount(0);
        int jumlahCart = this.getCart().getSize();

        for (int i = 0; i < jumlahCart; i++) {
            String nama_menu = this.getCart().getMenu(i).getMenuName();
            int quantity = 1;
            int price = this.getCart().getMenu(i).getPrice();
            boolean sameItemCheck = false;

            for (int j = 0; j < model.getRowCount(); j++) {
                String namaMenuExists = (String) model.getValueAt(j, 0);
                if (nama_menu.equals(namaMenuExists)) {
                    sameItemCheck = true;
                    break;
                }
            }

            if (sameItemCheck) {
                int existingRowIndex = getRowIndexByMenuName(nama_menu);
                int oldQuantity = (int) model.getValueAt(existingRowIndex, 1);
                int newQuantity = oldQuantity + 1;
                int harga_satuan = this.getCart().getMenu(i).getPrice();
                int newPrice = harga_satuan * newQuantity;
                model.setValueAt(newQuantity, existingRowIndex, 1);
                model.setValueAt(newPrice, existingRowIndex, 2);
            } else {
                model.addRow(new Object[]{nama_menu, quantity, price});
            }
        }
    }

    private int getRowIndexByMenuName(String menuName) {
        for (int i = 0; i < model.getRowCount(); i++) {
            String namaMenuExists = (String) model.getValueAt(i, 0);
            if (menuName.equals(namaMenuExists)) {
                return i;
            }
        }
        return -1;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JTable TableCart;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
