package poly.ex.pay1;

public abstract class PayStore {

	//변하는 부분.

	//test
	public static Pay findPay(String option) {
			if(option.equals("kakao")) {
				return new KakaoPay();
			} else if(option.equals("naver")) {
				return new NaverPay();
			} else if(option.equals("NewPay")) {
				return new NewPay();
			} else {
				return new DefaultPay(); //작업내역 그냥 수정.1111
			}
		}
	}

