package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.MessList;


public interface MessListDAO {
	 public void addMessList(MessList messList);
	 public void updateMessList(MessList messList);
	 public List<MessList> listMessLists();
	 public MessList getMessListById(int id);
	 public void removeMessList(int id);
}
