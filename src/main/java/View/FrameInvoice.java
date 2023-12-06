/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.RootController;
import Interface.Tabel;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class FrameInvoice extends RootController implements Tabel {
    private int total_harga;
    private int ongkir;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    public FrameInvoice() {
        initComponents();
    }
    
    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
        showTabel();
        setInvoice();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesanan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIDPesanan = new javax.swing.JLabel();
        txtNama = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblOngkir = new javax.swing.JLabel();
        txtOngkir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInvoice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 227, 206));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPesanan.setBackground(new java.awt.Color(255, 227, 206));
        tblPesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 111, 82)));
        tblPesanan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tblPesanan.setForeground(new java.awt.Color(79, 111, 82));
        tblPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Menu", "Jumlah", "Harga Satuan", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblPesanan);

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel2.setText("ID Pesanan");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel4.setText("Tanggal");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        jLabel5.setText("Total Harga");

        txtIDPesanan.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtIDPesanan.setText("<not editable>");

        txtNama.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtNama.setText("<not editable>");

        txtTanggal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtTanggal.setText("<not editable>");

        txtTotalHarga.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtTotalHarga.setText("<not editable>");

        jButton1.setBackground(new java.awt.Color(115, 144, 114));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblOngkir.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        lblOngkir.setText("Ongkir");

        txtOngkir.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtOngkir.setText("<not editable>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOngkir)
                                .addGap(18, 18, 18)
                                .addComponent(txtOngkir)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIDPesanan))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(39, 39, 39)
                                        .addComponent(txtTanggal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtNama))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtTotalHarga)))
                                .addGap(58, 58, 58))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(648, 648, 648)
                        .addComponent(jButton1)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDPesanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOngkir)
                        .addComponent(txtOngkir))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtTotalHarga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(115, 144, 114));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gambar/Green Retro Midcentury Geometric Sticker Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        txtInvoice.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        txtInvoice.setForeground(new java.awt.Color(236, 227, 206));
        txtInvoice.setText("INVOICE");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 227, 206));
        jLabel6.setText("Jajanin Cafe");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 227, 206));
        jLabel7.setText("Jl. Embong Malang No.70  ");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 227, 206));
        jLabel8.setText("Surabaya Pusat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInvoice)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtInvoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Pesanan Telah Dibayar!");
        this.getCart().clearCart();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setInvoice() {
        txtIDPesanan.setText("ID-001");
        txtNama.setText(this.getUser().getNama());
        txtTanggal.setText(this.dateFormat.format(date));   
        
        if(this.ongkir != 0) {
            this.total_harga += this.ongkir;
        }
        
        txtOngkir.setText(Integer.toString(this.ongkir));
        txtTotalHarga.setText(Integer.toString(this.total_harga));
    }
    
    @Override
    public void showTabel() {
        String nama_menu;
        int quantity;
        int harga_satuan;
        int sameItemCheck;

        int jumlahCart;
        DefaultTableModel model = (DefaultTableModel) tblPesanan.getModel();

        model.setRowCount(0);
        jumlahCart = this.getCart().getSize();

        for (int i = 0; i < jumlahCart; i++) {
            nama_menu = this.getCart().getMenu(i).getMenuName();
            harga_satuan = this.getCart().getMenu(i).getPrice();
            quantity = 1;           
            sameItemCheck = 0;
            int j;
            
            for(j = 0; j < model.getRowCount(); j++){
                String namaMenuExists = (String) model.getValueAt(j, 0);
                if (nama_menu == namaMenuExists){
                    sameItemCheck = 1;
                    if(sameItemCheck == 1){
                        break;
                    }
                }
            }
            
            if (sameItemCheck == 1){
                int oldQuantity = (int) model.getValueAt( j, 1);
                int newQuantity = oldQuantity + 1;
                int newPrice = harga_satuan * newQuantity;
                
                model.setValueAt(newQuantity, j, 1);
                model.setValueAt(harga_satuan, j, 2);
                model.setValueAt(newPrice, j, 3);
                
                this.total_harga += harga_satuan;
            }else{
                model.addRow(new Object[]{nama_menu, quantity, harga_satuan, harga_satuan});   
                
                this.total_harga += harga_satuan;
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOngkir;
    private javax.swing.JTable tblPesanan;
    private javax.swing.JLabel txtIDPesanan;
    private javax.swing.JLabel txtInvoice;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtOngkir;
    private javax.swing.JLabel txtTanggal;
    private javax.swing.JLabel txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
