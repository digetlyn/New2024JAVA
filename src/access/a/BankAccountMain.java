package access.a;

import access.BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();

		account.deposit(10000); //입금 1만원
		account.withdraw(3000); //출금 3천원
		System.out.println("balance = " + account.getBalance()); //현재 잔고 출력
	}
}
