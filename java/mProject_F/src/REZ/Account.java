package REZ;

public class Account {
	 
    private String accountNo;
    private int balance;
 
    //���¹�ȣ
    public Account(String accountNo) {
        this.accountNo = accountNo;
    }


    //�Ա� ���
    public int deposit(int money) {
 
        balance = balance + money;
        return balance;
    }
 
    //��� ���
    public int withdraw(int money) {
 
        balance = balance - money;
        return balance;
    }
 
    //�ܰ� Ȯ�� ���
    public void showBalance() {
        System.out.println(balance);
    }
}




