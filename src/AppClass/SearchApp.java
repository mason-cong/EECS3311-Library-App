package AppClass;

import javax.swing.*;

import com.csvreader.CsvReader;

import ItemClass.Item;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SearchApp extends JFrame {
	
	private JPanel panel;
	private JPanel resultPanel;
	private JButton searchButton;
	private JTextField searchField;
	private JLabel label;
	private String text;
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Item> searchItems = new ArrayList<Item>();
	private String path = "./items.csv";
	
	
	public SearchApp() {
		panel = new JPanel();
		resultPanel = new JPanel();
		
		searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterText();
			}
		});
		
		searchField = new JTextField("");
		searchField.setColumns(20);
		searchField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterText();
			}
		});
		
		label = new JLabel("");

		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
		panel.add(searchField);
		panel.add(searchButton);
		panel.add(label);
		panel.add(resultPanel);
		
		this.add(panel, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
	private void searchRequest() throws Exception {
		
		searchItems = new ArrayList<Item>();
		loadItems();
		
		for(Item i : items) {
			if(i.getName().contains(text)) {
				searchItems.add(i);
			}
		}
		
		resultPanel.removeAll();
		
		for(Item i : searchItems) {
			JButton element = new JButton(i.getName() + " " + (i.getAvailability() == true ? "(Available)" : "(Unavailable)"));
			element.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(panel, "Rent Book");
				}
			});
			resultPanel.add(element);
		}
		
	}
	
	private void loadItems() throws Exception {
		CsvReader reader = new CsvReader(path); 
		items = new ArrayList<Item>();
		reader.readHeaders();
		
		while(reader.readRecord()){
			//id,name,availability
			Item i = new Item();
			i.setId(reader.get("id"));
			i.setName(reader.get("name"));
			i.setAvailability(Boolean.parseBoolean(reader.get("availability")));
			items.add(i); 
		}
	}
	
	private void enterText() {
		text = searchField.getText();
		label.setText("Search results for " + text);
		try {
			searchRequest();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}