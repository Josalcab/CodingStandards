// Copyright (C) 2020
// All rights reserved

package labcodingstandards;

import java.util.Scanner;


/**
 * @author Josue Cabezas
 *
 */
public class Calculator {	
	
	/**
	* Main method for Calculator app.
	* @param args
	*/
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}

	/**
	* Performs a basic arithmetic operation between two numbers and a basic operator.
	* @param first First value to operate with.
	* @param second Second value to operate with.
	* @param operator Symbol that determines the arithmetic operation to be performed.
	* @return String Text that includes the result of the operation
	*/
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
