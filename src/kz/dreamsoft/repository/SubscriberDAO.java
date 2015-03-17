package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.Subscriber;


public interface SubscriberDAO {
	public void addSubscriber(Subscriber subscriber);
	 public void updateSubscriber(Subscriber subscriber);
	 public List<Subscriber> listSubscribers();
	 public Subscriber getSubscriberById(int id);
	 public void removeSubscriber(int id);
}
