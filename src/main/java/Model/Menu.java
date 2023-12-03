/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Freeze
 */
public class Menu {
    private int menu_id;
    private String menuName;
    private String description;
    private int price;
    private String image;
    private int userId;
    
    public Menu(String menuName, int price, String description, String image) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int id) {
        this.userId = id;
    }
    
    public void setMenuId(int id) {
        this.menu_id = id;
    }
    
    public int getMenuId() {
        return this.menu_id;
    }
}
