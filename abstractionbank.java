import java.util.*;
abstract class Bank {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class Branch extends Bank {
    double balance = 0;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        }
    }
}
public class abstractionbank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Branch b = new Branch();

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        b.withdraw(wd);
    }
}
