/*	In Strategy pattern, a class behavior or its algorithm can 
 *	be changed at run time. This type of design pattern comes under behavior pattern.
 *
 *	In Strategy pattern, we create objects which represent various strategies and a context
 *	object whose behavior varies as per its strategy object. The strategy object changes the 
 *	executing algorithm of the context object.
 */

public class Main {

	public static void main(String[] args) {

		Context context = new Context(new OperationAdd());
		System.out.println("Addition: 10+5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("Subtraction: 10-5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultipy());
		System.out.println("Multiplication: 10*5 = " + context.executeStrategy(10, 5));

	}

}
