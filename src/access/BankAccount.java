package access;

public class BankAccount {

	private int balance;

	// 맥 : 커멘드 + n  -> Constructor -> Select None 누르면  빈 기본 생성자를 자동 생성
	public BankAccount() {
		balance = 0;
	}

	// public 메서드 : deposit

	public void deposit(int amount) {
		if (isAmountValid(amount)) {
			balance += amount;

		} else {
			System.out.println("유효하지 않은 금액 입니다.");
		}
	}

	//public 메서드  : withdraw
	public void withdraw(int amount) {
		if (isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;

		} else {
			System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
		}
	}

	// public 메서드 : getBalance
	public int getBalance() {
		return balance;
	}

	//검증 로직 내부에서만 쓸꺼니깐 private로 만듦
	private boolean isAmountValid(int amount) {
		//금액이 0보다 커야함.
		return amount > 0;
	}

}
