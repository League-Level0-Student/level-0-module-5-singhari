package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happiness = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog(null, "What kind of pet do you have?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
while(happiness < 50) {		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Playtime", "Nutertion", "Take a walk" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
if(task == 0) {
	Playtime(pet);
	System.out.println("After playing, your "+pet+"'s happiness is "+happiness+".");
}
else if (task==1) {
	 Nuteration();
	 System.out.println("After eating, your "+pet+"'s happiness is "+happiness+".");
}
else {
	takeawalk();
	System.out.println("After taking a walk, your "+pet+"'s happiness is "+happiness+".");
}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	}
	public static void Playtime(String pet) {
	happiness = happiness +15;
	}
	public static void Nuteration() {
		if(happiness <= 10) {
			happiness = happiness +15;
		}
	}
	public static void takeawalk() {
		happiness = happiness +5;
	}
	//Playtime = Plus 15 happiness
	//nuteration = plus 3 happiness if under 10. 
	//takeawalk = plus 5 happiness
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}