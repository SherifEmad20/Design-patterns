
public class Electronics extends Course {
	Student student;

	Electronics(Student student) {
		this.student = student;
		this.student.attach(this);
	}

	@Override
	public void update() {
		System.out.println("New electronics content added.");
	};

}
