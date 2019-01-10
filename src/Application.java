
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Please work...pretty please ");
		
		Circle c = new Circle();
		
		System.out.println(c.toString());
		System.out.println(c.calculatedArea());
		
		
		Circle c2 = new Circle(2.3);
		System.out.println(c2.toString());
		System.out.println(c2.calculatedArea());
		
		Circle c3 = new Circle(.9);
		System.out.println(c3.toString());
		System.out.println(c3.calculatedArea());
		
		
	}//end main

}//end class
