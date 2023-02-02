public class Math extends Course {
	Student student;

	Math(Student student) {
		this.student = student;
		this.student.attach(this);
	}

	@Override
	public void update() {
		System.out.println("New math content added.");
	};

}
