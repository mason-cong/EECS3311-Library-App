package App;

import javax.swing.*;

public class FacultyApp extends JFrame implements App {

	BaseApp decorated;
	
	public FacultyApp(BaseApp app) {
		this.decorated = app;
		//setupPanel();
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean register() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void manageItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOnlineBooks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requests() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}
	
}
