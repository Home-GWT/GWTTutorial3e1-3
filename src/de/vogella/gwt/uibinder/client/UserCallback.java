package de.vogella.gwt.uibinder.client;

import java.util.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.*;
import com.google.gwt.user.client.ui.*;
import de.vogella.gwt.uibinder.shared.*;

public class UserCallback implements AsyncCallback<List<MyUser>> {

	private FlexTable table; 

	public UserCallback(FlexTable table) {
		this.table = table;
	}

	public void onFailure(Throwable caught) {
		Window.alert(caught.getMessage());
	}

	public void onSuccess(List<MyUser> users) {
  		if(users == null) return;
  		
  		int row=1;
  		for(MyUser user:users){
  			table.setText(++row,0,user.getId());
  			table.setText(row,1,user.getUsername());
  			table.setText(row,2,user.getNumberOfHits());
  		}
	}

}
