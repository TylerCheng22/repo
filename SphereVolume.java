import java.util.Scanner;

public class SphereVolume

{

	public static void main(String[] args) 
	
		{
	
		Scanner in = new Scanner(System.in);

		System.out.println("Finding the volume of sphere");
		System.out.print("Enter diameter: ");

		double diameter = in.nextDouble();
		double radius = diameter/2;
		double V = (4/3.0)*Math.PI*Math.pow(radius, 3);

		System.out.println("Volume of sphere with diameter "+diameter+" is: "+V);

		}

}
