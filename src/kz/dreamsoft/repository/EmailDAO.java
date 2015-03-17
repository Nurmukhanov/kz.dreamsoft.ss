package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.Email;

public interface EmailDAO {
	 public void addEmail(Email email);
	    public void updateEmail(Email email);
	    public List<Email> listEmail();
	    public Email getEmailById(int id);
	    public void removeEmail(int id);
}
