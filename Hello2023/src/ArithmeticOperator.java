import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time = sc.nextInt();
		int sec = time % 60;
		int min = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간 ");
		System.out.print(min + "분 ");
		System.out.print(sec + "초입니다.");
		
		sc.close();
	}

}
