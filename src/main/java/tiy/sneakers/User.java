package tiy.sneakers;
import javax.persistence.*;
/**
 * Created by Corey Shaw on 5/21/2016.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    int id;
    @Column(nullable = false, unique = true)
    String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)

    public   String password;


    public User() {
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
