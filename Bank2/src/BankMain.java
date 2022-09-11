import java.net.StandardSocketOptions;

public class BankMain {

    public static void main(String[] args) {
        BankAccount cust1 = new BankAccount();
        cust1.deposit(500);

        BankAccount cust2 = new BankAccount();
        cust2.withdraw(400);

        System.out.println(cust1.printBalance());
        System.out.println(cust2.printBalance());

    }
}
