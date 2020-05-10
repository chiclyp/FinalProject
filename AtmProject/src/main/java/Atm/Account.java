package Atm;

/**
 *
 * @author Pauline Chicoye
 */
public class Account {
    private final int ACC_NIP = 11458;
    private double accBalance;
    private double depositSum;
    private double withdrawSum;
    
    public Account(double aB){
        aB = accBalance;
    }
    public void setBalance (double bal){
        this.accBalance = bal;
    }
    public void setDepSum (double dep){
        this.depositSum = dep;
    }
    public void setWithSum (double with){
        this.withdrawSum = with;
    }
    public double getBalance(){
        return accBalance;
    }
    public double getDepSum() {
        return depositSum;
    }
    public double getWithSum(){
        return withdrawSum;
    }
    @Override
    public String toString(){
        return "Your account balance is " + accBalance;
    }
    
}
