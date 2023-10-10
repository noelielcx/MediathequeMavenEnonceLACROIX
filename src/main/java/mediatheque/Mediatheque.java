package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		//throw new UnsupportedOperationException("Not supported yet.");
		for (Item i : items)
			i.accept(new BookVisitor());
	}

	public void printOnlyCDs() {
		//throw new UnsupportedOperationException("Not supported yet.");
		for (Item i : items)
			i.accept(new CDVisitor());
	}


}
