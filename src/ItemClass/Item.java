package ItemClass;

public class Item {
	String id;
	String name;
	boolean availability;
	
	public void setId(String i) {
		id = i;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAvailability(boolean f) {
		availability = f;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean getAvailability() {
		return availability;
	}
} 