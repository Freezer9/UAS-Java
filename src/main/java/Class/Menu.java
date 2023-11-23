/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Freeze
 */
public class Menu {
    private String menuName;
    private int price;
    private String description;
    private String image;
    
    public Menu(String menuName, int price, String description, String image) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
        this.image = image;
    }
    
    public String displayMenu() {
        return this.menuName + " " + this.price + " " + this.description + " " + this.image;
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
    
    
}
