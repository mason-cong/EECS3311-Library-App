package Payment;

public class CreditStrategy implements PaymentStrategy {

	String cardNumber, securityCode, expiryDate;
	
	@Override
	public boolean executePayment() {
		return true;
	}

}
