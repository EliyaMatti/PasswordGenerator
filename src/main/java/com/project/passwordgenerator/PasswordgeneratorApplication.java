package com.project.passwordgenerator;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.passwordgenerator.service.InputFromUser;
import com.project.passwordgenerator.service.PassGenerator;
import com.project.passwordgenerator.service.QuestionsForUser;

@SpringBootApplication
public class PasswordgeneratorApplication {
	public static final Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(PasswordgeneratorApplication.class, args);

		QuestionsForUser questionsForUser = new QuestionsForUser(keyboard);
		InputFromUser inputFromUser = questionsForUser.QuestionForUser();
		String Pass = PassGenerator.generator(inputFromUser);
		System.out.println("Your password  : " + Pass);
		keyboard.close();
	}

}
