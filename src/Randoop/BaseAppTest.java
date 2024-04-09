import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class BaseAppTest {
    private BaseApp app;

    @Before
    public void setup() {
        app = new BaseApp();
    }

    @Test
    public void testLoginSuccess() {
        app.checkDetails("test@example.com", "password");
        assertTrue(app.clientType.equals("Faculty"));
    }

    @Test
    public void testLoginFailure() {
        app.checkDetails("test@example.com", "wrong_password");
        assertFalse(app.clientType.equals("Faculty"));
    }

    @Test
    public void testRegisterFaculty() {
        app.registerDetails("Test Faculty", "1", "test_faculty@example.com", "password");
        assertTrue(app.clientType.equals("Faculty"));
    }

    @Test
    public void testRegisterNonFacultyStaff() {
        app.registerDetails("Test NonFacultyStaff", "2", "test_nonfaculty_staff@example.com", "password");
        assertTrue(app.clientType.equals("NonFacultyStaff"));
    }

    @Test
    public void testRegisterStudent() {
        app.registerDetails("Test Student", "3", "test_student@example.com", "password");
        assertTrue(app.clientType.equals("Student"));
    }

    @Test
    public void testRegisterVisitor() {
        app.registerDetails("Test Visitor", "4", "test_visitor@example.com", "password");
        assertTrue(app.clientType.equals("Visitor"));
    }

    @Test
    public void testSubmitRequest() {
        app.submitRequest("Test Book", "Test Author", "test_student@example.com");
        // Check if the request is written to the CSV file
    }

    @Test
    public void testChangePaymentDebit() {
        app.changePayment("Debit");
        assertTrue(app.paymentInfo instanceof DebitStrategy);
    }

    @Test
    public void testChangePaymentCredit() {
        app.changePayment("Credit");
        assertTrue(app.paymentInfo instanceof CreditStrategy);
    }

    @Test
    public void testChangePaymentMobileWallet() {
        app.changePayment("Mobile Wallet");
        assertTrue(app.paymentInfo instanceof MobileWalletStrategy);
    }
}