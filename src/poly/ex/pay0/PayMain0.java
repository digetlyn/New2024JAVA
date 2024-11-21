package poly.ex.pay0;

public class PayMain0 {

	public static void main(String[] args) {
		PayService payService = new PayService();

		//KakoPay 결제
		String pay0ption1 = "kakao";
		int amount1 = 5000;
		payService.processPay(pay0ption1, amount1);


		//NaverPay 결제
		String pay0ption2 = "naver";
		int amount2 = 10000;
		payService.processPay(pay0ption2, amount2);

		//잘못된 결제수단 선택
		String pay0ption3 = "bad";
		int amount3 = 15000;
		payService.processPay(pay0ption3, amount3);

	}
}
