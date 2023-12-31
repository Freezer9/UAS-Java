package Model;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Menu> cartList;
    
    public Cart() {
        this.cartList = new ArrayList<>();        
    }
    
    public Menu getMenu(int id) {
        return this.cartList.get(id);
    }
    
    public int getSize() {
        return this.cartList.size();
    }
    
    public void addMenu(Menu menu) {
        this.cartList.add(menu);
    }
    
    public boolean checkCart() {
        return this.cartList.isEmpty();
    }
    
    public void clearCart(){
        cartList.clear();
    }
}
