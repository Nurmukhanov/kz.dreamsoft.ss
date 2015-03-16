package kz.dreamsoft.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "param")
public class Param extends BaseEntity{

    @Column(name = "param_name")
    private String paramName;
    @Column(name = "type")
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }
}
