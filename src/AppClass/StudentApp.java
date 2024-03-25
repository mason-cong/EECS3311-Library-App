package AppClass;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	JPanel appScreen;

	JPanel textPanel = new JPanel();
	
	TextbookReader text = (TextbookReader) GenerateReaderFactory.generateReader("textbook");
	
	public StudentApp(BaseApp app) {
		this.decorated = app;
		setupPanel();
	}
	
	public void setupPanel() {
		JMenuItem textbookScreen = new JMenuItem("Textbook");
		decorated.menu.add(textbookScreen);
		decorated.appScreen.add(textPanel, "Textbook");
		textbookScreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decorated.changeScreen("Textbook");
				text.setReader();
			}
		});
	}
	
	@Override
	public void login() {
	}

	@Override
	public void register() {
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
