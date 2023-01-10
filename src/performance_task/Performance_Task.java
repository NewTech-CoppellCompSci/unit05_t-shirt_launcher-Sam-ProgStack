package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		boolean bool = true;
		
		System.out.println("Enter launch velocity (m/s): ");
		double vel = inKey.nextDouble();
		
		System.out.println("Enter launch angle in degrees: ");
		double deg = inKey.nextDouble();
		
		System.out.println("Projectile Path: ");
		
		int sec = 0;
		double y = 5;
		double x = 5;
		do{
			
			x = Math.cos(Math.toRadians(deg)) * sec * vel;
			y = Math.sin(Math.toRadians(deg)) * sec * vel - 0.5 * 9.8 * (sec*sec);
			if(y < 0) {
				bool = false;
				y = 0;
			}
			System.out.println("Time: "+sec+"s");
			System.out.println("x-pos: "+x+"m");
			System.out.println("y-pos: "+y+"m");
			sec++;
			//wrongly placed code (?) : Lines 31-34
//			sec++;
//			x = Math.cos(Math.toRadians(deg)) * sec * vel;
//			y = Math.sin(Math.toRadians(deg)) * sec * vel - 0.5 * 9.8 * (sec*sec);
		} while(x >= 0 && y >= 0 && bool);
		
		
		
		
		
	}
	
}
