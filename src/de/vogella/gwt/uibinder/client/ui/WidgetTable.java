package de.vogella.gwt.uibinder.client.ui;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.uibinder.client.*;
import com.google.gwt.user.client.ui.*;

import de.vogella.gwt.uibinder.client.*;

public class WidgetTable extends Composite {
	@UiTemplate("WidgetTable.ui.xml")
	interface          MyUiBinder extends UiBinder<Widget, WidgetTable> {}
	@UiField FlexTable table;
	@UiField Button    show;
	
	private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

	public WidgetTable(){
		initWidget(uiBinder.createAndBindUi(this));
		int column=0;
		for(String header:getTableHeader()) table.setText(0,column++,header);
		table.getRowFormatter().addStyleName(0,"tableHeader");
	}
  
	@UiHandler("show")
    public void handleClick(ClickEvent e){
		UserServiceAsync  service = (UserServiceAsync)GWT.create(UserService.class);
		service.getUserList(new UserCallback(table));
    }
	
  	public List<String> getTableHeader() {
  		List<String> header = new ArrayList<String>();
  		header.add("Id");
  		header.add("Name");
  		header.add("Number");
  		return header;
  	}
  	
} 
