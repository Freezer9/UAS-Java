package Class;

import ViewPembayaran.FrameCart;

public class User{
    private int id;
    private String username;
    private String password;
    private String email;
    private String nama;
    private String address;
    
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setEmail(String email) {
        this.email= email;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.address = alamat;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getPassword() {
        return this.password;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAddress() {
        return this.address;
    }
    
    public int getId() {
        return this.id;
    }
}
