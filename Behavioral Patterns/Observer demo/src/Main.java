/*Observer pattern is used when there is one-to-many relationship between objects such as if one 
 * object is modified, its depenedent objects are to be notified automatically. Observer pattern 
 * falls under behavioral pattern category. 
 */

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		new Math(student);
		new Programming(student);
		new Electronics(student);
		student.notifyAllObservers();
	}
}
