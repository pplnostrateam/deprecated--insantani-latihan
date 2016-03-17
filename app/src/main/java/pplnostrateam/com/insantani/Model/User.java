package pplnostrateam.com.insantani.Model;

/**
 * Created by arisyaag on 3/15/16.
 */
public class User {

    public String name, email, password, phone;

    public User (String name, String email, String password, String phone){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public User (String email, String password) {
        this.email = email;
        this.password = password;
        this.name = "";
        this.phone = "";
    }
}
