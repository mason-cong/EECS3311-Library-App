import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Payment.MobileWalletStrategy mobileWalletStrategy1 = new Payment.MobileWalletStrategy("hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Payment.Payment payment0 = new Payment.Payment();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "", "hi!", "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "hi!", "hi!", "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ManagementTeam.Course course0 = new ManagementTeam.Course();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Payment.DebitStrategy debitStrategy1 = new Payment.DebitStrategy("");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "", "", "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        java.lang.Class<?> wildcardClass1 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "", "", "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Payment.DebitStrategy debitStrategy1 = new Payment.DebitStrategy("hi!");
        java.lang.Class<?> wildcardClass2 = debitStrategy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Payment.MobileWalletStrategy mobileWalletStrategy1 = new Payment.MobileWalletStrategy("");
        java.lang.Class<?> wildcardClass2 = mobileWalletStrategy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = manager0.verifyAccount(client11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Payment.CreditStrategy creditStrategy1 = new Payment.CreditStrategy("hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setAvailability(false);
        java.lang.Class<?> wildcardClass11 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        ClientClass.Visitor visitor0 = new ClientClass.Visitor();
        java.lang.Class<?> wildcardClass1 = visitor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "hi!", "", "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "", "", "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager11.setClient((ClientClass.Client) faculty18);
        faculty18.setType("hi!");
        manager0.setClient((ClientClass.Client) faculty18);
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        client24.setID("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = manager0.verifyAccount(client24);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "hi!", "hi!", "hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "hi!", "", "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "", "hi!", "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ClientClass.Student student0 = new ClientClass.Student();
        student0.setPassword("hi!");
        student0.setPassword("");
        java.lang.String str5 = student0.getID();
        java.lang.Class<?> wildcardClass6 = student0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "hi!", "hi!", "");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        report1.setEmail("");
        report1.setEmail("hi!");
        report1.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        java.lang.Class<?> wildcardClass19 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        java.lang.String str3 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "", "hi!", "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "", "", "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        java.lang.Class<?> wildcardClass5 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        ManagementTeam.Manager manager34 = new ManagementTeam.Manager();
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        manager34.viewReport(report35);
        report35.setEmail("");
        report35.setEmail("hi!");
        ClientClass.Visitor visitor45 = new ClientClass.Visitor();
        java.lang.String str46 = visitor45.getType();
        visitor45.setID("");
        java.lang.String str49 = report35.viewReport((ClientClass.Client) visitor45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = manager0.verifyAccount((ClientClass.Client) visitor45);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "", "hi!", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        java.lang.String str16 = report11.getEmail();
        manager0.viewReport(report11);
        ClientClass.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = manager0.verifyAccount(client18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ClientClass.Client.getType()\" because \"client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        java.lang.Class<?> wildcardClass7 = report1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setType("");
        java.lang.Class<?> wildcardClass11 = client2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setID("");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        java.lang.String str16 = report11.getEmail();
        manager0.viewReport(report11);
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        java.lang.String str23 = client19.getType();
        manager0.setClient(client19);
        java.lang.Class<?> wildcardClass25 = client19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("");
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setType("hi!");
        client2.setEmail("hi!");
        client2.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "hi!", "hi!", "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        report1.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        boolean boolean10 = book0.getAvailability();
        java.lang.Class<?> wildcardClass11 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        java.lang.String str1 = faculty0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager12 = new ManagementTeam.Manager();
        ManagementTeam.Report report13 = new ManagementTeam.Report();
        ClientClass.Client client14 = new ClientClass.Client();
        client14.setID("");
        java.lang.String str17 = report13.viewReport(client14);
        manager12.viewReport(report13);
        report13.setEmail("");
        manager11.viewReport(report13);
        ClientClass.Faculty faculty22 = new ClientClass.Faculty();
        faculty22.setID("");
        faculty22.setPassword("");
        java.lang.String str27 = report13.viewReport((ClientClass.Client) faculty22);
        manager0.viewReport(report13);
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ClientClass.Client client30 = new ClientClass.Client();
        client30.setID("");
        java.lang.String str33 = report29.viewReport(client30);
        client30.setID("");
        client30.setType("");
        client30.setEmail("");
        java.lang.String str40 = client30.getID();
        client30.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = manager0.verifyAccount(client30);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getEmail();
        java.lang.String str5 = faculty0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        manager0.viewReport(report30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        java.lang.Class<?> wildcardClass3 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        report1.setEmail("");
        report1.setEmail("hi!");
        java.lang.String str11 = report1.getEmail();
        java.lang.String str12 = report1.getEmail();
        java.lang.Class<?> wildcardClass13 = report1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        java.lang.String str16 = book0.getName();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        manager11.setClient((ClientClass.Client) visitor18);
        manager10.setClient((ClientClass.Client) visitor18);
        java.lang.String str21 = visitor18.getID();
        java.lang.String str22 = report0.viewReport((ClientClass.Client) visitor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("hi!");
        java.lang.String str11 = client1.getType();
        java.lang.Class<?> wildcardClass12 = client1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        java.lang.Class<?> wildcardClass10 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("");
        java.lang.String str4 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        java.lang.String str11 = visitor8.getPassword();
        java.lang.String str12 = visitor8.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        java.lang.String str5 = book0.getName();
        boolean boolean6 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        java.lang.String str10 = visitor7.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        java.lang.String str7 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Student student11 = new ClientClass.Student();
        student11.setPassword("hi!");
        student11.setPassword("");
        java.lang.String str16 = student11.getID();
        manager0.setClient((ClientClass.Client) student11);
        ManagementTeam.Manager manager18 = new ManagementTeam.Manager();
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        ClientClass.Client client20 = new ClientClass.Client();
        client20.setID("");
        java.lang.String str23 = report19.viewReport(client20);
        manager18.viewReport(report19);
        report19.setEmail("");
        report19.setEmail("hi!");
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        visitor29.setID("");
        java.lang.String str33 = report19.viewReport((ClientClass.Client) visitor29);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = manager0.verifyAccount((ClientClass.Client) visitor29);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Payment.CreditStrategy creditStrategy1 = new Payment.CreditStrategy("");
        java.lang.Class<?> wildcardClass2 = creditStrategy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Visitor visitor42 = new ClientClass.Visitor();
        java.lang.String str43 = visitor42.getType();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor42);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = report36.viewReport((ClientClass.Client) visitor52);
        manager0.viewReport(report36);
        ManagementTeam.Report report57 = new ManagementTeam.Report();
        ClientClass.Client client58 = new ClientClass.Client();
        client58.setID("");
        java.lang.String str61 = report57.viewReport(client58);
        java.lang.String str62 = report57.getEmail();
        report57.setEmail("");
        ManagementTeam.Manager manager65 = new ManagementTeam.Manager();
        ManagementTeam.Report report66 = new ManagementTeam.Report();
        ClientClass.Client client67 = new ClientClass.Client();
        client67.setID("");
        java.lang.String str70 = report66.viewReport(client67);
        manager65.viewReport(report66);
        ClientClass.Visitor visitor72 = new ClientClass.Visitor();
        manager65.setClient((ClientClass.Client) visitor72);
        java.lang.String str74 = visitor72.getType();
        visitor72.setPassword("");
        visitor72.setPassword("hi!");
        java.lang.String str79 = report57.viewReport((ClientClass.Client) visitor72);
        manager0.viewReport(report57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("hi!");
        book0.setId("");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        java.lang.String str2 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        report1.setEmail("");
        report1.setEmail("hi!");
        java.lang.String str11 = report1.getEmail();
        report1.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "", "hi!", "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "", "", "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        visitor7.setPassword("hi!");
        java.lang.String str14 = visitor7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        java.lang.String str9 = book0.getName();
        java.lang.String str10 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "hi!", "", "hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getName();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        java.lang.String str11 = faculty9.getPassword();
        java.lang.String str12 = faculty9.getEmail();
        java.lang.Class<?> wildcardClass13 = faculty9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setName("");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ClientClass.Student student6 = new ClientClass.Student();
        student6.setPassword("hi!");
        student6.setPassword("");
        java.lang.String str11 = student6.getID();
        manager0.setClient((ClientClass.Client) student6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setType("");
        java.lang.String str14 = faculty7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        java.lang.String str12 = visitor7.getType();
        visitor7.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        boolean boolean10 = book0.getAvailability();
        boolean boolean11 = book0.getAvailability();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "hi!", "", "");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.Class<?> wildcardClass3 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        book0.setId("");
        book0.setName("");
        book0.setAvailability(true);
        boolean boolean15 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        ClientClass.Client client0 = new ClientClass.Client();
        client0.setID("");
        java.lang.String str3 = client0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("hi!");
        nonFacultyStaff0.setEmail("hi!");
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "hi!", "hi!", "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "hi!", "hi!", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "", "", "");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        java.lang.String str16 = book0.getName();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        report0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        ClientClass.Visitor visitor0 = new ClientClass.Visitor();
        java.lang.String str1 = visitor0.getType();
        visitor0.setID("");
        visitor0.setPassword("hi!");
        java.lang.String str6 = visitor0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "", "hi!", "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        visitor7.setPassword("hi!");
        java.lang.String str14 = visitor7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setPassword("hi!");
        java.lang.String str5 = nonFacultyStaff0.getEmail();
        java.lang.String str6 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str5 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        faculty46.setEmail("");
        faculty46.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager12 = new ManagementTeam.Manager();
        ManagementTeam.Report report13 = new ManagementTeam.Report();
        ClientClass.Client client14 = new ClientClass.Client();
        client14.setID("");
        java.lang.String str17 = report13.viewReport(client14);
        manager12.viewReport(report13);
        ClientClass.Visitor visitor19 = new ClientClass.Visitor();
        manager12.setClient((ClientClass.Client) visitor19);
        manager11.setClient((ClientClass.Client) visitor19);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager11.viewReport(report23);
        report23.setEmail("hi!");
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        java.lang.String str41 = client37.getType();
        java.lang.String str42 = report35.viewReport(client37);
        java.lang.String str43 = client37.getEmail();
        java.lang.String str44 = report23.viewReport(client37);
        manager0.setClient(client37);
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = manager0.verifyAccount(client47);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setName("hi!");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setPassword("hi!");
        java.lang.String str5 = nonFacultyStaff0.getEmail();
        java.lang.String str6 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setAvailability(false);
        java.lang.String str7 = book0.getName();
        book0.setAvailability(false);
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "hi!", "", "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        faculty46.setEmail("");
        java.lang.String str56 = faculty46.getEmail();
        faculty46.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        report7.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        java.lang.String str14 = faculty11.getEmail();
        java.lang.String str15 = faculty11.getID();
        manager0.setClient((ClientClass.Client) faculty11);
        faculty11.setPassword("hi!");
        java.lang.String str19 = faculty11.getID();
        faculty11.setID("");
        java.lang.String str22 = faculty11.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        ItemClass.Book book0 = new ItemClass.Book();
        java.lang.String str1 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        java.lang.String str7 = book0.getId();
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        faculty9.setPassword("");
        java.lang.String str13 = faculty9.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = report0.getEmail();
        report0.setEmail("");
        ManagementTeam.Manager manager8 = new ManagementTeam.Manager();
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ClientClass.Client client10 = new ClientClass.Client();
        client10.setID("");
        java.lang.String str13 = report9.viewReport(client10);
        manager8.viewReport(report9);
        ClientClass.Visitor visitor15 = new ClientClass.Visitor();
        manager8.setClient((ClientClass.Client) visitor15);
        java.lang.String str17 = visitor15.getType();
        visitor15.setPassword("");
        visitor15.setPassword("hi!");
        java.lang.String str22 = report0.viewReport((ClientClass.Client) visitor15);
        java.lang.String str23 = visitor15.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        java.lang.String str7 = book0.getName();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Visitor visitor42 = new ClientClass.Visitor();
        java.lang.String str43 = visitor42.getType();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor42);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = report36.viewReport((ClientClass.Client) visitor52);
        manager0.viewReport(report36);
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Faculty faculty64 = new ClientClass.Faculty();
        manager57.setClient((ClientClass.Client) faculty64);
        ClientClass.Visitor visitor66 = new ClientClass.Visitor();
        java.lang.String str67 = visitor66.getType();
        visitor66.setType("hi!");
        manager57.setClient((ClientClass.Client) visitor66);
        ManagementTeam.Manager manager71 = new ManagementTeam.Manager();
        ManagementTeam.Report report72 = new ManagementTeam.Report();
        ClientClass.Client client73 = new ClientClass.Client();
        client73.setID("");
        java.lang.String str76 = report72.viewReport(client73);
        manager71.viewReport(report72);
        ClientClass.Visitor visitor78 = new ClientClass.Visitor();
        java.lang.String str79 = visitor78.getType();
        java.lang.String str80 = report72.viewReport((ClientClass.Client) visitor78);
        visitor78.setType("hi!");
        java.lang.String str83 = visitor78.getType();
        manager57.setClient((ClientClass.Client) visitor78);
        ManagementTeam.Report report85 = new ManagementTeam.Report();
        ManagementTeam.Report report86 = new ManagementTeam.Report();
        ClientClass.Client client87 = new ClientClass.Client();
        client87.setID("");
        java.lang.String str90 = report86.viewReport(client87);
        client87.setID("");
        java.lang.String str93 = report85.viewReport(client87);
        manager57.viewReport(report85);
        manager0.viewReport(report85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!" + "'", str83.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "" + "'", str93.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setAvailability(false);
        java.lang.String str15 = book0.getName();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Student student11 = new ClientClass.Student();
        student11.setPassword("hi!");
        student11.setPassword("");
        java.lang.String str16 = student11.getID();
        manager0.setClient((ClientClass.Client) student11);
        student11.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        java.lang.String str24 = report12.getEmail();
        java.lang.String str25 = report12.getEmail();
        java.lang.String str26 = report12.getEmail();
        java.lang.String str27 = report12.getEmail();
        ClientClass.Faculty faculty28 = new ClientClass.Faculty();
        faculty28.setID("");
        faculty28.setPassword("");
        java.lang.String str33 = faculty28.getPassword();
        java.lang.String str34 = report12.viewReport((ClientClass.Client) faculty28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.Class<?> wildcardClass3 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        client12.setID("");
        java.lang.String str18 = client12.getID();
        client12.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = manager0.verifyAccount(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        report22.setEmail("");
        report22.setEmail("hi!");
        ClientClass.Visitor visitor32 = new ClientClass.Visitor();
        java.lang.String str33 = visitor32.getType();
        visitor32.setID("");
        java.lang.String str36 = report22.viewReport((ClientClass.Client) visitor32);
        java.lang.String str37 = report0.viewReport((ClientClass.Client) visitor32);
        java.lang.Class<?> wildcardClass38 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        faculty11.setPassword("");
        java.lang.String str16 = report2.viewReport((ClientClass.Client) faculty11);
        java.lang.String str17 = report2.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("");
        java.lang.Class<?> wildcardClass11 = client1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        java.lang.String str7 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        manager16.setClient((ClientClass.Client) visitor24);
        ManagementTeam.Manager manager27 = new ManagementTeam.Manager();
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ClientClass.Client client29 = new ClientClass.Client();
        client29.setID("");
        java.lang.String str32 = report28.viewReport(client29);
        manager27.viewReport(report28);
        ClientClass.Visitor visitor34 = new ClientClass.Visitor();
        java.lang.String str35 = visitor34.getType();
        java.lang.String str36 = report28.viewReport((ClientClass.Client) visitor34);
        manager16.viewReport(report28);
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        manager38.viewReport(report39);
        ClientClass.Visitor visitor45 = new ClientClass.Visitor();
        java.lang.String str46 = visitor45.getType();
        java.lang.String str47 = report39.viewReport((ClientClass.Client) visitor45);
        manager16.setClient((ClientClass.Client) visitor45);
        ManagementTeam.Manager manager49 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager50 = new ManagementTeam.Manager();
        ManagementTeam.Report report51 = new ManagementTeam.Report();
        ClientClass.Client client52 = new ClientClass.Client();
        client52.setID("");
        java.lang.String str55 = report51.viewReport(client52);
        manager50.viewReport(report51);
        report51.setEmail("");
        manager49.viewReport(report51);
        ManagementTeam.Manager manager60 = new ManagementTeam.Manager();
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        manager60.viewReport(report61);
        ClientClass.Faculty faculty67 = new ClientClass.Faculty();
        manager60.setClient((ClientClass.Client) faculty67);
        faculty67.setType("hi!");
        manager49.setClient((ClientClass.Client) faculty67);
        manager16.setClient((ClientClass.Client) faculty67);
        java.lang.String str73 = faculty67.getPassword();
        java.lang.String str74 = faculty67.getEmail();
        manager0.setClient((ClientClass.Client) faculty67);
        java.lang.Class<?> wildcardClass76 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setName("");
        java.lang.String str7 = book0.getId();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getName();
        boolean boolean11 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        report12.setEmail("");
        report12.setEmail("hi!");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = report12.viewReport((ClientClass.Client) visitor22);
        java.lang.String str27 = visitor22.getID();
        java.lang.String str28 = visitor22.getType();
        manager0.setClient((ClientClass.Client) visitor22);
        visitor22.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Report report14 = new ManagementTeam.Report();
        ClientClass.Client client15 = new ClientClass.Client();
        client15.setID("");
        java.lang.String str18 = report14.viewReport(client15);
        java.lang.String str19 = report14.getEmail();
        report14.setEmail("");
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        manager22.setClient((ClientClass.Client) visitor29);
        java.lang.String str31 = visitor29.getType();
        visitor29.setPassword("");
        visitor29.setPassword("hi!");
        java.lang.String str36 = report14.viewReport((ClientClass.Client) visitor29);
        java.lang.String str37 = visitor29.getPassword();
        visitor29.setType("");
        manager0.setClient((ClientClass.Client) visitor29);
        java.lang.String str41 = visitor29.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager34 = new ManagementTeam.Manager();
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        manager34.viewReport(report35);
        report35.setEmail("");
        manager33.viewReport(report35);
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Faculty faculty51 = new ClientClass.Faculty();
        manager44.setClient((ClientClass.Client) faculty51);
        faculty51.setType("hi!");
        manager33.setClient((ClientClass.Client) faculty51);
        manager0.setClient((ClientClass.Client) faculty51);
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Visitor visitor64 = new ClientClass.Visitor();
        java.lang.String str65 = visitor64.getType();
        java.lang.String str66 = report58.viewReport((ClientClass.Client) visitor64);
        ManagementTeam.Manager manager67 = new ManagementTeam.Manager();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        manager67.viewReport(report68);
        ClientClass.Visitor visitor74 = new ClientClass.Visitor();
        java.lang.String str75 = visitor74.getType();
        java.lang.String str76 = report68.viewReport((ClientClass.Client) visitor74);
        java.lang.String str77 = report58.viewReport((ClientClass.Client) visitor74);
        report58.setEmail("hi!");
        manager0.viewReport(report58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        java.lang.String str17 = client13.getType();
        java.lang.String str18 = report11.viewReport(client13);
        manager0.setClient(client13);
        ClientClass.Faculty faculty20 = new ClientClass.Faculty();
        faculty20.setID("");
        java.lang.String str23 = faculty20.getEmail();
        java.lang.String str24 = faculty20.getID();
        faculty20.setEmail("hi!");
        java.lang.String str27 = faculty20.getID();
        manager0.setClient((ClientClass.Client) faculty20);
        java.lang.String str29 = faculty20.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "", "", "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        ManagementTeam.Manager manager54 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager55 = new ManagementTeam.Manager();
        ManagementTeam.Report report56 = new ManagementTeam.Report();
        ClientClass.Client client57 = new ClientClass.Client();
        client57.setID("");
        java.lang.String str60 = report56.viewReport(client57);
        manager55.viewReport(report56);
        ClientClass.Visitor visitor62 = new ClientClass.Visitor();
        manager55.setClient((ClientClass.Client) visitor62);
        manager54.setClient((ClientClass.Client) visitor62);
        ManagementTeam.Manager manager65 = new ManagementTeam.Manager();
        ManagementTeam.Report report66 = new ManagementTeam.Report();
        ClientClass.Client client67 = new ClientClass.Client();
        client67.setID("");
        java.lang.String str70 = report66.viewReport(client67);
        manager65.viewReport(report66);
        ClientClass.Visitor visitor72 = new ClientClass.Visitor();
        java.lang.String str73 = visitor72.getType();
        java.lang.String str74 = report66.viewReport((ClientClass.Client) visitor72);
        manager54.viewReport(report66);
        manager0.viewReport(report66);
        ClientClass.Visitor visitor77 = new ClientClass.Visitor();
        java.lang.String str78 = visitor77.getType();
        visitor77.setID("");
        java.lang.String str81 = visitor77.getPassword();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = manager0.verifyAccount((ClientClass.Client) visitor77);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setPassword("");
        java.lang.String str5 = faculty0.getType();
        java.lang.String str6 = faculty0.getPassword();
        java.lang.String str7 = faculty0.getID();
        java.lang.String str8 = faculty0.getPassword();
        java.lang.Class<?> wildcardClass9 = faculty0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        faculty11.setPassword("");
        java.lang.String str16 = report2.viewReport((ClientClass.Client) faculty11);
        java.lang.String str17 = faculty11.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        book0.setId("");
        boolean boolean11 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getName();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("hi!");
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.viewReport(report19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ManagementTeam.Report.viewReport(ClientClass.Client)\" because \"report\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("hi!");
        nonFacultyStaff0.setPassword("");
        java.lang.String str6 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        boolean boolean4 = book0.getAvailability();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        java.lang.String str5 = book0.getId();
        java.lang.String str6 = book0.getName();
        java.lang.String str7 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        java.lang.String str9 = client2.getID();
        client2.setType("");
        java.lang.String str12 = client2.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        faculty9.setPassword("");
        faculty9.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        java.lang.String str11 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        book0.setId("");
        book0.setName("");
        java.lang.String str13 = book0.getName();
        java.lang.Class<?> wildcardClass14 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        boolean boolean4 = book0.getAvailability();
        java.lang.String str5 = book0.getName();
        boolean boolean6 = book0.getAvailability();
        java.lang.String str7 = book0.getName();
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = client1.getType();
        client1.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        java.lang.String str3 = report0.getEmail();
        ManagementTeam.Manager manager4 = new ManagementTeam.Manager();
        ManagementTeam.Report report5 = new ManagementTeam.Report();
        ClientClass.Client client6 = new ClientClass.Client();
        client6.setID("");
        java.lang.String str9 = report5.viewReport(client6);
        manager4.viewReport(report5);
        ClientClass.Visitor visitor11 = new ClientClass.Visitor();
        manager4.setClient((ClientClass.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        visitor11.setPassword("");
        java.lang.String str16 = report0.viewReport((ClientClass.Client) visitor11);
        java.lang.String str17 = visitor11.getType();
        java.lang.String str18 = visitor11.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setAvailability(false);
        java.lang.String str11 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setType("");
        java.lang.Class<?> wildcardClass14 = faculty7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        java.lang.String str21 = visitor17.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        report0.setEmail("hi!");
        report0.setEmail("hi!");
        report0.setEmail("");
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager15 = new ManagementTeam.Manager();
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ClientClass.Client client17 = new ClientClass.Client();
        client17.setID("");
        java.lang.String str20 = report16.viewReport(client17);
        manager15.viewReport(report16);
        report16.setEmail("");
        manager14.viewReport(report16);
        ClientClass.Student student25 = new ClientClass.Student();
        student25.setPassword("hi!");
        student25.setPassword("");
        java.lang.String str30 = student25.getID();
        manager14.setClient((ClientClass.Client) student25);
        java.lang.String str32 = student25.getPassword();
        java.lang.String str33 = student25.getPassword();
        java.lang.String str34 = student25.getPassword();
        student25.setID("");
        student25.setType("");
        java.lang.String str39 = report0.viewReport((ClientClass.Client) student25);
        java.lang.String str40 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager11.setClient((ClientClass.Client) faculty18);
        faculty18.setType("hi!");
        manager0.setClient((ClientClass.Client) faculty18);
        java.lang.String str23 = faculty18.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str7 = book0.getName();
        book0.setId("");
        book0.setAvailability(true);
        boolean boolean12 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = report0.getEmail();
        report0.setEmail("");
        java.lang.String str8 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Manager manager7 = new ManagementTeam.Manager();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        manager7.viewReport(report8);
        ClientClass.Faculty faculty14 = new ClientClass.Faculty();
        manager7.setClient((ClientClass.Client) faculty14);
        java.lang.String str16 = faculty14.getEmail();
        faculty14.setType("hi!");
        faculty14.setType("");
        manager0.setClient((ClientClass.Client) faculty14);
        ClientClass.Client client22 = null;
        manager0.setClient(client22);
        ManagementTeam.Manager manager24 = new ManagementTeam.Manager();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        manager24.viewReport(report25);
        report25.setEmail("");
        report25.setEmail("hi!");
        ClientClass.Visitor visitor35 = new ClientClass.Visitor();
        java.lang.String str36 = visitor35.getType();
        visitor35.setID("");
        java.lang.String str39 = report25.viewReport((ClientClass.Client) visitor35);
        report25.setEmail("");
        java.lang.String str42 = report25.getEmail();
        manager0.viewReport(report25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setAvailability(true);
        book0.setName("hi!");
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        visitor17.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        book0.setName("");
        java.lang.String str13 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        java.lang.Class<?> wildcardClass30 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setPassword("hi!");
        java.lang.String str5 = nonFacultyStaff0.getEmail();
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        java.lang.String str21 = report1.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        java.lang.String str46 = student39.getType();
        student39.setType("hi!");
        manager0.setClient((ClientClass.Client) student39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager12 = new ManagementTeam.Manager();
        ManagementTeam.Report report13 = new ManagementTeam.Report();
        ClientClass.Client client14 = new ClientClass.Client();
        client14.setID("");
        java.lang.String str17 = report13.viewReport(client14);
        manager12.viewReport(report13);
        report13.setEmail("");
        manager11.viewReport(report13);
        ClientClass.Student student22 = new ClientClass.Student();
        student22.setPassword("hi!");
        student22.setPassword("");
        java.lang.String str27 = student22.getID();
        manager11.setClient((ClientClass.Client) student22);
        java.lang.String str29 = student22.getPassword();
        java.lang.String str30 = student22.getPassword();
        java.lang.String str31 = student22.getPassword();
        student22.setID("");
        student22.setType("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = manager0.verifyAccount((ClientClass.Client) student22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Faculty faculty42 = new ClientClass.Faculty();
        manager35.setClient((ClientClass.Client) faculty42);
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ManagementTeam.Report report51 = new ManagementTeam.Report();
        ManagementTeam.Report report52 = new ManagementTeam.Report();
        ClientClass.Client client53 = new ClientClass.Client();
        client53.setID("");
        java.lang.String str56 = report52.viewReport(client53);
        java.lang.String str57 = client53.getType();
        java.lang.String str58 = report51.viewReport(client53);
        manager44.viewReport(report51);
        manager35.viewReport(report51);
        ManagementTeam.Manager manager61 = new ManagementTeam.Manager();
        ManagementTeam.Report report62 = new ManagementTeam.Report();
        ClientClass.Client client63 = new ClientClass.Client();
        client63.setID("");
        java.lang.String str66 = report62.viewReport(client63);
        manager61.viewReport(report62);
        ClientClass.Visitor visitor68 = new ClientClass.Visitor();
        java.lang.String str69 = visitor68.getType();
        java.lang.String str70 = report62.viewReport((ClientClass.Client) visitor68);
        java.lang.String str71 = report62.getEmail();
        java.lang.String str72 = report62.getEmail();
        manager35.viewReport(report62);
        manager0.viewReport(report62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        java.lang.String str3 = report0.getEmail();
        ManagementTeam.Manager manager4 = new ManagementTeam.Manager();
        ManagementTeam.Report report5 = new ManagementTeam.Report();
        ClientClass.Client client6 = new ClientClass.Client();
        client6.setID("");
        java.lang.String str9 = report5.viewReport(client6);
        manager4.viewReport(report5);
        ClientClass.Visitor visitor11 = new ClientClass.Visitor();
        manager4.setClient((ClientClass.Client) visitor11);
        java.lang.String str13 = visitor11.getType();
        visitor11.setPassword("");
        java.lang.String str16 = report0.viewReport((ClientClass.Client) visitor11);
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ManagementTeam.Manager manager18 = new ManagementTeam.Manager();
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        ClientClass.Client client20 = new ClientClass.Client();
        client20.setID("");
        java.lang.String str23 = report19.viewReport(client20);
        manager18.viewReport(report19);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager18.setClient((ClientClass.Client) faculty25);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        java.lang.String str28 = visitor27.getType();
        visitor27.setType("hi!");
        manager18.setClient((ClientClass.Client) visitor27);
        ManagementTeam.Manager manager32 = new ManagementTeam.Manager();
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ClientClass.Client client34 = new ClientClass.Client();
        client34.setID("");
        java.lang.String str37 = report33.viewReport(client34);
        manager32.viewReport(report33);
        ClientClass.Visitor visitor39 = new ClientClass.Visitor();
        java.lang.String str40 = visitor39.getType();
        java.lang.String str41 = report33.viewReport((ClientClass.Client) visitor39);
        visitor39.setType("hi!");
        java.lang.String str44 = visitor39.getType();
        manager18.setClient((ClientClass.Client) visitor39);
        java.lang.String str46 = report17.viewReport((ClientClass.Client) visitor39);
        java.lang.String str47 = report0.viewReport((ClientClass.Client) visitor39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setId("");
        java.lang.String str9 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        java.lang.String str9 = book0.getName();
        book0.setName("hi!");
        java.lang.String str12 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Visitor visitor42 = new ClientClass.Visitor();
        java.lang.String str43 = visitor42.getType();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor42);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = report36.viewReport((ClientClass.Client) visitor52);
        manager0.viewReport(report36);
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Faculty faculty64 = new ClientClass.Faculty();
        manager57.setClient((ClientClass.Client) faculty64);
        ManagementTeam.Manager manager66 = new ManagementTeam.Manager();
        ManagementTeam.Report report67 = new ManagementTeam.Report();
        ClientClass.Client client68 = new ClientClass.Client();
        client68.setID("");
        java.lang.String str71 = report67.viewReport(client68);
        manager66.viewReport(report67);
        ManagementTeam.Report report73 = new ManagementTeam.Report();
        ManagementTeam.Report report74 = new ManagementTeam.Report();
        ClientClass.Client client75 = new ClientClass.Client();
        client75.setID("");
        java.lang.String str78 = report74.viewReport(client75);
        java.lang.String str79 = client75.getType();
        java.lang.String str80 = report73.viewReport(client75);
        manager66.viewReport(report73);
        manager57.viewReport(report73);
        ManagementTeam.Manager manager83 = new ManagementTeam.Manager();
        ManagementTeam.Report report84 = new ManagementTeam.Report();
        ClientClass.Client client85 = new ClientClass.Client();
        client85.setID("");
        java.lang.String str88 = report84.viewReport(client85);
        manager83.viewReport(report84);
        report84.setEmail("");
        report84.setEmail("hi!");
        java.lang.String str94 = report84.getEmail();
        java.lang.String str95 = report84.getEmail();
        manager57.viewReport(report84);
        java.lang.String str97 = report84.getEmail();
        manager0.viewReport(report84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "" + "'", str88.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!" + "'", str95.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "hi!" + "'", str97.equals("hi!"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        ClientClass.Student student0 = new ClientClass.Student();
        student0.setPassword("hi!");
        student0.setPassword("");
        student0.setID("");
        student0.setPassword("hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("");
        client1.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        boolean boolean11 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Report report29 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.viewReport(report29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ManagementTeam.Report.viewReport(ClientClass.Client)\" because \"report\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        java.lang.String str11 = visitor8.getPassword();
        visitor8.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("");
        java.lang.Class<?> wildcardClass18 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        ManagementTeam.Manager manager66 = new ManagementTeam.Manager();
        ManagementTeam.Report report67 = new ManagementTeam.Report();
        ClientClass.Client client68 = new ClientClass.Client();
        client68.setID("");
        java.lang.String str71 = report67.viewReport(client68);
        manager66.viewReport(report67);
        ClientClass.Faculty faculty73 = new ClientClass.Faculty();
        manager66.setClient((ClientClass.Client) faculty73);
        ClientClass.Faculty faculty75 = new ClientClass.Faculty();
        manager66.setClient((ClientClass.Client) faculty75);
        ManagementTeam.Report report77 = new ManagementTeam.Report();
        ManagementTeam.Report report78 = new ManagementTeam.Report();
        ClientClass.Client client79 = new ClientClass.Client();
        client79.setID("");
        java.lang.String str82 = report78.viewReport(client79);
        java.lang.String str83 = client79.getType();
        java.lang.String str84 = report77.viewReport(client79);
        manager66.setClient(client79);
        manager0.setClient(client79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "" + "'", str82.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        java.lang.String str34 = faculty27.getPassword();
        java.lang.String str35 = faculty27.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Report report11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.viewReport(report11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ManagementTeam.Report.viewReport(ClientClass.Client)\" because \"report\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getID();
        java.lang.Class<?> wildcardClass8 = client1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager11.setClient((ClientClass.Client) faculty18);
        faculty18.setType("hi!");
        manager0.setClient((ClientClass.Client) faculty18);
        java.lang.String str23 = faculty18.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.viewReport(report19);
        java.lang.Class<?> wildcardClass29 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        java.lang.String str10 = visitor7.getEmail();
        java.lang.String str11 = visitor7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getId();
        book0.setId("");
        book0.setName("");
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("");
        book0.setName("");
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Manager manager7 = new ManagementTeam.Manager();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        manager7.viewReport(report8);
        ClientClass.Visitor visitor14 = new ClientClass.Visitor();
        manager7.setClient((ClientClass.Client) visitor14);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        report17.setEmail("");
        manager7.viewReport(report17);
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        report26.setEmail("");
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        visitor29.setID("");
        java.lang.String str33 = visitor29.getPassword();
        java.lang.String str34 = report26.viewReport((ClientClass.Client) visitor29);
        manager7.setClient((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        java.lang.Class<?> wildcardClass37 = manager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        report22.setEmail("");
        report22.setEmail("hi!");
        ClientClass.Visitor visitor32 = new ClientClass.Visitor();
        java.lang.String str33 = visitor32.getType();
        visitor32.setID("");
        java.lang.String str36 = report22.viewReport((ClientClass.Client) visitor32);
        java.lang.String str37 = report0.viewReport((ClientClass.Client) visitor32);
        report0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        java.lang.String str30 = visitor26.getEmail();
        visitor26.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("");
        book0.setName("hi!");
        java.lang.String str7 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        report0.setEmail("");
        report0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ClientClass.Faculty faculty19 = new ClientClass.Faculty();
        faculty19.setID("");
        faculty19.setPassword("");
        manager0.setClient((ClientClass.Client) faculty19);
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        ClientClass.Client client27 = new ClientClass.Client();
        client27.setID("");
        java.lang.String str30 = report26.viewReport(client27);
        java.lang.String str31 = client27.getType();
        java.lang.String str32 = report25.viewReport(client27);
        java.lang.String str33 = client27.getType();
        client27.setType("hi!");
        client27.setID("hi!");
        boolean boolean38 = manager0.verifyAccount(client27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        java.lang.String str21 = visitor17.getType();
        java.lang.String str22 = visitor17.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        faculty9.setID("");
        java.lang.String str12 = faculty9.getEmail();
        java.lang.String str13 = faculty9.getID();
        java.lang.String str14 = faculty9.getType();
        manager0.setClient((ClientClass.Client) faculty9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str17 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        java.lang.String str11 = book0.getId();
        java.lang.String str12 = book0.getName();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        manager10.setClient((ClientClass.Client) visitor17);
        manager9.setClient((ClientClass.Client) visitor17);
        ManagementTeam.Manager manager20 = new ManagementTeam.Manager();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        manager20.viewReport(report21);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        java.lang.String str28 = visitor27.getType();
        java.lang.String str29 = report21.viewReport((ClientClass.Client) visitor27);
        manager9.viewReport(report21);
        report21.setEmail("hi!");
        java.lang.String str33 = report21.getEmail();
        java.lang.String str34 = report21.getEmail();
        manager0.viewReport(report21);
        ClientClass.Visitor visitor36 = new ClientClass.Visitor();
        java.lang.String str37 = visitor36.getType();
        visitor36.setID("");
        visitor36.setID("");
        manager0.setClient((ClientClass.Client) visitor36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("hi!");
        java.lang.String str4 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        book0.setId("hi!");
        boolean boolean13 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        ManagementTeam.Manager manager54 = new ManagementTeam.Manager();
        ManagementTeam.Report report55 = new ManagementTeam.Report();
        ClientClass.Client client56 = new ClientClass.Client();
        client56.setID("");
        java.lang.String str59 = report55.viewReport(client56);
        manager54.viewReport(report55);
        ClientClass.Faculty faculty61 = new ClientClass.Faculty();
        manager54.setClient((ClientClass.Client) faculty61);
        ClientClass.Faculty faculty63 = new ClientClass.Faculty();
        manager54.setClient((ClientClass.Client) faculty63);
        ClientClass.Faculty faculty65 = new ClientClass.Faculty();
        faculty65.setID("");
        java.lang.String str68 = faculty65.getEmail();
        java.lang.String str69 = faculty65.getID();
        manager54.setClient((ClientClass.Client) faculty65);
        java.lang.String str71 = faculty65.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = manager0.verifyAccount((ClientClass.Client) faculty65);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setPassword("");
        java.lang.String str5 = faculty0.getType();
        java.lang.String str6 = faculty0.getPassword();
        java.lang.String str7 = faculty0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        boolean boolean6 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        visitor7.setEmail("hi!");
        java.lang.String str14 = visitor7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        visitor30.setType("");
        java.lang.String str37 = visitor30.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getID();
        java.lang.String str5 = faculty0.getType();
        faculty0.setID("");
        java.lang.Class<?> wildcardClass8 = faculty0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        java.lang.String str12 = faculty7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.Class<?> wildcardClass1 = nonFacultyStaff0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty16);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty18);
        manager0.setClient((ClientClass.Client) faculty18);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        ClientClass.Visitor visitor28 = new ClientClass.Visitor();
        java.lang.String str29 = visitor28.getType();
        java.lang.String str30 = report22.viewReport((ClientClass.Client) visitor28);
        java.lang.String str31 = report22.getEmail();
        ClientClass.Client client32 = null;
        java.lang.String str33 = report22.viewReport(client32);
        manager0.viewReport(report22);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager36 = new ManagementTeam.Manager();
        ManagementTeam.Report report37 = new ManagementTeam.Report();
        ClientClass.Client client38 = new ClientClass.Client();
        client38.setID("");
        java.lang.String str41 = report37.viewReport(client38);
        manager36.viewReport(report37);
        report37.setEmail("");
        manager35.viewReport(report37);
        ManagementTeam.Manager manager46 = new ManagementTeam.Manager();
        ManagementTeam.Report report47 = new ManagementTeam.Report();
        ClientClass.Client client48 = new ClientClass.Client();
        client48.setID("");
        java.lang.String str51 = report47.viewReport(client48);
        manager46.viewReport(report47);
        ClientClass.Faculty faculty53 = new ClientClass.Faculty();
        manager46.setClient((ClientClass.Client) faculty53);
        faculty53.setType("hi!");
        manager35.setClient((ClientClass.Client) faculty53);
        faculty53.setType("");
        java.lang.String str60 = faculty53.getPassword();
        manager0.setClient((ClientClass.Client) faculty53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        report34.setEmail("");
        report34.setEmail("hi!");
        manager0.viewReport(report34);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        faculty45.setPassword("");
        faculty45.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = manager0.verifyAccount((ClientClass.Client) faculty45);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getType();
        java.lang.String str29 = visitor24.getPassword();
        visitor24.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty16);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty18);
        manager0.setClient((ClientClass.Client) faculty18);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        ClientClass.Faculty faculty28 = new ClientClass.Faculty();
        manager21.setClient((ClientClass.Client) faculty28);
        ClientClass.Student student30 = new ClientClass.Student();
        student30.setPassword("hi!");
        student30.setPassword("");
        java.lang.String str35 = student30.getID();
        manager21.setClient((ClientClass.Client) student30);
        ManagementTeam.Manager manager37 = new ManagementTeam.Manager();
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        ClientClass.Client client39 = new ClientClass.Client();
        client39.setID("");
        java.lang.String str42 = report38.viewReport(client39);
        manager37.viewReport(report38);
        ClientClass.Faculty faculty44 = new ClientClass.Faculty();
        manager37.setClient((ClientClass.Client) faculty44);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        manager37.setClient((ClientClass.Client) faculty46);
        ClientClass.Faculty faculty48 = new ClientClass.Faculty();
        faculty48.setID("");
        java.lang.String str51 = faculty48.getEmail();
        java.lang.String str52 = faculty48.getID();
        manager37.setClient((ClientClass.Client) faculty48);
        manager21.setClient((ClientClass.Client) faculty48);
        ManagementTeam.Report report55 = new ManagementTeam.Report();
        ClientClass.Client client56 = new ClientClass.Client();
        client56.setID("");
        java.lang.String str59 = report55.viewReport(client56);
        java.lang.String str60 = report55.getEmail();
        report55.setEmail("");
        manager21.viewReport(report55);
        ManagementTeam.Report report64 = new ManagementTeam.Report();
        ClientClass.Client client65 = new ClientClass.Client();
        client65.setID("");
        java.lang.String str68 = report64.viewReport(client65);
        java.lang.String str69 = client65.getType();
        client65.setID("");
        manager21.setClient(client65);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = manager0.verifyAccount(client65);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("", "hi!", "", "hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        java.lang.String str12 = visitor7.getPassword();
        java.lang.String str13 = visitor7.getID();
        visitor7.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        java.lang.String str16 = book0.getName();
        java.lang.String str17 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        report31.setEmail("");
        report31.setEmail("hi!");
        java.lang.String str41 = report31.getEmail();
        java.lang.String str42 = report31.getEmail();
        manager0.viewReport(report31);
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        report44.setEmail("");
        java.lang.String str47 = report44.getEmail();
        ManagementTeam.Manager manager48 = new ManagementTeam.Manager();
        ManagementTeam.Report report49 = new ManagementTeam.Report();
        ClientClass.Client client50 = new ClientClass.Client();
        client50.setID("");
        java.lang.String str53 = report49.viewReport(client50);
        manager48.viewReport(report49);
        ClientClass.Visitor visitor55 = new ClientClass.Visitor();
        manager48.setClient((ClientClass.Client) visitor55);
        java.lang.String str57 = visitor55.getType();
        visitor55.setPassword("");
        java.lang.String str60 = report44.viewReport((ClientClass.Client) visitor55);
        java.lang.String str61 = visitor55.getType();
        manager0.setClient((ClientClass.Client) visitor55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "" + "'", str60.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        report34.setEmail("");
        report34.setEmail("hi!");
        manager0.viewReport(report34);
        ClientClass.Client client45 = null;
        java.lang.String str46 = report34.viewReport(client45);
        report34.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setName("");
        book0.setId("");
        book0.setName("");
        boolean boolean9 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setAvailability(true);
        java.lang.String str15 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        book0.setName("hi!");
        java.lang.String str13 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        java.lang.String str22 = report12.getEmail();
        report12.setEmail("hi!");
        java.lang.String str25 = report12.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        book0.setName("");
        java.lang.String str13 = book0.getId();
        java.lang.String str14 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Faculty faculty3 = new ClientClass.Faculty();
        faculty3.setID("");
        faculty3.setPassword("");
        java.lang.String str8 = faculty3.getType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = report0.viewReport((ClientClass.Client) faculty3);
        faculty3.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        java.lang.String str9 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        report22.setEmail("");
        report22.setEmail("hi!");
        ClientClass.Visitor visitor32 = new ClientClass.Visitor();
        java.lang.String str33 = visitor32.getType();
        visitor32.setID("");
        java.lang.String str36 = report22.viewReport((ClientClass.Client) visitor32);
        java.lang.String str37 = report0.viewReport((ClientClass.Client) visitor32);
        visitor32.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        java.lang.String str7 = book0.getName();
        boolean boolean8 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setEmail("hi!");
        client2.setType("hi!");
        client2.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        java.lang.String str9 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("");
        client1.setEmail("");
        java.lang.String str13 = client1.getPassword();
        client1.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setAvailability(false);
        java.lang.String str7 = book0.getName();
        boolean boolean8 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str9 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setPassword("");
        faculty0.setEmail("hi!");
        faculty0.setEmail("");
        faculty0.setEmail("hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str17 = book0.getId();
        boolean boolean18 = book0.getAvailability();
        java.lang.String str19 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setAvailability(true);
        book0.setName("hi!");
        java.lang.Class<?> wildcardClass17 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setEmail("hi!");
        faculty0.setType("hi!");
        java.lang.String str7 = faculty0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Report report6 = new ManagementTeam.Report();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        java.lang.String str12 = client8.getType();
        java.lang.String str13 = report6.viewReport(client8);
        report6.setEmail("hi!");
        manager0.viewReport(report6);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Faculty faculty24 = new ClientClass.Faculty();
        manager17.setClient((ClientClass.Client) faculty24);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = client35.getType();
        java.lang.String str40 = report33.viewReport(client35);
        manager26.viewReport(report33);
        manager17.viewReport(report33);
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        manager43.viewReport(report44);
        report44.setEmail("");
        report44.setEmail("hi!");
        java.lang.String str54 = report44.getEmail();
        java.lang.String str55 = report44.getEmail();
        manager17.viewReport(report44);
        manager0.viewReport(report44);
        java.lang.String str58 = report44.getEmail();
        report44.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        java.lang.String str5 = book0.getId();
        java.lang.String str6 = book0.getName();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getID();
        faculty0.setEmail("hi!");
        java.lang.String str7 = faculty0.getType();
        java.lang.String str8 = faculty0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = report34.getEmail();
        report34.setEmail("");
        manager0.viewReport(report34);
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        java.lang.String str48 = client44.getType();
        client44.setID("");
        manager0.setClient(client44);
        java.lang.String str52 = client44.getID();
        java.lang.String str53 = client44.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        java.lang.String str17 = client13.getType();
        java.lang.String str18 = report11.viewReport(client13);
        manager0.setClient(client13);
        client13.setEmail("hi!");
        java.lang.String str22 = client13.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("hi!", "hi!", "", "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str9 = book0.getId();
        book0.setId("");
        java.lang.String str12 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getType();
        visitor24.setEmail("hi!");
        java.lang.String str31 = visitor24.getEmail();
        visitor24.setEmail("hi!");
        java.lang.String str34 = visitor24.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("");
        book0.setName("hi!");
        book0.setId("hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        java.lang.Class<?> wildcardClass9 = client2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getEmail();
        client2.setType("");
        client2.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        manager10.setClient((ClientClass.Client) visitor17);
        manager9.setClient((ClientClass.Client) visitor17);
        ManagementTeam.Manager manager20 = new ManagementTeam.Manager();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        manager20.viewReport(report21);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        java.lang.String str28 = visitor27.getType();
        java.lang.String str29 = report21.viewReport((ClientClass.Client) visitor27);
        manager9.viewReport(report21);
        report21.setEmail("hi!");
        java.lang.String str33 = report21.getEmail();
        java.lang.String str34 = report21.getEmail();
        manager0.viewReport(report21);
        report21.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        java.lang.String str21 = visitor17.getType();
        java.lang.String str22 = visitor17.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        java.lang.String str18 = visitor17.getType();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor17);
        java.lang.String str20 = report1.viewReport((ClientClass.Client) visitor17);
        java.lang.String str21 = visitor17.getType();
        visitor17.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setAvailability(true);
        java.lang.String str9 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        boolean boolean4 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        report22.setEmail("");
        report22.setEmail("hi!");
        ClientClass.Visitor visitor32 = new ClientClass.Visitor();
        java.lang.String str33 = visitor32.getType();
        visitor32.setID("");
        java.lang.String str36 = report22.viewReport((ClientClass.Client) visitor32);
        java.lang.String str37 = report0.viewReport((ClientClass.Client) visitor32);
        java.lang.String str38 = visitor32.getPassword();
        java.lang.Class<?> wildcardClass39 = visitor32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        java.lang.String str14 = faculty11.getEmail();
        java.lang.String str15 = faculty11.getID();
        manager0.setClient((ClientClass.Client) faculty11);
        java.lang.String str17 = faculty11.getType();
        faculty11.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        visitor59.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        java.lang.String str10 = faculty7.getPassword();
        faculty7.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getId();
        book0.setId("");
        java.lang.String str12 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("hi!");
        boolean boolean5 = book0.getAvailability();
        java.lang.String str6 = book0.getName();
        book0.setAvailability(false);
        java.lang.String str9 = book0.getId();
        boolean boolean10 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        java.lang.String str24 = report12.getEmail();
        report12.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        book0.setAvailability(true);
        boolean boolean9 = book0.getAvailability();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        java.lang.String str11 = book0.getId();
        boolean boolean12 = book0.getAvailability();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        book0.setId("hi!");
        book0.setAvailability(true);
        java.lang.String str15 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        java.lang.String str11 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        java.lang.String str3 = report0.getEmail();
        ManagementTeam.Report report4 = new ManagementTeam.Report();
        ManagementTeam.Report report5 = new ManagementTeam.Report();
        ClientClass.Client client6 = new ClientClass.Client();
        client6.setID("");
        java.lang.String str9 = report5.viewReport(client6);
        java.lang.String str10 = client6.getType();
        java.lang.String str11 = report4.viewReport(client6);
        java.lang.String str12 = client6.getType();
        java.lang.String str13 = client6.getID();
        java.lang.String str14 = report0.viewReport(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        visitor7.setPassword("hi!");
        manager0.setClient((ClientClass.Client) visitor7);
        visitor7.setEmail("");
        visitor7.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        java.lang.String str6 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Payment.CreditStrategy creditStrategy4 = new Payment.CreditStrategy("hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass5 = creditStrategy4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setName("");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        visitor59.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getID();
        java.lang.String str5 = faculty0.getType();
        faculty0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        java.lang.String str66 = visitor59.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        java.lang.String str10 = book0.getName();
        java.lang.String str11 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        nonFacultyStaff0.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        visitor9.setPassword("hi!");
        visitor9.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setAvailability(false);
        book0.setAvailability(false);
        java.lang.String str13 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        java.lang.String str10 = visitor7.getType();
        java.lang.String str11 = visitor7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        java.lang.String str30 = client26.getType();
        java.lang.String str31 = report24.viewReport(client26);
        java.lang.String str32 = client26.getEmail();
        java.lang.String str33 = report12.viewReport(client26);
        report12.setEmail("");
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        java.lang.String str41 = report36.getEmail();
        report36.setEmail("");
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        manager44.setClient((ClientClass.Client) visitor51);
        java.lang.String str53 = visitor51.getType();
        visitor51.setPassword("");
        visitor51.setPassword("hi!");
        java.lang.String str58 = report36.viewReport((ClientClass.Client) visitor51);
        java.lang.String str59 = visitor51.getPassword();
        visitor51.setType("");
        java.lang.String str62 = report12.viewReport((ClientClass.Client) visitor51);
        java.lang.String str63 = visitor51.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getType();
        visitor24.setEmail("hi!");
        java.lang.String str31 = visitor24.getEmail();
        java.lang.String str32 = visitor24.getType();
        java.lang.String str33 = visitor24.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = client23.getType();
        java.lang.String str28 = report21.viewReport(client23);
        java.lang.String str29 = client23.getType();
        java.lang.String str30 = report0.viewReport(client23);
        client23.setPassword("");
        client23.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        java.lang.String str22 = client18.getType();
        java.lang.String str23 = report16.viewReport(client18);
        manager9.viewReport(report16);
        manager0.viewReport(report16);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ClientClass.Visitor visitor33 = new ClientClass.Visitor();
        java.lang.String str34 = visitor33.getType();
        java.lang.String str35 = report27.viewReport((ClientClass.Client) visitor33);
        java.lang.String str36 = report27.getEmail();
        java.lang.String str37 = report27.getEmail();
        manager0.viewReport(report27);
        java.lang.String str39 = report27.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        client2.setType("");
        java.lang.Class<?> wildcardClass11 = client2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Report report6 = new ManagementTeam.Report();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        java.lang.String str12 = client8.getType();
        java.lang.String str13 = report6.viewReport(client8);
        report6.setEmail("hi!");
        manager0.viewReport(report6);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Faculty faculty24 = new ClientClass.Faculty();
        manager17.setClient((ClientClass.Client) faculty24);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = client35.getType();
        java.lang.String str40 = report33.viewReport(client35);
        manager26.viewReport(report33);
        manager17.viewReport(report33);
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        manager43.viewReport(report44);
        report44.setEmail("");
        report44.setEmail("hi!");
        java.lang.String str54 = report44.getEmail();
        java.lang.String str55 = report44.getEmail();
        manager17.viewReport(report44);
        manager0.viewReport(report44);
        java.lang.String str58 = report44.getEmail();
        java.lang.String str59 = report44.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str18 = visitor16.getID();
        visitor16.setPassword("hi!");
        java.lang.String str21 = report0.viewReport((ClientClass.Client) visitor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getName();
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        report10.setEmail("hi!");
        java.lang.String str20 = report10.getEmail();
        manager0.viewReport(report10);
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = report22.getEmail();
        report22.setEmail("");
        manager0.viewReport(report22);
        ManagementTeam.Manager manager31 = new ManagementTeam.Manager();
        ManagementTeam.Report report32 = new ManagementTeam.Report();
        ClientClass.Client client33 = new ClientClass.Client();
        client33.setID("");
        java.lang.String str36 = report32.viewReport(client33);
        manager31.viewReport(report32);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        manager31.setClient((ClientClass.Client) faculty38);
        java.lang.String str40 = faculty38.getEmail();
        faculty38.setType("hi!");
        faculty38.setType("");
        faculty38.setType("hi!");
        manager0.setClient((ClientClass.Client) faculty38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str5 = book0.getId();
        boolean boolean6 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        book0.setId("hi!");
        java.lang.String str13 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setType("");
        java.lang.String str11 = client2.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        visitor9.setPassword("hi!");
        java.lang.String str16 = visitor9.getID();
        visitor9.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        boolean boolean7 = book0.getAvailability();
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ClientClass.Client client16 = new ClientClass.Client();
        client16.setID("");
        java.lang.String str19 = report15.viewReport(client16);
        manager14.viewReport(report15);
        ClientClass.Visitor visitor21 = new ClientClass.Visitor();
        java.lang.String str22 = visitor21.getType();
        java.lang.String str23 = report15.viewReport((ClientClass.Client) visitor21);
        visitor21.setType("hi!");
        java.lang.String str26 = visitor21.getType();
        manager0.setClient((ClientClass.Client) visitor21);
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ClientClass.Client client30 = new ClientClass.Client();
        client30.setID("");
        java.lang.String str33 = report29.viewReport(client30);
        client30.setID("");
        java.lang.String str36 = report28.viewReport(client30);
        manager0.viewReport(report28);
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager39 = new ManagementTeam.Manager();
        ManagementTeam.Report report40 = new ManagementTeam.Report();
        ClientClass.Client client41 = new ClientClass.Client();
        client41.setID("");
        java.lang.String str44 = report40.viewReport(client41);
        manager39.viewReport(report40);
        report40.setEmail("");
        manager38.viewReport(report40);
        ClientClass.Faculty faculty49 = new ClientClass.Faculty();
        faculty49.setID("");
        faculty49.setPassword("");
        java.lang.String str54 = report40.viewReport((ClientClass.Client) faculty49);
        manager0.viewReport(report40);
        java.lang.String str56 = report40.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = report0.getEmail();
        java.lang.String str6 = report0.getEmail();
        report0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        visitor7.setPassword("hi!");
        manager0.setClient((ClientClass.Client) visitor7);
        visitor7.setEmail("");
        visitor7.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setType("");
        faculty7.setType("hi!");
        faculty7.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Payment.DebitStrategy debitStrategy4 = new Payment.DebitStrategy("", "", "", "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ManagementTeam.Manager manager3 = new ManagementTeam.Manager();
        ManagementTeam.Report report4 = new ManagementTeam.Report();
        ClientClass.Client client5 = new ClientClass.Client();
        client5.setID("");
        java.lang.String str8 = report4.viewReport(client5);
        manager3.viewReport(report4);
        ClientClass.Visitor visitor10 = new ClientClass.Visitor();
        java.lang.String str11 = visitor10.getType();
        java.lang.String str12 = report4.viewReport((ClientClass.Client) visitor10);
        visitor10.setType("hi!");
        java.lang.String str15 = visitor10.getType();
        java.lang.String str16 = report0.viewReport((ClientClass.Client) visitor10);
        visitor10.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        java.lang.String str12 = book0.getName();
        book0.setName("");
        boolean boolean15 = book0.getAvailability();
        java.lang.String str16 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str7 = book0.getName();
        book0.setId("");
        java.lang.String str10 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.viewReport(report19);
        java.lang.String str29 = report19.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        visitor7.setPassword("hi!");
        manager0.setClient((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        visitor7.setType("");
        visitor7.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setType("hi!");
        java.lang.String str12 = visitor7.getType();
        java.lang.String str13 = visitor7.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("hi!");
        client1.setEmail("");
        java.lang.String str13 = client1.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str9 = book0.getId();
        book0.setId("hi!");
        boolean boolean12 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setName("hi!");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Report report6 = new ManagementTeam.Report();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        java.lang.String str12 = client8.getType();
        java.lang.String str13 = report6.viewReport(client8);
        report6.setEmail("hi!");
        manager0.viewReport(report6);
        report6.setEmail("hi!");
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager28 = new ManagementTeam.Manager();
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ClientClass.Client client30 = new ClientClass.Client();
        client30.setID("");
        java.lang.String str33 = report29.viewReport(client30);
        manager28.viewReport(report29);
        report29.setEmail("");
        manager19.viewReport(report29);
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        report38.setEmail("");
        ClientClass.Visitor visitor41 = new ClientClass.Visitor();
        java.lang.String str42 = visitor41.getType();
        visitor41.setID("");
        java.lang.String str45 = visitor41.getPassword();
        java.lang.String str46 = report38.viewReport((ClientClass.Client) visitor41);
        manager19.setClient((ClientClass.Client) visitor41);
        ManagementTeam.Manager manager48 = new ManagementTeam.Manager();
        ManagementTeam.Report report49 = new ManagementTeam.Report();
        ClientClass.Client client50 = new ClientClass.Client();
        client50.setID("");
        java.lang.String str53 = report49.viewReport(client50);
        manager48.viewReport(report49);
        ClientClass.Faculty faculty55 = new ClientClass.Faculty();
        manager48.setClient((ClientClass.Client) faculty55);
        ClientClass.Student student57 = new ClientClass.Student();
        student57.setPassword("hi!");
        student57.setPassword("");
        java.lang.String str62 = student57.getID();
        manager48.setClient((ClientClass.Client) student57);
        ClientClass.Faculty faculty64 = new ClientClass.Faculty();
        faculty64.setID("");
        java.lang.String str67 = faculty64.getEmail();
        java.lang.String str68 = faculty64.getID();
        java.lang.String str69 = faculty64.getPassword();
        manager48.setClient((ClientClass.Client) faculty64);
        ManagementTeam.Manager manager71 = new ManagementTeam.Manager();
        ManagementTeam.Report report72 = new ManagementTeam.Report();
        ClientClass.Client client73 = new ClientClass.Client();
        client73.setID("");
        java.lang.String str76 = report72.viewReport(client73);
        manager71.viewReport(report72);
        ClientClass.Visitor visitor78 = new ClientClass.Visitor();
        java.lang.String str79 = visitor78.getType();
        java.lang.String str80 = report72.viewReport((ClientClass.Client) visitor78);
        java.lang.String str81 = visitor78.getType();
        manager48.setClient((ClientClass.Client) visitor78);
        java.lang.String str83 = visitor78.getID();
        manager19.setClient((ClientClass.Client) visitor78);
        java.lang.String str85 = report6.viewReport((ClientClass.Client) visitor78);
        report6.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "" + "'", str85.equals(""));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        ClientClass.Client client0 = new ClientClass.Client();
        client0.setID("");
        client0.setPassword("");
        client0.setID("");
        java.lang.String str7 = client0.getPassword();
        java.lang.String str8 = client0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        java.lang.String str7 = report1.getEmail();
        ClientClass.Faculty faculty8 = new ClientClass.Faculty();
        faculty8.setID("");
        faculty8.setPassword("");
        java.lang.String str13 = report1.viewReport((ClientClass.Client) faculty8);
        faculty8.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        manager21.viewReport(report22);
        ClientClass.Faculty faculty28 = new ClientClass.Faculty();
        manager21.setClient((ClientClass.Client) faculty28);
        ClientClass.Student student30 = new ClientClass.Student();
        student30.setPassword("hi!");
        student30.setPassword("");
        java.lang.String str35 = student30.getID();
        manager21.setClient((ClientClass.Client) student30);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        faculty37.setID("");
        java.lang.String str40 = faculty37.getEmail();
        java.lang.String str41 = faculty37.getID();
        java.lang.String str42 = faculty37.getPassword();
        manager21.setClient((ClientClass.Client) faculty37);
        java.lang.String str44 = faculty37.getType();
        java.lang.String str45 = report0.viewReport((ClientClass.Client) faculty37);
        report0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setName("");
        book0.setId("");
        book0.setName("");
        book0.setName("hi!");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ClientClass.Client client16 = new ClientClass.Client();
        client16.setID("");
        java.lang.String str19 = report15.viewReport(client16);
        manager14.viewReport(report15);
        ClientClass.Visitor visitor21 = new ClientClass.Visitor();
        java.lang.String str22 = visitor21.getType();
        java.lang.String str23 = report15.viewReport((ClientClass.Client) visitor21);
        visitor21.setType("hi!");
        java.lang.String str26 = visitor21.getType();
        manager0.setClient((ClientClass.Client) visitor21);
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ClientClass.Client client30 = new ClientClass.Client();
        client30.setID("");
        java.lang.String str33 = report29.viewReport(client30);
        client30.setID("");
        java.lang.String str36 = report28.viewReport(client30);
        manager0.viewReport(report28);
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        manager38.viewReport(report39);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        manager38.setClient((ClientClass.Client) faculty45);
        ClientClass.Visitor visitor47 = new ClientClass.Visitor();
        java.lang.String str48 = visitor47.getType();
        visitor47.setType("hi!");
        manager38.setClient((ClientClass.Client) visitor47);
        ManagementTeam.Report report52 = new ManagementTeam.Report();
        ClientClass.Client client53 = new ClientClass.Client();
        client53.setID("");
        java.lang.String str56 = report52.viewReport(client53);
        java.lang.String str57 = report52.getEmail();
        report52.setEmail("");
        ManagementTeam.Manager manager60 = new ManagementTeam.Manager();
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        manager60.viewReport(report61);
        ClientClass.Visitor visitor67 = new ClientClass.Visitor();
        manager60.setClient((ClientClass.Client) visitor67);
        java.lang.String str69 = visitor67.getType();
        visitor67.setPassword("");
        visitor67.setPassword("hi!");
        java.lang.String str74 = report52.viewReport((ClientClass.Client) visitor67);
        java.lang.String str75 = visitor67.getPassword();
        visitor67.setType("");
        manager38.setClient((ClientClass.Client) visitor67);
        ManagementTeam.Manager manager79 = new ManagementTeam.Manager();
        ManagementTeam.Report report80 = new ManagementTeam.Report();
        ClientClass.Client client81 = new ClientClass.Client();
        client81.setID("");
        java.lang.String str84 = report80.viewReport(client81);
        manager79.viewReport(report80);
        ClientClass.Visitor visitor86 = new ClientClass.Visitor();
        manager79.setClient((ClientClass.Client) visitor86);
        java.lang.String str88 = visitor86.getType();
        visitor86.setPassword("");
        manager38.setClient((ClientClass.Client) visitor86);
        manager0.setClient((ClientClass.Client) visitor86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Report report6 = new ManagementTeam.Report();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        java.lang.String str12 = client8.getType();
        java.lang.String str13 = report6.viewReport(client8);
        report6.setEmail("hi!");
        manager0.viewReport(report6);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Faculty faculty24 = new ClientClass.Faculty();
        manager17.setClient((ClientClass.Client) faculty24);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = client35.getType();
        java.lang.String str40 = report33.viewReport(client35);
        manager26.viewReport(report33);
        manager17.viewReport(report33);
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        manager43.viewReport(report44);
        report44.setEmail("");
        report44.setEmail("hi!");
        java.lang.String str54 = report44.getEmail();
        java.lang.String str55 = report44.getEmail();
        manager17.viewReport(report44);
        manager0.viewReport(report44);
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        client59.setID("");
        java.lang.String str65 = client59.getID();
        java.lang.String str66 = client59.getEmail();
        manager0.setClient(client59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setId("");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getId();
        book0.setAvailability(true);
        java.lang.Class<?> wildcardClass11 = book0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ClientClass.Faculty faculty19 = new ClientClass.Faculty();
        faculty19.setID("");
        faculty19.setPassword("");
        manager0.setClient((ClientClass.Client) faculty19);
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        java.lang.String str30 = report25.getEmail();
        report25.setEmail("");
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        ClientClass.Visitor visitor40 = new ClientClass.Visitor();
        manager33.setClient((ClientClass.Client) visitor40);
        java.lang.String str42 = visitor40.getType();
        visitor40.setPassword("");
        visitor40.setPassword("hi!");
        java.lang.String str47 = report25.viewReport((ClientClass.Client) visitor40);
        manager0.viewReport(report25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        report10.setEmail("hi!");
        java.lang.String str20 = report10.getEmail();
        manager0.viewReport(report10);
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = report22.getEmail();
        report22.setEmail("");
        manager0.viewReport(report22);
        report22.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        visitor7.setType("hi!");
        java.lang.Class<?> wildcardClass14 = visitor7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Student student11 = new ClientClass.Student();
        student11.setPassword("hi!");
        student11.setPassword("");
        java.lang.String str16 = student11.getID();
        manager0.setClient((ClientClass.Client) student11);
        java.lang.String str18 = student11.getPassword();
        java.lang.String str19 = student11.getEmail();
        java.lang.String str20 = student11.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Faculty faculty3 = new ClientClass.Faculty();
        faculty3.setID("");
        faculty3.setPassword("");
        java.lang.String str8 = faculty3.getType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = report0.viewReport((ClientClass.Client) faculty3);
        java.lang.String str11 = report0.getEmail();
        java.lang.String str12 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        java.lang.String str10 = book0.getId();
        book0.setName("hi!");
        java.lang.String str13 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        faculty16.setPassword("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = manager0.verifyAccount((ClientClass.Client) faculty16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        report0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        visitor7.setPassword("hi!");
        manager0.setClient((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        java.lang.String str13 = visitor7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        java.lang.String str30 = client26.getType();
        java.lang.String str31 = report24.viewReport(client26);
        java.lang.String str32 = client26.getEmail();
        java.lang.String str33 = report12.viewReport(client26);
        client26.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        java.lang.String str30 = client26.getType();
        java.lang.String str31 = report24.viewReport(client26);
        java.lang.String str32 = client26.getEmail();
        java.lang.String str33 = report12.viewReport(client26);
        report12.setEmail("");
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        report36.setEmail("");
        java.lang.String str39 = report36.getEmail();
        ManagementTeam.Manager manager40 = new ManagementTeam.Manager();
        ManagementTeam.Report report41 = new ManagementTeam.Report();
        ClientClass.Client client42 = new ClientClass.Client();
        client42.setID("");
        java.lang.String str45 = report41.viewReport(client42);
        manager40.viewReport(report41);
        ClientClass.Visitor visitor47 = new ClientClass.Visitor();
        manager40.setClient((ClientClass.Client) visitor47);
        java.lang.String str49 = visitor47.getType();
        visitor47.setPassword("");
        java.lang.String str52 = report36.viewReport((ClientClass.Client) visitor47);
        java.lang.String str53 = report12.viewReport((ClientClass.Client) visitor47);
        java.lang.String str54 = visitor47.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        report10.setEmail("");
        java.lang.String str13 = report10.getEmail();
        manager9.viewReport(report10);
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ClientClass.Client client17 = new ClientClass.Client();
        client17.setID("");
        java.lang.String str20 = report16.viewReport(client17);
        java.lang.String str21 = client17.getType();
        java.lang.String str22 = report15.viewReport(client17);
        report15.setEmail("hi!");
        manager9.viewReport(report15);
        manager0.viewReport(report15);
        report15.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setAvailability(true);
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ClientClass.Client client16 = new ClientClass.Client();
        client16.setID("");
        java.lang.String str19 = report15.viewReport(client16);
        manager14.viewReport(report15);
        ClientClass.Visitor visitor21 = new ClientClass.Visitor();
        java.lang.String str22 = visitor21.getType();
        java.lang.String str23 = report15.viewReport((ClientClass.Client) visitor21);
        visitor21.setType("hi!");
        java.lang.String str26 = visitor21.getType();
        manager0.setClient((ClientClass.Client) visitor21);
        java.lang.Class<?> wildcardClass28 = visitor21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        report10.setEmail("hi!");
        java.lang.String str20 = report10.getEmail();
        manager0.viewReport(report10);
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = report22.getEmail();
        report22.setEmail("");
        manager0.viewReport(report22);
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        client31.setPassword("");
        client31.setEmail("");
        java.lang.String str38 = client31.getID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = manager0.verifyAccount(client31);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        ClientClass.Client client16 = null;
        java.lang.String str17 = report11.viewReport(client16);
        manager0.viewReport(report11);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        java.lang.String str28 = visitor22.getEmail();
        manager0.setClient((ClientClass.Client) visitor22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        java.lang.String str10 = visitor7.getEmail();
        visitor7.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setId("");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Student student11 = new ClientClass.Student();
        student11.setPassword("hi!");
        student11.setPassword("");
        java.lang.String str16 = student11.getID();
        manager0.setClient((ClientClass.Client) student11);
        java.lang.String str18 = student11.getPassword();
        java.lang.String str19 = student11.getPassword();
        java.lang.String str20 = student11.getPassword();
        student11.setID("");
        student11.setType("");
        java.lang.String str25 = student11.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        manager10.setClient((ClientClass.Client) visitor17);
        manager9.setClient((ClientClass.Client) visitor17);
        ManagementTeam.Manager manager20 = new ManagementTeam.Manager();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        manager20.viewReport(report21);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        java.lang.String str28 = visitor27.getType();
        java.lang.String str29 = report21.viewReport((ClientClass.Client) visitor27);
        manager9.viewReport(report21);
        report21.setEmail("hi!");
        java.lang.String str33 = report21.getEmail();
        java.lang.String str34 = report21.getEmail();
        manager0.viewReport(report21);
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        report36.setEmail("");
        ClientClass.Visitor visitor39 = new ClientClass.Visitor();
        java.lang.String str40 = visitor39.getType();
        visitor39.setID("");
        java.lang.String str43 = visitor39.getPassword();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor39);
        java.lang.String str45 = report36.getEmail();
        ClientClass.Client client46 = null;
        java.lang.String str47 = report36.viewReport(client46);
        manager0.viewReport(report36);
        ManagementTeam.Manager manager49 = new ManagementTeam.Manager();
        ManagementTeam.Report report50 = new ManagementTeam.Report();
        ClientClass.Client client51 = new ClientClass.Client();
        client51.setID("");
        java.lang.String str54 = report50.viewReport(client51);
        manager49.viewReport(report50);
        ClientClass.Faculty faculty56 = new ClientClass.Faculty();
        manager49.setClient((ClientClass.Client) faculty56);
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ManagementTeam.Report report59 = new ManagementTeam.Report();
        ClientClass.Client client60 = new ClientClass.Client();
        client60.setID("");
        java.lang.String str63 = report59.viewReport(client60);
        java.lang.String str64 = client60.getType();
        java.lang.String str65 = report58.viewReport(client60);
        java.lang.String str66 = client60.getType();
        manager49.setClient(client60);
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        report68.setEmail("");
        ClientClass.Visitor visitor71 = new ClientClass.Visitor();
        java.lang.String str72 = visitor71.getType();
        visitor71.setID("");
        java.lang.String str75 = visitor71.getPassword();
        java.lang.String str76 = report68.viewReport((ClientClass.Client) visitor71);
        manager49.viewReport(report68);
        manager0.viewReport(report68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getID();
        visitor7.setPassword("hi!");
        visitor7.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        java.lang.String str30 = visitor26.getEmail();
        java.lang.String str31 = visitor26.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        java.lang.String str54 = faculty46.getType();
        faculty46.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getEmail();
        client2.setType("");
        client2.setID("");
        java.lang.String str13 = client2.getType();
        java.lang.String str14 = client2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setType("hi!");
        java.lang.String str4 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setID("hi!");
        faculty7.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("");
        client1.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getEmail();
        client2.setType("");
        client2.setID("");
        java.lang.String str13 = client2.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        faculty9.setPassword("");
        java.lang.Class<?> wildcardClass13 = faculty9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        faculty11.setPassword("");
        java.lang.String str16 = report2.viewReport((ClientClass.Client) faculty11);
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        java.lang.String str23 = client19.getType();
        java.lang.String str24 = report17.viewReport(client19);
        java.lang.String str25 = client19.getType();
        client19.setType("hi!");
        client19.setEmail("hi!");
        java.lang.String str30 = report2.viewReport(client19);
        java.lang.String str31 = client19.getID();
        client19.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = report34.getEmail();
        report34.setEmail("");
        manager0.viewReport(report34);
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        java.lang.String str48 = client44.getType();
        client44.setID("");
        manager0.setClient(client44);
        ClientClass.Faculty faculty52 = new ClientClass.Faculty();
        faculty52.setID("");
        faculty52.setPassword("");
        faculty52.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = manager0.verifyAccount((ClientClass.Client) faculty52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        java.lang.String str24 = report12.getEmail();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        ClientClass.Client client27 = new ClientClass.Client();
        client27.setID("");
        java.lang.String str30 = report26.viewReport(client27);
        java.lang.String str31 = client27.getType();
        java.lang.String str32 = report25.viewReport(client27);
        java.lang.String str33 = client27.getEmail();
        java.lang.String str34 = report12.viewReport(client27);
        client27.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str7 = book0.getName();
        book0.setId("");
        book0.setAvailability(true);
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        java.lang.String str7 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = report0.getEmail();
        report0.setEmail("");
        ManagementTeam.Manager manager8 = new ManagementTeam.Manager();
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ClientClass.Client client10 = new ClientClass.Client();
        client10.setID("");
        java.lang.String str13 = report9.viewReport(client10);
        manager8.viewReport(report9);
        ClientClass.Visitor visitor15 = new ClientClass.Visitor();
        manager8.setClient((ClientClass.Client) visitor15);
        java.lang.String str17 = visitor15.getType();
        visitor15.setPassword("");
        visitor15.setPassword("hi!");
        java.lang.String str22 = report0.viewReport((ClientClass.Client) visitor15);
        java.lang.String str23 = visitor15.getPassword();
        visitor15.setID("");
        java.lang.String str26 = visitor15.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getType();
        visitor24.setEmail("hi!");
        java.lang.String str31 = visitor24.getEmail();
        java.lang.String str32 = visitor24.getType();
        visitor24.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty16);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager9.setClient((ClientClass.Client) faculty18);
        manager0.setClient((ClientClass.Client) faculty18);
        java.lang.String str21 = faculty18.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        visitor3.setPassword("hi!");
        java.lang.String str11 = visitor3.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setName("hi!");
        java.lang.String str11 = book0.getName();
        book0.setAvailability(true);
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Faculty faculty8 = new ClientClass.Faculty();
        manager1.setClient((ClientClass.Client) faculty8);
        ClientClass.Visitor visitor10 = new ClientClass.Visitor();
        java.lang.String str11 = visitor10.getType();
        visitor10.setType("hi!");
        manager1.setClient((ClientClass.Client) visitor10);
        ManagementTeam.Manager manager15 = new ManagementTeam.Manager();
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ClientClass.Client client17 = new ClientClass.Client();
        client17.setID("");
        java.lang.String str20 = report16.viewReport(client17);
        manager15.viewReport(report16);
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        java.lang.String str24 = report16.viewReport((ClientClass.Client) visitor22);
        visitor22.setType("hi!");
        java.lang.String str27 = visitor22.getType();
        manager1.setClient((ClientClass.Client) visitor22);
        java.lang.String str29 = report0.viewReport((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        report31.setEmail("");
        report31.setEmail("hi!");
        ClientClass.Visitor visitor41 = new ClientClass.Visitor();
        java.lang.String str42 = visitor41.getType();
        visitor41.setID("");
        java.lang.String str45 = report31.viewReport((ClientClass.Client) visitor41);
        visitor41.setPassword("hi!");
        visitor41.setID("hi!");
        java.lang.String str50 = report0.viewReport((ClientClass.Client) visitor41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getName();
        java.lang.String str11 = book0.getId();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ClientClass.Client client17 = new ClientClass.Client();
        client17.setID("");
        java.lang.String str20 = report16.viewReport(client17);
        client17.setID("");
        client17.setType("");
        client17.setEmail("");
        java.lang.String str27 = client17.getID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = manager0.verifyAccount(client17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        java.lang.String str9 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str14 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        nonFacultyStaff0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        java.lang.String str12 = visitor7.getPassword();
        java.lang.String str13 = visitor7.getID();
        java.lang.String str14 = visitor7.getID();
        visitor7.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        report12.setEmail("");
        report12.setEmail("hi!");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = report12.viewReport((ClientClass.Client) visitor22);
        java.lang.String str27 = visitor22.getID();
        java.lang.String str28 = visitor22.getType();
        manager0.setClient((ClientClass.Client) visitor22);
        visitor22.setEmail("");
        visitor22.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        faculty46.setEmail("");
        java.lang.String str56 = faculty46.getEmail();
        faculty46.setID("hi!");
        java.lang.String str59 = faculty46.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Manager manager7 = new ManagementTeam.Manager();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        manager7.viewReport(report8);
        ClientClass.Visitor visitor14 = new ClientClass.Visitor();
        manager7.setClient((ClientClass.Client) visitor14);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        report17.setEmail("");
        manager7.viewReport(report17);
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        report26.setEmail("");
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        visitor29.setID("");
        java.lang.String str33 = visitor29.getPassword();
        java.lang.String str34 = report26.viewReport((ClientClass.Client) visitor29);
        manager7.setClient((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        visitor29.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        java.lang.String str16 = report11.getEmail();
        manager0.viewReport(report11);
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        java.lang.String str23 = client19.getType();
        manager0.setClient(client19);
        client19.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getId();
        boolean boolean8 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        java.lang.String str10 = report1.getEmail();
        java.lang.String str11 = report1.getEmail();
        java.lang.String str12 = report1.getEmail();
        report1.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        java.lang.String str34 = faculty27.getEmail();
        java.lang.String str35 = faculty27.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        ManagementTeam.Report report66 = new ManagementTeam.Report();
        ClientClass.Client client67 = new ClientClass.Client();
        client67.setID("");
        java.lang.String str70 = report66.viewReport(client67);
        java.lang.String str71 = client67.getType();
        client67.setID("");
        manager0.setClient(client67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        visitor30.setType("");
        visitor30.setPassword("");
        visitor30.setPassword("hi!");
        java.lang.String str41 = visitor30.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        book0.setName("");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        java.lang.String str21 = report0.getEmail();
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Faculty faculty29 = new ClientClass.Faculty();
        manager22.setClient((ClientClass.Client) faculty29);
        ClientClass.Student student31 = new ClientClass.Student();
        student31.setPassword("hi!");
        student31.setPassword("");
        java.lang.String str36 = student31.getID();
        manager22.setClient((ClientClass.Client) student31);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        faculty38.setID("");
        java.lang.String str41 = faculty38.getEmail();
        java.lang.String str42 = faculty38.getID();
        java.lang.String str43 = faculty38.getPassword();
        manager22.setClient((ClientClass.Client) faculty38);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = visitor52.getType();
        manager22.setClient((ClientClass.Client) visitor52);
        java.lang.String str57 = visitor52.getID();
        java.lang.String str58 = report0.viewReport((ClientClass.Client) visitor52);
        java.lang.Class<?> wildcardClass59 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        visitor30.setType("");
        visitor30.setPassword("");
        visitor30.setPassword("hi!");
        java.lang.String str41 = visitor30.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        book0.setName("");
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        java.lang.String str21 = report0.getEmail();
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Faculty faculty29 = new ClientClass.Faculty();
        manager22.setClient((ClientClass.Client) faculty29);
        ClientClass.Student student31 = new ClientClass.Student();
        student31.setPassword("hi!");
        student31.setPassword("");
        java.lang.String str36 = student31.getID();
        manager22.setClient((ClientClass.Client) student31);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        faculty38.setID("");
        java.lang.String str41 = faculty38.getEmail();
        java.lang.String str42 = faculty38.getID();
        java.lang.String str43 = faculty38.getPassword();
        manager22.setClient((ClientClass.Client) faculty38);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = visitor52.getType();
        manager22.setClient((ClientClass.Client) visitor52);
        java.lang.String str57 = visitor52.getID();
        java.lang.String str58 = report0.viewReport((ClientClass.Client) visitor52);
        report0.setEmail("hi!");
        java.lang.String str61 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        faculty7.setType("hi!");
        faculty7.setType("");
        faculty7.setType("hi!");
        java.lang.String str16 = faculty7.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        report7.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        java.lang.String str7 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        ClientClass.Client client0 = new ClientClass.Client();
        client0.setID("");
        client0.setPassword("");
        client0.setID("");
        java.lang.String str7 = client0.getPassword();
        java.lang.String str8 = client0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Report report6 = new ManagementTeam.Report();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        java.lang.String str12 = client8.getType();
        java.lang.String str13 = report6.viewReport(client8);
        report6.setEmail("hi!");
        manager0.viewReport(report6);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Faculty faculty24 = new ClientClass.Faculty();
        manager17.setClient((ClientClass.Client) faculty24);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = client35.getType();
        java.lang.String str40 = report33.viewReport(client35);
        manager26.viewReport(report33);
        manager17.viewReport(report33);
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        manager43.viewReport(report44);
        report44.setEmail("");
        report44.setEmail("hi!");
        java.lang.String str54 = report44.getEmail();
        java.lang.String str55 = report44.getEmail();
        manager17.viewReport(report44);
        manager0.viewReport(report44);
        java.lang.String str58 = report44.getEmail();
        report44.setEmail("hi!");
        java.lang.String str61 = report44.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setPassword("hi!");
        java.lang.String str5 = nonFacultyStaff0.getPassword();
        java.lang.String str6 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        report31.setEmail("");
        report31.setEmail("hi!");
        java.lang.String str41 = report31.getEmail();
        java.lang.String str42 = report31.getEmail();
        manager0.viewReport(report31);
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        manager44.setClient((ClientClass.Client) visitor51);
        ManagementTeam.Manager manager53 = new ManagementTeam.Manager();
        ManagementTeam.Report report54 = new ManagementTeam.Report();
        ClientClass.Client client55 = new ClientClass.Client();
        client55.setID("");
        java.lang.String str58 = report54.viewReport(client55);
        manager53.viewReport(report54);
        report54.setEmail("");
        manager44.viewReport(report54);
        ManagementTeam.Manager manager63 = new ManagementTeam.Manager();
        ManagementTeam.Report report64 = new ManagementTeam.Report();
        ClientClass.Client client65 = new ClientClass.Client();
        client65.setID("");
        java.lang.String str68 = report64.viewReport(client65);
        manager63.viewReport(report64);
        ClientClass.Visitor visitor70 = new ClientClass.Visitor();
        manager63.setClient((ClientClass.Client) visitor70);
        java.lang.String str72 = visitor70.getID();
        manager44.setClient((ClientClass.Client) visitor70);
        ManagementTeam.Manager manager74 = new ManagementTeam.Manager();
        ManagementTeam.Report report75 = new ManagementTeam.Report();
        ClientClass.Client client76 = new ClientClass.Client();
        client76.setID("");
        java.lang.String str79 = report75.viewReport(client76);
        manager74.viewReport(report75);
        report75.setEmail("");
        report75.setEmail("hi!");
        java.lang.String str85 = report75.getEmail();
        java.lang.String str86 = report75.getEmail();
        manager44.viewReport(report75);
        manager0.viewReport(report75);
        report75.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!" + "'", str86.equals("hi!"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ClientClass.Faculty faculty19 = new ClientClass.Faculty();
        faculty19.setID("");
        faculty19.setPassword("");
        manager0.setClient((ClientClass.Client) faculty19);
        java.lang.String str25 = faculty19.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setType("");
        java.lang.String str11 = client2.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        boolean boolean7 = book0.getAvailability();
        boolean boolean8 = book0.getAvailability();
        boolean boolean9 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Faculty faculty37 = new ClientClass.Faculty();
        manager30.setClient((ClientClass.Client) faculty37);
        ClientClass.Student student39 = new ClientClass.Student();
        student39.setPassword("hi!");
        student39.setPassword("");
        java.lang.String str44 = student39.getID();
        manager30.setClient((ClientClass.Client) student39);
        ClientClass.Faculty faculty46 = new ClientClass.Faculty();
        faculty46.setID("");
        java.lang.String str49 = faculty46.getEmail();
        java.lang.String str50 = faculty46.getID();
        java.lang.String str51 = faculty46.getPassword();
        manager30.setClient((ClientClass.Client) faculty46);
        manager0.setClient((ClientClass.Client) faculty46);
        faculty46.setEmail("");
        java.lang.String str56 = faculty46.getEmail();
        faculty46.setID("hi!");
        faculty46.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("");
        book0.setAvailability(true);
        java.lang.String str20 = book0.getName();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        manager16.setClient((ClientClass.Client) visitor24);
        ManagementTeam.Manager manager27 = new ManagementTeam.Manager();
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ClientClass.Client client29 = new ClientClass.Client();
        client29.setID("");
        java.lang.String str32 = report28.viewReport(client29);
        manager27.viewReport(report28);
        ClientClass.Visitor visitor34 = new ClientClass.Visitor();
        java.lang.String str35 = visitor34.getType();
        java.lang.String str36 = report28.viewReport((ClientClass.Client) visitor34);
        manager16.viewReport(report28);
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        manager38.viewReport(report39);
        ClientClass.Visitor visitor45 = new ClientClass.Visitor();
        java.lang.String str46 = visitor45.getType();
        java.lang.String str47 = report39.viewReport((ClientClass.Client) visitor45);
        manager16.setClient((ClientClass.Client) visitor45);
        ManagementTeam.Manager manager49 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager50 = new ManagementTeam.Manager();
        ManagementTeam.Report report51 = new ManagementTeam.Report();
        ClientClass.Client client52 = new ClientClass.Client();
        client52.setID("");
        java.lang.String str55 = report51.viewReport(client52);
        manager50.viewReport(report51);
        report51.setEmail("");
        manager49.viewReport(report51);
        ManagementTeam.Manager manager60 = new ManagementTeam.Manager();
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        manager60.viewReport(report61);
        ClientClass.Faculty faculty67 = new ClientClass.Faculty();
        manager60.setClient((ClientClass.Client) faculty67);
        faculty67.setType("hi!");
        manager49.setClient((ClientClass.Client) faculty67);
        manager16.setClient((ClientClass.Client) faculty67);
        java.lang.String str73 = faculty67.getPassword();
        java.lang.String str74 = faculty67.getEmail();
        manager0.setClient((ClientClass.Client) faculty67);
        java.lang.String str76 = faculty67.getPassword();
        faculty67.setID("hi!");
        faculty67.setEmail("hi!");
        java.lang.String str81 = faculty67.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        java.lang.String str11 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("hi!");
        boolean boolean5 = book0.getAvailability();
        java.lang.String str6 = book0.getName();
        book0.setAvailability(false);
        java.lang.String str9 = book0.getId();
        book0.setName("");
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        java.lang.String str21 = report0.getEmail();
        java.lang.String str22 = report0.getEmail();
        java.lang.String str23 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = report34.getEmail();
        report34.setEmail("");
        manager0.viewReport(report34);
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        java.lang.String str48 = client44.getType();
        client44.setID("");
        manager0.setClient(client44);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        report53.setEmail("");
        report53.setEmail("hi!");
        java.lang.String str63 = report53.getEmail();
        ClientClass.Client client64 = null;
        java.lang.String str65 = report53.viewReport(client64);
        manager0.viewReport(report53);
        ManagementTeam.Manager manager67 = new ManagementTeam.Manager();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        manager67.viewReport(report68);
        ClientClass.Visitor visitor74 = new ClientClass.Visitor();
        manager67.setClient((ClientClass.Client) visitor74);
        java.lang.String str76 = visitor74.getType();
        java.lang.String str77 = visitor74.getEmail();
        manager0.setClient((ClientClass.Client) visitor74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        client12.setID("");
        java.lang.String str18 = client12.getID();
        client12.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = manager0.verifyAccount(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        java.lang.String str15 = client11.getType();
        java.lang.String str16 = report9.viewReport(client11);
        java.lang.String str17 = client11.getType();
        manager0.setClient(client11);
        ClientClass.Faculty faculty19 = new ClientClass.Faculty();
        faculty19.setID("");
        faculty19.setPassword("");
        manager0.setClient((ClientClass.Client) faculty19);
        faculty19.setPassword("");
        faculty19.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        nonFacultyStaff0.setPassword("hi!");
        java.lang.String str5 = nonFacultyStaff0.getID();
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        nonFacultyStaff0.setType("");
        java.lang.String str9 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getID();
        java.lang.String str5 = faculty0.getType();
        faculty0.setID("");
        java.lang.String str8 = faculty0.getEmail();
        faculty0.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str17 = book0.getId();
        boolean boolean18 = book0.getAvailability();
        boolean boolean19 = book0.getAvailability();
        book0.setAvailability(false);
        boolean boolean22 = book0.getAvailability();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getID();
        java.lang.String str8 = client1.getEmail();
        java.lang.String str9 = client1.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = client1.getType();
        client1.setID("");
        client1.setPassword("hi!");
        java.lang.String str10 = client1.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setName("hi!");
        book0.setName("hi!");
        java.lang.String str13 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        report0.setEmail("hi!");
        report0.setEmail("hi!");
        report0.setEmail("");
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager15 = new ManagementTeam.Manager();
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ClientClass.Client client17 = new ClientClass.Client();
        client17.setID("");
        java.lang.String str20 = report16.viewReport(client17);
        manager15.viewReport(report16);
        report16.setEmail("");
        manager14.viewReport(report16);
        ClientClass.Student student25 = new ClientClass.Student();
        student25.setPassword("hi!");
        student25.setPassword("");
        java.lang.String str30 = student25.getID();
        manager14.setClient((ClientClass.Client) student25);
        java.lang.String str32 = student25.getPassword();
        java.lang.String str33 = student25.getPassword();
        java.lang.String str34 = student25.getPassword();
        student25.setID("");
        student25.setType("");
        java.lang.String str39 = report0.viewReport((ClientClass.Client) student25);
        ManagementTeam.Report report40 = new ManagementTeam.Report();
        ClientClass.Client client41 = new ClientClass.Client();
        client41.setID("");
        java.lang.String str44 = report40.viewReport(client41);
        client41.setID("");
        client41.setType("");
        client41.setEmail("");
        java.lang.String str51 = client41.getID();
        java.lang.String str52 = client41.getPassword();
        java.lang.String str53 = report0.viewReport(client41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setId("hi!");
        java.lang.String str3 = book0.getName();
        java.lang.String str4 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        faculty11.setPassword("");
        java.lang.String str16 = report2.viewReport((ClientClass.Client) faculty11);
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        java.lang.String str23 = client19.getType();
        java.lang.String str24 = report17.viewReport(client19);
        java.lang.String str25 = client19.getType();
        client19.setType("hi!");
        client19.setEmail("hi!");
        java.lang.String str30 = report2.viewReport(client19);
        report2.setEmail("hi!");
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        ClientClass.Faculty faculty40 = new ClientClass.Faculty();
        manager33.setClient((ClientClass.Client) faculty40);
        ClientClass.Faculty faculty42 = new ClientClass.Faculty();
        manager33.setClient((ClientClass.Client) faculty42);
        java.lang.String str44 = faculty42.getPassword();
        java.lang.String str45 = faculty42.getEmail();
        java.lang.String str46 = report2.viewReport((ClientClass.Client) faculty42);
        java.lang.String str47 = report2.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        java.lang.String str11 = book0.getId();
        java.lang.String str12 = book0.getName();
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getID();
        visitor7.setType("");
        visitor7.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getEmail();
        client2.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        boolean boolean10 = book0.getAvailability();
        boolean boolean11 = book0.getAvailability();
        java.lang.String str12 = book0.getName();
        java.lang.String str13 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        java.lang.String str14 = visitor9.getID();
        visitor9.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        book0.setName("hi!");
        book0.setName("hi!");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("hi!");
        boolean boolean5 = book0.getAvailability();
        boolean boolean6 = book0.getAvailability();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager12 = new ManagementTeam.Manager();
        ManagementTeam.Report report13 = new ManagementTeam.Report();
        ClientClass.Client client14 = new ClientClass.Client();
        client14.setID("");
        java.lang.String str17 = report13.viewReport(client14);
        manager12.viewReport(report13);
        ClientClass.Visitor visitor19 = new ClientClass.Visitor();
        manager12.setClient((ClientClass.Client) visitor19);
        manager11.setClient((ClientClass.Client) visitor19);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager11.viewReport(report23);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        ClientClass.Visitor visitor40 = new ClientClass.Visitor();
        java.lang.String str41 = visitor40.getType();
        java.lang.String str42 = report34.viewReport((ClientClass.Client) visitor40);
        manager11.setClient((ClientClass.Client) visitor40);
        manager0.setClient((ClientClass.Client) visitor40);
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        client46.setID("");
        client46.setType("");
        client46.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = manager0.verifyAccount(client46);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = report34.getEmail();
        report34.setEmail("");
        manager0.viewReport(report34);
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        java.lang.String str48 = client44.getType();
        client44.setID("");
        manager0.setClient(client44);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        report53.setEmail("");
        report53.setEmail("hi!");
        java.lang.String str63 = report53.getEmail();
        ClientClass.Client client64 = null;
        java.lang.String str65 = report53.viewReport(client64);
        manager0.viewReport(report53);
        ManagementTeam.Report report67 = new ManagementTeam.Report();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        client69.setID("");
        java.lang.String str75 = report67.viewReport(client69);
        manager0.viewReport(report67);
        ManagementTeam.Manager manager77 = new ManagementTeam.Manager();
        ManagementTeam.Report report78 = new ManagementTeam.Report();
        ClientClass.Client client79 = new ClientClass.Client();
        client79.setID("");
        java.lang.String str82 = report78.viewReport(client79);
        manager77.viewReport(report78);
        ClientClass.Faculty faculty84 = new ClientClass.Faculty();
        manager77.setClient((ClientClass.Client) faculty84);
        ClientClass.Faculty faculty86 = new ClientClass.Faculty();
        manager77.setClient((ClientClass.Client) faculty86);
        ClientClass.Faculty faculty88 = new ClientClass.Faculty();
        faculty88.setID("");
        java.lang.String str91 = faculty88.getEmail();
        java.lang.String str92 = faculty88.getID();
        manager77.setClient((ClientClass.Client) faculty88);
        java.lang.String str94 = faculty88.getType();
        java.lang.String str95 = report67.viewReport((ClientClass.Client) faculty88);
        java.lang.String str96 = report67.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "" + "'", str82.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str96);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        java.lang.String str3 = faculty0.getEmail();
        java.lang.String str4 = faculty0.getPassword();
        faculty0.setEmail("");
        faculty0.setEmail("");
        java.lang.String str9 = faculty0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        ManagementTeam.Manager manager24 = new ManagementTeam.Manager();
        ManagementTeam.Report report25 = new ManagementTeam.Report();
        ClientClass.Client client26 = new ClientClass.Client();
        client26.setID("");
        java.lang.String str29 = report25.viewReport(client26);
        manager24.viewReport(report25);
        ClientClass.Faculty faculty31 = new ClientClass.Faculty();
        manager24.setClient((ClientClass.Client) faculty31);
        ClientClass.Faculty faculty33 = new ClientClass.Faculty();
        manager24.setClient((ClientClass.Client) faculty33);
        ClientClass.Faculty faculty35 = new ClientClass.Faculty();
        faculty35.setID("");
        java.lang.String str38 = faculty35.getEmail();
        java.lang.String str39 = faculty35.getID();
        manager24.setClient((ClientClass.Client) faculty35);
        java.lang.String str41 = report12.viewReport((ClientClass.Client) faculty35);
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ClientClass.Client client43 = new ClientClass.Client();
        client43.setID("");
        java.lang.String str46 = report42.viewReport(client43);
        java.lang.String str47 = report42.getEmail();
        report42.setEmail("");
        ManagementTeam.Manager manager50 = new ManagementTeam.Manager();
        ManagementTeam.Report report51 = new ManagementTeam.Report();
        ClientClass.Client client52 = new ClientClass.Client();
        client52.setID("");
        java.lang.String str55 = report51.viewReport(client52);
        manager50.viewReport(report51);
        ClientClass.Visitor visitor57 = new ClientClass.Visitor();
        manager50.setClient((ClientClass.Client) visitor57);
        java.lang.String str59 = visitor57.getType();
        visitor57.setPassword("");
        visitor57.setPassword("hi!");
        java.lang.String str64 = report42.viewReport((ClientClass.Client) visitor57);
        visitor57.setID("");
        visitor57.setEmail("hi!");
        java.lang.String str69 = report12.viewReport((ClientClass.Client) visitor57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        java.lang.String str22 = client18.getType();
        java.lang.String str23 = report16.viewReport(client18);
        manager9.viewReport(report16);
        manager0.viewReport(report16);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        java.lang.String str27 = visitor26.getType();
        visitor26.setType("hi!");
        visitor26.setEmail("hi!");
        manager0.setClient((ClientClass.Client) visitor26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Report report14 = new ManagementTeam.Report();
        ClientClass.Client client15 = new ClientClass.Client();
        client15.setID("");
        java.lang.String str18 = report14.viewReport(client15);
        java.lang.String str19 = report14.getEmail();
        report14.setEmail("");
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        manager22.setClient((ClientClass.Client) visitor29);
        java.lang.String str31 = visitor29.getType();
        visitor29.setPassword("");
        visitor29.setPassword("hi!");
        java.lang.String str36 = report14.viewReport((ClientClass.Client) visitor29);
        java.lang.String str37 = visitor29.getPassword();
        visitor29.setType("");
        manager0.setClient((ClientClass.Client) visitor29);
        visitor29.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        visitor7.setType("hi!");
        java.lang.String str14 = visitor7.getPassword();
        java.lang.String str15 = visitor7.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Faculty faculty3 = new ClientClass.Faculty();
        faculty3.setID("");
        faculty3.setPassword("");
        java.lang.String str8 = faculty3.getType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = report0.viewReport((ClientClass.Client) faculty3);
        java.lang.String str11 = report0.getEmail();
        ManagementTeam.Manager manager12 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager13 = new ManagementTeam.Manager();
        ManagementTeam.Report report14 = new ManagementTeam.Report();
        ClientClass.Client client15 = new ClientClass.Client();
        client15.setID("");
        java.lang.String str18 = report14.viewReport(client15);
        manager13.viewReport(report14);
        report14.setEmail("");
        manager12.viewReport(report14);
        ClientClass.Student student23 = new ClientClass.Student();
        student23.setPassword("hi!");
        student23.setPassword("");
        java.lang.String str28 = student23.getID();
        manager12.setClient((ClientClass.Client) student23);
        java.lang.String str30 = student23.getPassword();
        java.lang.String str31 = student23.getEmail();
        java.lang.String str32 = report0.viewReport((ClientClass.Client) student23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        report1.setEmail("");
        java.lang.String str4 = report1.getEmail();
        manager0.viewReport(report1);
        ManagementTeam.Manager manager6 = new ManagementTeam.Manager();
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ClientClass.Client client8 = new ClientClass.Client();
        client8.setID("");
        java.lang.String str11 = report7.viewReport(client8);
        manager6.viewReport(report7);
        ClientClass.Faculty faculty13 = new ClientClass.Faculty();
        manager6.setClient((ClientClass.Client) faculty13);
        ClientClass.Faculty faculty15 = new ClientClass.Faculty();
        manager6.setClient((ClientClass.Client) faculty15);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        report18.setEmail("");
        report18.setEmail("hi!");
        ClientClass.Visitor visitor28 = new ClientClass.Visitor();
        java.lang.String str29 = visitor28.getType();
        visitor28.setID("");
        java.lang.String str32 = report18.viewReport((ClientClass.Client) visitor28);
        java.lang.String str33 = visitor28.getID();
        java.lang.String str34 = visitor28.getType();
        manager6.setClient((ClientClass.Client) visitor28);
        ManagementTeam.Manager manager36 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager37 = new ManagementTeam.Manager();
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        ClientClass.Client client39 = new ClientClass.Client();
        client39.setID("");
        java.lang.String str42 = report38.viewReport(client39);
        manager37.viewReport(report38);
        ClientClass.Visitor visitor44 = new ClientClass.Visitor();
        manager37.setClient((ClientClass.Client) visitor44);
        manager36.setClient((ClientClass.Client) visitor44);
        ManagementTeam.Manager manager47 = new ManagementTeam.Manager();
        ManagementTeam.Report report48 = new ManagementTeam.Report();
        ClientClass.Client client49 = new ClientClass.Client();
        client49.setID("");
        java.lang.String str52 = report48.viewReport(client49);
        manager47.viewReport(report48);
        ClientClass.Visitor visitor54 = new ClientClass.Visitor();
        java.lang.String str55 = visitor54.getType();
        java.lang.String str56 = report48.viewReport((ClientClass.Client) visitor54);
        manager36.viewReport(report48);
        report48.setEmail("hi!");
        java.lang.String str60 = report48.getEmail();
        java.lang.String str61 = report48.getEmail();
        java.lang.String str62 = report48.getEmail();
        java.lang.String str63 = report48.getEmail();
        java.lang.String str64 = report48.getEmail();
        manager6.viewReport(report48);
        manager0.viewReport(report48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        java.lang.String str22 = client18.getType();
        java.lang.String str23 = report16.viewReport(client18);
        manager9.viewReport(report16);
        manager0.viewReport(report16);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        report27.setEmail("");
        report27.setEmail("hi!");
        java.lang.String str37 = report27.getEmail();
        java.lang.String str38 = report27.getEmail();
        manager0.viewReport(report27);
        ManagementTeam.Manager manager40 = new ManagementTeam.Manager();
        ManagementTeam.Report report41 = new ManagementTeam.Report();
        report41.setEmail("");
        java.lang.String str44 = report41.getEmail();
        manager40.viewReport(report41);
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ManagementTeam.Report report47 = new ManagementTeam.Report();
        ClientClass.Client client48 = new ClientClass.Client();
        client48.setID("");
        java.lang.String str51 = report47.viewReport(client48);
        java.lang.String str52 = client48.getType();
        java.lang.String str53 = report46.viewReport(client48);
        report46.setEmail("hi!");
        manager40.viewReport(report46);
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Faculty faculty64 = new ClientClass.Faculty();
        manager57.setClient((ClientClass.Client) faculty64);
        ManagementTeam.Manager manager66 = new ManagementTeam.Manager();
        ManagementTeam.Report report67 = new ManagementTeam.Report();
        ClientClass.Client client68 = new ClientClass.Client();
        client68.setID("");
        java.lang.String str71 = report67.viewReport(client68);
        manager66.viewReport(report67);
        ManagementTeam.Report report73 = new ManagementTeam.Report();
        ManagementTeam.Report report74 = new ManagementTeam.Report();
        ClientClass.Client client75 = new ClientClass.Client();
        client75.setID("");
        java.lang.String str78 = report74.viewReport(client75);
        java.lang.String str79 = client75.getType();
        java.lang.String str80 = report73.viewReport(client75);
        manager66.viewReport(report73);
        manager57.viewReport(report73);
        ManagementTeam.Manager manager83 = new ManagementTeam.Manager();
        ManagementTeam.Report report84 = new ManagementTeam.Report();
        ClientClass.Client client85 = new ClientClass.Client();
        client85.setID("");
        java.lang.String str88 = report84.viewReport(client85);
        manager83.viewReport(report84);
        report84.setEmail("");
        report84.setEmail("hi!");
        java.lang.String str94 = report84.getEmail();
        java.lang.String str95 = report84.getEmail();
        manager57.viewReport(report84);
        manager40.viewReport(report84);
        manager0.viewReport(report84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "" + "'", str88.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!" + "'", str95.equals("hi!"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("");
        book0.setAvailability(true);
        java.lang.String str20 = book0.getName();
        java.lang.String str21 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        visitor7.setEmail("hi!");
        visitor7.setEmail("");
        java.lang.String str16 = visitor7.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        report12.setEmail("");
        report12.setEmail("hi!");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = report12.viewReport((ClientClass.Client) visitor22);
        java.lang.String str27 = visitor22.getID();
        java.lang.String str28 = visitor22.getType();
        manager0.setClient((ClientClass.Client) visitor22);
        visitor22.setEmail("");
        java.lang.String str32 = visitor22.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        ManagementTeam.Manager manager29 = new ManagementTeam.Manager();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        manager29.viewReport(report30);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager29.setClient((ClientClass.Client) faculty36);
        ClientClass.Student student38 = new ClientClass.Student();
        student38.setPassword("hi!");
        student38.setPassword("");
        java.lang.String str43 = student38.getID();
        manager29.setClient((ClientClass.Client) student38);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        faculty45.setID("");
        java.lang.String str48 = faculty45.getEmail();
        java.lang.String str49 = faculty45.getID();
        java.lang.String str50 = faculty45.getPassword();
        manager29.setClient((ClientClass.Client) faculty45);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        java.lang.String str62 = visitor59.getType();
        manager29.setClient((ClientClass.Client) visitor59);
        java.lang.String str64 = visitor59.getID();
        manager0.setClient((ClientClass.Client) visitor59);
        java.lang.String str66 = visitor59.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getEmail();
        java.lang.String str2 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        java.lang.String str16 = report11.getEmail();
        manager0.viewReport(report11);
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        java.lang.String str23 = client19.getType();
        manager0.setClient(client19);
        ClientClass.Client client25 = null;
        manager0.setClient(client25);
        ClientClass.NonFacultyStaff nonFacultyStaff27 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff27.setType("");
        nonFacultyStaff27.setPassword("hi!");
        java.lang.String str32 = nonFacultyStaff27.getEmail();
        manager0.setClient((ClientClass.Client) nonFacultyStaff27);
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        report34.setEmail("");
        ClientClass.Visitor visitor37 = new ClientClass.Visitor();
        java.lang.String str38 = visitor37.getType();
        visitor37.setID("");
        java.lang.String str41 = visitor37.getPassword();
        java.lang.String str42 = report34.viewReport((ClientClass.Client) visitor37);
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        manager44.setClient((ClientClass.Client) visitor51);
        manager43.setClient((ClientClass.Client) visitor51);
        java.lang.String str54 = visitor51.getPassword();
        java.lang.String str55 = report34.viewReport((ClientClass.Client) visitor51);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = manager0.verifyAccount((ClientClass.Client) visitor51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"String.substring(int, int)\" because the return value of \"ClientClass.Client.getID()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setEmail("");
        nonFacultyStaff0.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        ClientClass.Client client0 = new ClientClass.Client();
        client0.setID("");
        client0.setPassword("");
        client0.setEmail("");
        java.lang.String str7 = client0.getType();
        client0.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        java.lang.String str11 = book0.getId();
        java.lang.String str12 = book0.getName();
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        java.lang.String str11 = visitor8.getID();
        java.lang.String str12 = visitor8.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Report report7 = new ManagementTeam.Report();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        java.lang.String str13 = client9.getType();
        java.lang.String str14 = report7.viewReport(client9);
        manager0.viewReport(report7);
        java.lang.String str16 = report7.getEmail();
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        manager17.setClient((ClientClass.Client) visitor24);
        java.lang.String str26 = visitor24.getType();
        java.lang.String str27 = report7.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = client23.getType();
        java.lang.String str28 = report21.viewReport(client23);
        java.lang.String str29 = client23.getType();
        java.lang.String str30 = report0.viewReport(client23);
        java.lang.Class<?> wildcardClass31 = report0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        ClientClass.Client client10 = null;
        java.lang.String str11 = report0.viewReport(client10);
        java.lang.String str12 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ClientClass.Faculty faculty16 = new ClientClass.Faculty();
        faculty16.setID("");
        java.lang.String str19 = faculty16.getEmail();
        java.lang.String str20 = faculty16.getID();
        java.lang.String str21 = faculty16.getPassword();
        manager0.setClient((ClientClass.Client) faculty16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        java.lang.String str31 = visitor30.getType();
        java.lang.String str32 = report24.viewReport((ClientClass.Client) visitor30);
        java.lang.String str33 = visitor30.getType();
        manager0.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Visitor visitor42 = new ClientClass.Visitor();
        java.lang.String str43 = visitor42.getType();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor42);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = report36.viewReport((ClientClass.Client) visitor52);
        manager0.viewReport(report36);
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        report58.setEmail("");
        report58.setEmail("hi!");
        ClientClass.Visitor visitor68 = new ClientClass.Visitor();
        java.lang.String str69 = visitor68.getType();
        visitor68.setID("");
        java.lang.String str72 = report58.viewReport((ClientClass.Client) visitor68);
        java.lang.String str73 = visitor68.getID();
        java.lang.String str74 = visitor68.getType();
        manager0.setClient((ClientClass.Client) visitor68);
        java.lang.String str76 = visitor68.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Faculty faculty17 = new ClientClass.Faculty();
        manager10.setClient((ClientClass.Client) faculty17);
        ClientClass.Student student19 = new ClientClass.Student();
        student19.setPassword("hi!");
        student19.setPassword("");
        java.lang.String str24 = student19.getID();
        manager10.setClient((ClientClass.Client) student19);
        ClientClass.Faculty faculty26 = new ClientClass.Faculty();
        faculty26.setID("");
        java.lang.String str29 = faculty26.getEmail();
        java.lang.String str30 = faculty26.getID();
        java.lang.String str31 = faculty26.getPassword();
        manager10.setClient((ClientClass.Client) faculty26);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        ClientClass.Visitor visitor40 = new ClientClass.Visitor();
        java.lang.String str41 = visitor40.getType();
        java.lang.String str42 = report34.viewReport((ClientClass.Client) visitor40);
        java.lang.String str43 = visitor40.getType();
        manager10.setClient((ClientClass.Client) visitor40);
        visitor40.setEmail("hi!");
        java.lang.String str47 = report0.viewReport((ClientClass.Client) visitor40);
        ManagementTeam.Report report48 = new ManagementTeam.Report();
        report48.setEmail("");
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        java.lang.String str52 = visitor51.getType();
        visitor51.setID("");
        java.lang.String str55 = visitor51.getPassword();
        java.lang.String str56 = report48.viewReport((ClientClass.Client) visitor51);
        java.lang.String str57 = report48.getEmail();
        ManagementTeam.Manager manager58 = new ManagementTeam.Manager();
        ManagementTeam.Report report59 = new ManagementTeam.Report();
        ClientClass.Client client60 = new ClientClass.Client();
        client60.setID("");
        java.lang.String str63 = report59.viewReport(client60);
        manager58.viewReport(report59);
        ClientClass.Faculty faculty65 = new ClientClass.Faculty();
        manager58.setClient((ClientClass.Client) faculty65);
        ClientClass.Student student67 = new ClientClass.Student();
        student67.setPassword("hi!");
        student67.setPassword("");
        java.lang.String str72 = student67.getID();
        manager58.setClient((ClientClass.Client) student67);
        ClientClass.Faculty faculty74 = new ClientClass.Faculty();
        faculty74.setID("");
        java.lang.String str77 = faculty74.getEmail();
        java.lang.String str78 = faculty74.getID();
        java.lang.String str79 = faculty74.getPassword();
        manager58.setClient((ClientClass.Client) faculty74);
        ManagementTeam.Manager manager81 = new ManagementTeam.Manager();
        ManagementTeam.Report report82 = new ManagementTeam.Report();
        ClientClass.Client client83 = new ClientClass.Client();
        client83.setID("");
        java.lang.String str86 = report82.viewReport(client83);
        manager81.viewReport(report82);
        ClientClass.Visitor visitor88 = new ClientClass.Visitor();
        java.lang.String str89 = visitor88.getType();
        java.lang.String str90 = report82.viewReport((ClientClass.Client) visitor88);
        java.lang.String str91 = visitor88.getType();
        manager58.setClient((ClientClass.Client) visitor88);
        visitor88.setEmail("hi!");
        java.lang.String str95 = report48.viewReport((ClientClass.Client) visitor88);
        java.lang.String str96 = report0.viewReport((ClientClass.Client) visitor88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "" + "'", str96.equals(""));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getId();
        java.lang.String str10 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ClientClass.Student student11 = new ClientClass.Student();
        student11.setPassword("hi!");
        student11.setPassword("");
        java.lang.String str16 = student11.getID();
        manager0.setClient((ClientClass.Client) student11);
        java.lang.String str18 = student11.getPassword();
        student11.setID("");
        student11.setType("");
        java.lang.String str23 = student11.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        java.lang.String str9 = book0.getId();
        java.lang.String str10 = book0.getName();
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        ClientClass.Visitor visitor26 = new ClientClass.Visitor();
        manager19.setClient((ClientClass.Client) visitor26);
        java.lang.String str28 = visitor26.getID();
        manager0.setClient((ClientClass.Client) visitor26);
        java.lang.String str30 = visitor26.getEmail();
        visitor26.setType("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        client1.setType("");
        client1.setEmail("");
        java.lang.String str11 = client1.getID();
        java.lang.String str12 = client1.getPassword();
        client1.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        book0.setAvailability(false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        ClientClass.Visitor visitor0 = new ClientClass.Visitor();
        java.lang.String str1 = visitor0.getType();
        visitor0.setType("hi!");
        visitor0.setPassword("hi!");
        java.lang.String str6 = visitor0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getID();
        client1.setPassword("hi!");
        java.lang.Class<?> wildcardClass10 = client1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        report12.setEmail("hi!");
        java.lang.String str24 = report12.getEmail();
        java.lang.String str25 = report12.getEmail();
        ClientClass.NonFacultyStaff nonFacultyStaff26 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff26.setType("");
        nonFacultyStaff26.setPassword("hi!");
        java.lang.String str31 = nonFacultyStaff26.getID();
        java.lang.String str32 = nonFacultyStaff26.getPassword();
        nonFacultyStaff26.setType("");
        java.lang.String str35 = report12.viewReport((ClientClass.Client) nonFacultyStaff26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ManagementTeam.Manager manager7 = new ManagementTeam.Manager();
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ClientClass.Client client9 = new ClientClass.Client();
        client9.setID("");
        java.lang.String str12 = report8.viewReport(client9);
        manager7.viewReport(report8);
        ClientClass.Faculty faculty14 = new ClientClass.Faculty();
        manager7.setClient((ClientClass.Client) faculty14);
        java.lang.String str16 = faculty14.getEmail();
        faculty14.setType("hi!");
        faculty14.setType("");
        manager0.setClient((ClientClass.Client) faculty14);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        java.lang.String str35 = client31.getType();
        java.lang.String str36 = report29.viewReport(client31);
        manager22.viewReport(report29);
        java.lang.String str38 = report29.getEmail();
        ManagementTeam.Manager manager39 = new ManagementTeam.Manager();
        ManagementTeam.Report report40 = new ManagementTeam.Report();
        ClientClass.Client client41 = new ClientClass.Client();
        client41.setID("");
        java.lang.String str44 = report40.viewReport(client41);
        manager39.viewReport(report40);
        ClientClass.Visitor visitor46 = new ClientClass.Visitor();
        manager39.setClient((ClientClass.Client) visitor46);
        java.lang.String str48 = visitor46.getType();
        java.lang.String str49 = report29.viewReport((ClientClass.Client) visitor46);
        manager0.viewReport(report29);
        ManagementTeam.Manager manager51 = new ManagementTeam.Manager();
        ManagementTeam.Report report52 = new ManagementTeam.Report();
        ClientClass.Client client53 = new ClientClass.Client();
        client53.setID("");
        java.lang.String str56 = report52.viewReport(client53);
        manager51.viewReport(report52);
        ClientClass.Faculty faculty58 = new ClientClass.Faculty();
        manager51.setClient((ClientClass.Client) faculty58);
        faculty58.setType("hi!");
        java.lang.String str62 = report29.viewReport((ClientClass.Client) faculty58);
        faculty58.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        ClientClass.Client client5 = null;
        java.lang.String str6 = report0.viewReport(client5);
        report0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        book0.setAvailability(true);
        book0.setId("hi!");
        book0.setId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setPassword("");
        java.lang.String str5 = faculty0.getType();
        java.lang.String str6 = faculty0.getPassword();
        java.lang.String str7 = faculty0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        book0.setId("hi!");
        book0.setName("");
        book0.setId("hi!");
        book0.setAvailability(true);
        book0.setName("hi!");
        book0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Student student9 = new ClientClass.Student();
        student9.setPassword("hi!");
        student9.setPassword("");
        java.lang.String str14 = student9.getID();
        manager0.setClient((ClientClass.Client) student9);
        ManagementTeam.Manager manager16 = new ManagementTeam.Manager();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Faculty faculty25 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty25);
        ClientClass.Faculty faculty27 = new ClientClass.Faculty();
        faculty27.setID("");
        java.lang.String str30 = faculty27.getEmail();
        java.lang.String str31 = faculty27.getID();
        manager16.setClient((ClientClass.Client) faculty27);
        manager0.setClient((ClientClass.Client) faculty27);
        java.lang.String str34 = faculty27.getPassword();
        java.lang.String str35 = faculty27.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        java.lang.String str21 = report0.getEmail();
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Faculty faculty29 = new ClientClass.Faculty();
        manager22.setClient((ClientClass.Client) faculty29);
        ClientClass.Student student31 = new ClientClass.Student();
        student31.setPassword("hi!");
        student31.setPassword("");
        java.lang.String str36 = student31.getID();
        manager22.setClient((ClientClass.Client) student31);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        faculty38.setID("");
        java.lang.String str41 = faculty38.getEmail();
        java.lang.String str42 = faculty38.getID();
        java.lang.String str43 = faculty38.getPassword();
        manager22.setClient((ClientClass.Client) faculty38);
        ManagementTeam.Manager manager45 = new ManagementTeam.Manager();
        ManagementTeam.Report report46 = new ManagementTeam.Report();
        ClientClass.Client client47 = new ClientClass.Client();
        client47.setID("");
        java.lang.String str50 = report46.viewReport(client47);
        manager45.viewReport(report46);
        ClientClass.Visitor visitor52 = new ClientClass.Visitor();
        java.lang.String str53 = visitor52.getType();
        java.lang.String str54 = report46.viewReport((ClientClass.Client) visitor52);
        java.lang.String str55 = visitor52.getType();
        manager22.setClient((ClientClass.Client) visitor52);
        java.lang.String str57 = visitor52.getID();
        java.lang.String str58 = report0.viewReport((ClientClass.Client) visitor52);
        java.lang.String str59 = report0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager10 = new ManagementTeam.Manager();
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        manager10.viewReport(report11);
        ClientClass.Visitor visitor17 = new ClientClass.Visitor();
        manager10.setClient((ClientClass.Client) visitor17);
        manager9.setClient((ClientClass.Client) visitor17);
        java.lang.String str20 = visitor17.getPassword();
        java.lang.String str21 = report0.viewReport((ClientClass.Client) visitor17);
        visitor17.setEmail("");
        visitor17.setID("hi!");
        java.lang.String str26 = visitor17.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setEmail("");
        java.lang.String str6 = nonFacultyStaff0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        java.lang.String str22 = report12.getEmail();
        report12.setEmail("hi!");
        java.lang.Class<?> wildcardClass25 = report12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        java.lang.String str10 = faculty7.getEmail();
        java.lang.String str11 = faculty7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = client1.getType();
        client1.setID("");
        client1.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        ClientClass.Student student0 = new ClientClass.Student();
        student0.setPassword("hi!");
        student0.setEmail("");
        java.lang.String str5 = student0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getId();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setEmail("hi!");
        client2.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = client23.getType();
        java.lang.String str28 = report21.viewReport(client23);
        java.lang.String str29 = client23.getType();
        java.lang.String str30 = report0.viewReport(client23);
        java.lang.String str31 = client23.getID();
        java.lang.String str32 = client23.getType();
        java.lang.String str33 = client23.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        java.lang.String str22 = client18.getType();
        java.lang.String str23 = report16.viewReport(client18);
        manager9.viewReport(report16);
        manager0.viewReport(report16);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        ClientClass.Faculty faculty33 = new ClientClass.Faculty();
        manager26.setClient((ClientClass.Client) faculty33);
        ClientClass.Student student35 = new ClientClass.Student();
        student35.setPassword("hi!");
        student35.setPassword("");
        java.lang.String str40 = student35.getID();
        manager26.setClient((ClientClass.Client) student35);
        ManagementTeam.Manager manager42 = new ManagementTeam.Manager();
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        manager42.viewReport(report43);
        ClientClass.Faculty faculty49 = new ClientClass.Faculty();
        manager42.setClient((ClientClass.Client) faculty49);
        ClientClass.Faculty faculty51 = new ClientClass.Faculty();
        manager42.setClient((ClientClass.Client) faculty51);
        ClientClass.Faculty faculty53 = new ClientClass.Faculty();
        faculty53.setID("");
        java.lang.String str56 = faculty53.getEmail();
        java.lang.String str57 = faculty53.getID();
        manager42.setClient((ClientClass.Client) faculty53);
        manager26.setClient((ClientClass.Client) faculty53);
        ManagementTeam.Report report60 = new ManagementTeam.Report();
        ClientClass.Client client61 = new ClientClass.Client();
        client61.setID("");
        java.lang.String str64 = report60.viewReport(client61);
        java.lang.String str65 = report60.getEmail();
        report60.setEmail("");
        manager26.viewReport(report60);
        ManagementTeam.Report report69 = new ManagementTeam.Report();
        ClientClass.Client client70 = new ClientClass.Client();
        client70.setID("");
        java.lang.String str73 = report69.viewReport(client70);
        java.lang.String str74 = client70.getType();
        client70.setID("");
        manager26.setClient(client70);
        manager0.setClient(client70);
        ClientClass.Client client79 = null;
        manager0.setClient(client79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        java.lang.String str9 = visitor7.getType();
        visitor7.setPassword("");
        java.lang.String str12 = visitor7.getType();
        visitor7.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        ItemClass.Book book0 = new ItemClass.Book();
        boolean boolean1 = book0.getAvailability();
        java.lang.String str2 = book0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        report10.setEmail("hi!");
        java.lang.String str20 = report10.getEmail();
        manager0.viewReport(report10);
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        java.lang.String str27 = report22.getEmail();
        report22.setEmail("");
        manager0.viewReport(report22);
        ManagementTeam.Manager manager31 = new ManagementTeam.Manager();
        ManagementTeam.Report report32 = new ManagementTeam.Report();
        ClientClass.Client client33 = new ClientClass.Client();
        client33.setID("");
        java.lang.String str36 = report32.viewReport(client33);
        manager31.viewReport(report32);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        manager31.setClient((ClientClass.Client) faculty38);
        ManagementTeam.Manager manager40 = new ManagementTeam.Manager();
        ManagementTeam.Report report41 = new ManagementTeam.Report();
        ClientClass.Client client42 = new ClientClass.Client();
        client42.setID("");
        java.lang.String str45 = report41.viewReport(client42);
        manager40.viewReport(report41);
        ManagementTeam.Report report47 = new ManagementTeam.Report();
        ManagementTeam.Report report48 = new ManagementTeam.Report();
        ClientClass.Client client49 = new ClientClass.Client();
        client49.setID("");
        java.lang.String str52 = report48.viewReport(client49);
        java.lang.String str53 = client49.getType();
        java.lang.String str54 = report47.viewReport(client49);
        manager40.viewReport(report47);
        manager31.viewReport(report47);
        manager0.viewReport(report47);
        ManagementTeam.Manager manager58 = new ManagementTeam.Manager();
        ManagementTeam.Report report59 = new ManagementTeam.Report();
        ClientClass.Client client60 = new ClientClass.Client();
        client60.setID("");
        java.lang.String str63 = report59.viewReport(client60);
        manager58.viewReport(report59);
        ManagementTeam.Manager manager65 = new ManagementTeam.Manager();
        ManagementTeam.Report report66 = new ManagementTeam.Report();
        ClientClass.Client client67 = new ClientClass.Client();
        client67.setID("");
        java.lang.String str70 = report66.viewReport(client67);
        manager65.viewReport(report66);
        ClientClass.Visitor visitor72 = new ClientClass.Visitor();
        manager65.setClient((ClientClass.Client) visitor72);
        ManagementTeam.Manager manager74 = new ManagementTeam.Manager();
        ManagementTeam.Report report75 = new ManagementTeam.Report();
        ClientClass.Client client76 = new ClientClass.Client();
        client76.setID("");
        java.lang.String str79 = report75.viewReport(client76);
        manager74.viewReport(report75);
        report75.setEmail("");
        manager65.viewReport(report75);
        ManagementTeam.Report report84 = new ManagementTeam.Report();
        report84.setEmail("");
        ClientClass.Visitor visitor87 = new ClientClass.Visitor();
        java.lang.String str88 = visitor87.getType();
        visitor87.setID("");
        java.lang.String str91 = visitor87.getPassword();
        java.lang.String str92 = report84.viewReport((ClientClass.Client) visitor87);
        manager65.setClient((ClientClass.Client) visitor87);
        manager58.setClient((ClientClass.Client) visitor87);
        java.lang.String str95 = report47.viewReport((ClientClass.Client) visitor87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "" + "'", str95.equals(""));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        ManagementTeam.Manager manager14 = new ManagementTeam.Manager();
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ClientClass.Client client16 = new ClientClass.Client();
        client16.setID("");
        java.lang.String str19 = report15.viewReport(client16);
        manager14.viewReport(report15);
        ClientClass.Visitor visitor21 = new ClientClass.Visitor();
        java.lang.String str22 = visitor21.getType();
        java.lang.String str23 = report15.viewReport((ClientClass.Client) visitor21);
        visitor21.setType("hi!");
        java.lang.String str26 = visitor21.getType();
        manager0.setClient((ClientClass.Client) visitor21);
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        ClientClass.Client client30 = new ClientClass.Client();
        client30.setID("");
        java.lang.String str33 = report29.viewReport(client30);
        client30.setID("");
        java.lang.String str36 = report28.viewReport(client30);
        manager0.viewReport(report28);
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        java.lang.String str44 = client40.getType();
        java.lang.String str45 = report38.viewReport(client40);
        report38.setEmail("hi!");
        report38.setEmail("hi!");
        manager0.viewReport(report38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        ClientClass.Visitor visitor8 = new ClientClass.Visitor();
        manager1.setClient((ClientClass.Client) visitor8);
        manager0.setClient((ClientClass.Client) visitor8);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Visitor visitor18 = new ClientClass.Visitor();
        java.lang.String str19 = visitor18.getType();
        java.lang.String str20 = report12.viewReport((ClientClass.Client) visitor18);
        manager0.viewReport(report12);
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        java.lang.String str30 = visitor29.getType();
        java.lang.String str31 = report23.viewReport((ClientClass.Client) visitor29);
        manager0.setClient((ClientClass.Client) visitor29);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager34 = new ManagementTeam.Manager();
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        manager34.viewReport(report35);
        report35.setEmail("");
        manager33.viewReport(report35);
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Faculty faculty51 = new ClientClass.Faculty();
        manager44.setClient((ClientClass.Client) faculty51);
        faculty51.setType("hi!");
        manager33.setClient((ClientClass.Client) faculty51);
        manager0.setClient((ClientClass.Client) faculty51);
        java.lang.String str57 = faculty51.getPassword();
        faculty51.setID("hi!");
        java.lang.String str60 = faculty51.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setEmail("hi!");
        java.lang.String str12 = visitor7.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ManagementTeam.Report report16 = new ManagementTeam.Report();
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        java.lang.String str22 = client18.getType();
        java.lang.String str23 = report16.viewReport(client18);
        manager9.viewReport(report16);
        manager0.viewReport(report16);
        ManagementTeam.Manager manager26 = new ManagementTeam.Manager();
        ManagementTeam.Report report27 = new ManagementTeam.Report();
        ClientClass.Client client28 = new ClientClass.Client();
        client28.setID("");
        java.lang.String str31 = report27.viewReport(client28);
        manager26.viewReport(report27);
        report27.setEmail("");
        report27.setEmail("hi!");
        java.lang.String str37 = report27.getEmail();
        java.lang.String str38 = report27.getEmail();
        manager0.viewReport(report27);
        ManagementTeam.Report report40 = new ManagementTeam.Report();
        report40.setEmail("");
        java.lang.String str43 = report40.getEmail();
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        manager44.setClient((ClientClass.Client) visitor51);
        java.lang.String str53 = visitor51.getType();
        visitor51.setPassword("");
        java.lang.String str56 = report40.viewReport((ClientClass.Client) visitor51);
        manager0.viewReport(report40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        visitor16.setPassword("hi!");
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str20 = report0.viewReport((ClientClass.Client) visitor16);
        java.lang.String str21 = report0.getEmail();
        java.lang.String str22 = report0.getEmail();
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Faculty faculty30 = new ClientClass.Faculty();
        manager23.setClient((ClientClass.Client) faculty30);
        ClientClass.Student student32 = new ClientClass.Student();
        student32.setPassword("hi!");
        student32.setPassword("");
        java.lang.String str37 = student32.getID();
        manager23.setClient((ClientClass.Client) student32);
        ClientClass.Faculty faculty39 = new ClientClass.Faculty();
        faculty39.setID("");
        java.lang.String str42 = faculty39.getEmail();
        java.lang.String str43 = faculty39.getID();
        java.lang.String str44 = faculty39.getPassword();
        manager23.setClient((ClientClass.Client) faculty39);
        ManagementTeam.Manager manager46 = new ManagementTeam.Manager();
        ManagementTeam.Report report47 = new ManagementTeam.Report();
        ClientClass.Client client48 = new ClientClass.Client();
        client48.setID("");
        java.lang.String str51 = report47.viewReport(client48);
        manager46.viewReport(report47);
        ClientClass.Visitor visitor53 = new ClientClass.Visitor();
        java.lang.String str54 = visitor53.getType();
        java.lang.String str55 = report47.viewReport((ClientClass.Client) visitor53);
        java.lang.String str56 = visitor53.getType();
        manager23.setClient((ClientClass.Client) visitor53);
        visitor53.setEmail("hi!");
        visitor53.setID("");
        java.lang.String str62 = report0.viewReport((ClientClass.Client) visitor53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setID("");
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        nonFacultyStaff0.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        boolean boolean8 = book0.getAvailability();
        book0.setName("");
        java.lang.String str11 = book0.getName();
        book0.setId("");
        book0.setId("");
        book0.setName("hi!");
        book0.setName("");
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        boolean boolean10 = book0.getAvailability();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        visitor9.setPassword("hi!");
        visitor9.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Visitor visitor9 = new ClientClass.Visitor();
        java.lang.String str10 = visitor9.getType();
        visitor9.setType("hi!");
        manager0.setClient((ClientClass.Client) visitor9);
        visitor9.setPassword("hi!");
        visitor9.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        report10.setEmail("hi!");
        java.lang.String str20 = report10.getEmail();
        manager0.viewReport(report10);
        java.lang.String str22 = report10.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager1 = new ManagementTeam.Manager();
        ManagementTeam.Report report2 = new ManagementTeam.Report();
        ClientClass.Client client3 = new ClientClass.Client();
        client3.setID("");
        java.lang.String str6 = report2.viewReport(client3);
        manager1.viewReport(report2);
        report2.setEmail("");
        manager0.viewReport(report2);
        ManagementTeam.Manager manager11 = new ManagementTeam.Manager();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        manager11.viewReport(report12);
        ClientClass.Faculty faculty18 = new ClientClass.Faculty();
        manager11.setClient((ClientClass.Client) faculty18);
        faculty18.setType("hi!");
        manager0.setClient((ClientClass.Client) faculty18);
        faculty18.setType("");
        faculty18.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        faculty9.setID("");
        java.lang.String str12 = faculty9.getEmail();
        java.lang.String str13 = faculty9.getID();
        java.lang.String str14 = faculty9.getType();
        java.lang.String str15 = faculty9.getType();
        manager0.setClient((ClientClass.Client) faculty9);
        faculty9.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getID();
        client1.setPassword("hi!");
        java.lang.String str10 = client1.getID();
        java.lang.String str11 = client1.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ClientClass.Faculty faculty11 = new ClientClass.Faculty();
        faculty11.setID("");
        java.lang.String str14 = faculty11.getEmail();
        java.lang.String str15 = faculty11.getID();
        manager0.setClient((ClientClass.Client) faculty11);
        faculty11.setPassword("hi!");
        java.lang.String str19 = faculty11.getID();
        java.lang.String str20 = faculty11.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        java.lang.String str9 = faculty7.getEmail();
        java.lang.String str10 = faculty7.getEmail();
        java.lang.String str11 = faculty7.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Faculty faculty3 = new ClientClass.Faculty();
        faculty3.setID("");
        faculty3.setPassword("");
        java.lang.String str8 = faculty3.getType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = report0.viewReport((ClientClass.Client) faculty3);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ClientClass.Client client12 = new ClientClass.Client();
        client12.setID("");
        java.lang.String str15 = report11.viewReport(client12);
        client12.setID("");
        client12.setType("");
        client12.setEmail("");
        client12.setEmail("hi!");
        java.lang.String str24 = report0.viewReport(client12);
        client12.setID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty7);
        ClientClass.Faculty faculty9 = new ClientClass.Faculty();
        manager0.setClient((ClientClass.Client) faculty9);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        ManagementTeam.Report report12 = new ManagementTeam.Report();
        ClientClass.Client client13 = new ClientClass.Client();
        client13.setID("");
        java.lang.String str16 = report12.viewReport(client13);
        java.lang.String str17 = client13.getType();
        java.lang.String str18 = report11.viewReport(client13);
        manager0.setClient(client13);
        ClientClass.Student student20 = new ClientClass.Student();
        student20.setID("hi!");
        boolean boolean23 = manager0.verifyAccount((ClientClass.Client) student20);
        student20.setType("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Manager manager9 = new ManagementTeam.Manager();
        ManagementTeam.Report report10 = new ManagementTeam.Report();
        ClientClass.Client client11 = new ClientClass.Client();
        client11.setID("");
        java.lang.String str14 = report10.viewReport(client11);
        manager9.viewReport(report10);
        report10.setEmail("");
        manager0.viewReport(report10);
        ManagementTeam.Report report19 = new ManagementTeam.Report();
        report19.setEmail("");
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setID("");
        java.lang.String str26 = visitor22.getPassword();
        java.lang.String str27 = report19.viewReport((ClientClass.Client) visitor22);
        manager0.setClient((ClientClass.Client) visitor22);
        java.lang.String str29 = visitor22.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str29);
    }
}

