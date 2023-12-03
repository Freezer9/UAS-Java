package Loader;

import Model.Menu;
import java.util.ArrayList;

public class DataLoader {
    private ArrayList<Menu> menuItems;
    
    public ArrayList<Menu> loadMenuItems() {
        this.menuItems = new ArrayList<>();

        Menu item1 = new Menu("Brownies", 12000, "Description 1", "src/main/java/Resources/menu/Brownies.png");
        menuItems.add(item1);
        Menu item2 = new Menu("Croissant", 15000, "Description 2", "src/main/java/Resources/menu/croissant.png");
        menuItems.add(item2);
        Menu item3 = new Menu("Donat Blueberry", 12000, "Description 3", "src/main/java/Resources/menu/Donat bluberry.png");
        menuItems.add(item3);
        Menu item4 = new Menu("Donat Coklat Garis", 12000, "Description 4", "src/main/java/Resources/menu/Donat coklat garis.png");
        menuItems.add(item4);
        Menu item5 = new Menu("Donat Coklat Polos", 12000, "Description 5", "src/main/java/Resources/menu/Donat coklat polos.png");
        menuItems.add(item5);
        Menu item6 = new Menu("Donat Durian", 12000, "Description 6", "src/main/java/Resources/menu/donat durian.png");
        menuItems.add(item6);
        Menu item7 = new Menu("Donat Matcha", 12000, "Description 7", "src/main/java/Resources/menu/donat matcha.png");
        menuItems.add(item7);
        Menu item8 = new Menu("Donat Strawberry", 12000, "Description 8", "src/main/java/Resources/menu/Donat stoberi.png");
        menuItems.add(item8);
        Menu item9 = new Menu("Donat Susu Meses", 12000, "Description 9", "src/main/java/Resources/menu/donat susu meses.png");
        menuItems.add(item9);
        Menu item10 = new Menu("Dozen isi 4", 48000, "Description 10", "src/main/java/Resources/menu/dozen 4.png");
        menuItems.add(item10);
        Menu item11 = new Menu("Dozen isi 6", 72000, "Description 11", "src/main/java/Resources/menu/donat isi 6.png");
        menuItems.add(item11);
        Menu item12 = new Menu("Dozen isi 10", 120000, "Description 12", "src/main/java/Resources/menu/donat dozen 10.png");
        menuItems.add(item12);
        
        return menuItems;
    }
////    
//    public ArrayList<Outlet> loadOutletBranch() {
//        ArrayList<Outlet> outletBranch = new ArrayList<>();
//
//        Outlet branch1 = new Outlet("Surabaya Pusat Jl. Embong Malang No. 70", "Buka setiap hari: 07:00 - 22:00", "0897252725248");
//        outletBranch.add(branch1);
//        Outlet branch2 = new Outlet("Surabaya Timur Ruko San Diego No. 90", "Buka setiap hari: 07:00 - 22:00", "081625273427");
//        outletBranch.add(branch2);
//        Outlet branch3 = new Outlet("Surabaya Barat Gwalk Ruko No. 99", "Buka setiap hari: 07:00 - 22:00", "0872522725227");
//        outletBranch.add(branch3);
//        return outletBranch;
//    }
}
