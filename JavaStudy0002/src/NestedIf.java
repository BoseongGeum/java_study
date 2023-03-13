import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int grade = sc.nextInt();
		
		if ((score >= 70) && (grade == 4)) {
			System.out.println("합격!");
		}
		else if ((grade != 4) && (score >= 60)) {
			System.out.println("합격!");
		}
		else {
			System.out.println("불합격!");
		}
	}

}
