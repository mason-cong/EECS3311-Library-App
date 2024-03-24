package App;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.csvreader.CsvReader;

import ClientClass.Client;

public class StudentApp extends JFrame implements App {
	
	BaseApp decorated;
	
	//Copmponents to the app screen
	/*JPanel appScreen;
	JMenuBar appMenu;
	JMenu menu;
	
	JPanel loginPanel;
	JPanel searchPanel = new JPanel();
	JPanel itemsPanel = new JPanel();
	JPanel requestPanel = new JPanel();
	JPanel paymentPanel = new JPanel();
	JPanel readPanel = new JPanel();*/
	JPanel textPanel = new JPanel();
	
	
	public StudentApp(BaseApp app) {
		this.decorated = app;
		setupPanel();
	}
	
	/*private void changeScreen(String screenName) {
		((CardLayout) appScreen.getLayout()).show(appScreen, screenName);
	}*/
	
	/*private void setupMenu() {
		//Create menu tab for user to switch between app functions
		menu = new JMenu("Functions");
		JMenuItem searchScreen = new JMenuItem("Search");
		JMenuItem itemsScreen = new JMenuItem("Rented Items");
		JMenuItem requestScreen = new JMenuItem("Request");
		JMenuItem paymentScreen = new JMenuItem("Payment");
		JMenuItem readerScreen = new JMenuItem("Reader");
		
		//Set the menu to be able to switch between panels
		searchScreen.addActionListener(selected -> changeScreen("Search"));
		itemsScreen.addActionListener(selected -> changeScreen("Rented Items"));
		requestScreen.addActionListener(selected -> changeScreen("Request"));
		paymentScreen.addActionListener(selected -> changeScreen("Payment"));
		readerScreen.addActionListener(selected -> changeScreen("Reader"));
		
		//Add the different menu options to the main menu
		menu.add(searchScreen);
		menu.add(itemsScreen);
		menu.add(requestScreen);
		menu.add(paymentScreen);
		menu.add(readerScreen);
		
		appMenu.add(menu);
		appMenu.setVisible(false);
	}*/
	
	public void setupPanel() {
		JMenuItem textbookScreen = new JMenuItem("Textbook");
		decorated.menu.add(textbookScreen);
		decorated.appScreen.add(textPanel, "TextBook");
		
	}
	
	

	
	@Override
	public void login() {
		//Creating the UI
		/*JLabel userLabel = new JLabel("Email");
		JLabel passLabel = new JLabel("Password");
		JTextField userText = new JTextField();
		JTextField passText = new JPasswordField();
		JButton submit = new JButton("SUBMIT");
		
		loginPanel = new JPanel(new GridLayout(3, 1));
		loginPanel.add(userLabel);
		loginPanel.add(userText);
		loginPanel.add(passLabel);
		loginPanel.add(passText);
		loginPanel.add(submit);
	
		submit.addActionListener(e -> checkDetails(userText.getText(), passText.getText()));*/
		
	}

	void checkDetails(String email, String password) {
		/*boolean success = false;
		String path = "C:\\Users\\tusit\\eclipse-workspace\\YorkULibraryApp\\logindetails.csv";
		try {
			CsvReader reader = new CsvReader(path); f
			reader.readHeaders();
			
			while(reader.readRecord()) { 
				Client client = new Client();
					client.setEmail(reader.get("email"));
					client.setPassword(reader.get("password"));
					String clientType = reader.get("type");
				if (client.getEmail().equals(email) && client.getPassword().equals(password)) {
					success = true;
					appMenu.setVisible(true);
					changeScreen("Rented Items");
					break;
				}
			}
		} catch (FileNotFoundException e) {
            e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		if (success == false) {
			JOptionPane.showMessageDialog(appScreen, "Incorrect details");*/
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

	}
}
