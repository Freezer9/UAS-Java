package Class;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Menu> cartList;
    
    public Cart() {
        this.cartList = new ArrayList<>();
        
        //this.cartList.add(new Menu("Kontol 1", 12000, "Description 1", "12"));
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
}
