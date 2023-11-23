/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Loader.DataLoader;
import java.util.ArrayList;

/**
 *
 * @author Freeze
 */
public class Menu {
    private String menuName;
    private int price;
    private String description;
    private String image;
    private ArrayList<Menu> menuList;
    
    public Menu(String menuName, int price, String description, String image) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.image = image;        
    }
    
    public void setMenu() {
        DataLoader data = new DataLoader();
        this.menuList = new ArrayList<>();
        
        
        for(int i = 0; i < data.loadMenuItems().size(); i++) {
            this.menuList.add(data.loadMenuItems().get(i));        
        }
    }
    
    public Menu getMenu(int indeks) {
        return this.menuList.get(indeks);
    }
    
    public String getImage() {
        return this.image;
    }
    
    public String getMenuName() {
        return this.menuName;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getPrice() {
        return this.price;
    }
}
