import java.util.Scanner;


public class RoshamboApp {
	
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		
		Player rockPlayer = new RockPlayer("Dwayne Johnson");
		Player randomPlayer = new RandDrago();
		Player humanPlayer = new ConsolePlayer();
		boolean user = true;
		String input;

		Roshambo r1;
		Roshambo r2 = rockPlayer.generateRoshambo();

		// System.out.println(r1+ " " + r2);
		System.out.println("Welcome to Rock Paper Scissors (R/P/S) \n");

		System.out.println("What is your name?");
		 String name = scnr.nextLine();
		 humanPlayer.setName(name);
		do {

			do {
				input = Validator.getString(scnr, "Enter rock,paper, or scissors\n");
				if (input.toLowerCase().startsWith("r") || input.toLowerCase().startsWith("p")
						|| input.toLowerCase().startsWith("s")) {
					user = false;
				}
			} while (user);
			r1 = humanPlayer.generateRoshambo(input);
			do {

				// System.out.println("Enter rock, paper or scissors");
				input = Validator.getString(scnr, "Would you like to play aganist, jets or sharks?");
				if (input.equalsIgnoreCase("jets")) {
					r2 = rockPlayer.generateRoshambo();
					user = false;
				} else if (input.equalsIgnoreCase("sharks")) {
					r2 = randomPlayer.generateRoshambo();
					user = false;
				} else {
					System.out.println("Sorry! Try Rocky or Rambo");
					user = true;

				}
			} while (user);
			System.out.println(getWinner(r1, r2));

			System.out.println("Continue? (y/n)");
			input = scnr.nextLine();
		} while (input.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		scnr.close();
	}

	public static String getWinner(Roshambo r1, Roshambo r2) {

		if (r1.equals(Roshambo.ROCK) && r2.equals(Roshambo.SCISSORS)
				|| r1.equals(Roshambo.SCISSORS) && r2.equals(Roshambo.PAPER)
				|| r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK)) {
			return "You Win!";

		} else if (r1.equals(r2)) {
			return ("It's a tie!");
		} else {
			return "You Lose.";
		}

		

	}

}
