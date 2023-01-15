import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name , Password, Balance to create an account");
    String name = sc.next();
    String password = sc.next();
    double balance = sc.nextDouble();

    SBIUser user = new SBIUser(name,balance, password);

        String message = user.addMoney(0);
        System.out.println(message);

        System.out.println("Enter the amount you want to withdraw");
        int money = sc.nextInt();

        System.out.println("Enter Your Password");
        String pass = sc.next();
        System.out.println(user.withdrawMoney(money, pass));

        System.out.println("the rate of interest is :");
        System.out.println(user.calculateInterest(10));
    }
}