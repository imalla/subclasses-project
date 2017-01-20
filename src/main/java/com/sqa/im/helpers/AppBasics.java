/**
 *   File Name: AppBasics.java<br>
 *
 *   Malla, Isha<br>
 *   Created: Jan 14, 2017
 *
 */

package com.sqa.im.helpers;

import java.util.*;

import com.sqa.im.helpers.exceptions.*;

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

	public static int requestIntFromUser(String question) {
		return requestIntFromUser(question, 0, 0);
	}

	public static int requestIntFromUser(String question, int min, int max) {
		String input;
		int result = 0;
		boolean isNotValid = true;
		while (isNotValid) {
			try {
				System.out.print(question + " ");
				input = scanner.nextLine();
				result = Integer.parseInt(input);
				if (min != 0 && max != 0) {
					if (result <= max && result >= min) {
						isNotValid = false;
					} else {
						throw new NumberNotInRangeException();
					}
				}
				isNotValid = false;
			} catch (NumberFormatException e) {
				System.out.println("You have not entered a correct number value.");
			} catch (NumberNotInRangeException e) {
				System.out.println("You have not entered a number within the range of " + min + " and " + max + ".");
			}
		}
		return result;
	}

	public static String requestUserInfo(String question) {
		System.out.print(question + " ");
		String response = scanner.nextLine();
		return response;
	}
}
