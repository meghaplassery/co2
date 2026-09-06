class BankAccount {
    private int accountNo;
    private String holderName;
    private double balance;

    public void setAccountNo(int accountNo) {
        if (accountNo > 0)
            this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance");
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNo(1001);
        b.setHolderName("Rahul");
        b.setBalance(25000);

        System.out.println("Account No: " + b.getAccountNo());
        System.out.println("Name: " + b.getHolderName());
        System.out.println("Balance: " + b.getBalance());
    }
}