package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		System.out.println(input+"^"+input2+" = "+Math.pow(input, input2));
	}
	
	
	
	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.println("The square root of "+input+" is "+Math.sqrt(input));
			
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Length of side A: ");
		int input = inKey.nextInt();
		System.out.println("Length of side B: ");
		int input2 = inKey.nextInt();
		System.out.println("Hypotenuse = "+Math.hypot(input, input2));
		
	}
	
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int input;
		do {
			System.out.println("Enter an integer: ");
			input = inKey.nextInt();
			min = Math.min(min, input);
			max = Math.max(max, input);
		} while(input != 0);
		System.out.println("Max = "+max+"\nMin = "+min);
	}
	
	
	
}
