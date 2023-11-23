package Class;

import java.util.ArrayList;

public class RootController {
    private final ArrayList<User> userList;
    
    public RootController() {
        this.userList = new ArrayList<>();
        
        this.userList.add(new User("hafid", "123", "pid"));
    }
    
    public void tambahUser(String username, String password, String email) {
        this.userList.add(new User(username, password, email));
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
    
    public void setUser(int indeks, String nama, String password, String email) {
        User u = this.userList.get(indeks);
        u.setUsername(nama);
        u.setEmail(email);
        u.setPassword(password);
    }
    
    
}
