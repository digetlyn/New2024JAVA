package poly.ex.pay1;

public class PayService {

	public void processPay(String option, int amount) {

		System.out.println("결제를 시작합니다: option= " + option + ", amount=" + amount);

		Pay pay = PayStore.findPay(option); //PayStore 결제수단을 보관하고 있는곳
		boolean	result = pay.pay(amount);


		if(result){
			System.out.println("결제에 성공했습니다.");
		} else {
			System.out.println("결제에 실패했습니다.");
		}
	}
}
