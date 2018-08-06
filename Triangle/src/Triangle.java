/**
 * Just a triangle class that defines a triangle and its type
 */

/**
 * @author subhamsa
 *
 */
public class Triangle {
	private int side1;
	private int side2;
	private int side3;
	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	boolean isIsosceles()
	{
		return ((side1==side2 || side2==side3 || side3==side1)&&(side1!=side2||side2!=side3||side3!=side1))?true:false;
	}
	
	boolean isEquilateral()
	{
		return ((side1==side2 && side2==side3 && side3==side1))?true:false;
	}
	
	boolean isScalene()
	{
		return ((side1!=side2 && side2!=side3 && side3!=side1))?true:false;
	}
	
	boolean isRight()
	{
		int hypotenuese=(side1>side2 && side1>side3)?side1 :(side2>side1 && side2>side3)?side2:side3;
		//ternary operation for checking right angled triangle
		return
				((hypotenuese==side1)&&((side2*side2)+(side3*side3))==hypotenuese*hypotenuese)?true:
					((hypotenuese==side2)&&((side3*side3)+(side1*side1))==hypotenuese*hypotenuese)?true:
						((hypotenuese==side3)&&((side2*side2)+(side1*side1))==hypotenuese*hypotenuese)?true:false;
				
	}
}
