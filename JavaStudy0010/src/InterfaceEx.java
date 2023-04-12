interface PhoneInterface {
	final int timeout = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
class Calc {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends Calc implements PhoneInterface {
	public void sendCall() {
		System.out.println("RRRRRR");
	}
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}
	public void schedule() {
		System.out.println("일정 관리합니다");
	}
}
/*class SamsungPhone implements PhoneInterface {
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() { System.out.println("전화기에 불이 켜졌습니다.");
	
	}
}*/

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SmartPhone p = new SmartPhone();
	p.printLogo();
	p.sendCall();
	p.receiveCall();
	System.out.println(p.calculate(3, 5));
	p.schedule();
	}

}
