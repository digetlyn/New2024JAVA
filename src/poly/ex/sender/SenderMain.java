package poly.ex.sender;

public class SenderMain {

	public static void main(String[] args) {
		Sender[]senders = {new EmailSender(), new SMSSender(), new FaceBookSender()};
		for (Sender sender : senders) {
			sender.sendMessage("환영합니다.");
		}
	}
}
