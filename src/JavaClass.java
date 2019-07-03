import java.util.Arrays;
import java.util.Scanner;

public class JavaClass {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] students = {"Jim", "Holly", "Bob", "Moe", "Jessica", "Carol", "Ish", "Abe", "Ahamd", "Josh"};
		String[] hometowns = {"Detroit", "Sterling Heights", "St. Joseph", "Knoxville", "Cleveland", "Detroit", "Dearborn", "Woodhaven", "Brooklyn", "Buffalo"};
		String[] favoriteFoods = {"Chicken", "Veal", "Mac and Cheese", "Turkey", "Potato Toters", "Chicken Parm", "Pizza", "Tacos", "Kabobs", "Sausage"};
		
		int index = 0;
		String choice = "";
		do{
			System.out.println(Arrays.toString(students));
			boolean valid;
			do{
				System.out.println("Welcome to the Java hood. Which student would you like to learn more about? (Enter a number between 1 and 10)");
				index = scnr.nextInt() - 1;
				scnr.nextLine();
				try {
					System.out.println("Student " + (index + 1) + " is " + students[index] +"." + " What would you like to know about " + students[index] + "? (Enter hometowns or favorite foods)");
					valid = true;
				}catch (IndexOutOfBoundsException ex) {
					System.out.println("That ain't it bruh. Try again.");
					valid = false;
				}
			} while (!valid);
			
			String userChoice = scnr.nextLine();
			if (userChoice.equals("hometowns")) {
				int city = index;
				System.out.println(students[index] + " is from " + hometowns[city] + ".");
			} 
			else if (userChoice.equals("favorite foods")) {
				int food = index;
				System.out.println(students[index] + " loves " + favoriteFoods[food] + ".");	
			} 
			else {
				System.out.println("That ain't one of the choices Jimbo... try again.");
			}
			System.out.println("Would you like to know more? (enter yes or no)");
			choice = scnr.nextLine();
		} while (choice.equals("yes") || choice.equals("Yes"));
		
		System.out.println("Thanks!");
		
		
		
		scnr.close();

		
	}

}
