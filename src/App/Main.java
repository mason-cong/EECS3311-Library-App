package App;

import javax.swing.JFrame;

import ClientClass.*;
import ItemClass.*;

public class Main {
	
	public static void main(String[] args) throws Exception {

		BaseApp newApp = new BaseApp();
		newApp.setSize(1280,960);
		newApp.setVisible(true);
		newApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newApp.pack();
	}
}
