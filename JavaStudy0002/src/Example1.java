import java.util.Scanner;

public class Example1 {
	public static int max(int a, int b, int c) {
		
		if ((a >= b) && (a >= c)) {
			return a;
		}
		else if ((b >= a) && (b >= c)) {
			return b;
		}
		else {
			return c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int m = max(a, b, c);
		System.out.println(m);
		sc.close();
	}

}
