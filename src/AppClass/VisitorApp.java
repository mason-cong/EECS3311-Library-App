package AppClass;

import ItemClass.Item;
import ClientClass.Client;
import javax.swing.*;
import com.csvreader.CsvReader;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class VisitorApp extends JFrame implements App {
	
	BaseApp decorated;
	
	JPanel registerPanel;

	
	
	public VisitorApp(BaseApp app) {
		this.decorated = app;
	}

	@Override
	public void login() {
	}
	
	@Override
	public void register() {
	    // Creating the UI
	    JLabel nameLabel = new JLabel("Name");
	    JLabel idLabel = new JLabel("ID");//maybe if they're visitor write null? 
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

	private void registerDetails(String name, String id /*maybe null*/, String email, String password) {
	    // Registration logic goes here
	}
	@Override
	public void manageItems() {
	}

	@Override
	public void readOnlineBooks() {
	}

	@Override
	public void requests() {
	}

	@Override
	public void payment() {
	}

}
