/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;
import Class.*;
import Loader.*;
import javax.swing.ImageIcon;
import java.util.ArrayList;
    
/**
 *
 * @author raffi1
 */
public class ListMenu extends javax.swing.JPanel {
    private Cart cart;
    private DataLoader dataLoader = new DataLoader();
    private ArrayList<Menu> menuList;
    
    public ListMenu(Cart cart) {
        this.cart = cart;
        initComponents();
    }
    
    public void setMenu() {
        this.menuList = dataLoader.loadMenuItems();
    }
    
    public void setMenuDisplay(int i){
        this.setMenu();
        this.menuList.get(i).setMenuId(i);
        nameLabel.setText(this.menuList.get(i).getMenuName());
        descLabel.setText(this.menuList.get(i).getDescription());
        priceLabel.setText("Rp." + Integer.toString(this.menuList.get(i).getPrice()));
        txtId.setText(Integer.toString(i));
        imageLabel.setIcon(new ImageIcon(this.menuList.get(i).getImage()));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        txtId = new javax.swing.JLabel();
        testId = new javax.swing.JLabel();
        testisi = new javax.swing.JLabel();

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Brownies.png"))); // NOI18N

        nameLabel.setText("jLabel2");

        descLabel.setText("jLabel3");

        priceLabel.setText("jLabel4");

        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        txtId.setText("jLabel3");

        testId.setText("jLabel3");

        testisi.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(imageLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel)
                            .addComponent(nameLabel))
                        .addContainerGap(441, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descLabel)
                        .addGap(42, 42, 42)
                        .addComponent(txtId)
                        .addGap(47, 47, 47)
                        .addComponent(testId)
                        .addGap(37, 37, 37)
                        .addComponent(testisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddToCart)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(imageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descLabel)
                            .addComponent(btnAddToCart)
                            .addComponent(txtId)
                            .addComponent(testId)
                            .addComponent(testisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
//         TODO add your handling code here:
        this.cart.addMenu(this.menuList.get(Integer.parseInt(txtId.getText())));
        testId.setText(txtId.getText());
        
        if(!menuList.isEmpty()) {
            testisi.setText(this.menuList.get(Integer.parseInt(txtId.getText())).getMenuName());
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JLabel descLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel testId;
    private javax.swing.JLabel testisi;
    private javax.swing.JLabel txtId;
    // End of variables declaration//GEN-END:variables
}
