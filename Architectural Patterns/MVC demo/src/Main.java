
public class Main {

	public static void main(String[] args) {

		// fetch student record based on his roll no from the database

		UserModel vendor = retriveVendorFromDatabase();
		UserModel customer = retriveCustomerFromDatabase();

		// Create a view : to write course details on console

		UserView vendorView = new UserView();
		UserView customerView = new UserView();

		UserController vendorController = new Vendor(vendor, vendorView);
		UserController customerController = new UserController(customer, customerView);

		vendorController.updateView();
		customerController.updateView();

		// update model data

		vendorController.setUserName("vendor updated");
		vendorController.setUserId("vendor id is 01");
		System.out.println("After updating, user Details are as follows");

		vendorController.updateView();

		customerController.setUserName("customer updated");
		customerController.setUserId("customer id is 02");
		System.out.println("After updating, user Details are as follows");

		customerController.updateView();

	}

	private static UserModel retriveVendorFromDatabase() {
		UserModel vendor = new UserModel();
		vendor.setName("vendor");
		vendor.setId("01");
		return vendor;
	}

	private static UserModel retriveCustomerFromDatabase() {
		UserModel customer = new UserModel();
		customer.setName("customer");
		customer.setId("02");
		return customer;
	}

}