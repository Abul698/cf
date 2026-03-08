package javaapplicationcirclr;

public class AccountStatus1 {

    private int accNo;
    private double balance;
    privte int deposit;
    private double withdraw;

    public int getAccNo() {
        return accNo;

    }

    public double deposit(){
    balance += deposit;
            return balance;
    
}
public double withdraw(){
    if (balance>=withdraw){
        balance -=withdraw;
    }
    else{
        System.out.println("insufficient Amount");
    }
    return balance;
}

    private static class privte {

        public privte() {
        }
    }
}