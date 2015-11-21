package de.vogella.gwt.uibinder.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;
import de.vogella.gwt.uibinder.client.ui.*;

public class App implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new WidgetTable());
	}
	
} 