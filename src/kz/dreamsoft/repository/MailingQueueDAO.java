package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.MailingQueue;


public interface MailingQueueDAO {
	 public void addMailingQueue(MailingQueue mailingQueue);
	 public void updateMailingQueue(MailingQueue mailingQueue);
	 public List<MailingQueue> listMailingQueues();
	 public MailingQueue getMailingQueueById(int id);
	 public void removeMailingQueue(int id);
}
