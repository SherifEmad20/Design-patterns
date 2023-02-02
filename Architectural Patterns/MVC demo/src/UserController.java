public class UserController {

	private UserModel model;
	private UserView view;

	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}

	public void setUserName(String name) {
		model.setName(name);
	}

	public String getUserName() {
		return model.getName();
	}

	public void setUserId(String id) {
		model.setId(id);
	}

	public String getUserId() {
		return model.getId();
	}

	public void updateView() {
		view.printUserDetails(model.getName(), model.getId());
	}
}