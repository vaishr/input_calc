/**
 *   File Name: AddingNumbers.java<br>
 *
 *   Reddy, Vaishnavi<br>
 *   Created: Oct 10, 2016
 *   
 */

package com.sqa.vr;

import com.sqa.vr.helpers.*;

/**
 * AddingNumbers //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Reddy, Vaishnavi
 * @version     1.0.0
 * @since       1.0
 *
 */
public class AddingNumbers {

	/**
	 * @param args
	 */
	
	private static String appName = "Most amazing and special adding";
	private static String username;
	private static int numberCount;
	private static int sum = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello and Welcome to the " + appName + " Application");
		username = RequestInput.getString("What is your lovely name?");
		System.out.println("Thank you " + username + " for using the " + appName + " application");
		numberCount = RequestInput.getInt("How MANY numbers do want to add?");
		int[] numbers = new int[numberCount];
		
		String[] numberStrings = RequestInput.getString("Give numbers separated by commas").split(",");
		numbers = new int[numberCount];
		for (int i = 0 ; i < numberStrings.length; i++) {
			numbers[i] = Integer.parseInt(numberStrings[i].trim());
		}		
//		for (int i = 0; i < numberCount; i++) {
//			numbers[i] = RequestInput.getInt("What is value # " + (i+1) + " that you want to add?");
//			sum += numbers[i];
//		}
		System.out.println("Total of adding the " + numberCount + " numbers is " + addNumbers(numbers));
	}
	
	public static int addNumbers(int... num) {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}
}