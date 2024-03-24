package ClientClass;

import ItemClass.*;
import ManagementTeam.Course;
import java.util.ArrayList;

public class Faculty extends Client {

	private ArrayList<Textbook> prevTextbooks = new ArrayList<Textbook>();
	private ArrayList<Course> prevCourses = new ArrayList<Course>();
	
	private ArrayList<Textbook> currentTextbooks = new ArrayList<Textbook>();
	private ArrayList<Course> currentCourses = new ArrayList<Course>();
	
	private void addCourses(Course newCourse) {
		currentCourses.add(newCourse);
	}
	
	private void newTerm() { //IF SAME COURSES ARE TAUGHT BUT DIFFERENT TERMS
		prevCourses.addAll(currentCourses); // adds onto the older archived courses too
		currentCourses = new ArrayList<Course>();
	}
	
	private void newCourses() { //TERM AND COURSES ARE CHANGED
		prevCourses.addAll(currentCourses); // adds onto the older archived courses too
		currentCourses = new ArrayList<Course>();
		
		prevTextbooks.addAll(currentTextbooks); // adds onto the older archived courses too
		currentTextbooks = new ArrayList<Textbook>();
	}
	
	
}
