import java.util.*;
class SPalindrome { 
	public static void main(String[] args){
 	Scanner obj = new Scanner(System.in);
	System.out.println("Give Your Words : ");
	String data = obj.nextLine();

	String S = new StringBuilder(data).reverse().toString();
	if (data.equals(S)) {
		System.out.println("It is Palindrome");
	}
	else{
		System.out.println("It is not a Palindrome");
	}
	}
}
