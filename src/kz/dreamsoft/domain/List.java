package kz.dreamsoft.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "list")
public class List extends BaseEntity{

    @Column(name = "list_name")
    private  String listName;

    public String getListName() {return listName;}

    public void setListName(String listName) {
        this.listName = listName;
    }
}

