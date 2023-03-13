import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("철수: ");
		String cs = sc.next();
		System.out.print("영희: ");
		String yh = sc.next();
		
		if (cs.equals(yh)){
			System.out.println("비겼습니다.");
		}
		
		else if (cs.equals("가위")) {
			if (yh.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("영희가 이겼습니다.");
			}
			
		}
		else if (cs.equals("바위")) {
			if (yh.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("영희가 이겼습니다.");
			}
			
		}
		else if (cs.equals("보")) {
			if (yh.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("영희가 이겼습니다.");
			}
			
		}
		sc.close();
	}

}
