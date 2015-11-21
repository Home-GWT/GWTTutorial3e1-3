package de.vogella.gwt.uibinder.server;

import java.util.*;

import com.google.gwt.user.server.rpc.*;

import de.vogella.gwt.uibinder.client.*;
import de.vogella.gwt.uibinder.shared.*;

public class UserServiceImpl extends RemoteServiceServlet implements UserService {
	private static final long serialVersionUID = 1L;
	private List<MyUser> userList = new ArrayList<MyUser>();

	public UserServiceImpl() {
		MyUser user = new MyUser();
		user.setId("1");
		user.setUsername("Peter");
		user.setNumberOfHits("15");
		userList.add(user);

		user = new MyUser();
		user.setId("2");
		user.setUsername("Hanz");
		user.setNumberOfHits("25");
		userList.add(user);
    
		user = new MyUser();
		user.setId("3");
		user.setUsername("Dima");
		user.setNumberOfHits("35");
		userList.add(user);
    
		user = new MyUser();
		user.setId("4");
		user.setUsername("Nikolas");
		user.setNumberOfHits("45");
		userList.add(user);
	}

	public MyUser getUser(String id) {
		for (Object object:userList) {
			if (((MyUser) object).getId().equals(id)) return ((MyUser) object);
		}
		return null;
  }

	public List<MyUser> getUserList() {
		return userList;
	}
} 
