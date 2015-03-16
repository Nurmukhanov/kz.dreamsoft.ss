package kz.dreamsoft.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "subscriber")
public class Subscriber extends BaseEntity{

    @Column(name = "email")
    private String email;
    @Column(name = "groups")
    private String groups;
    @Column(name = "active")
    private boolean active=false;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
