package App;

public class GenerateReaderFactory {
	public Reader generateReader() {
		String y = "a";
		if (y == "b") {
			return new NewsletterReader();
		} else if (y == "c") {
			return new TextbookReader();
		} else {
			return null;
		}
	}
}
