package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.ListSubscriber;


public interface ListSubscriberDAO {
	 public void addListSubscriber(ListSubscriber listSubscriber);
	 public void updateListSubscriber(ListSubscriber listSubscriber);
	 public List<ListSubscriber> listListSubscriber();
	 public ListSubscriber getListSubscriberById(int id);
	 public void removeListSubscriber(int id);
}