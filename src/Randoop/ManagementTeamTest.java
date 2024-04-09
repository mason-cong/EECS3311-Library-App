import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ManagementTeamTest {

    private ManagementTeam managementTeam;
    private Manager manager1;
    private Manager manager2;

    @BeforeEach
    public void setUp() {
        managementTeam = new ManagementTeam();
        manager1 = new Manager("Manager 1", "Team 1");
        manager2 = new Manager("Manager 2", "Team 2");
    }

    @Test
    public void testAddManager() {
        managementTeam.addManager(manager1);
        assertEquals(1, managementTeam.getManagers().size());
        assertEquals(manager1, managementTeam.getManagers().get(0));
    }

    @Test
    public void testRemoveManager() {
        managementTeam.addManager(manager1);
        managementTeam.addManager(manager2);
        managementTeam.removeManager(manager1);
        assertEquals(1, managementTeam.getManagers().size());
        assertEquals(manager2, managementTeam.getManagers().get(0));
    }

    @Test
    public void testGetManagers() {
        managementTeam.addManager(manager1);
        List<Manager> managers = managementTeam.getManagers();
        assertEquals(1, managers.size());
        assertEquals(manager1, managers.get(0));
    }

    @Test
    public void testGetEmptyManagers() {
        List<Manager> managers = managementTeam.getManagers();
        assertTrue(managers.isEmpty());
    }

    @Test
    public void testAddNullManager() {
        assertThrows(NullPointerException.class, () -> managementTeam.addManager(null));
    }

    @Test
    public void testRemoveNullManager() {
        assertThrows(NullPointerException.class, () -> managementTeam.removeManager(null));
    }

    @Test
    public void testGetEmptyCopyManagers() {
        managementTeam.addManager(manager1);
        List<Manager> managers = managementTeam.getManagers();
        assertEquals(1, managers.size());
        assertEquals(manager1, managers.get(0));
        assertNotSame(managers, managementTeam.getManagers());
    }

    @Test
    public void testAddMultipleManagers() {
        managementTeam.addManager(manager1);
        managementTeam.addManager(manager2);
        assertEquals(2, managementTeam.getManagers().size());
        assertEquals(manager1, managementTeam.getManagers().get(0));
        assertEquals(manager2, managementTeam.getManagers().get(1));
    }

    @Test
    public void testRemoveMultipleManagers() {
        managementTeam.addManager(manager1);
        managementTeam.addManager(manager2);
        managementTeam.removeManager(manager1);
        managementTeam.removeManager(manager2);
        assertTrue(managementTeam.getManagers().isEmpty());
    }

    @Test
    public void testGetSameManagersAfterAddingAndRemovingManagers() {
        managementTeam.addManager(manager1);
        List<Manager> managers1 = managementTeam.getManagers();
        managementTeam.removeManager(manager1);
        List<Manager> managers2 = managementTeam.getManagers();
        assertNotSame(managers1, managers2);
    }
}