import java.util.*;
class Fibanocci {
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
       
	int i,a=0,b=1,c;
	System.out.println("Enter the Number : ");
	int values = scan.nextInt();
	c = a+b;
	while(c<=values) {
       	System.out.println("Fibanocci series is : "+c);
	a=b;
	b=c;
	c = a+b;
	}
	}
}
