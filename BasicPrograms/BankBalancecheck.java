import java.util.*;
 class Bank {
    static double myaccount, amount, n, withdraw, b;
    static Scanner opt = new Scanner(System.in);
    public static void account() {
        myaccount = 1000;
        System.out.print("Enter amount to deposit: ");
        amount = opt.nextDouble();
        n = myaccount + amount;
        System.out.println("Your Amount is : " + n);
    }
    public static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        withdraw = opt.nextDouble();
        System.out.println("Your Withdrawal Amount is : " + withdraw);
    }
    public static void Balance() {
        b = n - withdraw;
        System.out.println("Your balance amount is : " + b);
    }
    public static void main(String args[]) {
        Bank.account();
        Bank.withdraw();
        Bank.Balance();
    }
}

