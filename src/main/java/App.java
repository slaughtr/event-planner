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
		String shouldContinue = "1";
		// TimedExit newTimer = new TimedExit();

		Double people = 0.0;
		String food = "";
		String drink = "";
		String entertainment = "";
		String coupon = "";
		//ask user if they want to plan a party
		while(shouldContinue.equals("1")) {
			System.out.println("Hey you wanna party? [Y]es/[N]o");
			String wannaParty = userInput.readLine().toLowerCase();

			if (wannaParty.equals("y")) {
				System.out.println("Dope!");
				shouldContinue = "2";
			} else if (wannaParty.equals("n")) {
				System.out.println("Well that's a bummer, dude.");
				System.out.println("Exiting this fantastic app in 5 seconds...");
				// newTimer.TimedExit(); //I'll figure this bit out eventually.
				System.exit(0);
			}
		}
		//how many people
		System.out.println("Hey how many people dude");
		String numPeople = userInput.readLine();
		people = Double.parseDouble(numPeople);
		//food?
		while(shouldContinue.equals("2")) {
			System.out.println("Y'all gonna eat? We have lots of options: ");
			System.out.println("We have some light [snacks], some [fancy snacks], a [simple meal], and a [full meal] option. Or, just tell me [no].");
			String wantFood = userInput.readLine().toLowerCase();
			if (wantFood.equals("snacks")) {
				System.out.println("Wicked awesome dude. We'll get you some chips and salsa and maybe some gummy worms.");
				food = wantFood;
				shouldContinue = "3";
			} else if (wantFood.equals("fancy snacks")) {
				System.out.println("Radical dudeical. You'll get some, like, I don't know, fancy crackers on square plates and like oven roasted peppers or something. It'll be dope!");
				food = wantFood;
				shouldContinue = "3";
			} else if (wantFood.equals("simple meal")) {
				System.out.println("Nice dude. That'll be, like, burgers and fries. Maybe we can scrounge up some pizza instead. We'll work out the deets later.");
				food = wantFood;
				shouldContinue = "3";
			} else if (wantFood.equals("full meal")) {
				System.out.println("Woah dude that's far out! We'll get a chef. They'll know what to do. Because we totally can't cook. That'd be nuts.");
				food = wantFood;
				shouldContinue = "3";
			} else if (wantFood.equals("no")) {
				System.out.println("Fair enough dude, but you're missing out....");
				food = "";
				shouldContinue = "3";
			}
		}

		//drink?
		while(shouldContinue.equals("3")) {
			System.out.println("Duuuuude! What about some bev-er-ag-esss? Mucho importante dude. We have a few options: ");
			System.out.println("So what we have is, like, so exciting. I can get you some [water] for, like, free. Or, some [coffee and tea] for only $25. It's good coffee, too. Strong. Maybe don't give it to the guy with heart problems heh heh. We can also do a healthy bar of [smoothies]. And they're only $100! That's crazy cheap. Totally gluten free, probably. And of course, we offer a [alcohol] in a fully stocked bar. Of course, that'll cost you. $250, to be precise. Worth it, if you ask me. I've been drinking since you started talking to me. And look how cool I am.");
			String wantDrink = userInput.readLine().toLowerCase();
			if (wantDrink.equals("water")) {
				System.out.println("Gotta stay hydrated, for sure dude. We'll put some water in some pitchers and leave it out. Bring your own cups though. Or, like, pour it straight into your mouth dude. That sounds awesome.");
				drink = wantDrink;
				shouldContinue = "4";
			} else if (wantDrink.equals("coffee and tea")) {
				System.out.println("Sweet stuff. You'll have a well-caffeinated little get together going. We roast our beans in-house. We use, like, a rocket engine or something. It's crazy! And yeah, there's tea, too, dude. I dunno what that stuff is about.");
				drink = wantDrink;
				shouldContinue = "4";
			} else if (wantDrink.equals("smoothies")) {
				System.out.println("Keeping it healthy, dude? We'll blend up some strawberries and blueberries and stuff. We'll even do some kale for you! Dude, you're gonna be, like, so healthy, dude. It's bananas heh heh.");
				drink = wantDrink;
				shouldContinue = "4";
			} else if (wantDrink.equals("alcohol")) {
				System.out.println("Dude, you get me.");
				drink = wantDrink;
				shouldContinue = "4";
			}
		}
		//entertainment?
		while(shouldContinue.equals("4")) {
			System.out.println("So, like, you wouldn't want a lame party, would you dude? How about some of the entertainment options we provide? They are: ");
			System.out.println("So, like, dude. If it's a kid's party or you're just, like, trying to scare some adults, we can get you a [clown] for only $100. They'll probably be fine people or whatever. We also know some, like, [performance art]ists. I don't know what they do, exactly, but dude I swear they went to art school so I bet it's awesome. Also, since they're neck deep in student loans and can't do a whole lot of earning with that art degree, they'll do it for only $250! We can also get you, like, a standard [DJ]. Like, one of those DJs that presses play on an iPod and charges you a few hundred dollars. $300, actually. And, like, dude, I happen to know a dude that knows a dude that met a dude that can get that [Diplo] dude in here! Like, it's $100,000 but, like, dude! He's world famous or something, dude. As always, you could just say [no] to all these fun options.");
			String wantEntertainment = userInput.readLine().toLowerCase();
			if (wantEntertainment.equals("clown")) {
				System.out.println("So, like, I hope no one is afraid of clowns dude.");
				entertainment = wantEntertainment;
				shouldContinue = "5";
			} else if (wantEntertainment.equals("performance art")) {
				System.out.println("After the last time, I'll make sure this isn't a nude performance just for you, dude. Unless that's what you want? I'm not here to judge.");
				entertainment = wantEntertainment;
				shouldContinue = "5";
			} else if (wantEntertainment.equals("dj")) {
				System.out.println("I think my neighbor knows how to use iTunes, dude.");
				entertainment = wantEntertainment;
				shouldContinue = "5";
			} else if (wantEntertainment.equals("diplo")) {
				System.out.println("DUDE! I can't believe I get to see Diplo now!...");
				entertainment = wantEntertainment;
				shouldContinue = "5";
			} else if (wantEntertainment.equals("no")) {
				System.out.println("Bummer, dude.");
				entertainment = "";
				shouldContinue = "5";
			}
		}

		// offer coupon codes
		while(shouldContinue.equals("5")) {
			System.out.println("Checking to see if you're eligible for some coupons, dude.");
			if (people < 50.0 && food.equals("full meal") && drink.equals("alcohol")) {
				System.out.println("Hey, rad dude! Seems like you might be having a private dinner! Let's, like, save you $100! That coupon code is [privatedinnerfuntime]. Just put that in at the end!");
				shouldContinue = "6";
			} else if (people > 50.0 && food.equals("") && drink.equals("alcohol") && (entertainment.equals("dj") || entertainment.equals("diplo"))) {
				System.out.println("Awh snap, dude! Looks like you're having a dance party! Since I, like, totally love to dance, I'll give you 10% off, dude! But I'm coming to cut a rug for sure. Just, like, enter [justadanceparty] at the end!");
				shouldContinue = "6";
			} else if (people > 500.0 && food.equals("full meal") && drink.equals("alcohol")) {
				System.out.println("Hey dude, we're gonna give you, like, 1% off your total because it looks like this is a fancy gala event or something");
				shouldContinue = "6";
			}
		}
		//print final price
		Event newEvent = new Event(people, food, drink, entertainment, coupon); //I always lol at these lines.

		System.out.println("That'll cost you: ");
		System.out.println(newEvent.getCost());
	}
}
