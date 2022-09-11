public class BankAccount {

    private double ballance;

    public BankAccount(){
        ballance = 0;

    }
    public void deposit(double amount){
        ballance = ballance + amount;
    }
    public  void withdraw(double amount){
        if(amount <= ballance){
        ballance = ballance - amount;
        }else{
            System.err.println("Transaction cancelled due to insufficient founds");
        }
    }
    public double printBalance(){
        return ballance;
    }


}