import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 80) {
			grade = 'C';
		}
		else if (score >= 80) {
			grade = 'D';
		}
		else {
			grade = 'E';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		sc.close();
	}

}
