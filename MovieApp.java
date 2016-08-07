package myClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {

		String choice = "y";
		Scanner scan1 = new Scanner(System.in);
		String userInput = "";

		System.out.println("Welcome to the Movie List Application!");

		System.out.println("There are 10 movies in this list.");
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("What category are you interested in? ");

			userInput = scan1.nextLine();

			ArrayList<Movies> list = new ArrayList();
			list.add(new Movies("It Follows", "horror"));
			list.add(new Movies("Star Wars", "scifi"));
			list.add(new Movies("The Blob", "horror"));
			list.add(new Movies("The Jerk", "Comedy"));
			list.add(new Movies("Ghostbusters", "Comedy"));
			list.add(new Movies("Suspiria", "horror"));
			list.add(new Movies("Alien", "scifi"));
			list.add(new Movies("Clueless", "Comedy"));
			list.add(new Movies("It", "horror"));
			list.add(new Movies("The Thing", "scifi"));

			for (int i = 0; i < list.size(); i++) {
				if (userInput.equalsIgnoreCase(list.get(i).getCategory())) { // comparing user input, index, and category
																				

					System.out.println(list.get(i).getTitle()); // if matches if statement above it prints out the title
																
				}

			}
			if (!userInput.equalsIgnoreCase("horror") && !userInput.equalsIgnoreCase("comedy")
					&& !userInput.equalsIgnoreCase("scifi")) {
				System.out.println("This is not a valid category, please select horror, comedy, scifi");
			}
			System.out.println("Continue? (y/n): ");
			choice = scan1.nextLine();

		}

		if (choice.equalsIgnoreCase("n")) {
			System.out.println("Goodbye!");
		}
		

	}
}
