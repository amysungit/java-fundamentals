/**
 * File Name: BasicApp.java<br>
 * Sung, Amy<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 4, 2017
 */
package com.sqa.hs;

import java.util.*;

import com.sqa.hs.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Sung, Amy
 * @version 1.0.0
 * @since 1.0
 */
public class BasicApp {

	static String appName = "Basic Fundamentals";

	static String user;

	static int cupsofCoffee;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set the user variable to the value returned from the helper method of
		// AppBasics given an appName
		user = AppBasics.welcomeUserAndGetName("My New App");
		// Execute the core method the calculate cups of coffee
		requestNumCupsOfCoffee();
		// Call the farewell method of AppBasics helper class give the app name
		// and username
		AppBasics.farewellUser(appName, user);
	}

	/**
	 *
	 */
	private static void requestNumCupsOfCoffee() {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many cups of coffee would you like " + user + "? ");
		input = scanner.nextLine();
		cupsofCoffee = Integer.parseInt(input.trim());
		System.out.println("Sounds like you would like " + cupsofCoffee * 2 + " cups of coffee!");
	}
}
