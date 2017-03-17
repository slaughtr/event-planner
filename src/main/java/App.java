import java.io.Console;
//JUST TO BE CLEAR, DUDE IS A GENDER NEUTRAL TERM. SOURCE: GOODBURGER
public class App{
	public static void main(String[] args) {
		Console userInput = System.console();
		int shouldContinue = 1;
		boolean fromContinue = false;
		boolean wholeAppExit = false;

		Double people = 0.0;
		String food = "";
		String drink = "";
		String entertainment = "";
		String coupon = "";
		//ask user if they want to plan a party
		while(wholeAppExit == false) {
				while(shouldContinue == 1) {
				System.out.println((char)27 + "[34;43mHey you wanna party?\n[Y]es/[N]o"+ (char)27 + "[0m");
				String wannaParty = userInput.readLine().toLowerCase();

				if (wannaParty.equals("y")) {
					System.out.println("Dope!");
					shouldContinue = 2;
				} else if (wannaParty.equals("n")) {
					System.out.println("Well that's a bummer, dude.");
					System.out.println("Exiting this fantastic app...");
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
				System.out.println("\nWe have some light "+(char)27 + "[34m[snacks]" + (char)27 + "[0m for "+(char)27 + "[32m$50"+(char)27 + "[0m.\nOr some "+(char)27 + "[34m[fancy snacks]" + (char)27 + "[0m for "+(char)27 + "[32m$100"+(char)27 + "[0m\nOr a "+(char)27 + "[34m[simple meal]" + (char)27 + "[0m for "+(char)27 + "[32m$200"+(char)27 + "[0m\nAnd a "+(char)27 + "[34m[full meal]" + (char)27 + "[0m option, for "+(char)27 + "[32m$400"+(char)27 + "[0m.\nOr, just tell me "+(char)27 + "[34m[no]" + (char)27 + "[0m.");
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
				System.out.println("\nSo what we have is, like, so exciting.\nI can get you some "+(char)27 + "[34m[water]" + (char)27 + "[0m for, like, free.\nOr, some "+(char)27 + "[34m[coffee and tea]" + (char)27 + "[0m for only "+(char)27 + "[32m$25"+(char)27 + "[0m. It's good coffee, too. Strong. Maybe don't give it to the guy with heart problems heh heh.\nWe can also do a healthy bar of "+(char)27 + "[34m[smoothies]" + (char)27 + "[0m. And they're only  "+(char)27 + "[32m$100"+(char)27 + "[0m! That's crazy cheap.\nTotally gluten free, probably. \nAnd of course, we offer a "+(char)27 + "[34m[alcohol]" + (char)27 + "[0m in a fully stocked bar. Of course, that'll cost you. "+(char)27 + "[32m$250"+(char)27 + "[0m, to be precise. \nWorth it, if you ask me. I've been drinking since you started talking to me. And look how cool I am.");
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
			while(shouldContinue == 5) { // "+(char)27 + "[34m[selection]" + (char)27 + "[0m
				System.out.println("\n\nSo, like, you wouldn't want a lame party, would you dude? How about some of the entertainment options we provide? They are: ");
				System.out.println("\nSo, like, dude. If it's a kid's party or you're just, like, trying to scare some adults, we can get you a "+(char)27 + "[34m[clown]" + (char)27 + "[0m for only "+(char)27 + "[32m$100"+(char)27 + "[0m. \nThey'll probably be fine people or whatever.\n\nWe also know some, like, "+(char)27 + "[34m[performance art]" + (char)27 + "[0mists. I don't know what they do, exactly, but dude I swear they went to art school so I bet it's awesome.\nAlso, since they're neck deep in student loans and can't do a whole lot of earning with that art degree, they'll do it for only "+(char)27 + "[32m$250"+(char)27 + "[0m\n\nWe can also get you, like, a standard "+(char)27 + "[34m[DJ]" + (char)27 + "[0m.\nLike, one of those DJs that presses play on an iPod and charges you a few hundred dollars. "+(char)27 + "[32m$300"+(char)27 + "[0m, actually.\n\nAnd, like, dude, I happen to know a dude that knows a dude that met a dude that can get that "+(char)27 + "[34m[Diplo]" + (char)27 + "[0m dude in here! \nLike, it's "+(char)27 + "[32m$100000"+(char)27 + "[0m but, like, dude! He's world famous or something, dude. \n\nAs always, you could just say "+(char)27 + "[34m[no]" + (char)27 + "[0m to all these fun options.");
				String wantEntertainment = userInput.readLine().toLowerCase();
				if (wantEntertainment.equals("clown")) {
					System.out.println("\n\nSo, like, I hope no one is afraid of clowns dude.");
					entertainment = wantEntertainment;
					shouldContinue = 6;
				} else if (wantEntertainment.equals("performance art")) {
					System.out.println("\n\nAfter the last time, I'll make sure this isn't a nude performance just for you, dude. \nUnless that's what you want? \nI'm not here to judge.");
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
				System.out.println("\n\n"+(char)27 + "[30;36;1mChecking to see if you're eligible for some coupons, dude."+(char)27 + "[0m");
				if (people < 50.0 && food.equals("full meal") && drink.equals("alcohol")) {
					System.out.println("\n\nHey, rad dude! Seems like you might be having a private dinner! Let's, like, save you "+(char)27 + "[32m$100"+(char)27 + "[0m! That coupon code is [privatedinnerfuntime]. Just put that in at the end!");
					shouldContinue = 7;
				} else if (people > 50.0 && food.equals("") && drink.equals("alcohol") && (entertainment.equals("dj") || entertainment.equals("diplo"))) {
					System.out.println("\n\nAwh snap, dude! Looks like you're having a dance party! Since I, like, totally love to dance, I'll give you "+(char)27 + "[32m$10%"+(char)27 + "[0m off, dude! But I'm coming to cut a rug for sure. Just, like, enter [justadanceparty] at the end!");
					shouldContinue = 7;
				} else if (people > 500.0 && food.equals("full meal") && drink.equals("alcohol")) {
					System.out.println("\n\nHey dude, we're gonna give you, like, "+(char)27 + "[32m1%"+(char)27 + "[0m off your total because it looks like this is a fancy gala event or something");
					shouldContinue = 7;
				}
					System.out.println("\n"+(char)27 + "[30;36;1mAwh, that's no fun, dude! You're not eligible for any coupons. Maybe try again next time?"+(char)27 + "[0m");
					shouldContinue = 7;
			}
			//confirm all options, allow coupon code entering
			while(shouldContinue == 7) {
				System.out.println(String.format("\n\nSo it lookes like you're bringing %.0f people and getting %S for food, %S to drink, and %S for entertainment.\nIs this correct?\nUse the following commands:\n"+(char)27 + "[34m[Y]" + (char)27 + "[0mes to add a coupon code and finish your order.\n"+(char)27 + "[34m[people]" + (char)27 + "[0m to change the number of people attending.\n"+(char)27 + "[34m[food]" + (char)27 + "[0m to change your food option.\n"+(char)27 + "[34m[drink]" + (char)27 + "[0m to change your drink option.\n"+(char)27 + "[34m[entertainment]" + (char)27 + "[0m to change your entertainment option.\n"+(char)27 + "[34m[exit]" + (char)27 + "[0m to quit entirely.", people, food, drink, entertainment));
				String continueRestart = userInput.readLine().toLowerCase();

				if (continueRestart.equals("y")) {
					System.out.println("\n\n"+(char)27 + "[30;36;1mAwesome dude! Did you want to enter a coupon code? If so, like, do it now! Otherwise, just, like, hit enter, dude."+(char)27 + "[0m");
					String couponCode = userInput.readLine().toLowerCase();
					coupon = couponCode;
					shouldContinue = 8;
				} else if (continueRestart.equals("people")) {
					shouldContinue = 2;
					fromContinue = true;
				} else if (continueRestart.equals("food")) {
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
			//print final price
			while(shouldContinue == 8){
				Event newEvent = new Event(people, food, drink, entertainment, coupon); //I always lol at these lines. so hilariously redundant
				String finalCost = Double.toString(newEvent.getCost());
				System.out.println("\n\nThat'll cost you:  "+(char)27 + "[32m$"+finalCost+(char)27 + "[0m");
				System.out.println("Thanks for your business!"+(char)27 + "[0m");
				System.exit(0);
			}
			}
		}
	}
