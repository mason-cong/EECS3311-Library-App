package App;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
	
	//Components to the app screen
	JPanel appScreen;
	JMenuBar appMenu;
	
	JPanel loginPanel;
	JPanel registerPanel;
	JPanel searchPanel = new JPanel();
	JPanel itemsPanel = new JPanel();
	JPanel requestPanel = new JPanel();
	JPanel paymentPanel = new JPanel();
	
	
	public StudentApp(BaseApp app) {
		this.decorated = app;
		this.appScreen = new JPanel(new CardLayout());
		this.appMenu = new JMenuBar();
		login();
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
		appMenu.setVisible(false);
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
		
		//app.setSize(1280,960);
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	@Override
	public void login() {
		//Creating the UI
		JLabel userLabel = new JLabel("Email");
		JLabel passLabel = new JLabel("Password");
		JTextField userText = new JTextField();
		JTextField passText = new JPasswordField();
		JButton submit = new JButton("SUBMIT");
		
		// Set background color and font for the submit button
		submit.setBackground(new Color(50, 150, 250));
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Arial", Font.BOLD, 14)); 
		
		loginPanel = new JPanel(new GridLayout(3, 1));
		loginPanel.add(userLabel);
		loginPanel.add(userText);
		loginPanel.add(passLabel);
		loginPanel.add(passText);
		loginPanel.add(submit);
	
		submit.addActionListener(e -> checkDetails(userText.getText(), passText.getText()));
		
	}

	void checkDetails(String email, String password) {
		boolean success = false;
		String path = "C:\\Users\\tusit\\eclipse-workspace\\YorkULibraryApp\\logindetails.csv";
		try {
			CsvReader reader = new CsvReader(path); 
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
			JOptionPane.showMessageDialog(appScreen, "Incorrect details");
		} 
		
	}

	@Override
	public void register() {
	    // Creating the UI
	    JLabel nameLabel = new JLabel("Name");
	    JLabel idLabel = new JLabel("ID");
	    JLabel userLabel = new JLabel("Email");
	    JLabel passLabel = new JLabel("Password");
	    JTextField nameText = new JTextField();
	    JTextField idText = new JTextField();
	    JTextField userText = new JTextField();
	    JTextField passText = new JPasswordField();
	    JButton submit = new JButton("REGISTER");

	    // Set background color and font for the submit button
	    submit.setBackground(new Color(50, 150, 250));
	    submit.setForeground(Color.WHITE);
	    submit.setFont(new Font("Arial", Font.BOLD, 14));

	    registerPanel = new JPanel(new GridLayout(5, 1));
	    registerPanel.add(nameLabel);
	    registerPanel.add(nameText);
	    registerPanel.add(idLabel);
	    registerPanel.add(idText);
	    registerPanel.add(userLabel);
	    registerPanel.add(userText);
	    registerPanel.add(passLabel);
	    registerPanel.add(passText);
	    registerPanel.add(submit);

	    submit.addActionListener(e -> registerDetails(nameText.getText(), idText.getText(), userText.getText(), passText.getText()));
	}

	private void registerDetails(String name, String id, String email, String password) {
	    // Registration logic goes here
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
