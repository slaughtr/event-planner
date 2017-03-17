import java.io.Console;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

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

//JUST TO BE CLEAR, DUDE IS A GENDER NEUTRAL TERM. SOURCE: GOODBURGER
public class App{
	public static void main(String[] args) {
		Console userInput = System.console();
		int shouldContinue = 1;
		boolean fromContinue = false;
		boolean wholeAppExit = false;
		// TimedExit newTimer = new TimedExit();

		Double people = 0.0;
		String food = "";
		String drink = "";
		String entertainment = "";
		String coupon = "";
		//ask user if they want to plan a party
		while(wholeAppExit == false) {
				while(shouldContinue == 1) {
				System.out.println("Hey you wanna party?\n[Y]es/[N]o");
				String wannaParty = userInput.readLine().toLowerCase();

				if (wannaParty.equals("y")) {
					System.out.println("Dope!");
					shouldContinue = 2;
				} else if (wannaParty.equals("n")) {
					System.out.println("Well that's a bummer, dude.");
					System.out.println("Exiting this fantastic app in 5 seconds...");
					// newTimer.TimedExit(); //I'll figure this bit out eventually.
					System.exit(0);
				}
			}
			//how many people
			while(shouldContinue == 2) {
				System.out.println("Hey how many people dude");
				String numPeople = userInput.readLine();
				people = Double.parseDouble(numPeople);
				if (fromContinue == true) shouldContinue = 6;
				shouldContinue = 3;
			}
			//food?
			while(shouldContinue == 3) {
				System.out.println("\n\nY'all gonna eat? We have lots of options: ");
				System.out.println("\nWe have some light [snacks].\nOr some [fancy snacks]\nOr a [simple meal]\nAnd a [full meal] option.\nOr, just tell me [no].");
				String wantFood = userInput.readLine().toLowerCase();
				if (wantFood.equals("snacks")) {
					System.out.println("\nWicked awesome dude. We'll get you some chips and salsa and maybe some gummy worms.");
					food = wantFood;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 4;
				} else if (wantFood.equals("fancy snacks")) {
					System.out.println("\nRadical dudeical. You'll get some, like, I don't know, fancy crackers on square plates and like oven roasted peppers or something. It'll be dope!");
					food = wantFood;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 4;
				} else if (wantFood.equals("simple meal")) {
					System.out.println("\nNice dude. That'll be, like, burgers and fries. Maybe we can scrounge up some pizza instead. We'll work out the deets later.");
					food = wantFood;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 4;
				} else if (wantFood.equals("full meal")) {
					System.out.println("\nWoah dude that's far out! We'll get a chef. They'll know what to do. Because we totally can't cook. That'd be nuts.");
					food = wantFood;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 4;
				} else if (wantFood.equals("no")) {
					System.out.println("\nFair enough dude, but you're missing out....");
					food = "";
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 4;
				}
			}

			//drink?
			while(shouldContinue == 4) {
				System.out.println("\n\nDuuuuude! What about some bev-er-ag-esss? Mucho importante dude. We have a few options: ");
				System.out.println("\nSo what we have is, like, so exciting.\nI can get you some [water] for, like, free.\nOr, some [coffee and tea] for only $25. It's good coffee, too. Strong. Maybe don't give it to the guy with heart problems heh heh.\nWe can also do a healthy bar of [smoothies]. And they're only $100! That's crazy cheap.\nTotally gluten free, probably. \nAnd of course, we offer a [alcohol] in a fully stocked bar. Of course, that'll cost you. $250, to be precise. \nWorth it, if you ask me. I've been drinking since you started talking to me. And look how cool I am.");
				String wantDrink = userInput.readLine().toLowerCase();
				if (wantDrink.equals("water")) {
					System.out.println("\nGotta stay hydrated, for sure dude. We'll put some water in some pitchers and leave it out. Bring your own cups though. Or, like, pour it straight into your mouth dude. \nThat sounds awesome.");
					drink = wantDrink;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 5;
				} else if (wantDrink.equals("coffee and tea")) {
					System.out.println("\nSweet stuff. You'll have a well-caffeinated little get together going. We roast our beans in-house. We use, like, a rocket engine or something. It's crazy! \nAnd yeah, there's tea, too, dude. \nI dunno what that stuff is about.");
					drink = wantDrink;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 5;
				} else if (wantDrink.equals("smoothies")) {
					System.out.println("\nKeeping it healthy, dude? We'll blend up some strawberries and blueberries and stuff. We'll even do some kale for you! Dude, you're gonna be, like, so healthy, dude. \nIt's bananas heh heh.");
					drink = wantDrink;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 5;
				} else if (wantDrink.equals("alcohol")) {
					System.out.println("Dude, you get me.");
					drink = wantDrink;
					if (fromContinue == true) shouldContinue = 6;
					shouldContinue = 5;
				}
			}
			//entertainment?
			while(shouldContinue == 5) {
				System.out.println("\n\nSo, like, you wouldn't want a lame party, would you dude? How about some of the entertainment options we provide? They are: ");
				System.out.println("\nSo, like, dude. If it's a kid's party or you're just, like, trying to scare some adults, we can get you a [clown] for only $100. \nThey'll probably be fine people or whatever.\n\nWe also know some, like, [performance art]ists. I don't know what they do, exactly, but dude I swear they went to art school so I bet it's awesome.\nAlso, since they're neck deep in student loans and can't do a whole lot of earning with that art degree, they'll do it for only $250!\n\nWe can also get you, like, a standard [DJ].\nLike, one of those DJs that presses play on an iPod and charges you a few hundred dollars. $300, actually.\n\nAnd, like, dude, I happen to know a dude that knows a dude that met a dude that can get that [Diplo] dude in here! \nLike, it's $100,000 but, like, dude! He's world famous or something, dude. \n\nAs always, you could just say [no] to all these fun options.");
				String wantEntertainment = userInput.readLine().toLowerCase();
				if (wantEntertainment.equals("clown")) {
					System.out.println("\nSo, like, I hope no one is afraid of clowns dude.");
					entertainment = wantEntertainment;
					shouldContinue = 6;
				} else if (wantEntertainment.equals("performance art")) {
					System.out.println("\nAfter the last time, I'll make sure this isn't a nude performance just for you, dude. \nUnless that's what you want? \nI'm not here to judge.");
					entertainment = wantEntertainment;
					shouldContinue = 6;
				} else if (wantEntertainment.equals("dj")) {
					System.out.println("\n\nI think my neighbor knows how to use iTunes, dude.");
					entertainment = wantEntertainment;
					shouldContinue = 6;
				} else if (wantEntertainment.equals("diplo")) {
					System.out.println("\n\nDUDE! I can't believe I get to see Diplo now!...");
					entertainment = wantEntertainment;
					shouldContinue = 6;
				} else if (wantEntertainment.equals("no")) {
					System.out.println("\n\nBummer, dude.");
					entertainment = "";
					shouldContinue = 6;
				}
			}

			// offer coupon codes
			while(shouldContinue == 6) {
				System.out.println("\n\nChecking to see if you're eligible for some coupons, dude.");
				if (people < 50.0 && food.equals("full meal") && drink.equals("alcohol")) {
					System.out.println("\n\nHey, rad dude! Seems like you might be having a private dinner! Let's, like, save you $100! That coupon code is [privatedinnerfuntime]. Just put that in at the end!");
					shouldContinue = 7;
				} else if (people > 50.0 && food.equals("") && drink.equals("alcohol") && (entertainment.equals("dj") || entertainment.equals("diplo"))) {
					System.out.println("\n\nAwh snap, dude! Looks like you're having a dance party! Since I, like, totally love to dance, I'll give you 10% off, dude! But I'm coming to cut a rug for sure. Just, like, enter [justadanceparty] at the end!");
					shouldContinue = 7;
				} else if (people > 500.0 && food.equals("full meal") && drink.equals("alcohol")) {
					System.out.println("\n\nHey dude, we're gonna give you, like, 1% off your total because it looks like this is a fancy gala event or something");
					shouldContinue = 7;
				}
					System.out.println("\nAwh, that's no fun, dude! You're not eligible for any coupons. Maybe try again next time?");
					shouldContinue = 7;
			}

			//confirm all options, allow coupon code entering
			while(shouldContinue == 7) {
				System.out.println(String.format("\n\nSo it lookes like you're bringing %.0f people and getting %S for food, %S to drink, and %S for entertainment.\nIs this correct?\nUse the following commands:\n[Y]es to add a coupon code and finish your order.\n[people] to change the number of people attending.\n[food] to change your food option.\n[drink] to change your drink option.\n[entertainment] to change your entertainment option.\n[exit] to quit entirely.", people, food, drink, entertainment));
				String continueRestart = userInput.readLine().toLowerCase();

				if (continueRestart.equals("y")) {
				String couponCode = userInput.readLine().toLowerCase();

				shouldContinue = 8;
				} else if (continueRestart.equals("people")) {
					shouldContinue = 2;
					fromContinue = true;

				} else if (continueRestart.equals("food")) {
					System.out.println("should continue: "+shouldContinue+" fromContinue : "+fromContinue);
					shouldContinue = 3;
					fromContinue = true;

				} else if (continueRestart.equals("drink")) {
					shouldContinue = 4;
					fromContinue = true;

				} else if (continueRestart.equals("entertainment")) {
					shouldContinue = 5;
					fromContinue = true;

				} else if (continueRestart.equals("exit")) {
					System.out.println("Well that's just too bad, dude.");
					System.exit(0);
				}
			}

			if (shouldContinue < 8 && fromContinue == true) System.out.println("should continue: "+shouldContinue+" fromContinue : "+fromContinue);

			while(shouldContinue == 8){}
				//print final price
				Event newEvent = new Event(people, food, drink, entertainment, coupon); //I always lol at these lines.

				System.out.println("That'll cost you: ");
				System.out.println(newEvent.getCost());
			}
		}
	}
