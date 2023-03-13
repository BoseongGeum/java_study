import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n >= 10) {
			int ten = n / 10;
			int one = n % 10;
			
			System.out.println(ten + " " + one);
		}
		else {
			System.out.println(n);
		}
		sc.close();
	}

}
