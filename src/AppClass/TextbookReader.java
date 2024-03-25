package AppClass;

import java.io.IOException;

import javax.swing.*;

public class TextbookReader extends Reader {

	protected void setReader() {
		JPanel reader = new JPanel();
		JLabel download = new JLabel("Access textbooks");
		reader.add(download);
		JFrame frame = new JFrame("YULA");
		frame.add(reader);
		frame.setSize(1280, 960);
		frame.setVisible(true);
	}

}
