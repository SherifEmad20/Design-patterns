public class Programming extends Course {
	Student student;

	Programming(Student student) {
		this.student = student;
		this.student.attach(this);
	}

	@Override
	public void update() {
		System.out.println("New programming content added.");
	};

}
