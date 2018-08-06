
public class TestShape {

	public static void main(String[] args) {
		Shape myNewShape;
		
		//DRAWING A CIRCLE
		myNewShape=new Circle();
		myNewShape.draw();
		
		//DRAWING A RECTANGLE
		myNewShape=new Rectangle();
		myNewShape.draw();
		
		//DRAWING A POLYGON
		myNewShape=new Polygon();
		myNewShape.draw();
		
		//Testing method overriding
		Rectangle rectangle=new Square();//upcasting
		rectangle.draw();//overriding
		
		
	}

}
