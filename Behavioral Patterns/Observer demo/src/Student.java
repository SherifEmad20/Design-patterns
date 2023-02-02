import java.util.ArrayList;

public class Student {

	private ArrayList<Course> courses = new ArrayList<Course>();

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void attach(Course course) {
		this.courses.add(course);
	}

	public void notifyAllObservers() {
		for (Course course : courses) {
			course.update();
		}
	}

}
