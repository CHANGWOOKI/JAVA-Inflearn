package method.ex;

public class ex2 {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 2000);
        balance = withdraw(balance, 3000);
        balance = withdraw(balance, 20000);
        System.out.println("최종 잔액 : " + balance);
    }

    // 입금 메서드
    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원 입금하셨습니다. 잔고 : " + balance);
        return balance;
    }

    // 출금 메서드
    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원 출금하셨습니다. 잔고 : " + balance);
            return balance;
        } else {
            System.out.println("잔고보다 큰 금액은 출금할 수 없습니다.");
            return balance;
        }
    }

}
