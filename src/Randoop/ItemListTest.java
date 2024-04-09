import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import org.junit.Before;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ItemListTest {

    private ItemList itemList;
    private String path = "items.csv";

    @Before
    public void setUp() {
        itemList = new ItemList();
    }

    @Test
    public void testUpdate() throws Exception {
        // Test updating the items list from a CSV file
        itemList.update(path);
        assertEquals(0, itemList.items.size());

        // Add some items to the CSV file
        Item item1 = new Item("1", "Item 1", true);
        Item item2 = new Item("2", "Item 2", false);
        Item item3 = new Item("3", "Item 3", true);
        itemList.add(path, item1);
        itemList.add(path, item2);
        itemList.add(path, item3);

        // Update the items list from the CSV file
        itemList.update(path);
        assertEquals(3, itemList.items.size());
        assertEquals(item1, itemList.items.get(0));
        assertEquals(item2, itemList.items.get(1));
        assertEquals(item3, itemList.items.get(2));
    }

    @Test
    public void testAdd() throws Exception {
        // Test adding an item to the items list and updating the CSV file
        Item item = new Item("1", "Item 1", true);
        itemList.add(path, item);
        assertTrue(itemList.items.contains(item));

        // Check that the CSV file was updated
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();
        assertTrue(reader.readRecord());
        assertEquals("1", reader.get("id"));
        assertEquals("Item 1", reader.get("name"));
        assertEquals("true", reader.get("availability"));
        assertFalse(reader.readRecord());
        reader.close();
    }

    @Test
    public void testAdd2() throws Exception {
        // Test adding a new row to the CSV file
        itemList.add2(path);
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();
        assertTrue(reader.readRecord());
        assertEquals("id", reader.get("id"));
        assertEquals("name", reader.get("name"));
        assertEquals("availability", reader.get("availability"));
        assertFalse(reader.readRecord());
        reader.close();
    }

    @Test
    public void testUpdateWithEmptyList() throws Exception {
        // Test updating the CSV file with an empty list of items
        itemList.update(path);
        itemList.add2(path);
        ArrayList<Item> emptyList = new ArrayList<Item>();
        itemList.items = emptyList;
        itemList.update(path);
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();
        assertTrue(reader.readRecord());
        assertEquals("id", reader.get("id"));
        assertEquals("name", reader.get("name"));
        assertEquals("availability", reader.get("availability"));
        assertFalse(reader.readRecord());
        reader.close();
    }

    @Test
    public void testUpdateWithNullPath() {
        // Test updating the CSV file with a null path
        itemList.path = null;
        assertThrows(IllegalArgumentException.class, () -> itemList.update(path));
    }

    @Test
    public void testAddWithNullName() {
        // Test adding an item with a null name
        Item item = new Item("1", null, true);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testAddWithNullID() {
        // Test adding an item with a null ID
        Item item = new Item(null, "Item 1", true);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testAddWithNullAvailability() {
        // Test adding an item with a null availability value
        Item item = new Item("1", "Item 1", null);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testUpdateWithInvalidCSV() throws Exception {
        // Test updating the items list with an invalid CSV file
        String invalidPath = "invalid.csv";
        assertThrows(IllegalArgumentException.class, () -> itemList.update(invalidPath));
    }

    @Test
    public void testAddWithInvalidID() {
        // Test adding an item with an invalid ID value
        Item item = new Item("12345678901234567890", "Item 1", true);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testAddWithInvalidName() {
        // Test adding an item with an invalid name value
        Item item = new Item("1", "I", true);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testAddWithInvalidAvailability() {
        // Test adding an item with an invalid availability value
        Item item = new Item("1", "Item 1", "invalid");
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item));
    }

    @Test
    public void testUpdateWithNonExistentCSV() throws Exception {
        // Test updating the items list with a non-existent CSV file
        String nonExistentPath = "nonexistent.csv";
        assertThrows(IllegalArgumentException.class, () -> itemList.update(nonExistentPath));
    }

    @Test
    public void testAddWithDuplicateID() throws Exception {
        // Test adding an item with a duplicate ID value
        Item item1 = new Item("1", "Item 1", true);
        Item item2 = new Item("1", "Item 2", false);
        itemList.add(path, item1);
        assertThrows(IllegalArgumentException.class, () -> itemList.add(path, item2));
    }

    @Test
    public void testUpdateWithReadOnlyCSV() throws Exception {
        // Test updating the items list with a read-only CSV file
        String readOnlyPath = "readonly.csv";
        try (FileWriter writer = new FileWriter(readOnlyPath)) {
            writer.write("id,name,availability\n");
            writer.write("1,Item 1,true\n");
        }
        assertThrows(IOException.class, () -> itemList.update(readOnlyPath));
    }

    @Test
    public void testAddWithBlankID()