package Payment;

public class DebitStrategy implements PaymentStrategy {

	String cardNumber, securityCode, expiryDate;
	
	@Override
	public boolean executePayment() { //I assume boolean class, so we can determine if payment went through or not
		// TODO Auto-generated method stub
		return true;
	}
	
}
