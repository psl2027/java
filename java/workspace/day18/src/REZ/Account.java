package REZ;

public class Account {
	 
    private String accountNo;
    private int balance;
 
    //계좌번호
    public Account(String accountNo) {
        this.accountNo = accountNo;
    }


    //입금 기능
    public int deposit(int money) {
 
        balance = balance + money;
        return balance;
    }
 
    //출금 기능
    public int withdraw(int money) {
 
        balance = balance - money;
        return balance;
    }
 
    //잔고 확인 기능
    public void showBalance() {
        System.out.println(balance);
    }
}




