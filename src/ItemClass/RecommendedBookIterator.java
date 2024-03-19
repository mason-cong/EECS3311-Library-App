package ItemClass;

import java.util.Iterator;
import java.util.List;

public class RecommendedBookIterator implements Iterator<Book> {
	private int currentIndex;
	private List<Book> list;
	
	public RecommendedBookIterator(List<Book> list) {
		this.list = list;
		this.currentIndex = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (currentIndex < list.size()) {
			currentIndex++;
			return true;
		}	
		currentIndex++;
		return false;
		
	}

	@Override
	public Book next() {
		return list.get(currentIndex);
	}

}
