package com.bc.client.code.ws;

import com.bc.server.code.ws.BasicCalculatorService;
import java.util.Scanner;

public class BasicCalculatorClientCode {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculatorService bcs = new BasicCalculatorService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Two Numbers");
    		System.out.println("2. Subtract Two Numbers");
    		System.out.println("3. Multiply Two Numbers");
    		System.out.println("4. Divide Two Numbers");
    		System.out.println("5. Square Root Of A Number");
    		System.out.println("6. Cube Root Of A Number");
    		System.out.println("7. Exit");
    		System.out.print("Enter The Choice :: ");
    		int choice = sc.nextInt();
    		if(choice == 1) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int addResult = bcs.getBasicCalculatorPort().add(num1, num2);
    			System.out.println("Addition Of Two Numbers Is :: "+addResult);
    			System.out.println("");
    		}
    		else if(choice == 2) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int subResult = bcs.getBasicCalculatorPort().subtract(num1, num2);
    			System.out.println("Subtraction Of Two Numbers Is :: "+subResult);
    			System.out.println("");
    		}
    		else if(choice == 3) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int mulResult = bcs.getBasicCalculatorPort().multiply(num1, num2);
    			System.out.println("Multiplication Of Two Numbers Is :: "+mulResult);
    			System.out.println("");
    		}
    		else if(choice == 4) {
    			System.out.print("Enter First Number :: ");
    			int num1 = sc.nextInt();
    			
    			System.out.print("Enter Second Number :: ");
    			int num2 = sc.nextInt();
    			
    			int divResult = bcs.getBasicCalculatorPort().divide(num1, num2);
    			System.out.println("Division Of Two Numbers Is :: "+divResult);
    			System.out.println("");
    		}
    		else if(choice == 5) {
    			System.out.print("Enter Number Wants For Square Root :: ");
    			int num1 = sc.nextInt();
    			
    			int srResult = bcs.getBasicCalculatorPort().square(num1);
    			System.out.println("Square Root Of Number Is :: "+srResult);
    			System.out.println("");
    		}
    		else if(choice == 6) {
    			System.out.print("Enter Number Wants For Cube Root :: ");
    			int num1 = sc.nextInt();
    			
    			int crResult = bcs.getBasicCalculatorPort().cube(num1);
    			System.out.println("Cube Root Of Number Is :: "+crResult);
    			System.out.println("");
    		}
    		else {
    			System.out.println("Goodbye....!!");
    			return;
    		}
		}
	}
}
