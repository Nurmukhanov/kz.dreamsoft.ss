package kz.dreamsoft.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;


/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "list_subscriber")
public class ListSubscriber extends BaseEntity{

    @Column(name = "subscriber")
    private Subscriber subscriber;
    @Column(name = "email")
    private String email;
    @Column(name = "date_created")
    private Date dateCreated;

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
