public class UserModel {
	private String CourseName;
	private String CourseId;

	public String getId() {
		return CourseId;
	}

	public void setId(String id) {
		this.CourseId = id;
	}

	public String getName() {
		return CourseName;
	}

	public void setName(String name) {
		this.CourseName = name;
	}

}