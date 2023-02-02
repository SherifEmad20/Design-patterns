
public class Main {

	public static void main(String[] args) {

		Shape circle = new Circle();
		System.out.println("Normal shape");
		circle.draw();
		System.out.println();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		System.out.println("Decorated shape");
		redCircle.draw();
		System.out.println();
		
		Shape rectangle = new Rectangle();
		System.out.println("Normal shape");
		rectangle.draw();
		System.out.println();
		
		Shape Redrectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Decorated shape");
		Redrectangle.draw();
		System.out.println();

	
	}

}
