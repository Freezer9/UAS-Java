package Controller;

import Model.Cart;
import Model.FoodCommerce;
import Model.User;
import javax.swing.JFrame;

public class RootController extends JFrame{
    protected FoodCommerce toko = new FoodCommerce();
    protected Cart cart = new Cart();
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

    public void setToko(FoodCommerce toko) {
        this.toko = toko;
    }
   
    public void openFrame(RootController frame, User user, Cart cart) {
        frame.setUser(user);
        frame.setCart(cart);
        frame.setVisible(true);
    }
}
