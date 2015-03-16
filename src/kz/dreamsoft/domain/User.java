package kz.dreamsoft.domain;

import javax.persistence.*;

import java.util.Date;

/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity{

    @Column(name = "user_name")
    private String userName;
    @Column(name = "hashed_password")
    private String hashedPassword;
    @Column(name = "salt")
    private String salt;
    @Column(name = "roles")
    private Date roles;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getRoles() {
        return roles;
    }

    public void setRoles(Date roles) {
        this.roles = roles;
    }
}
