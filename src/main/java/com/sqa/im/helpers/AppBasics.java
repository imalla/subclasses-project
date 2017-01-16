/**
 *   File Name: AppBasics.java<br>
 *
 *   Malla, Isha<br>
 *   Created: Jan 14, 2017
 *
 */

package com.sqa.im.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Malla, Isha
 * @version 1.0.0
 * @since 1.0
 *
 */

public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName, String appName) {
		System.out.println("Thank you for using the " + appName + " app!");
		System.out.println("Goodbye " + userName + " and have a good day!");
	}

	public static String greetUserAndGetName(String appName) {
		System.out.println("Hello, Welcome to the " + appName + " App!");
		System.out.print("Could I please get your name?: ");
		return scanner.nextLine();
	}

}
