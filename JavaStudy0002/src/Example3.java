import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		double tax;
		
		if (money > 20000000) {
			tax = money * 0.15;
		}
		else if (money > 10000000) {
			tax = money * 0.1;
		}
		else {
			tax = money * 0.07;
		}
		
		System.out.println(tax);
		sc.close();
	}

}
