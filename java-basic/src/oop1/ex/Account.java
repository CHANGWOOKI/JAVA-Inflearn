package oop1.ex;

public class Account {
    int balance;    // 잔액

    // 입금 메서드
    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    // 출금 메서드
    int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔고 부족");
        } else {
            balance -= amount;
        }
        return balance;
    }
}