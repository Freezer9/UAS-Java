/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewPromo;

import java.awt.Image;
import javax.swing.ImageIcon;
import Class.*;
import javax.swing.JOptionPane;

public class Promo extends javax.swing.JFrame {
    private Cart cart;
    
    public Promo() {
        initComponents();
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public void setNamaPromo(String nama) {
        LabelPromo.setText(nama);
    }
    
    public void setHarga(String harga) {
        LabelHarga.setText(harga);
    }
    
    
    public void setFoto(String url) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(url));
    Image image = imageIcon.getImage();

    // Ubah ukuran gambar jika diperlukan
    int width = 100;
    int height = 100;
    Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);

    // Tetapkan ikon yang telah diubah ukurannya ke label
    ImageIcon scaledIcon = new ImageIcon(scaledImage);
    LabelFoto.setIcon(scaledIcon);
    LabelFoto.setText(""); // Mungkin ini tidak perlu, tergantung pada kebutuhan Anda
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPilih = new javax.swing.JButton();
        cmbHalaman = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LabelPromo = new javax.swing.JLabel();
        LabelFoto = new javax.swing.JLabel();
        lblRp = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPilih.setText("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        cmbHalaman.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promo 1", "Promo 2", "Promo 3", "Promo 4", "Promo 5", " " }));
        cmbHalaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHalamanActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Beli");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Promo.png"))); // NOI18N

        LabelPromo.setText("Menu");

        LabelFoto.setText("Foto");

        lblRp.setText("Rp.");

        LabelHarga.setText("price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelPromo)
                                            .addComponent(LabelFoto)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblRp)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelHarga)))))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPilih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilih))
                .addGap(18, 18, 18)
                .addComponent(LabelPromo)
                .addGap(35, 35, 35)
                .addComponent(LabelFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRp)
                    .addComponent(LabelHarga))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbHalamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHalamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHalamanActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
         String selectedItem = cmbHalaman.getSelectedItem().toString();
         
        if (selectedItem != null && !selectedItem.equals("")) {
            switch (selectedItem) {
                case "Promo 1" -> {
                        this.setFoto("/Resources/gambarpromo/Promo2.png");
                        this.setNamaPromo("Croissant & Coffee");
                        this.setHarga("45000");
                }
                case "Promo 2" -> {
                        this.setFoto("/Resources/gambarpromo/Promo5.png");
                        this.setNamaPromo("2 Donat & Coffee");
                        this.setHarga("75000");
                }
                case "Promo 3" -> {
                        this.setFoto("/Resources/gambarpromo/Promo3.png");
                        this.setNamaPromo("3 Donat & Coffee");
                        this.setHarga("R85000");
                }
                case "Promo 4" -> {
                        this.setFoto("/Resources/gambarpromo/Promo4.png");
                        this.setNamaPromo("1 Donat & Chamomile Tea");
                        this.setHarga("45000");
                }
                case "Promo 5" -> {
                        this.setFoto("/Resources/gambarpromo/Promo5.png");
                        this.setNamaPromo("1 Donat & Hot Capucino");
                        this.setHarga("55000");
                }
                default -> {
                        this.setFoto("/Resources/gambarpromo/Promo2.png");
                        this.setNamaPromo("Croissant & Coffee");
                        this.setHarga("45000");
                }
            }
        } 
    }//GEN-LAST:event_btnPilihActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String namaMenu = LabelPromo.getText();
        int harga = Integer.parseInt(LabelHarga.getText());
        String namaPromo = cmbHalaman.getSelectedItem().toString();
          
        this.cart.addMenu(new Menu(namaMenu, harga, namaPromo, LabelFoto.getText()));
        JOptionPane.showMessageDialog(this, "Berhasil Menambah Menu!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFoto;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelPromo;
    private javax.swing.JButton btnPilih;
    private javax.swing.JComboBox<String> cmbHalaman;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRp;
    // End of variables declaration//GEN-END:variables
}
