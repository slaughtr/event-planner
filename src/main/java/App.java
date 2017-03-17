import java.io.Console;
import java.util.Timer;

public class App{
	public static void main(String[] args) {
		Console userInput = System.console();
		boolean continue = false;
		//ask user if they want to plan a party
		while(!continue) {
			System.out.println("Hey you wanna party? [Y]es/[N]o");
			String wannaParty = userInput.readLine().toLowerCase();
			if (wannaParty.equals("y")) {
				System.out.println("Dope!");
				continue = true;
			} else if (wannaParty.equals("n")) {
				System.out.println("Well that's a bummer, dude.");
				System.out.println("Exiting this fantastic app in 5 seconds...");
				TimedExit();
			}
		}
		//how many people
		System.out.println("Hey how many people man");
		int numPeople = userInput.readLine();
		//food?
		System.out.println("Y'all gonna eat?");

		//drink?
		System.out.println("What about drinks?");

		//entertainment?
		System.out.println("I know a guy...");

		//offer coupon codes
		// if (selectedthingsright) {
		// 	System.out.println("Hey looks like you're up for some coupons.");
		// }

		//print final price
		System.out.println("That'll cost you: ");

	}
}
