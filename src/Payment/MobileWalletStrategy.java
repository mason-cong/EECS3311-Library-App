package Payment;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import ClientClass.Client;
import ItemClass.Item;

public class MobileWalletStrategy implements PaymentStrategy {
	
	String payingEmail;
	String walletDetail;
		
	MobileWalletStrategy(String email, String walletDetail) {
		this.payingEmail = email;
		this.walletDetail = walletDetail;
	}
	
	public MobileWalletStrategy(String email) {
		this.payingEmail = email;
	}

	@Override
	public boolean executePayment() {
		String path = "C:\\Users\\tusit\\eclipse-workspace\\YorkULibraryApp\\balances.csv";
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> balances = new ArrayList<String>();
		
		String checkEmail;
		String balance;
		int index = 0;
		
		try {		
		CsvReader reader = new CsvReader(path);
		while(reader.readRecord()) { 
			checkEmail = reader.get("email");
			balance = reader.get("balance");
			names.add(checkEmail);
			if (checkEmail.equals(payingEmail)) {
				balances.set(index, "0");
			}
			index++;	
		}

			CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
			//file order is email, balance
				csvOutput.write("email");
				csvOutput.write("balance");
				csvOutput.endRecord();
			
			
			for(int i = 0; i < index && index != 0; i++) {
				csvOutput.write(names.get(i));
				csvOutput.write(balances.get(i));
				csvOutput.endRecord();
			}
				csvOutput.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		return true;
	}

}
