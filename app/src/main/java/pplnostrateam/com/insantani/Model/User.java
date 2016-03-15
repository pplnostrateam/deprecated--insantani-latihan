package pplnostrateam.com.insantani.Model;

/**
 * Created by arisyaag on 3/15/16.
 */
public class User {

    String name, username, password, phone;

    public User (String name, String username, String password, String phone){
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public User (String username, String password) {
        this.username = username;
        this.password = password;
        this.name = "";
        this.phone = "";
    }
}
