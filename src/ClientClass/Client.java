package ClientClass;

import ItemClass.*;
import java.util.ArrayList;

public class Client {

	private String email;
	private String password;
	private String id;
	private String type;
	protected ArrayList<Item> items;
	protected ArrayList<Newsletters> newsletters;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
