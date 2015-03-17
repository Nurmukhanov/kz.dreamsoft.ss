package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.Mailing;

public interface MailingDAO {
	 public void addMailing(Mailing Mailing);
	 public void updateMailing(Mailing mailing);
	 public List<Mailing> listMailings();
	 public Mailing getMailingById(int id);
	 public void removeMailing(int id);
}
