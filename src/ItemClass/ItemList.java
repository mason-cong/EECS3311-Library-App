package ItemClass;

import java.lang.Boolean;
import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class ItemList {

	ArrayList<Item> items = new ArrayList<Item>();
	String path;
	
	public void update(String path) throws Exception {
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		while(reader.readRecord()) { 
			Item item = new Item();

			item.id = reader.get("id");
			item.name = reader.get("name");
			item.availability = Boolean.parseBoolean(reader.get("availability"));
			items.add(item);
		}
	}
	
	public void add(String path, Item item) throws Exception {
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, true), ',');
			//file order is (id, name, availability)
			csvOutput.write(item.id);
			csvOutput.write(item.name);
		    csvOutput.write(String.valueOf(item.availability));
			csvOutput.endRecord();
			csvOutput.close();
			
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	
	public void add2(String path) throws Exception {
		try {		
			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, true), ',');
			//file order is (id, name, availability)
			csvOutput.write("id");
			csvOutput.write("name");
	    	csvOutput.write("availability");
			csvOutput.endRecord();

			/*for(Item u: items){
				//csvOutput.write(u.getName());
				//csvOutput.write(String.valueOf(u.getId()));
				//csvOutput.write(u.getEmail());
				//csvOutput.write(u.getPassword());
				csvOutput.endRecord();
			}*/
			csvOutput.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
