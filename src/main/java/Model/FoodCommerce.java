package Model;

import java.util.ArrayList;

public class FoodCommerce {
    private ArrayList<User> userList;
    private Cart cart;
    
    public FoodCommerce() {
        this.userList = new ArrayList<>();
        
        this.userList.add(new User("hafid", "123", "pid"));
    }
    
    public void tambahUser(String username, String password, String email) {
        this.userList.add(new User(username, password, email));
    }
    public void updateUser(int id, String nama, String address) {
        User u = this.userList.get(id);
        u.setNama(nama);
        u.setAlamat(address);
    }
    
    public int getJumlahUser() {    
        return this.userList.size();
    }
    
    public void hapusUser(int indeks){
        this.userList.remove(indeks);
    }
    
    public User getUser(int indeks) {
        return this.userList.get(indeks);
    }
    
    public boolean checkUser(String gmail) {
        for(int i = 0; i < this.getJumlahUser(); i++) {
            if(this.getUser(i).getEmail().equals(gmail)) {
                return true;
            } 
        }
        return false;
    }
    
    public void setUser(int indeks, String nama, String password, String email) {
        User u = this.userList.get(indeks);
        u.setUsername(nama);
        u.setEmail(email);
        u.setPassword(password);
    }
    
    
}
