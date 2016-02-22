import java.util.Scanner;

public class Quarterback {
	public static void main(String[] args) {
		double touchdowns;
		double totalYards;
		double interceptions;
		double completions;
		double passesAttempted;
		double passerRating;
		double a;
		double b;
		double c;
		double d;

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the amount of touchdowns:");
		touchdowns = reader.nextDouble();

		System.out.print("Enter the total number of yards:");
		totalYards = reader.nextDouble();

		System.out.print("Enter the amount of interceptions:");
		interceptions = reader.nextDouble();

		System.out.print("Enter the amount of completions:");
		completions = reader.nextDouble();

		System.out.print("Enter the number of passes attempted:");
		passesAttempted = reader.nextDouble();

		reader.close();

		a = ((completions / passesAttempted) - 0.3) * 5;
		a = (a > 2.375) ? 2.375 : a;

		b = ((totalYards / passesAttempted) - 3) * 0.25;
		b = (b > 2.375) ? 2.375 : b;

		c = (touchdowns / passesAttempted) * 20;
		c = (c > 2.375) ? 2.375 : c;

		d = 2.375 - (interceptions / passesAttempted) * 25;
		d = (d > 2.375) ? 2.375 : d;

		passerRating = ((a + b + c + d) / 6) * 100;

		System.out.printf("This Quarterbacks Passer rating is %.2f", passerRating);
		
	
	}
}
