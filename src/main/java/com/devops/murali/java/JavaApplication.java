package com.devops.murali.java;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devops.murali.java.calc.Calculator;



@SpringBootApplication
public class JavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);
		
		runCalculator();
	}

	private static void runCalculator() {
		// TODO Auto-generated method stub4
		
		Calculator calculator = new Calculator();
			
			 Scanner scanner= new Scanner(System.in);
			 System.out.print("Enter first number: ");
		        int a = scanner.nextInt();
		        System.out.print("Enter second number: ");
		        int b = scanner.nextInt();
		      
	        System.out.println("Sum: " + calculator.sum(a,b));
	        System.out.println("Subtraction: " + calculator.subtract(a,b));
	        System.out.println("Multiplication: " + calculator.multiply(a,b));
	        System.out.println("Division: " + calculator.divide(a,b));
		
		
	}

}
