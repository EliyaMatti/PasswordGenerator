package com.project.passwordgenerator.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputFromUser {
	  
	  /**
	   * 1.password should include Capital Letters
	   * 2.Password should include Small caharacter
	   * 3.password should include Numbers
	   * 4.password should include special charater
	   */
	
	boolean CapitalLetters;
	boolean smallLetters;
	boolean Numbers;
	boolean SpecialCharacters;
	Integer LengthofPassword;

}
