import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ClientClass.NonFacultyStaff nonFacultyStaff1 = new ClientClass.NonFacultyStaff();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = manager0.verifyAccount((ClientClass.Client) nonFacultyStaff1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = manager0.verifyAccount((ClientClass.Client) visitor7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Faculty faculty7 = new ClientClass.Faculty();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = manager0.verifyAccount((ClientClass.Client) faculty7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.NonFacultyStaff nonFacultyStaff7 = new ClientClass.NonFacultyStaff();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = manager0.verifyAccount((ClientClass.Client) nonFacultyStaff7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ClientClass.Client client1 = new ClientClass.Client();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = manager0.verifyAccount(client1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        ClientClass.Faculty faculty21 = new ClientClass.Faculty();
        manager14.setClient((ClientClass.Client) faculty21);
        ClientClass.Visitor visitor23 = new ClientClass.Visitor();
        java.lang.String str24 = visitor23.getType();
        visitor23.setType("hi!");
        manager14.setClient((ClientClass.Client) visitor23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean28 = manager0.verifyAccount((ClientClass.Client) visitor23);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        ClientClass.Visitor visitor16 = new ClientClass.Visitor();
        manager9.setClient((ClientClass.Client) visitor16);
        java.lang.String str18 = visitor16.getType();
        visitor16.setPassword("");
        java.lang.String str21 = visitor16.getPassword();
        java.lang.String str22 = visitor16.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = manager0.verifyAccount((ClientClass.Client) visitor16);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        ClientClass.Faculty faculty64 = new ClientClass.Faculty();
        manager57.setClient((ClientClass.Client) faculty64);
        ClientClass.Visitor visitor66 = new ClientClass.Visitor();
        java.lang.String str67 = visitor66.getType();
        visitor66.setType("hi!");
        manager57.setClient((ClientClass.Client) visitor66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean71 = manager0.verifyAccount((ClientClass.Client) visitor66);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        ManagementTeam.Manager manager23 = new ManagementTeam.Manager();
        ManagementTeam.Report report24 = new ManagementTeam.Report();
        ClientClass.Client client25 = new ClientClass.Client();
        client25.setID("");
        java.lang.String str28 = report24.viewReport(client25);
        manager23.viewReport(report24);
        ClientClass.Visitor visitor30 = new ClientClass.Visitor();
        manager23.setClient((ClientClass.Client) visitor30);
        manager22.setClient((ClientClass.Client) visitor30);
        ManagementTeam.Manager manager33 = new ManagementTeam.Manager();
        ManagementTeam.Report report34 = new ManagementTeam.Report();
        ClientClass.Client client35 = new ClientClass.Client();
        client35.setID("");
        java.lang.String str38 = report34.viewReport(client35);
        manager33.viewReport(report34);
        ClientClass.Visitor visitor40 = new ClientClass.Visitor();
        java.lang.String str41 = visitor40.getType();
        java.lang.String str42 = report34.viewReport((ClientClass.Client) visitor40);
        manager22.viewReport(report34);
        ManagementTeam.Manager manager44 = new ManagementTeam.Manager();
        ManagementTeam.Report report45 = new ManagementTeam.Report();
        ClientClass.Client client46 = new ClientClass.Client();
        client46.setID("");
        java.lang.String str49 = report45.viewReport(client46);
        manager44.viewReport(report45);
        ClientClass.Visitor visitor51 = new ClientClass.Visitor();
        java.lang.String str52 = visitor51.getType();
        java.lang.String str53 = report45.viewReport((ClientClass.Client) visitor51);
        manager22.setClient((ClientClass.Client) visitor51);
        ManagementTeam.Manager manager55 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager56 = new ManagementTeam.Manager();
        ManagementTeam.Report report57 = new ManagementTeam.Report();
        ClientClass.Client client58 = new ClientClass.Client();
        client58.setID("");
        java.lang.String str61 = report57.viewReport(client58);
        manager56.viewReport(report57);
        report57.setEmail("");
        manager55.viewReport(report57);
        ManagementTeam.Manager manager66 = new ManagementTeam.Manager();
        ManagementTeam.Report report67 = new ManagementTeam.Report();
        ClientClass.Client client68 = new ClientClass.Client();
        client68.setID("");
        java.lang.String str71 = report67.viewReport(client68);
        manager66.viewReport(report67);
        ClientClass.Faculty faculty73 = new ClientClass.Faculty();
        manager66.setClient((ClientClass.Client) faculty73);
        faculty73.setType("hi!");
        manager55.setClient((ClientClass.Client) faculty73);
        manager22.setClient((ClientClass.Client) faculty73);
        java.lang.String str79 = faculty73.getPassword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean80 = manager0.verifyAccount((ClientClass.Client) faculty73);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        ClientClass.NonFacultyStaff nonFacultyStaff17 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff17.setType("");
        nonFacultyStaff17.setPassword("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = manager0.verifyAccount((ClientClass.Client) nonFacultyStaff17);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean65 = manager0.verifyAccount((ClientClass.Client) faculty63);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        ClientClass.Client client42 = new ClientClass.Client();
        client42.setID("");
        java.lang.String str45 = report41.viewReport(client42);
        manager40.viewReport(report41);
        ClientClass.Visitor visitor47 = new ClientClass.Visitor();
        manager40.setClient((ClientClass.Client) visitor47);
        java.lang.String str49 = visitor47.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean50 = manager0.verifyAccount((ClientClass.Client) visitor47);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        ManagementTeam.Manager manager81 = new ManagementTeam.Manager();
        ManagementTeam.Report report82 = new ManagementTeam.Report();
        ClientClass.Client client83 = new ClientClass.Client();
        client83.setID("");
        java.lang.String str86 = report82.viewReport(client83);
        manager81.viewReport(report82);
        ClientClass.Visitor visitor88 = new ClientClass.Visitor();
        manager81.setClient((ClientClass.Client) visitor88);
        java.lang.String str90 = visitor88.getType();
        visitor88.setPassword("");
        visitor88.setPassword("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean95 = manager0.verifyAccount((ClientClass.Client) visitor88);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        ManagementTeam.Manager manager0 = new ManagementTeam.Manager();
        ManagementTeam.Report report1 = new ManagementTeam.Report();
        ClientClass.Client client2 = new ClientClass.Client();
        client2.setID("");
        java.lang.String str5 = report1.viewReport(client2);
        manager0.viewReport(report1);
        ClientClass.Visitor visitor7 = new ClientClass.Visitor();
        visitor7.setPassword("hi!");
        manager0.setClient((ClientClass.Client) visitor7);
        ManagementTeam.Report report11 = new ManagementTeam.Report();
        report11.setEmail("");
        ClientClass.Visitor visitor14 = new ClientClass.Visitor();
        java.lang.String str15 = visitor14.getType();
        visitor14.setID("");
        java.lang.String str18 = visitor14.getPassword();
        java.lang.String str19 = report11.viewReport((ClientClass.Client) visitor14);
        java.lang.String str20 = report11.getEmail();
        ManagementTeam.Manager manager21 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager22 = new ManagementTeam.Manager();
        ManagementTeam.Report report23 = new ManagementTeam.Report();
        ClientClass.Client client24 = new ClientClass.Client();
        client24.setID("");
        java.lang.String str27 = report23.viewReport(client24);
        manager22.viewReport(report23);
        ClientClass.Visitor visitor29 = new ClientClass.Visitor();
        manager22.setClient((ClientClass.Client) visitor29);
        manager21.setClient((ClientClass.Client) visitor29);
        java.lang.String str32 = visitor29.getID();
        java.lang.String str33 = report11.viewReport((ClientClass.Client) visitor29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = manager0.verifyAccount((ClientClass.Client) visitor29);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        manager14.setClient((ClientClass.Client) visitor21);
        java.lang.String str23 = visitor21.getType();
        visitor21.setPassword("");
        visitor21.setPassword("hi!");
        java.lang.String str28 = visitor21.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = manager0.verifyAccount((ClientClass.Client) visitor21);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        ClientClass.NonFacultyStaff nonFacultyStaff50 = new ClientClass.NonFacultyStaff();
        nonFacultyStaff50.setType("");
        nonFacultyStaff50.setPassword("hi!");
        java.lang.String str55 = nonFacultyStaff50.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean56 = manager0.verifyAccount((ClientClass.Client) nonFacultyStaff50);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        ManagementTeam.Report report50 = new ManagementTeam.Report();
        report50.setEmail("");
        ClientClass.Visitor visitor53 = new ClientClass.Visitor();
        java.lang.String str54 = visitor53.getType();
        visitor53.setID("");
        java.lang.String str57 = visitor53.getPassword();
        java.lang.String str58 = report50.viewReport((ClientClass.Client) visitor53);
        ManagementTeam.Manager manager59 = new ManagementTeam.Manager();
        ManagementTeam.Manager manager60 = new ManagementTeam.Manager();
        ManagementTeam.Report report61 = new ManagementTeam.Report();
        ClientClass.Client client62 = new ClientClass.Client();
        client62.setID("");
        java.lang.String str65 = report61.viewReport(client62);
        manager60.viewReport(report61);
        ClientClass.Visitor visitor67 = new ClientClass.Visitor();
        manager60.setClient((ClientClass.Client) visitor67);
        manager59.setClient((ClientClass.Client) visitor67);
        java.lang.String str70 = visitor67.getPassword();
        java.lang.String str71 = report50.viewReport((ClientClass.Client) visitor67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean72 = manager0.verifyAccount((ClientClass.Client) visitor67);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        ManagementTeam.Manager manager20 = new ManagementTeam.Manager();
        ManagementTeam.Report report21 = new ManagementTeam.Report();
        ClientClass.Client client22 = new ClientClass.Client();
        client22.setID("");
        java.lang.String str25 = report21.viewReport(client22);
        manager20.viewReport(report21);
        ClientClass.Visitor visitor27 = new ClientClass.Visitor();
        java.lang.String str28 = visitor27.getType();
        java.lang.String str29 = report21.viewReport((ClientClass.Client) visitor27);
        visitor27.setType("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean32 = manager0.verifyAccount((ClientClass.Client) visitor27);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        ClientClass.Faculty faculty40 = new ClientClass.Faculty();
        java.lang.String str41 = faculty40.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean42 = manager0.verifyAccount((ClientClass.Client) faculty40);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        ManagementTeam.Report report32 = new ManagementTeam.Report();
        ClientClass.Client client33 = new ClientClass.Client();
        client33.setID("");
        java.lang.String str36 = report32.viewReport(client33);
        java.lang.String str37 = report32.getEmail();
        report32.setEmail("");
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
        visitor47.setPassword("hi!");
        java.lang.String str54 = report32.viewReport((ClientClass.Client) visitor47);
        java.lang.String str55 = visitor47.getPassword();
        visitor47.setType("");
        manager18.setClient((ClientClass.Client) visitor47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean59 = manager0.verifyAccount((ClientClass.Client) visitor47);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        java.lang.String str51 = visitor48.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = manager0.verifyAccount((ClientClass.Client) visitor48);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        ManagementTeam.Report report17 = new ManagementTeam.Report();
        ClientClass.Client client18 = new ClientClass.Client();
        client18.setID("");
        java.lang.String str21 = report17.viewReport(client18);
        manager16.viewReport(report17);
        ClientClass.Faculty faculty23 = new ClientClass.Faculty();
        manager16.setClient((ClientClass.Client) faculty23);
        ClientClass.Student student25 = new ClientClass.Student();
        student25.setPassword("hi!");
        student25.setPassword("");
        java.lang.String str30 = student25.getID();
        manager16.setClient((ClientClass.Client) student25);
        ClientClass.Faculty faculty32 = new ClientClass.Faculty();
        faculty32.setID("");
        java.lang.String str35 = faculty32.getEmail();
        java.lang.String str36 = faculty32.getID();
        java.lang.String str37 = faculty32.getPassword();
        manager16.setClient((ClientClass.Client) faculty32);
        ManagementTeam.Manager manager39 = new ManagementTeam.Manager();
        ManagementTeam.Report report40 = new ManagementTeam.Report();
        ClientClass.Client client41 = new ClientClass.Client();
        client41.setID("");
        java.lang.String str44 = report40.viewReport(client41);
        manager39.viewReport(report40);
        ClientClass.Visitor visitor46 = new ClientClass.Visitor();
        java.lang.String str47 = visitor46.getType();
        java.lang.String str48 = report40.viewReport((ClientClass.Client) visitor46);
        java.lang.String str49 = visitor46.getType();
        manager16.setClient((ClientClass.Client) visitor46);
        visitor46.setType("");
        visitor46.setPassword("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean55 = manager0.verifyAccount((ClientClass.Client) visitor46);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        ClientClass.NonFacultyStaff nonFacultyStaff61 = new ClientClass.NonFacultyStaff();
        java.lang.String str62 = nonFacultyStaff61.getType();
        nonFacultyStaff61.setEmail("");
        java.lang.String str65 = nonFacultyStaff61.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean66 = manager0.verifyAccount((ClientClass.Client) nonFacultyStaff61);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        ManagementTeam.Manager manager25 = new ManagementTeam.Manager();
        ManagementTeam.Report report26 = new ManagementTeam.Report();
        ClientClass.Client client27 = new ClientClass.Client();
        client27.setID("");
        java.lang.String str30 = report26.viewReport(client27);
        manager25.viewReport(report26);
        ClientClass.Visitor visitor32 = new ClientClass.Visitor();
        java.lang.String str33 = visitor32.getType();
        java.lang.String str34 = report26.viewReport((ClientClass.Client) visitor32);
        ManagementTeam.Manager manager35 = new ManagementTeam.Manager();
        ManagementTeam.Report report36 = new ManagementTeam.Report();
        ClientClass.Client client37 = new ClientClass.Client();
        client37.setID("");
        java.lang.String str40 = report36.viewReport(client37);
        manager35.viewReport(report36);
        ClientClass.Visitor visitor42 = new ClientClass.Visitor();
        java.lang.String str43 = visitor42.getType();
        java.lang.String str44 = report36.viewReport((ClientClass.Client) visitor42);
        java.lang.String str45 = report26.viewReport((ClientClass.Client) visitor42);
        java.lang.String str46 = visitor42.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = manager0.verifyAccount((ClientClass.Client) visitor42);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        ClientClass.Student student25 = new ClientClass.Student();
        student25.setPassword("hi!");
        student25.setEmail("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = manager0.verifyAccount((ClientClass.Client) student25);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        java.lang.String str15 = visitor14.getType();
        java.lang.String str16 = report8.viewReport((ClientClass.Client) visitor14);
        ManagementTeam.Manager manager17 = new ManagementTeam.Manager();
        ManagementTeam.Report report18 = new ManagementTeam.Report();
        ClientClass.Client client19 = new ClientClass.Client();
        client19.setID("");
        java.lang.String str22 = report18.viewReport(client19);
        manager17.viewReport(report18);
        ClientClass.Visitor visitor24 = new ClientClass.Visitor();
        java.lang.String str25 = visitor24.getType();
        java.lang.String str26 = report18.viewReport((ClientClass.Client) visitor24);
        java.lang.String str27 = report8.viewReport((ClientClass.Client) visitor24);
        java.lang.String str28 = visitor24.getEmail();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = manager0.verifyAccount((ClientClass.Client) visitor24);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = manager0.verifyAccount((ClientClass.Client) visitor33);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        ClientClass.Visitor visitor22 = new ClientClass.Visitor();
        java.lang.String str23 = visitor22.getType();
        visitor22.setType("hi!");
        visitor22.setPassword("hi!");
        java.lang.String str28 = visitor22.getPassword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean29 = manager0.verifyAccount((ClientClass.Client) visitor22);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        report42.setEmail("hi!");
        ManagementTeam.Report report54 = new ManagementTeam.Report();
        ManagementTeam.Report report55 = new ManagementTeam.Report();
        ClientClass.Client client56 = new ClientClass.Client();
        client56.setID("");
        java.lang.String str59 = report55.viewReport(client56);
        java.lang.String str60 = client56.getType();
        java.lang.String str61 = report54.viewReport(client56);
        java.lang.String str62 = client56.getEmail();
        java.lang.String str63 = report42.viewReport(client56);
        report42.setEmail("");
        ManagementTeam.Report report66 = new ManagementTeam.Report();
        ClientClass.Client client67 = new ClientClass.Client();
        client67.setID("");
        java.lang.String str70 = report66.viewReport(client67);
        java.lang.String str71 = report66.getEmail();
        report66.setEmail("");
        ManagementTeam.Manager manager74 = new ManagementTeam.Manager();
        ManagementTeam.Report report75 = new ManagementTeam.Report();
        ClientClass.Client client76 = new ClientClass.Client();
        client76.setID("");
        java.lang.String str79 = report75.viewReport(client76);
        manager74.viewReport(report75);
        ClientClass.Visitor visitor81 = new ClientClass.Visitor();
        manager74.setClient((ClientClass.Client) visitor81);
        java.lang.String str83 = visitor81.getType();
        visitor81.setPassword("");
        visitor81.setPassword("hi!");
        java.lang.String str88 = report66.viewReport((ClientClass.Client) visitor81);
        java.lang.String str89 = visitor81.getPassword();
        visitor81.setType("");
        java.lang.String str92 = report42.viewReport((ClientClass.Client) visitor81);
        java.lang.String str93 = visitor81.getID();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean94 = manager0.verifyAccount((ClientClass.Client) visitor81);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
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
        ClientClass.Student student23 = new ClientClass.Student();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = manager0.verifyAccount((ClientClass.Client) student23);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        ManagementTeam.Report report30 = new ManagementTeam.Report();
        ClientClass.Client client31 = new ClientClass.Client();
        client31.setID("");
        java.lang.String str34 = report30.viewReport(client31);
        java.lang.String str35 = report30.getEmail();
        report30.setEmail("");
        ManagementTeam.Manager manager38 = new ManagementTeam.Manager();
        ManagementTeam.Report report39 = new ManagementTeam.Report();
        ClientClass.Client client40 = new ClientClass.Client();
        client40.setID("");
        java.lang.String str43 = report39.viewReport(client40);
        manager38.viewReport(report39);
        ClientClass.Visitor visitor45 = new ClientClass.Visitor();
        manager38.setClient((ClientClass.Client) visitor45);
        java.lang.String str47 = visitor45.getType();
        visitor45.setPassword("");
        visitor45.setPassword("hi!");
        java.lang.String str52 = report30.viewReport((ClientClass.Client) visitor45);
        java.lang.String str53 = visitor45.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean54 = manager0.verifyAccount((ClientClass.Client) visitor45);
    }
}

