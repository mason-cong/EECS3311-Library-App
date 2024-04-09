import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseAppTest {

    private BaseApp app;

    @Before
    public void setUp() {
        app = new BaseApp();
    }

    @Test
1. public void testRegisterNewUser() {
        // Test registering a new user with valid input
        app.registerDetails("John Doe", "123456789", "johndoe@example.com", "password123");
        CsvReader reader = null;
        try {
            reader = new CsvReader("logindetails.csv");
            assertTrue(reader.readRecord()); // Make sure the CSV file was written to
            assertEquals("johndoe@example.com", reader.get("email"));
            assertEquals("password123", reader.get("password"));
            assertEquals("Student", reader.get("type")); // Assumes "1" corresponds to student type
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testRegisterNewUserWithInvalidID() {
        // Test registering a new user with an invalid ID (should default to "Visitor" type)
        app.registerDetails("Jane Doe", "abcdefg", "janedoe@example.com", "password456");
        CsvReader reader = null;
        try {
            reader = new CsvReader("logindetails.csv");
            assertTrue(reader.readRecord()); // Make sure the CSV file was written to
            assertEquals("janedoe@example.com", reader.get("email"));
            assertEquals("password456", reader.get("password"));
            assertEquals("Visitor", reader.get("type"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testCheckDetails() {
        // Test checking user credentials against stored data
        app.registerDetails("John Doe", "123456789", "johndoe@example.com", "password123");
        assertTrue(app.checkDetails("johndoe@example.com", "password123"));
        assertFalse(app.checkDetails("johndoe@example.com", "wrongpassword"));
        assertFalse(app.checkDetails("wrongemail@example.com", "password123"));
    }

    @Test
    public void testSubmitRequest() {
        // Test submitting a request with valid input
        app.submitRequest("The Great Gatsby", "F. Scott Fitzgerald", "johndoe@example.com");
        CsvReader reader = null;
        try {
            reader = new CsvReader("requests.csv");
            assertTrue(reader.readRecord()); // Make sure the CSV file was written to
            assertEquals("johndoe@example.com", reader.get("email"));
            assertEquals("The Great Gatsby", reader.get("title"));
            assertEquals("F. Scott Fitzgerald", reader.get("author"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testSubmitRequestWithEmptyTitle() {
        // Test submitting a request with an empty title
        app.submitRequest("", "F. Scott Fitzgerald", "johndoe@example.com");
        CsvReader reader = null;
        try {
            reader = new CsvReader("requests.csv");
            assertFalse(reader.readRecord()); // Make sure the CSV file was not written to
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testSubmitRequestWithEmptyAuthor() {
        // Test submitting a request with an empty author
        app.submitRequest("The Great Gatsby", "", "johndoe@example.com");
        CsvReader reader = null;
        try {
            reader = new CsvReader("requests.csv");
            assertFalse(reader.readRecord()); // Make sure the CSV file was not written to
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testSubmitRequestWithInvalidEmail() {
        // Test submitting a request with an invalid email
        app.submitRequest("The Great Gatsby", "F. Scott Fitzgerald", "wrongemail");
        CsvReader reader = null;
        try {
            reader = new CsvReader("requests.csv");
            assertFalse(reader.readRecord()); // Make sure the CSV file was not written to
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader!= null) {
                reader.close();
            }
        }
    }

    @Test
    public void testChangePaymentTypeToDebit() {
        // Test changing the payment type to "Debit"
        app.changePayment("Debit");
        assertEquals("Debit", app.paymentTypes.getSelectedItem());
    }

    @Test
    public void testChangePaymentTypeToCredit() {
        // Test changing the payment type to "Credit"
        app.changePayment("Credit");
        assertEquals("Credit", app.paymentTypes.getSelectedItem());
    }

    @Test
    public void testChangePaymentTypeToMobileWallet() {
        // Test changing the payment type to "Mobile Wallet"
        app.changePayment("Mobile Wallet");
        assertEquals("Mobile Wallet", app.paymentTypes.getSelectedItem());
    }

    @Test
    public void testEnterValidCardNumber() {
        // Test entering a valid card number for payment
        app.cardText.setText("1234567890123456");
        app.doPayment(app.paymentInfo);
        // Verify that the payment was successful
    }

    @Test
    public void testEnterInvalidCardNumber() {
        // Test entering an invalid card number for payment
        app.cardText.setText("123456789012345");
        app.doPayment(app.paymentInfo);
        // Verify that the payment was not successful
    }

    @Test
    public void testEnterValidExpiryDate() {
        // Test entering a valid expiry date for payment
        app.expiryText.setText("12/24");
        app.doPayment(app.paymentInfo);
        // Verify that the payment was successful
    }

    @Test
    public void testEnterInvalidExpiryDate() {
        // Test entering an invalid expiry date for payment
        app.expiryText.setText("12/12");
        app.doPayment(app.paymentInfo);
        // Verify that the payment was not successful
    }

    @Test