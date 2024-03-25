package App;

import java.io.IOException;

import javax.swing.*;

public class NewsletterReader extends Reader {

	@Override
	protected void setReader() {
		JEditorPane website = null;
		try {
			website = new JEditorPane("https://www.nytimes.com/ca/");
			website.setEditable(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JPanel reader = new JPanel();
		reader.add(website);
		
		JFrame frame = new JFrame("YULA");
		frame.add(new JScrollPane(reader));
		frame.setSize(1280, 960);
		frame.setVisible(true);
	}

}
