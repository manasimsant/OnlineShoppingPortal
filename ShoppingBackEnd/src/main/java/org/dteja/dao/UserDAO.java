package org.dteja.dao;

import org.dteja.models.User;

public interface UserDAO {
	public boolean registerUser(User user);
	public boolean modifyUser(User user);
	public User getUser(String username);


}
