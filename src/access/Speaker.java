package access;

public class Speaker {
	private int volume;
	//private 를 붙여주면 그곳 안에서만 가능하다.외부에서 접근이 불가

	Speaker(int volume) {
		this.volume = volume;
	}

	void volumeUp() {
		if (volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
		} else {
			volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}

	void volumeDown() {
		volume -= 10;
		System.out.println("volumeDown 호출");
	}

	void showVolume() {
		System.out.println("현재 음량: " + volume);
	}
}
