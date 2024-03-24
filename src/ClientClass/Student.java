package ClientClass;

import ManagementTeam.Course;
import java.util.ArrayList;

import ItemClass.Textbook;

public class Student extends Client{

	private ArrayList<Course> prevCourses = new ArrayList<Course>();
	private ArrayList<Course> currentCourses = new ArrayList<Course>();
	
	private ArrayList<Textbook> prevTextbooks = new ArrayList<Textbook>();
	private ArrayList<Textbook> currentTextbooks = new ArrayList<Textbook>();
	
	
	private void addCourses(Course newCourse) {
		currentCourses.add(newCourse);
	}
	
	private void newTerm() {
		prevCourses.addAll(currentCourses); // adds onto the older archived courses too
		currentCourses = new ArrayList<Course>();
		
		prevTextbooks.addAll(currentTextbooks); // adds onto the older archived courses too
		currentTextbooks = new ArrayList<Textbook>();
	}
}
