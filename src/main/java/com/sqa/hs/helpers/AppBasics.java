/**
 * File Name: AppBasics.java<br>
 * Sung, Amy<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Mar 4, 2017
 */
package com.sqa.hs.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Sung, Amy
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * Helper method to farewell user given the appName and user name.
	 */
	public static void farewellUser(String appName, String user) {
		System.out.println("Thank you for using the " + appName + " app " + user + ", have a great day!");
	}

	/**
	 * Helper method to welcome user
	 */
	public static String welcomeUserAndGetName(String appName) {
		System.out.println("Welcome to " + appName + " application.");
		System.out.print("Could I have your name? ");
		return scanner.nextLine();
	}
}
