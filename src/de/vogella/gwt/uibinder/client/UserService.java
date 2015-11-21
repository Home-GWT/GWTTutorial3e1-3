package de.vogella.gwt.uibinder.client;

import java.util.*;

import com.google.gwt.user.client.rpc.*;

import de.vogella.gwt.uibinder.shared.MyUser;

// 
@RemoteServiceRelativePath("userService")
public interface UserService extends RemoteService {
  List<MyUser> getUserList();
  MyUser getUser(String id);
} 