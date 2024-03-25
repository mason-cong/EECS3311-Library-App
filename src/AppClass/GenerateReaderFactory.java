package AppClass;

public class GenerateReaderFactory {
	public static  Reader generateReader(String type) {
		if (type.equals("news")) {
			return new NewsletterReader();
		} else if (type.equals("textbook")) {
			return new TextbookReader();
		} else {
			return null;
		}
	}
}
