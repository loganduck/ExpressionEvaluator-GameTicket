import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ExpressionEvaluator {
	static double x;
	static int leftOfDecimal, rightOfDecimal;
	
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("#,##0.0###");
	
	public static void main(String[] args) {
		System.out.print("Enter value for x: ");
		x = scan.nextDouble();
		
		double output = Math.sqrt(Math.pow((5 * Math.pow(x, 7)) - (4 * Math.pow(x, 6)) , 2)
				+ Math.sqrt(Math.abs(3*Math.pow(x, 5))));
		
		String str = Double.toString(output);
		leftOfDecimal = str.indexOf(".");
		rightOfDecimal = str.length();
		System.out.println("Result: " + output
				+ "\n# of digits to the left of decimal point: " + leftOfDecimal
				+ "\n# of digits to the right of decimal point: " + (rightOfDecimal-leftOfDecimal-1)
				+ "\nFormatted Result: " + format.format(output));
	}
}