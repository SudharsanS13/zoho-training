import java.util.*;
class CtoF {
	public static void main (String[] args) {
	Scanner obt = new Scanner (System.in);
	System.out.println("Enter the celcius : "); 
	double Celcius = obt.nextInt();
	
	double F;
	if (Celcius >= 0) {
	        F = (Celcius * 9/5) + 32;
		System.out.println("It's Fahrenheit is : "+F);
	}
	}
}

				
