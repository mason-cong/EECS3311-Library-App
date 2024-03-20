package ManagementTeam;

import ItemClass.Item;

public class Manager {
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   public void addItem(Item item) {
        // Implement the logic to add an item to the system
        // ...
    }
    public void verifyAccount(Account account) {
        // Implement the logic to verify an account
        // ...
    }
    public void viewReport(Report report) {
        // Implement the logic to view the report
        // ...
        System.out.println(report.viewReport());
    }
}
