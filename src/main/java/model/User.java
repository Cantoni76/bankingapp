package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private Integer id;
    private String password;
    private String firstName;
    private String lastName;

    public User(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(Integer id, String password, String firstName, String lastName) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
