import java.util.*;
class Palindrome {
	public static void main (String[] args){
		Scanner obt = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int data = obt.nextInt();
		int r,sum =0,back=data;
		while (data>0) {
                   r = data%10;
		   sum = (sum*10)+r;
		   data = data/10;
            }
	    System.out.println(sum);
	    if(back==sum) {
                System.out.println("It is Plaindrome");
	    }
	    else {
		System.out.println("It is not a Palindrome");    
	    }
	}
}

