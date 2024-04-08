import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
        ManagementTeam.Report report76 = new ManagementTeam.Report();
        ClientClass.Client client77 = new ClientClass.Client();
        client77.setID("");
        java.lang.String str80 = report76.viewReport(client77);
        client77.setID("");
        java.lang.String str83 = client77.getID();
        client77.setPassword("hi!");
        manager0.setClient(client77);
        java.lang.String str87 = client77.getID();
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
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        report1.setEmail("");
        java.lang.String str15 = report1.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        java.lang.String str67 = report53.getEmail();
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
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setId("hi!");
        boolean boolean5 = book0.getAvailability();
        book0.setAvailability(true);
        java.lang.String str8 = book0.getName();
        book0.setName("hi!");
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        java.lang.String str15 = book0.getName();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        client62.setID("");
        client62.setType("");
        client62.setEmail("hi!");
        java.lang.String str72 = client62.getType();
        java.lang.String str73 = report44.viewReport(client62);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str7 = book0.getName();
        book0.setId("");
        java.lang.String str10 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        faculty19.setEmail("hi!");
        manager0.setClient((ClientClass.Client) faculty19);
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Faculty faculty3 = new ClientClass.Faculty();
        faculty3.setID("");
        faculty3.setPassword("");
        java.lang.String str8 = faculty3.getType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = report0.viewReport((ClientClass.Client) faculty3);
        faculty3.setID("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        client36.setID("");
        client36.setType("");
        client36.setEmail("");
        client36.setEmail("");
        client36.setPassword("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = manager0.verifyAccount(client36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        ManagementTeam.Report report22 = new ManagementTeam.Report();
        ClientClass.Client client23 = new ClientClass.Client();
        client23.setID("");
        java.lang.String str26 = report22.viewReport(client23);
        client23.setID("");
        java.lang.String str29 = client23.getID();
        client23.setPassword("hi!");
        client23.setEmail("hi!");
        java.lang.String str34 = report12.viewReport(client23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setId("hi!");
        book0.setId("");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        ClientClass.Student student0 = new ClientClass.Student();
        student0.setID("hi!");
        java.lang.String str3 = student0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        java.lang.String str66 = faculty64.getEmail();
        java.lang.String str67 = faculty64.getPassword();
        faculty64.setPassword("hi!");
        faculty64.setEmail("");
        java.lang.String str72 = report36.viewReport((ClientClass.Client) faculty64);
        report36.setEmail("hi!");
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
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("hi!");
        java.lang.String str4 = nonFacultyStaff0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        client2.setID("");
        java.lang.String str8 = report0.viewReport(client2);
        client2.setType("");
        client2.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        faculty27.setID("hi!");
        faculty27.setPassword("");
        faculty27.setID("");
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
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        ManagementTeam.Report report37 = new ManagementTeam.Report();
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        ClientClass.Client client39 = new ClientClass.Client();
        client39.setID("");
        java.lang.String str42 = report38.viewReport(client39);
        java.lang.String str43 = client39.getType();
        java.lang.String str44 = report37.viewReport(client39);
        java.lang.String str45 = client39.getType();
        java.lang.String str46 = client39.getID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = manager0.verifyAccount(client39);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("");
        java.lang.String str3 = book0.getId();
        boolean boolean4 = book0.getAvailability();
        book0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        java.lang.String str11 = visitor7.getEmail();
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
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setPassword("");
        java.lang.String str5 = faculty0.getType();
        java.lang.String str6 = faculty0.getPassword();
        java.lang.String str7 = faculty0.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        ManagementTeam.Manager manager36 = new ManagementTeam.Manager();
        ManagementTeam.Report report37 = new ManagementTeam.Report();
        ClientClass.Client client38 = new ClientClass.Client();
        client38.setID("");
        java.lang.String str41 = report37.viewReport(client38);
        manager36.viewReport(report37);
        ClientClass.Visitor visitor43 = new ClientClass.Visitor();
        manager36.setClient((ClientClass.Client) visitor43);
        manager35.setClient((ClientClass.Client) visitor43);
        ManagementTeam.Manager manager46 = new ManagementTeam.Manager();
        ManagementTeam.Report report47 = new ManagementTeam.Report();
        ClientClass.Client client48 = new ClientClass.Client();
        client48.setID("");
        java.lang.String str51 = report47.viewReport(client48);
        manager46.viewReport(report47);
        ClientClass.Visitor visitor53 = new ClientClass.Visitor();
        java.lang.String str54 = visitor53.getType();
        java.lang.String str55 = report47.viewReport((ClientClass.Client) visitor53);
        manager35.viewReport(report47);
        report47.setEmail("hi!");
        ManagementTeam.Report report59 = new ManagementTeam.Report();
        ManagementTeam.Report report60 = new ManagementTeam.Report();
        ClientClass.Client client61 = new ClientClass.Client();
        client61.setID("");
        java.lang.String str64 = report60.viewReport(client61);
        java.lang.String str65 = client61.getType();
        java.lang.String str66 = report59.viewReport(client61);
        java.lang.String str67 = client61.getEmail();
        java.lang.String str68 = report47.viewReport(client61);
        manager0.viewReport(report47);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "" + "'", str66.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        manager38.viewReport(report39);
        ClientClass.Faculty faculty45 = new ClientClass.Faculty();
        manager38.setClient((ClientClass.Client) faculty45);
        ClientClass.Faculty faculty47 = new ClientClass.Faculty();
        manager38.setClient((ClientClass.Client) faculty47);
        ManagementTeam.Manager manager49 = new ManagementTeam.Manager();
        ManagementTeam.Report report50 = new ManagementTeam.Report();
        ClientClass.Client client51 = new ClientClass.Client();
        client51.setID("");
        java.lang.String str54 = report50.viewReport(client51);
        manager49.viewReport(report50);
        report50.setEmail("");
        report50.setEmail("hi!");
        ClientClass.Visitor visitor60 = new ClientClass.Visitor();
        java.lang.String str61 = visitor60.getType();
        visitor60.setID("");
        java.lang.String str64 = report50.viewReport((ClientClass.Client) visitor60);
        java.lang.String str65 = visitor60.getID();
        java.lang.String str66 = visitor60.getType();
        manager38.setClient((ClientClass.Client) visitor60);
        visitor60.setEmail("");
        java.lang.String str70 = report0.viewReport((ClientClass.Client) visitor60);
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
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "" + "'", str54.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "" + "'", str70.equals(""));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("hi!");
        java.lang.String str9 = book0.getName();
        java.lang.String str10 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ManagementTeam.Report report64 = new ManagementTeam.Report();
        ManagementTeam.Report report65 = new ManagementTeam.Report();
        ClientClass.Client client66 = new ClientClass.Client();
        client66.setID("");
        java.lang.String str69 = report65.viewReport(client66);
        java.lang.String str70 = client66.getType();
        java.lang.String str71 = report64.viewReport(client66);
        manager57.viewReport(report64);
        java.lang.String str73 = report64.getEmail();
        ManagementTeam.Manager manager74 = new ManagementTeam.Manager();
        ManagementTeam.Report report75 = new ManagementTeam.Report();
        ClientClass.Client client76 = new ClientClass.Client();
        client76.setID("");
        java.lang.String str79 = report75.viewReport(client76);
        manager74.viewReport(report75);
        ClientClass.Visitor visitor81 = new ClientClass.Visitor();
        manager74.setClient((ClientClass.Client) visitor81);
        java.lang.String str83 = visitor81.getType();
        java.lang.String str84 = report64.viewReport((ClientClass.Client) visitor81);
        java.lang.String str85 = visitor81.getType();
        visitor81.setEmail("hi!");
        java.lang.String str88 = visitor81.getEmail();
        manager31.setClient((ClientClass.Client) visitor81);
        java.lang.String str90 = report2.viewReport((ClientClass.Client) visitor81);
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
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!" + "'", str88.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "" + "'", str90.equals(""));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        ClientClass.Faculty faculty29 = new ClientClass.Faculty();
        faculty29.setID("");
        java.lang.String str32 = faculty29.getEmail();
        java.lang.String str33 = faculty29.getID();
        faculty29.setEmail("hi!");
        java.lang.String str36 = faculty29.getType();
        manager0.setClient((ClientClass.Client) faculty29);
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
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        ManagementTeam.Manager manager56 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Visitor visitor64 = new ClientClass.Visitor();
        manager57.setClient((ClientClass.Client) visitor64);
        manager56.setClient((ClientClass.Client) visitor64);
        ManagementTeam.Manager manager67 = new ManagementTeam.Manager();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        manager67.viewReport(report68);
        ClientClass.Visitor visitor74 = new ClientClass.Visitor();
        java.lang.String str75 = visitor74.getType();
        java.lang.String str76 = report68.viewReport((ClientClass.Client) visitor74);
        manager56.viewReport(report68);
        manager0.viewReport(report68);
        java.lang.String str79 = report68.getEmail();
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
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.lang.Class<?> wildcardClass56 = report40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        client18.setID("");
        client18.setType("");
        client18.setEmail("");
        java.lang.String str28 = client18.getID();
        manager0.setClient(client18);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager31 = new ManagementTeam.Manager();
        ManagementTeam.Report report32 = new ManagementTeam.Report();
        ClientClass.Client client33 = new ClientClass.Client();
        client33.setID("");
        java.lang.String str36 = report32.viewReport(client33);
        manager31.viewReport(report32);
        ClientClass.Visitor visitor38 = new ClientClass.Visitor();
        manager31.setClient((ClientClass.Client) visitor38);
        manager30.setClient((ClientClass.Client) visitor38);
        ManagementTeam.Manager manager41 = new ManagementTeam.Manager();
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ClientClass.Client client43 = new ClientClass.Client();
        client43.setID("");
        java.lang.String str46 = report42.viewReport(client43);
        manager41.viewReport(report42);
        ClientClass.Visitor visitor48 = new ClientClass.Visitor();
        java.lang.String str49 = visitor48.getType();
        java.lang.String str50 = report42.viewReport((ClientClass.Client) visitor48);
        manager30.viewReport(report42);
        ManagementTeam.Manager manager52 = new ManagementTeam.Manager();
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        manager52.viewReport(report53);
        ClientClass.Visitor visitor59 = new ClientClass.Visitor();
        java.lang.String str60 = visitor59.getType();
        java.lang.String str61 = report53.viewReport((ClientClass.Client) visitor59);
        manager30.setClient((ClientClass.Client) visitor59);
        ManagementTeam.Manager manager63 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager64 = new ManagementTeam.Manager();
        ManagementTeam.Report report65 = new ManagementTeam.Report();
        ClientClass.Client client66 = new ClientClass.Client();
        client66.setID("");
        java.lang.String str69 = report65.viewReport(client66);
        manager64.viewReport(report65);
        report65.setEmail("");
        manager63.viewReport(report65);
        ManagementTeam.Manager manager74 = new ManagementTeam.Manager();
        ManagementTeam.Report report75 = new ManagementTeam.Report();
        ClientClass.Client client76 = new ClientClass.Client();
        client76.setID("");
        java.lang.String str79 = report75.viewReport(client76);
        manager74.viewReport(report75);
        ClientClass.Faculty faculty81 = new ClientClass.Faculty();
        manager74.setClient((ClientClass.Client) faculty81);
        faculty81.setType("hi!");
        manager63.setClient((ClientClass.Client) faculty81);
        manager30.setClient((ClientClass.Client) faculty81);
        java.lang.String str87 = faculty81.getPassword();
        java.lang.String str88 = faculty81.getEmail();
        java.lang.String str89 = faculty81.getPassword();
        faculty81.setPassword("hi!");
        manager0.setClient((ClientClass.Client) faculty81);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "" + "'", str61.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str89);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        faculty19.setID("hi!");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getId();
        java.lang.String str9 = book0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        client1.setID("");
        java.lang.String str7 = client1.getID();
        client1.setPassword("hi!");
        java.lang.String str10 = client1.getID();
        client1.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        ManagementTeam.Manager manager34 = new ManagementTeam.Manager();
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        manager34.viewReport(report35);
        ClientClass.Faculty faculty41 = new ClientClass.Faculty();
        manager34.setClient((ClientClass.Client) faculty41);
        ClientClass.Visitor visitor43 = new ClientClass.Visitor();
        java.lang.String str44 = visitor43.getType();
        visitor43.setType("hi!");
        manager34.setClient((ClientClass.Client) visitor43);
        visitor43.setPassword("hi!");
        visitor43.setType("");
        manager0.setClient((ClientClass.Client) visitor43);
        ManagementTeam.Manager manager53 = new ManagementTeam.Manager();
        ManagementTeam.Report report54 = new ManagementTeam.Report();
        ClientClass.Client client55 = new ClientClass.Client();
        client55.setID("");
        java.lang.String str58 = report54.viewReport(client55);
        manager53.viewReport(report54);
        ClientClass.Faculty faculty60 = new ClientClass.Faculty();
        manager53.setClient((ClientClass.Client) faculty60);
        ClientClass.Visitor visitor62 = new ClientClass.Visitor();
        java.lang.String str63 = visitor62.getType();
        visitor62.setType("hi!");
        manager53.setClient((ClientClass.Client) visitor62);
        java.lang.String str67 = visitor62.getID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = manager0.verifyAccount((ClientClass.Client) visitor62);
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        java.lang.String str20 = book0.getId();
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
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        java.lang.String str30 = visitor24.getType();
        java.lang.String str31 = visitor24.getID();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        ClientClass.NonFacultyStaff nonFacultyStaff26 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff26.setType("");
        nonFacultyStaff26.setPassword("hi!");
        java.lang.String str31 = report16.viewReport((ClientClass.Client) nonFacultyStaff26);
        java.lang.String str32 = report16.getEmail();
        java.lang.Class<?> wildcardClass33 = report16.getClass();
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
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        report1.setEmail("");
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
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        java.lang.String str26 = client22.getType();
        java.lang.String str27 = report20.viewReport(client22);
        manager9.setClient(client22);
        ClientClass.Faculty faculty29 = new ClientClass.Faculty();
        faculty29.setID("");
        java.lang.String str32 = faculty29.getEmail();
        java.lang.String str33 = faculty29.getID();
        faculty29.setEmail("hi!");
        java.lang.String str36 = faculty29.getID();
        manager9.setClient((ClientClass.Client) faculty29);
        java.lang.String str38 = report1.viewReport((ClientClass.Client) faculty29);
        java.lang.String str39 = faculty29.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        ManagementTeam.Manager manager27 = new ManagementTeam.Manager();
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ClientClass.Client client29 = new ClientClass.Client();
        client29.setID("");
        java.lang.String str32 = report28.viewReport(client29);
        manager27.viewReport(report28);
        ClientClass.Visitor visitor34 = new ClientClass.Visitor();
        java.lang.String str35 = visitor34.getType();
        java.lang.String str36 = report28.viewReport((ClientClass.Client) visitor34);
        ManagementTeam.Manager manager37 = new ManagementTeam.Manager();
        ManagementTeam.Report report38 = new ManagementTeam.Report();
        ClientClass.Client client39 = new ClientClass.Client();
        client39.setID("");
        java.lang.String str42 = report38.viewReport(client39);
        manager37.viewReport(report38);
        ClientClass.Visitor visitor44 = new ClientClass.Visitor();
        java.lang.String str45 = visitor44.getType();
        java.lang.String str46 = report38.viewReport((ClientClass.Client) visitor44);
        java.lang.String str47 = report28.viewReport((ClientClass.Client) visitor44);
        java.lang.String str48 = visitor44.getType();
        java.lang.String str49 = report12.viewReport((ClientClass.Client) visitor44);
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        ManagementTeam.Manager manager56 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager57 = new ManagementTeam.Manager();
        ManagementTeam.Report report58 = new ManagementTeam.Report();
        ClientClass.Client client59 = new ClientClass.Client();
        client59.setID("");
        java.lang.String str62 = report58.viewReport(client59);
        manager57.viewReport(report58);
        ClientClass.Visitor visitor64 = new ClientClass.Visitor();
        manager57.setClient((ClientClass.Client) visitor64);
        manager56.setClient((ClientClass.Client) visitor64);
        ManagementTeam.Manager manager67 = new ManagementTeam.Manager();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        manager67.viewReport(report68);
        ClientClass.Visitor visitor74 = new ClientClass.Visitor();
        java.lang.String str75 = visitor74.getType();
        java.lang.String str76 = report68.viewReport((ClientClass.Client) visitor74);
        manager56.viewReport(report68);
        manager0.viewReport(report68);
        ManagementTeam.Report report79 = new ManagementTeam.Report();
        ManagementTeam.Report report80 = new ManagementTeam.Report();
        ClientClass.Client client81 = new ClientClass.Client();
        client81.setID("");
        java.lang.String str84 = report80.viewReport(client81);
        java.lang.String str85 = client81.getType();
        java.lang.String str86 = report79.viewReport(client81);
        manager0.viewReport(report79);
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
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "" + "'", str86.equals(""));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        client15.setID("");
        client15.setType("");
        client15.setEmail("hi!");
        manager0.setClient(client15);
        client15.setType("");
        client15.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff0.setType("");
        java.lang.String str3 = nonFacultyStaff0.getID();
        nonFacultyStaff0.setEmail("");
        java.lang.String str6 = nonFacultyStaff0.getPassword();
        java.lang.String str7 = nonFacultyStaff0.getType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        ClientClass.NonFacultyStaff nonFacultyStaff0 = new ClientClass.NonFacultyStaff();
        java.lang.String str1 = nonFacultyStaff0.getType();
        nonFacultyStaff0.setEmail("hi!");
        nonFacultyStaff0.setEmail("hi!");
        nonFacultyStaff0.setPassword("");
        java.lang.String str8 = nonFacultyStaff0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        ManagementTeam.Manager manager41 = new ManagementTeam.Manager();
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ClientClass.Client client43 = new ClientClass.Client();
        client43.setID("");
        java.lang.String str46 = report42.viewReport(client43);
        manager41.viewReport(report42);
        ClientClass.Visitor visitor48 = new ClientClass.Visitor();
        manager41.setClient((ClientClass.Client) visitor48);
        java.lang.String str50 = visitor48.getType();
        visitor48.setPassword("");
        manager0.setClient((ClientClass.Client) visitor48);
        ClientClass.Faculty faculty54 = new ClientClass.Faculty();
        faculty54.setID("");
        faculty54.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = manager0.verifyAccount((ClientClass.Client) faculty54);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        ClientClass.Visitor visitor0 = new ClientClass.Visitor();
        java.lang.String str1 = visitor0.getType();
        visitor0.setType("hi!");
        visitor0.setEmail("hi!");
        visitor0.setPassword("hi!");
        java.lang.String str8 = visitor0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = manager0.verifyAccount((ClientClass.Client) faculty38);
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        ManagementTeam.Report report29 = new ManagementTeam.Report();
        manager0.viewReport(report29);
        ManagementTeam.Manager manager31 = new ManagementTeam.Manager();
        ManagementTeam.Report report32 = new ManagementTeam.Report();
        ClientClass.Client client33 = new ClientClass.Client();
        client33.setID("");
        java.lang.String str36 = report32.viewReport(client33);
        manager31.viewReport(report32);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        manager31.setClient((ClientClass.Client) faculty38);
        ClientClass.Faculty faculty40 = new ClientClass.Faculty();
        manager31.setClient((ClientClass.Client) faculty40);
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ClientClass.Client client44 = new ClientClass.Client();
        client44.setID("");
        java.lang.String str47 = report43.viewReport(client44);
        java.lang.String str48 = client44.getType();
        java.lang.String str49 = report42.viewReport(client44);
        manager31.setClient(client44);
        ClientClass.Faculty faculty51 = new ClientClass.Faculty();
        faculty51.setID("");
        java.lang.String str54 = faculty51.getEmail();
        java.lang.String str55 = faculty51.getID();
        faculty51.setEmail("hi!");
        java.lang.String str58 = faculty51.getID();
        manager31.setClient((ClientClass.Client) faculty51);
        manager0.setClient((ClientClass.Client) faculty51);
        java.lang.String str61 = faculty51.getEmail();
        faculty51.setPassword("hi!");
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
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        ManagementTeam.Manager manager34 = new ManagementTeam.Manager();
        ManagementTeam.Report report35 = new ManagementTeam.Report();
        ClientClass.Client client36 = new ClientClass.Client();
        client36.setID("");
        java.lang.String str39 = report35.viewReport(client36);
        manager34.viewReport(report35);
        ClientClass.Faculty faculty41 = new ClientClass.Faculty();
        manager34.setClient((ClientClass.Client) faculty41);
        ClientClass.Visitor visitor43 = new ClientClass.Visitor();
        java.lang.String str44 = visitor43.getType();
        visitor43.setType("hi!");
        manager34.setClient((ClientClass.Client) visitor43);
        visitor43.setPassword("hi!");
        visitor43.setType("");
        manager0.setClient((ClientClass.Client) visitor43);
        ManagementTeam.Report report53 = new ManagementTeam.Report();
        ClientClass.Client client54 = new ClientClass.Client();
        client54.setID("");
        java.lang.String str57 = report53.viewReport(client54);
        client54.setID("");
        client54.setType("");
        client54.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = manager0.verifyAccount(client54);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Range [0, 2) out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        client2.setEmail("hi!");
        client2.setType("");
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        report1.setEmail("");
        report1.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        client62.setID("");
        client62.setType("");
        client62.setEmail("hi!");
        java.lang.String str72 = client62.getType();
        java.lang.String str73 = report44.viewReport(client62);
        java.lang.String str74 = client62.getPassword();
        java.lang.String str75 = client62.getPassword();
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
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        report12.setEmail("");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        java.lang.String str8 = book0.getName();
        book0.setName("hi!");
        book0.setName("hi!");
        boolean boolean13 = book0.getAvailability();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        java.lang.String str4 = book0.getId();
        book0.setAvailability(true);
        java.lang.String str7 = book0.getName();
        boolean boolean8 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        java.lang.String str6 = client2.getType();
        java.lang.String str7 = report0.viewReport(client2);
        java.lang.String str8 = client2.getType();
        client2.setType("");
        client2.setEmail("hi!");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getName();
        boolean boolean7 = book0.getAvailability();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        client62.setID("");
        client62.setType("");
        client62.setEmail("hi!");
        java.lang.String str72 = client62.getType();
        java.lang.String str73 = report44.viewReport(client62);
        ManagementTeam.Report report74 = new ManagementTeam.Report();
        report74.setEmail("");
        ClientClass.Faculty faculty77 = new ClientClass.Faculty();
        faculty77.setID("");
        faculty77.setPassword("");
        java.lang.String str82 = faculty77.getType();
        java.lang.String str83 = faculty77.getID();
        java.lang.String str84 = report74.viewReport((ClientClass.Client) faculty77);
        faculty77.setID("");
        java.lang.String str87 = report44.viewReport((ClientClass.Client) faculty77);
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
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "" + "'", str65.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "" + "'", str73.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str83 + "' != '" + "" + "'", str83.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        report0.setEmail("");
        ClientClass.Visitor visitor3 = new ClientClass.Visitor();
        java.lang.String str4 = visitor3.getType();
        visitor3.setID("");
        java.lang.String str7 = visitor3.getPassword();
        java.lang.String str8 = report0.viewReport((ClientClass.Client) visitor3);
        java.lang.String str9 = report0.getEmail();
        report0.setEmail("");
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
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(false);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        book0.setId("");
        java.lang.String str7 = book0.getId();
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        client15.setID("");
        client15.setType("");
        client15.setEmail("hi!");
        manager0.setClient(client15);
        client15.setType("");
        java.lang.String str28 = client15.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager20 = new ManagementTeam.Manager();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        manager20.viewReport(report21);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        manager20.setClient((ClientClass.Client) visitor27);
        manager19.setClient((ClientClass.Client) visitor27);
        ManagementTeam.Manager manager30 = new ManagementTeam.Manager();
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        manager30.viewReport(report31);
        ClientClass.Visitor visitor37 = new ClientClass.Visitor();
        java.lang.String str38 = visitor37.getType();
        java.lang.String str39 = report31.viewReport((ClientClass.Client) visitor37);
        manager19.viewReport(report31);
        report31.setEmail("hi!");
        ManagementTeam.Report report43 = new ManagementTeam.Report();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        java.lang.String str49 = client45.getType();
        java.lang.String str50 = report43.viewReport(client45);
        java.lang.String str51 = client45.getEmail();
        java.lang.String str52 = report31.viewReport(client45);
        report31.setEmail("");
        manager0.viewReport(report31);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "" + "'", str52.equals(""));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        ClientClass.NonFacultyStaff nonFacultyStaff25 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff25.setType("");
        nonFacultyStaff25.setPassword("hi!");
        java.lang.String str30 = nonFacultyStaff25.getID();
        java.lang.String str31 = nonFacultyStaff25.getPassword();
        manager0.setClient((ClientClass.Client) nonFacultyStaff25);
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
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        faculty51.setType("");
        faculty51.setPassword("");
        java.lang.String str61 = faculty51.getID();
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
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getName();
        java.lang.String str11 = book0.getId();
        book0.setAvailability(false);
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
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
        ManagementTeam.Report report33 = new ManagementTeam.Report();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        java.lang.String str39 = client35.getType();
        java.lang.String str40 = report33.viewReport(client35);
        manager26.viewReport(report33);
        java.lang.String str42 = report33.getEmail();
        ManagementTeam.Manager manager43 = new ManagementTeam.Manager();
        ManagementTeam.Report report44 = new ManagementTeam.Report();
        ClientClass.Client client45 = new ClientClass.Client();
        client45.setID("");
        java.lang.String str48 = report44.viewReport(client45);
        manager43.viewReport(report44);
        ClientClass.Visitor visitor50 = new ClientClass.Visitor();
        manager43.setClient((ClientClass.Client) visitor50);
        java.lang.String str52 = visitor50.getType();
        java.lang.String str53 = report33.viewReport((ClientClass.Client) visitor50);
        java.lang.String str54 = visitor50.getType();
        visitor50.setEmail("hi!");
        java.lang.String str57 = visitor50.getEmail();
        manager0.setClient((ClientClass.Client) visitor50);
        visitor50.setEmail("hi!");
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
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        ManagementTeam.Report report15 = new ManagementTeam.Report();
        ClientClass.Client client16 = new ClientClass.Client();
        client16.setID("");
        java.lang.String str19 = report15.viewReport(client16);
        client16.setID("");
        java.lang.String str22 = report14.viewReport(client16);
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        visitor30.setPassword("hi!");
        manager23.setClient((ClientClass.Client) visitor30);
        java.lang.String str34 = report14.viewReport((ClientClass.Client) visitor30);
        manager0.viewReport(report14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
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
        java.lang.String str13 = visitor7.getPassword();
        java.lang.String str14 = visitor7.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        java.lang.String str5 = report0.getEmail();
        ClientClass.Client client6 = null;
        java.lang.String str7 = report0.viewReport(client6);
        ManagementTeam.Report report8 = new ManagementTeam.Report();
        ManagementTeam.Report report9 = new ManagementTeam.Report();
        ClientClass.Client client10 = new ClientClass.Client();
        client10.setID("");
        java.lang.String str13 = report9.viewReport(client10);
        java.lang.String str14 = client10.getType();
        java.lang.String str15 = report8.viewReport(client10);
        java.lang.String str16 = client10.getType();
        java.lang.String str17 = client10.getID();
        client10.setType("");
        java.lang.String str20 = report0.viewReport(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
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
        client19.setType("");
        java.lang.String str33 = client19.getID();
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        book0.setId("");
        book0.setName("hi!");
        book0.setAvailability(true);
        book0.setId("");
        book0.setId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        book0.setId("hi!");
        book0.setName("");
        book0.setAvailability(true);
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
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        java.lang.String str40 = student25.getEmail();
        java.lang.String str41 = student25.getID();
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
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        report12.setEmail("hi!");
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
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        java.lang.String str7 = book0.getName();
        java.lang.String str8 = book0.getName();
        boolean boolean9 = book0.getAvailability();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        java.lang.String str1 = faculty0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        visitor29.setPassword("");
        visitor29.setEmail("");
        java.lang.String str45 = visitor29.getID();
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        java.lang.String str58 = faculty51.getEmail();
        java.lang.String str59 = faculty51.getPassword();
        faculty51.setPassword("hi!");
        java.lang.String str62 = faculty51.getEmail();
        java.lang.String str63 = faculty51.getType();
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
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        visitor8.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        java.lang.String str28 = visitor21.getType();
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.lang.String str38 = report0.getEmail();
        report0.setEmail("");
        ManagementTeam.Manager manager41 = new ManagementTeam.Manager();
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ClientClass.Client client43 = new ClientClass.Client();
        client43.setID("");
        java.lang.String str46 = report42.viewReport(client43);
        manager41.viewReport(report42);
        ClientClass.Visitor visitor48 = new ClientClass.Visitor();
        manager41.setClient((ClientClass.Client) visitor48);
        java.lang.String str50 = visitor48.getEmail();
        java.lang.String str51 = report0.viewReport((ClientClass.Client) visitor48);
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
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
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
        ManagementTeam.Manager manager25 = new ManagementTeam.Manager();
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        ClientClass.Client client27 = new ClientClass.Client();
        client27.setID("");
        java.lang.String str30 = report26.viewReport(client27);
        manager25.viewReport(report26);
        ClientClass.Faculty faculty32 = new ClientClass.Faculty();
        manager25.setClient((ClientClass.Client) faculty32);
        ClientClass.Student student34 = new ClientClass.Student();
        student34.setPassword("hi!");
        student34.setPassword("");
        java.lang.String str39 = student34.getID();
        manager25.setClient((ClientClass.Client) student34);
        ManagementTeam.Manager manager41 = new ManagementTeam.Manager();
        ManagementTeam.Report report42 = new ManagementTeam.Report();
        ClientClass.Client client43 = new ClientClass.Client();
        client43.setID("");
        java.lang.String str46 = report42.viewReport(client43);
        manager41.viewReport(report42);
        ClientClass.Faculty faculty48 = new ClientClass.Faculty();
        manager41.setClient((ClientClass.Client) faculty48);
        ClientClass.Faculty faculty50 = new ClientClass.Faculty();
        manager41.setClient((ClientClass.Client) faculty50);
        ClientClass.Faculty faculty52 = new ClientClass.Faculty();
        faculty52.setID("");
        java.lang.String str55 = faculty52.getEmail();
        java.lang.String str56 = faculty52.getID();
        manager41.setClient((ClientClass.Client) faculty52);
        manager25.setClient((ClientClass.Client) faculty52);
        faculty52.setEmail("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = manager0.verifyAccount((ClientClass.Client) faculty52);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        java.lang.String str38 = report0.getEmail();
        report0.setEmail("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        book0.setAvailability(false);
        book0.setName("hi!");
        book0.setId("");
        java.lang.String str9 = book0.getId();
        book0.setId("");
        book0.setAvailability(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        ManagementTeam.Manager manager27 = new ManagementTeam.Manager();
        ManagementTeam.Report report28 = new ManagementTeam.Report();
        ClientClass.Client client29 = new ClientClass.Client();
        client29.setID("");
        java.lang.String str32 = report28.viewReport(client29);
        manager27.viewReport(report28);
        ClientClass.Faculty faculty34 = new ClientClass.Faculty();
        manager27.setClient((ClientClass.Client) faculty34);
        ClientClass.Faculty faculty36 = new ClientClass.Faculty();
        manager27.setClient((ClientClass.Client) faculty36);
        ClientClass.Faculty faculty38 = new ClientClass.Faculty();
        faculty38.setID("");
        java.lang.String str41 = faculty38.getEmail();
        java.lang.String str42 = faculty38.getID();
        manager27.setClient((ClientClass.Client) faculty38);
        manager0.setClient((ClientClass.Client) faculty38);
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        java.lang.String str8 = visitor7.getType();
        java.lang.String str9 = report1.viewReport((ClientClass.Client) visitor7);
        visitor7.setPassword("");
        java.lang.String str12 = visitor7.getEmail();
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
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        book0.setAvailability(true);
        boolean boolean18 = book0.getAvailability();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        ManagementTeam.Manager manager18 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager19 = new ManagementTeam.Manager();
        ManagementTeam.Report report20 = new ManagementTeam.Report();
        ClientClass.Client client21 = new ClientClass.Client();
        client21.setID("");
        java.lang.String str24 = report20.viewReport(client21);
        manager19.viewReport(report20);
        report20.setEmail("");
        manager18.viewReport(report20);
        ClientClass.Student student29 = new ClientClass.Student();
        student29.setPassword("hi!");
        student29.setPassword("");
        java.lang.String str34 = student29.getID();
        manager18.setClient((ClientClass.Client) student29);
        java.lang.String str36 = student29.getPassword();
        java.lang.String str37 = student29.getPassword();
        java.lang.String str38 = student29.getPassword();
        student29.setID("");
        student29.setType("");
        java.lang.String str43 = report11.viewReport((ClientClass.Client) student29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setName("hi!");
        boolean boolean3 = book0.getAvailability();
        book0.setAvailability(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        ManagementTeam.Manager manager40 = new ManagementTeam.Manager();
        ManagementTeam.Report report41 = new ManagementTeam.Report();
        ClientClass.Client client42 = new ClientClass.Client();
        client42.setID("");
        java.lang.String str45 = report41.viewReport(client42);
        manager40.viewReport(report41);
        ClientClass.Faculty faculty47 = new ClientClass.Faculty();
        manager40.setClient((ClientClass.Client) faculty47);
        ClientClass.Visitor visitor49 = new ClientClass.Visitor();
        java.lang.String str50 = visitor49.getType();
        visitor49.setType("hi!");
        manager40.setClient((ClientClass.Client) visitor49);
        ManagementTeam.Manager manager54 = new ManagementTeam.Manager();
        ManagementTeam.Report report55 = new ManagementTeam.Report();
        ClientClass.Client client56 = new ClientClass.Client();
        client56.setID("");
        java.lang.String str59 = report55.viewReport(client56);
        manager54.viewReport(report55);
        ClientClass.Visitor visitor61 = new ClientClass.Visitor();
        java.lang.String str62 = visitor61.getType();
        java.lang.String str63 = report55.viewReport((ClientClass.Client) visitor61);
        visitor61.setType("hi!");
        java.lang.String str66 = visitor61.getType();
        manager40.setClient((ClientClass.Client) visitor61);
        ClientClass.Client client68 = new ClientClass.Client();
        client68.setID("");
        client68.setPassword("");
        client68.setID("");
        client68.setEmail("");
        manager40.setClient(client68);
        java.lang.String str78 = report0.viewReport(client68);
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
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
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
        java.lang.String str43 = report34.getEmail();
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Faculty faculty51 = new ClientClass.Faculty();
        manager44.setClient((ClientClass.Client) faculty51);
        ClientClass.Student student53 = new ClientClass.Student();
        student53.setPassword("hi!");
        student53.setPassword("");
        java.lang.String str58 = student53.getID();
        manager44.setClient((ClientClass.Client) student53);
        ClientClass.Faculty faculty60 = new ClientClass.Faculty();
        faculty60.setID("");
        java.lang.String str63 = faculty60.getEmail();
        java.lang.String str64 = faculty60.getID();
        java.lang.String str65 = faculty60.getPassword();
        manager44.setClient((ClientClass.Client) faculty60);
        ManagementTeam.Manager manager67 = new ManagementTeam.Manager();
        ManagementTeam.Report report68 = new ManagementTeam.Report();
        ClientClass.Client client69 = new ClientClass.Client();
        client69.setID("");
        java.lang.String str72 = report68.viewReport(client69);
        manager67.viewReport(report68);
        ClientClass.Visitor visitor74 = new ClientClass.Visitor();
        java.lang.String str75 = visitor74.getType();
        java.lang.String str76 = report68.viewReport((ClientClass.Client) visitor74);
        java.lang.String str77 = visitor74.getType();
        manager44.setClient((ClientClass.Client) visitor74);
        visitor74.setType("");
        java.lang.String str81 = report34.viewReport((ClientClass.Client) visitor74);
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
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "" + "'", str81.equals(""));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        report12.setEmail("");
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
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        ClientClass.Faculty faculty0 = new ClientClass.Faculty();
        faculty0.setID("");
        faculty0.setEmail("hi!");
        faculty0.setType("hi!");
        java.lang.String str7 = faculty0.getID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        ManagementTeam.Report report31 = new ManagementTeam.Report();
        ClientClass.Client client32 = new ClientClass.Client();
        client32.setID("");
        java.lang.String str35 = report31.viewReport(client32);
        client32.setID("");
        client32.setType("");
        client32.setEmail("");
        java.lang.String str42 = client32.getID();
        java.lang.String str43 = client32.getPassword();
        java.lang.String str44 = report22.viewReport(client32);
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
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        java.lang.String str6 = book0.getId();
        java.lang.String str7 = book0.getId();
        book0.setAvailability(true);
        book0.setAvailability(false);
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
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        ManagementTeam.Report report0 = new ManagementTeam.Report();
        ClientClass.Client client1 = new ClientClass.Client();
        client1.setID("");
        java.lang.String str4 = report0.viewReport(client1);
        report0.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        ItemClass.Book book0 = new ItemClass.Book();
        book0.setAvailability(true);
        java.lang.String str3 = book0.getId();
        java.lang.String str4 = book0.getName();
        java.lang.String str5 = book0.getName();
        book0.setId("hi!");
        book0.setId("hi!");
        java.lang.String str10 = book0.getName();
        java.lang.String str11 = book0.getId();
        java.lang.String str12 = book0.getName();
        java.lang.String str13 = book0.getId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }
}

