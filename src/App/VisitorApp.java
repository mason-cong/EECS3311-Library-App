package App;

import javax.swing.*;
import java.awt.*;

public class VisitorApp extends JFrame implements App {
	
	//Components to the app screen
	JPanel appScreen;
	JMenuBar appMenu;
	
	JPanel loginPanel = new JPanel();
	JPanel searchPanel = new JPanel();
	JPanel itemsPanel = new JPanel();
	JPanel requestPanel = new JPanel();
	JPanel paymentPanel = new JPanel();
	
	
	public VisitorApp() {
		this.appScreen = new JPanel(new CardLayout());
		this.appMenu = new JMenuBar();
		setupMenu();
		setupPanel();
	}
	
	private void changeScreen(String screenName) {
		((CardLayout) appScreen.getLayout()).show(appScreen, screenName);
	}
	
	private void setupMenu() {
		//Create menu tab for user to switch between app functions
		JMenu menu = new JMenu("Functions");
		JMenuItem searchScreen = new JMenuItem("Search");
		JMenuItem itemsScreen = new JMenuItem("Rented Items");
		JMenuItem requestScreen = new JMenuItem("Request");
		JMenuItem paymentScreen = new JMenuItem("Payment");
		
		//Set the menu to be able to switch between panels
		searchScreen.addActionListener(selected -> changeScreen("Search"));
		itemsScreen.addActionListener(selected -> changeScreen("Rented Items"));
		requestScreen.addActionListener(selected -> changeScreen("Request"));
		paymentScreen.addActionListener(selected -> changeScreen("Payment"));
		
		//Add the different menu options to the main menu
		menu.add(searchScreen);
		menu.add(itemsScreen);
		menu.add(requestScreen);
		menu.add(paymentScreen);
		
		appMenu.add(menu);
	}
	
	private void setupPanel() {
		appScreen.setPreferredSize(new Dimension(1280, 960));
		appScreen.add(loginPanel, "Login");
		appScreen.add(searchPanel, "Search");
		appScreen.add(itemsPanel, "Rented Items");
		appScreen.add(requestPanel, "Request");
		appScreen.add(paymentPanel, "Payment");
		
		setLayout(new BorderLayout());
		add(appMenu, BorderLayout.NORTH);
		add(appScreen, BorderLayout.CENTER);
	
	}
	
	
	public static void main(String args[]) throws Exception {
		VisitorApp app = new VisitorApp();
		app.setSize(1280,960);
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
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
	public boolean payment() {
		// TODO Auto-generated method stub
		return false;
	}

}
