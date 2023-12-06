package Controller;

import Loader.DataLoader;
import Model.Cart;
import Model.FoodCommerce;
import Model.User;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class RootController extends JFrame{
    private DataLoader dataLoader = new DataLoader();
    protected FoodCommerce toko = new FoodCommerce();
    private Cart cart;
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
    
    public User getUser() {
        return this.user;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return this.cart;
    }
    
    public void setToko(FoodCommerce toko) {
        this.toko = toko;
    }
    
    public FoodCommerce getToko() {
        return this.toko;
    }
   
    public int getMenuAmount() {
        return dataLoader.loadMenuItems().size();
    }
    
    public void openFrame(RootController frame, User user, Cart cart) {
        frame.setUser(user);
        frame.setCart(cart);
        frame.setVisible(true);
    }
    
    protected void closeFrame() {
        this.setVisible(false);
    }
     
    protected void windowListenerActivate(RootController frame, String method) {
        frame.addWindowListener(new WindowAdapter() {
            
        @Override
        public void windowClosed(WindowEvent e) {
            if(method.contains("dispose")) {
                dispose();
            } else {
                setVisible(true);
            }
            }
        });
     }
}
