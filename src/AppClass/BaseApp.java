package AppClass;

import ItemClass.*;
import Payment.*;
import ClientClass.*;
import javax.swing.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
		JPanel registerPanel;
		JPanel searchPanel = new JPanel();
		JPanel itemsPanel = new JPanel();
		JPanel requestPanel = new JPanel();
		JPanel paymentPanel;
		JPanel readPanel = new JPanel();
		
		
		public BaseApp() {
			this.appScreen = new JPanel(new CardLayout());
			this.appMenu = new JMenuBar();
			login();
			register();
			requests();
			setupMenu();
			setupPanel();
		}
		
		
		void changeScreen(String screenName) {
			switch (screenName) {
			case "Newsletter":
				readOnlineBooks();
			case "Search":
				SearchApp app = new SearchApp();
			}
			
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
			appScreen.add(registerPanel, "Register");
			
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
			JButton register = new JButton("REGISTER");
			
			loginPanel = new JPanel(new GridLayout(3, 1));
			loginPanel.add(userLabel);
			loginPanel.add(userText);
			loginPanel.add(passLabel);
			loginPanel.add(passText);
			loginPanel.add(submit);
			loginPanel.add(register);
		
			submit.addActionListener(e -> checkDetails(userText.getText(), passText.getText()));
			register.addActionListener(e -> changeScreen("Register"));
			
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
				app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    break;
		  	case "NonFacultyStaff":
		  		NonFacultyStaffApp app2 = new NonFacultyStaffApp(this);
	  		 	appMenu.setVisible(true);
				changeScreen("Rented Items");
				app2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    break;
		  	case "Student":
		  		 StudentApp app = new StudentApp(this);
		  		 	appMenu.setVisible(true);
					changeScreen("Rented Items");
					app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			break;
		  	case "Visitor":
		  		VisitorApp app3 = new VisitorApp(this);
	  		 	appMenu.setVisible(true);
				changeScreen("Rented Items");
				app3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  	break;
		  default:
		    
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
	    char result = id.charAt(0);
	    String type;
	
		switch (result) {
	    case ('1'):
	    	type = "Faculty";
	    break;
	    case ('2'):
	    	type = "NonFacultyStaff";
	    break;
	    case ('3'):
	    	type = "Student";
	    	break;
	    default:
	    	type = "Visitor";
	    	break;
	    } 
	    try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter("logindetails.csv", true), ',');
			//file order is (id, name, availability)
			csvOutput.write(email);
			csvOutput.write(password);
		    csvOutput.write(type);
			csvOutput.endRecord();
			csvOutput.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void manageItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readOnlineBooks() {
		NewsletterReader news = (NewsletterReader) GenerateReaderFactory.generateReader("news");
			news.setReader();
	}

	@Override
	public void requests() {
	    // Creating the UI
	    JLabel titleLabel = new JLabel("Title of the Book/Item");
	    JLabel authorLabel = new JLabel("Author (if applicable)");
	    JLabel emailLabel = new JLabel("Your Email");
	    JTextField titleText = new JTextField();
	    JTextField authorText = new JTextField();
	    JTextField emailText = new JTextField();
	    JButton submit = new JButton("SUBMIT");

	    requestPanel = new JPanel(new GridLayout(4, 1));
	    requestPanel.add(titleLabel);
	    requestPanel.add(titleText);
	    requestPanel.add(authorLabel);
	    requestPanel.add(authorText);
	    requestPanel.add(emailLabel);
	    requestPanel.add(emailText);
	    requestPanel.add(submit);

	    submit.addActionListener(e -> submitRequest(titleText.getText(), authorText.getText(), emailText.getText()));
	}

	@Override
	public void payment() {
	}

	private void submitRequest(String title, String author, String email) {
	    // Request processing logic goes here
	    //email entered identifies the user to know who made the request
	    String requesterEmail = email;

	    // Write the request data to the CSV file
	    try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter("requests.csv", true), ',');
			//file order is (id, name, availability)
			csvOutput.write(email);
			csvOutput.write(title);
		    csvOutput.write(author);
			csvOutput.endRecord();
			csvOutput.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Show a success message
	    JOptionPane.showMessageDialog(appScreen, "Your request has been submitted successfully!");
	    // Process the request and notify the user if the request is successful or not
	    //maybe use the email to notify the user?
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
