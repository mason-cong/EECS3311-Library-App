import ManagementTeam.Course;
import ItemClass.Textbook;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student;
    private Course course1;
    private Course course2;
    private Textbook textbook1;
    private Textbook textbook2;

    @Before
    public void setUp() {
        student = new Student();
        course1 = new Course("CSC108");
        course2 = new Course("CSC148");
        textbook1 = new Textbook("Introduction to Java Programming", "Y. Daniel Liang", "1234567890", 10.0);
        textbook2 = new Textbook("Data Structures and Algorithms in Java", "Robert Lafore", "0987654321", 15.0);
    }

    @Test
    public void testAddCourses() {
        // Test adding a course to the current courses list
        student.addCourses(course1);
        assertTrue(student.currentCourses.contains(course1));
    }

    @Test
    public void testAddMultipleCourses() {
        // Test adding multiple courses to the current courses list
        student.addCourses(course1);
        student.addCourses(course2);
        assertTrue(student.currentCourses.contains(course1));
        assertTrue(student.currentCourses.contains(course2));
    }

    @Test
    public void testAddCourseToPreviousCourses() {
        // Test adding a course to the previous courses list
        student.addCourses(course1);
        student.newTerm();
        student.prevCourses.add(course1);
        assertTrue(student.prevCourses.contains(course1));
    }

    @Test
    public void testAddMultipleCoursesToPreviousCourses() {
        // Test adding multiple courses to the previous courses list
        student.addCourses(course1);
        student.addCourses(course2);
        student.newTerm();
        student.prevCourses.addAll(student.currentCourses);
        assertTrue(student.prevCourses.contains(course1));
        assertTrue(student.prevCourses.contains(course2));
    }

    @Test
    public void testNewTerm() {
        // Test creating a new term and adding courses to the current courses list
        student.addCourses(course1);
        student.newTerm();
        assertTrue(student.currentCourses.contains(course1));
        assertEquals(0, student.prevCourses.size());
    }

    @Test
    public void testNewTermWithPreviousCourses() {
        // Test creating a new term and adding courses to the previous courses list
        student.addCourses(course1);
        student.newTerm();
        student.addCourses(course2);
        assertTrue(student.prevCourses.contains(course1));
        assertTrue(student.currentCourses.contains(course2));
    }

    @Test
    public void testAddTextbooks() {
        // Test adding a textbook to the current textbooks list
        student.currentTextbooks.add(textbook1);
        assertTrue(student.currentTextbooks.contains(textbook1));
    }

    @Test
    public void testAddMultipleTextbooks() {
        // Test adding multiple textbooks to the current textbooks list
        student.currentTextbooks.add(textbook1);
        student.currentTextbooks.add(textbook2);
        assertTrue(student.currentTextbooks.contains(textbook1));
        assertTrue(student.currentTextbooks.contains(textbook2));
    }

    @Test
    public void testAddTextbookToPreviousTextbooks() {
        // Test adding a textbook to the previous textbooks list
        student.currentTextbooks.add(textbook1);
        student.newTerm();
        student.prevTextbooks.add(textbook1);
        assertTrue(student.prevTextbooks.contains(textbook1));
    }

    @Test
    public void testAddMultipleTextbooksToPreviousTextbooks() {
        // Test adding multiple textbooks to the previous textbooks list
        student.currentTextbooks.add(textbook1);
        student.currentTextbooks.add(textbook2);
        student.newTerm();
        student.prevTextbooks.addAll(student.currentTextbooks);
        assertTrue(student.prevTextbooks.contains(textbook1));
        assertTrue(student.prevTextbooks.contains(textbook2));
    }

    @Test
    public void testGetPreviousCourses() {
        // Test getting the previous courses list
        student.addCourses(course1);
        student.newTerm();
        student.prevCourses.add(course1);
        assertEquals(student.prevCourses, student.getPreviousCourses());
    }

    @Test
    public void testGetCurrentCourses() {
        // Test getting the current courses list
        student.addCourses(course1);
        assertEquals(student.currentCourses, student.getCurrentCourses());
    }

    @Test
    public void testGetPreviousTextbooks() {
        // Test getting the previous textbooks list
        student.currentTextbooks.add(textbook1);
        student.newTerm();
        student.prevTextbooks.add(textbook1);
        assertEquals(student.prevTextbooks, student.getPreviousTextbooks());
    }

    @Test
    public void testGetCurrentTextbooks() {
        // Test getting the current textbooks list
        student.currentTextbooks.add(textbook1);
        assertEquals(student.currentTextbooks, student.getCurrentTextbooks());
    }

    @Test
    public void testGetPreviousCoursesSize() {
        // Test getting the size of the previous courses list
        student.addCourses(course1);
        student.newTerm();
        student.prevCourses.add(course1);
        assertEquals(1, student.getPreviousCourses().size());
    }

    @Test
    public void testGetCurrentCoursesSize() {
        // Test getting the size of the current courses list
        student.addCourses(course1);
        assertEquals(1, student.getCurrentCourses().size());
    }

    @Test
    public void testGetPreviousTextbooksSize() {
        // Test getting the size of the previous textbooks list
        student.currentTextbooks.add(textbook1);
        student.newTerm();
        student.prevTextbooks.add(textbook1);
        assertEquals(1, student.getPreviousTextbooks().size());
    }

    @Test
    public void testGetCurrentTextbooksSize() {
        // Test getting the size of the current textbooks list
        student.currentTextbooks.add(textbook1);
        assertEquals(1, student.getCurrentTextbooks().size());
    }
}