import java.util.Scanner;

public class NumericTypes {

public static void main(String[] args) 
	
	{

	Scanner in = new Scanner(System.in);

	final int NUMBER = 2;
	int score1 = 100;
	int score2 = 95;
	final int BOILING_IN_F = 212;
	double fToC;
	double average;
	String output;
	int temp;


	System.out.print("Enter score1: ");
	score1 = in.nextInt();

	System.out.print("Enter score2: ");
	score2 = in.nextInt();

	average = (double)(score1 + score2) / NUMBER;
	output = score1 + " and " + score2 + " have an average of " + average;

	System.out.println(output);

	fToC = (5 / 9.0) * (BOILING_IN_F - 32);

	output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";

	System.out.println(output);

	System.out.print("Enter temperature in Fahrenheit: ");
	temp = in.nextInt();

	fToC = (5 / 9.0) * (temp - 32);
	output = temp + " in Fahrenheit is " + fToC + " in Celsius.";

	System.out.println(output);
	System.out.println("Goodbye");

	}

}
