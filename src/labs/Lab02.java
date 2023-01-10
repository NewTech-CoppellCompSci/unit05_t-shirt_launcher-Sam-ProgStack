package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		for(int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random()*(Math.max(input, input2)-Math.min(input, input2)))+Math.min(input, input2) + " ");
		}
		
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.println();
		System.out.println("What is the radius of the cylinder?");
		double rad = inKey.nextDouble();
		System.out.println("What is the height of your cylinder?");
		double height = inKey.nextDouble();
		System.out.println("The volume of the cylinder is "+(Math.PI*(Math.pow(rad, 2)) ) * height);
	}


	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter x1: ");
		double x1 = inKey.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = inKey.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = inKey.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = inKey.nextDouble();
		
		System.out.println("Distance between points = "+Math.sqrt(Math.pow(x1 - x2, 2)+Math.pow(y1-y2, 2)) );
	}

	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a-value: ");
		double a = inKey.nextDouble();
		System.out.println("Enter b-value: ");
		double b = inKey.nextDouble();
		System.out.println("Enter c-value: ");
		double c = inKey.nextDouble();
		double ans;
		double ans2;
		ans = Math.sqrt(Math.pow(b, 2)-(4*a*c));
//		System.out.println(ans);
//		System.out.println(-b);
		ans2 = (-b) - ans;
		ans = (-b)+ans;
		
//		System.out.println(ans2);
		ans = ans/(2*a);
		ans2 = ans2/(2*a);
		System.out.println("x1 = "+ans+"\nx2 = "+ans2);
	}



}
