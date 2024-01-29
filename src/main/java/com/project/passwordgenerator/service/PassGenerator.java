package com.project.passwordgenerator.service;

import java.util.Random;


public class PassGenerator {

	public static String generator(InputFromUser inputFromUser) {
		/**
		 * case 1 : Capital letter
		 * case 2 : Small Letter
		 * case 3 : Numbers 
		 * case 4 : symbol
		 */
		
		String Capital = "QWERTYUIOPLKJHGFDSAZXCVBNM";
		String  small = "zxcvbnmlkjhgfdsaqwertyuiop";
		String SpecialCharater ="!@#$%^&*<>?";
		String Password = "";
		String Number ="0987612345";
		StringBuilder sb = new StringBuilder();
		
		if(inputFromUser.CapitalLetters)sb.append(Capital);
		if(inputFromUser.smallLetters)sb.append(small);
		if(inputFromUser.SpecialCharacters)sb.append(SpecialCharater);
		if(inputFromUser.Numbers)sb.append(Number);
		String PasswordDirectory = sb.toString();
		
		StringBuilder sb1 = new StringBuilder(Password);

		Random random = new Random();
		for(int i =0 ;i <= inputFromUser.LengthofPassword;i++) {
			if (Password.length() < inputFromUser.LengthofPassword ) {
				sb1.append(PasswordDirectory.charAt(random.nextInt(PasswordDirectory.length())));
				Password = sb1.toString();
			}
		}
		return Password;
	}
}
