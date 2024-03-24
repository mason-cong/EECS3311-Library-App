package ManagementTeam;

import java.util.ArrayList;
import java.util.List;

public class ManagementTeam {
    private List<Manager> listOfManagers;

    public ManagementTeam() {
        listOfManagers = new ArrayList<>();
    }

    public void addManager(Manager manager) {
        listOfManagers.add(manager);
    }

    public void removeManager(Manager manager) {
        listOfManagers.remove(manager);
    }

    public List<Manager> getManagers() {
        // Return a copy of the list to protect the original list
        return new ArrayList<>(listOfManagers);
    }
}
