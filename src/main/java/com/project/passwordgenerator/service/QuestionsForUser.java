package com.project.passwordgenerator.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 1.password should include Capital Letters 
 * 2.Password should include Small character 
 * 3.password should include Numbers 
 * 4.password should include special character
 * 5.length of password
 */
public class QuestionsForUser {

	public static Scanner keyboard;
	@Autowired
	 public Constants Constants;
	
	public QuestionsForUser(Scanner scanner) {
		keyboard = scanner;
	}

	public static InputFromUser QuestionForUser() {
		int lengthOfPassword;
		boolean caps = false;
		boolean samll = false;
		boolean numbers = false;
		boolean special = false;

		InputFromUser inputFromUser = new InputFromUser();
		try {
			System.out.println("Hello, welcome to the Password Generator");
			System.out.println("Please Answer the following questions for password generator with Yes or No");

			System.out.println("Should Your password contain capital Letters i.e ABCDEFGH.......");
			caps = answerForCapitalLettes();
			inputFromUser.setCapitalLetters(caps);

			System.out.println("Should Your password contain small Letters i.e abcdefgh.......");
			samll = answerForSmallLetters();
			inputFromUser.setSmallLetters(samll);

			System.out.println("Should Your password contain Numbers i.e 1234567.......");
			numbers = answerForNumbers();
			inputFromUser.setNumbers(numbers);

			System.out.println("Should Your password contain  Special Characters i.e  #@$!%^.....");
			special = answerForCapitalLettes();
			inputFromUser.setSpecialCharacters(special);

			if(caps == false && samll == false && numbers == false && special == false) {
				System.out.println("All the Parameters cannot be Zero");
				System.out.println("Want to Retry .. \n Yes or No?");
				keyboard.close();
				System.exit(0);
			}
			
			System.out.println("Please enter the lenght of Your passsword (minimum length should be 8");
			lengthOfPassword = answerForLenghtOfPassword();
			inputFromUser.setLengthofPassword(lengthOfPassword);

			return inputFromUser;
		} catch (Exception e) {
			System.out.println("Closing program beacause of invalid input");
			return inputFromUser;
		}
	}

	public static boolean answerForCapitalLettes() {
		String capitalLetters = keyboard.next();
		boolean caps = false;
		if (capitalLetters.equalsIgnoreCase("Yes") || capitalLetters.equalsIgnoreCase("No")) {
			if (capitalLetters.equalsIgnoreCase("Yes")) {
				return caps = true;
			}
		} else {
			System.out.println("Please entry only Yes or no  \n\n\nClosing program beacause of invalid input");
			keyboard.close();
			System.exit(0);
		}
		return caps;
	}
	

	public static boolean answerForSmallLetters() {
		String smallLetters = keyboard.next();
		boolean small = false;
		if (smallLetters.equalsIgnoreCase("Yes") || smallLetters.equalsIgnoreCase("No")) {
			if (smallLetters.equalsIgnoreCase("Yes")) {
				small = true;
			}
		} else {
			System.out.println("Please entry only Yes or no");
			keyboard.close();
			System.exit(0);
		}
		return small;
	}

	public static boolean answerForNumbers() {
		String Numbers = keyboard.next();
		boolean numbers = false;
		if (Numbers.equalsIgnoreCase("Yes") || Numbers.equalsIgnoreCase("No")) {
			if (Numbers.equalsIgnoreCase("Yes")) {
				numbers = true;
			}
		} else {
			System.out.println("Please entry only Yes or no");
			keyboard.close();
			System.exit(0);
		}
		return numbers;
	}

	public static boolean answerForSpecialCharacters() {
		String specialCharater = keyboard.next();
		boolean special = false;
		if (specialCharater.equalsIgnoreCase("Yes") || specialCharater.equalsIgnoreCase("No")) {
			if (specialCharater.equalsIgnoreCase("Yes")) {
				special = true;
			}
		} else {
			System.out.println("Please entry only Yes or no");
			keyboard.close();
			System.exit(0);
		}
		return special;
	}

	public static Integer answerForLenghtOfPassword() {
		int lengthOfPassword = keyboard.nextInt();

		if(lengthOfPassword >= 8) {
			return lengthOfPassword;
		}else {
			System.out.println("Please enter the valid Lenght i.e greater or equal to 8");
			keyboard.close();
			System.exit(0);
		}
		return lengthOfPassword;

	}
}
