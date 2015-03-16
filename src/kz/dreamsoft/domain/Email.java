package kz.dreamsoft.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by olzhas on 19.01.15.
 */
@Entity
@Table(name = "email")
public class Email extends BaseEntity{

    @Column(name = "from")
    private String from;
    @Column(name = "template")
    private String template;
    @Column(name = "subject_template")
    private String subject_template;
    @Column(name = "attachment")
    private String attachment;


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getSubject_template() {
        return subject_template;
    }

    public void setSubject_template(String subject_template) {
        this.subject_template = subject_template;
    }
}
