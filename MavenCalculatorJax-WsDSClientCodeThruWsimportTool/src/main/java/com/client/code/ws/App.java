package com.client.code.ws;

import java.util.Scanner;
import com.server.code.ws.CalculatorService;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	
    	CalculatorService calc = new CalculatorService();
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		System.out.println("1. Add Two Numbers");
    		System.out.println("2. Subtract Two Numbers");
    		System.out.println("3. Multiply Two Numbers");
    		System.out.println("4. Divide Two Numbers");
    		System.out.println("5. Exit");
    		System.out.print("Enter The Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int addResult = calc.getCalculatorPort().add(num1, num2);
    			System.out.println("Addition Of Two Numbers Is :: "+addResult);
    			System.out.println("");
    		}
    		else if(choice == 2) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int subResult = calc.getCalculatorPort().subtract(num1, num2);
    			System.out.println("Subtraction Of Two Numbers Is :: "+subResult);
    			System.out.println("");
    		}
    		else if(choice == 3) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int mulResult = calc.getCalculatorPort().multiply(num1, num2);
    			System.out.println("Multiplication Of Two Numbers Is :: "+mulResult);
    			System.out.println("");
    		}
    		else if(choice == 4) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int divResult = calc.getCalculatorPort().divide(num1, num2);
    			System.out.println("Division Of Two Numbers Is :: "+divResult);
    			System.out.println("");
    		}
    		else {
    			System.out.println("Goodbye....!!");
    			return;
    		}
    	}   	
    }
}
