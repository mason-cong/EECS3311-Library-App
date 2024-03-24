package App;

import ItemClass.*;
import Payment.*;
import ClientClass.*;
import javax.swing.*;
import com.csvreader.CsvReader;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseApp extends JFrame implements App {

		String clientType;
		String email;
		JComboBox<String> paymentTypes;
		PaymentStrategy paymentInfo;
		JLabel cardDetail;
	
	//Copmponents to the app screen
		JPanel appScreen;
		JMenuBar appMenu;
		JMenu menu;
		
		JPanel loginPanel;
		JPanel searchPanel = new JPanel();
		JPanel itemsPanel = new JPanel();
		JPanel requestPanel = new JPanel();
		JPanel paymentPanel;
		JPanel readPanel = new JPanel();
		
		
		public BaseApp() {
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
			menu = new JMenu("Functions");
			JMenuItem searchScreen = new JMenuItem("Search");
			JMenuItem itemsScreen = new JMenuItem("Rented Items");
			JMenuItem requestScreen = new JMenuItem("Request");
			JMenuItem paymentScreen = new JMenuItem("Payment");
			JMenuItem readerScreen = new JMenuItem("Newsletter");
			
			//Set the menu to be able to switch between panels
			searchScreen.addActionListener(selected -> changeScreen("Search"));
			itemsScreen.addActionListener(selected -> changeScreen("Rented Items"));
			requestScreen.addActionListener(selected -> changeScreen("Request"));
			paymentScreen.addActionListener(selected -> changeScreen("Payment"));
			readerScreen.addActionListener(selected -> changeScreen("Newsletter"));
			
			//Add the different menu options to the main menu
			menu.add(searchScreen);
			menu.add(itemsScreen);
			menu.add(requestScreen);
			menu.add(paymentScreen);
			menu.add(readerScreen);
			
			appMenu.add(menu);
			appMenu.setVisible(false);
		}
		
		
		private void setupPanel() {
			createPayment();
			
			appScreen.setPreferredSize(new Dimension(1280, 960));
			appScreen.add(loginPanel, "Login");
			appScreen.add(searchPanel, "Search");
			appScreen.add(itemsPanel, "Rented Items");
			appScreen.add(requestPanel, "Request");
			appScreen.add(paymentPanel, "Payment");
			appScreen.add(readPanel, "Newsletter");
			
			setLayout(new BorderLayout());
			add(appMenu, BorderLayout.NORTH);
			add(appScreen, BorderLayout.CENTER);
		}
		
	
		@Override
		public void login() {
			//Creating the UI
			JLabel userLabel = new JLabel("Email");
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
						this.email = email;
						this.clientType = clientType;
						decorateApp();
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

		
	public void decorateApp() {
		switch(clientType) {
		  	case "Faculty":
		  		FacultyApp app1 = new FacultyApp(this);
	  		 	appMenu.setVisible(true);
				changeScreen("Rented Items");
		    break;
		  	case "NonFacultyStaff":
		  		NonFacultyStaffApp app2 = new NonFacultyStaffApp(this);
	  		 	appMenu.setVisible(true);
				changeScreen("Rented Items");
		    break;
		  	case "Student":
		  		 StudentApp app = new StudentApp(this);
		  		 	appMenu.setVisible(true);
					changeScreen("Rented Items");
			break;
		  	case "Visitor":
		  		VisitorApp app3 = new VisitorApp(this);
	  		 	appMenu.setVisible(true);
				changeScreen("Rented Items");
		  	break;
		  default:
		    
		}
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

	public void changePayment(String strategy) {
		switch (strategy) {
		case ("Debit"):
			paymentInfo = new DebitStrategy(email);
		break;
		case ("Credit"):
			paymentInfo = new CreditStrategy(email);
		break;
		case ("Mobile Wallet"):
			paymentInfo = new MobileWalletStrategy(email);
		break;
		}
	}
	
	private void createPayment() {
		paymentPanel = new JPanel();
		paymentPanel.setLayout(null);
		
		String[] types = {"Debit", "Credit", "Mobile Wallet"};
		paymentTypes = new JComboBox<String>(types);
		paymentTypes.setBounds(960,100,100,50);
		paymentTypes.addActionListener(selected -> changePayment((String) paymentTypes.getSelectedItem()));
		
		JLabel cardnumber = new JLabel("Card Number");
		JLabel expiry = new JLabel("Expiry");
		JLabel security = new JLabel("Security Code");
		JTextField cardText = new JTextField();
		JTextField expiryText = new JTextField();
		JTextField securityText = new JTextField();
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(selected -> doPayment(paymentInfo));
		
		cardnumber.setBounds(420,350,100,50);
		cardText.setBounds(520,350,300,50);
		expiry.setBounds(420,400,100,50);
		expiryText.setBounds(520,400,300,50);
		security.setBounds(420,450,100,50);
		securityText.setBounds(520,450,300,50);
		submit.setBounds(550,600,100,50);
		
		paymentPanel.add(cardnumber);
		paymentPanel.add(cardText);
		paymentPanel.add(expiry);
		paymentPanel.add(expiryText);
		paymentPanel.add(security);
		paymentPanel.add(securityText);
		paymentPanel.add(submit);
		paymentPanel.add(paymentTypes);
	}
	
	private void doPayment(PaymentStrategy strategy) {
		paymentInfo.executePayment();
		
	}
}
