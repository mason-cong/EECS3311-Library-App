package ManagementTeam;

import ClientClass.Client;
import ItemClass.Item;
import ItemClass.ItemList;

public class Manager {
	//Manager class --> verifies, requests, reports
	
	protected Client client;
	ItemList items = new ItemList();
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public boolean verifyAccount(Client client) {
		/*if(client.getType() == "Student" || client.getID().substring(0,2) == "123" ){
		 * return true;
		 * }
		 * 
		 * */
		return false;
	}
	public void viewReport(Report report) {
		// Implement the logic to view the report
		System.out.println(report.viewReport(client));
	}
	
	void addItems() {
	}
	
}
