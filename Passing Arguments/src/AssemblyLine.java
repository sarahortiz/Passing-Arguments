import java.util.Scanner;
public class AssemblyLine
	{
	public static void main(String[] args)
		{
		double feet = inputFeet();
		double inches = inputInches();
		double feetAndInches = convertToInches(inches, feet);
		double centimeters = convertToCentimeters(feetAndInches);
		double meters = convertToMeters(centimeters);
		double totallFeet = convertToFeet(meters);
		double inches2 = convertToTotallInches(totallFeet);
		double percentDeviation = convertToPercentDeviation(feetAndInches, inches2);
		}
	public static double inputFeet()
		{
		Scanner userInput=new Scanner(System.in);
		System.out.println("What is your height in feet?");
		return userInput.nextDouble();
		}
	public static double inputInches()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		return userInput.nextDouble();
		}
	public static double convertToInches(double inputInches, double inputFeet)
		{
		double totallInches = (inputFeet*12) + inputInches  ;
		System.out.println("You are " + totallInches + " inches tall.");
		return totallInches;
		}
	public static double convertToCentimeters(double heightInInches)
		{
		double centimeters = heightInInches*2.54;
		System.out.println("You are " + centimeters + " centimeters tall.");
		return centimeters;
		}
	public static double convertToMeters(double heightInCentimeters)
		{
		double meters = heightInCentimeters/100;
		System.out.println("You are " + meters + " meters tall.");
		return meters;
		}
	public static double convertToFeet(double heightInMeters)
		{
		double totallFeet = heightInMeters*3.29094;
		System.out.println("You are " + totallFeet + " total feet tall.");
		return totallFeet;
		}
	public static double convertToTotallInches(double heightInTotallFeet) 
		{
		double inches2 = heightInTotallFeet*12;
		System.out.println("You are " + inches2 + " total inches tall.");
		return inches2;
		}
	public static double convertToPercentDeviation(double convertToInches, double convertToTotallInches)
		{
		double percentDeviation = convertToInches-convertToTotallInches/convertToTotallInches*100;
		System.out.println("The percent deviation is " + percentDeviation + "%");
		return percentDeviation;
		}
	}