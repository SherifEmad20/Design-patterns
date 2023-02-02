/* 	Abstract factory pattern works around super-factory and is also called factory of factories
	In Abstract Factory pattern an interface is responsible for creating a factory of related
 	objects without explicitly specifying their classes. 
 	Each generated factory can give the objects as per the Factory pattern
*/

public class Main {

	public static void main(String[] args) {
		// get shape factory
		// returns shapeFactory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

		// get an object of Shape Rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();

		// get an object of Shape Square
		Shape square = shapeFactory.getShape("SQUARE");
		square.draw();

		// get shape factory
		// returns roundedShapeFactory
		AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

		// get an object of Shape Rectangle
		Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
		roundedRectangle.draw();

		// get an object of Shape Square
		Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
		roundedSquare.draw();
	}
}
