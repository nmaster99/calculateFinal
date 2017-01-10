package ch.bbw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApp {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int summand1;
		int summand2;
		
		
		System.out.println("--------------------------------------------");
		System.out.println("------Welcome to Maven Calculator Demo------");
		System.out.println("--------------------------------------------");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your first number: ");
        summand1 = Integer.parseInt(br.readLine());
        System.out.print("Enter your second number:");
        summand2 = Integer.parseInt(br.readLine());
        
        System.out.println("--------------------------------------------");
        Calculator calculation = new Calculator();
        System.out.println("Result: "+ summand1 + " + " + summand2 + " = "+ calculation.addition(summand1, summand2));	
	}
}
