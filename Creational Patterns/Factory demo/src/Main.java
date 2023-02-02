// Factory pattern is used to create items without exposing creation logic to the client 
// and refer to newly created object using a common interface.

public class Main {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape("circle");
		Shape rectangle = shapeFactory.getShape("rectangle");
		Shape square = shapeFactory.getShape("square");

		circle.draw();
		rectangle.draw();
		square.draw();

	}
}
