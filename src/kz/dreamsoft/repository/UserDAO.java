package kz.dreamsoft.repository;

import java.util.List;

import kz.dreamsoft.domain.User;


public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
}
