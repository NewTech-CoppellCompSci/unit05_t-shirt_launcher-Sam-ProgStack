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
		
		double sec = 0;
		double y = 5;
		double x = 5;
		do{
			
			x = Math.cos(Math.toRadians(deg)) * sec * vel;
			y = Math.sin(Math.toRadians(deg)) * sec * vel - 0.5 * 9.8 * (sec*sec);
			if(y < 0) {
				bool = false;
//				sec--;
//				sec += (-Math.sin(Math.toRadians(deg)*vel-(vel*Math.sin(Math.toRadians(deg)))))/-9.8;
//				x = Math.cos(Math.toRadians(deg)) * sec * vel;
//				y = Math.sin(Math.toRadians(deg)) * sec * vel - 0.5 * 9.8 * (sec*sec);
				
				y = 0.0;
				x = getXatY(y, deg, vel);
				
				
			}
			System.out.println("Time: "+sec+"s");
			System.out.println("   x-pos: "+x+"m");
			System.out.println("   y-pos: "+y+"m");
			sec++;
			//wrongly placed code (?) : Lines 31-34
//			sec++;
//			x = Math.cos(Math.toRadians(deg)) * sec * vel;
//			y = Math.sin(Math.toRadians(deg)) * sec * vel - 0.5 * 9.8 * (sec*sec);
		} while(x >= 0 && y >= 0 && bool);
		
		
		
		
		
	}
	
	
	
	
	public static double getXatY(double y, double theta, double v) {
		
		//sin of launch Angle
		double sTheta = Math.sin(Math.toRadians(theta));
		//discriminant
		double disc = Math.sqrt(Math.pow(sTheta * v, 2) - 19.6 * y);
		
		//both values for time at given y
		double t1 = (-sTheta*v + disc) / -9.8;
		double t2 = (-sTheta*v - disc) / -9.8;
		
		//grab largest time value
		double t = Math.max(t1,  t2);
		
		
		//get x coordinate at largest time value
		double x = Math.cos(Math.toRadians(theta)) * t * v;
		
		return x;
	}
	
	
}
