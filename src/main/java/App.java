import java.io.Console;
import java.util.Timer;

//System.out.println((char)27 + "[31mThis text would show up red" + (char)27 + "[0m");
//^^^^^^ used to color text, will implement later ^^^^^
//make some String vars out of the below and use String.format for ease

// 30 black
// 31 red
// 32 green
// 33 yellow
// 34 blue
// 35 magenta
// 36 cyan
// 37 white
// 40 black background
// 41 red background
// 42 green background
// 43 yellow background
// 44 blue background
// 45 magenta background
// 46 cyan background
// 47 white background
// 1 make bright (usually just bold)
// 21 stop bright (normalizes boldness)
// 4 underline
// 24 stop underline
// 0 clear all formatting
// So, System.out.println((char)27 + "[34;43mBlue text with yellow background"); will give you blue text with a yellow background.

public class App{
	public static void main(String[] args) {
		Console userInput = System.console();
		boolean shouldContinue = false;
		TimedExit newTimer = new TimedExit();

		int people;
		String food;
		String drink;
		String entertainment;
		String coupon;
		//ask user if they want to plan a party
		while(!shouldContinue) {
			System.out.println("Hey you wanna party? [Y]es/[N]o");
			String wannaParty = userInput.readLine().toLowerCase();

			if (wannaParty.equals("y")) {
				System.out.println("Dope!");
				shouldContinue = true;
			} else if (wannaParty.equals("n")) {
				System.out.println("Well that's a bummer, dude.");
				System.out.println("Exiting this fantastic app in 5 seconds...");
				newTimer.TimedExit();
			}
		}
		shouldContinue = false;
		//how many people
		System.out.println("Hey how many people dude");
		String numPeople = userInput.readLine();
		people = Integer.parseInt(numPeople);
		//food?
		while(!shouldContinue) {
			System.out.println("Y'all gonna eat? We have lots of options: ");
			System.out.println("We have some light [snacks], some [fancy snacks], a [simple meal], and a [full meal] option. Or, just tell me [no].");
			String wantFood = userInput.readLine().toLowerCase();
			if (wantFood.equals("snacks")) {
				System.out.println("Wicked awesome dude. We'll get you some chips and salsa and maybe some gummy worms.");
				food = wantFood;
				shouldContinue = true;
			} else if (wantFood.equals("fancy snacks")) {
				System.out.println("Radical dudeical. You'll get some, like, I don't know, fancy crackers on square plates and like oven roasted peppers or something. It'll be dope!");
				food = wantFood;
				shouldContinue = true;
			} else if (wantFood.equals("simple meal")) {
				System.out.println("Nice dude. That'll be, like, burgers and fries. Maybe we can scrounge up some pizza instead. We'll work out the deets later.");
				food = wantFood;
				shouldContinue = true;
			} else if (wantFood.equals("full meal")) {
				System.out.println("Woah dude that's far out! We'll get a chef. They'll know what to do. Because we totally can't cook. That'd be nuts.");
				food = wantFood;
				shouldContinue = true;
			} else if (wantFood.equals("no")) {
				System.out.println("Fair enough dude, but you're missing out....");
				food = "";
				shouldContinue = true;
			}
		}
		shouldContinue = false;

		//drink?
		while(!shouldContinue) {
			System.out.println("Duuuuude! What about some bev-er-ag-esss? Mucho importante dude. We have a few options: ");
			System.out.println("So what we have is, like, so exciting. I can get you some [water] for, like, free. Or, some [coffee and tea] for only $25. It's good coffee, too. Strong. Maybe don't give it to the guy with heart problems heh heh. We can also do a healthy bar of [smoothies]. And they're only $100! That's crazy cheap. Totally gluten free, probably. And of course, we offer a [alcohol] in a fully stocked bar. Of course, that'll cost you. $250, to be precise. Worth it, if you ask me. I've been drinking since you started talking to me. And look how cool I am.");
			String wantDrink = userInput.readLine().toLowerCase();
			if (wantDrink.equals("water")) {
				System.out.println("Gotta stay hydrated, for sure dude. We'll put some water in some pitchers and leave it out. Bring your own cups though. Or, like, pour it straight into your mouth dude. That sounds awesome.");
				drink = wantDrink;
				shouldContinue = true;
			} else if (wantDrink.equals("coffee and tea")) {
				System.out.println("Sweet stuff. You'll have a well-caffeinated little get together going. We roast our beans in-house. We use, like, a rocket engine or something. It's crazy! And yeah, there's tea, too, dude. I dunno what that stuff is about.");
				drink = wantDrink;
				shouldContinue = true;
			} else if (wantDrink.equals("smoothies")) {
				System.out.println("Keeping it healthy, dude? We'll blend up some strawberries and blueberries and stuff. We'll even do some kale for you! Dude, you're gonna be, like, so healthy, dude. It's bananas heh heh.");
				drink = wantDrink;
				shouldContinue = true;
			} else if (wantDrink.equals("alcohol")) {
				System.out.println("Dude, you get me.");
				drink = wantDrink;
				shouldContinue = true;
			}
		}
		shouldContinue = false;
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
