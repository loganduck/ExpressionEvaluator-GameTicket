import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * Generates ticket output for football games.
 * Includes prices for regular, student, and faculty tickets.
 * Generates a random number for potential prize.
 * 
 * Copy examples at the end.
 */
public class GameTicket {
	static String price, category, time, date, seat, row, section, gameDescription;
	static String ticketCode, hour, minute, month, day, year, dollars, cents, cost;
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("#.00"); 
	
	public static void main(String[] args) {
		System.out.print("Enter your ticket code: ");
		
		ticketCode = scan.nextLine();
		
		if (ticketCode.length() < 25) {
			System.out.println("Invalid Ticket Code.\nTicket Code"
					+ " must be at least 25 characters.");
		} else {
		
		dollars = ticketCode.substring(0,3);
		cents = ticketCode.substring(3,5);
		price = "$" + dollars + "." + cents;
		cost = dollars + cents;
		
		category = ticketCode.substring(5, 6);
		
		hour = ticketCode.substring(6, 8);
		minute = ticketCode.substring(8, 10);
		time = hour + ":" + minute;
		
		month = ticketCode.substring(10, 12);
		day = ticketCode.substring(12, 14);
		year = ticketCode.substring(14, 18);
		date = month + "/" + day + "/" + year;
		
		seat = ticketCode.substring(18, 20);
		row = ticketCode.substring(20, 22);
		section = ticketCode.substring(23, 24);
		gameDescription = ticketCode.substring(24, ticketCode.length());
		
		double formatCost = Double.parseDouble(cost);
		formatCost = formatCost / 100;
		if (ticketCode.charAt(5) == 's') {
			formatCost = formatCost * 0.15;
		}
		if (ticketCode.charAt(5) == 'f') {
			formatCost = formatCost * 0.15;
		}
	
		Random rand = new Random();
		int  prizeNumber = rand.nextInt(9999999) + 1;
		DecimalFormat prizeFormat = new DecimalFormat("0000000");
		
		System.out.println("\nGame: " + gameDescription + "\tDate: " + date + "\tTime: " + time
				+ "\nSection: " + section + "\tRow: " + row + "\t\tSeat: " + seat
				+ "\nPrice: " + price + "\tCategory: " + category + "\tCost: $" + format.format(formatCost)
				+ "\nPrize Number: " + prizeFormat.format(prizeNumber));
		}
	}
	/*
	 * 11500r153009032016173205Auburn vs Clemson
	 * 11500s153009172016173205Auburn vs Texas A&M
	 * 11500f153011262016173205Auburn vs Florida
	 */
}