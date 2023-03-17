import java.util.Scanner;

public class Main {

	public static void Askii() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		char j = (char)i;
		
		System.out.println(j);
		s.close();
	}
	
	public static void Long() {
		Scanner s = new Scanner(System.in);
		
		long i = s.nextLong();
		long j = s.nextLong();
		
		System.out.println(i + j);
		s.close();
	}
	
	public static void Negative() {
		Scanner s = new Scanner(System.in);
		
		long i = s.nextLong();
		
		System.out.println(-i);
		s.close();
	}
	
	public static void NextChar() {
		Scanner s = new Scanner(System.in);
		
		char i = s.next().charAt(0);
		int j = (int)i;
		j++;
		char k = (char)j;
		
		System.out.println(k);
		s.close();
	}
	
	public static void Devide() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		System.out.println(i / j);
		s.close();
	}
	
	public static void Rest() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		System.out.println(i % j);
		s.close();
	}
	
	public static void Plus() {
		Scanner s = new Scanner(System.in);
		
		long i = s.nextLong();
		
		System.out.println(++i);
		s.close();
	}
	
	public static void Complex() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		System.out.printf("%.2f", i/(float)j);
		s.close();
	}
	
	public static void SumAve() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		
		long sum = i + j + k;
		float ave = sum / (float)3;
		
		System.out.println(sum);
		System.out.printf("%.1f", ave);
		s.close();
	}
	
	public static void Double() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		System.out.println(i<<1);
		s.close();
	}
	
	public static void Double2() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		System.out.println(i*(1<<(j)));
		s.close();
	}
	
	public static void Comparison() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a > b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		s.close();
	}
	
	public static void Comparison2() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a == b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		s.close();
	}
	
	public static void Comparison3() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a <= b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		s.close();
	}
	
	public static void Comparison4() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a == b) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
		
		s.close();
	}
	
	public static void Not() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if (a == 1) {
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
	
	public static void Not2() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if ((a == 1) && (b == 1)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void Not3() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if ((a == 1) || (b == 1)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void Not4() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a != b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void Not5() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a == b) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void Not6() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if ((a == 0) && (b == 0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void Bitwise() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		System.out.println(~a);
	}
	
	public static void main(String[] args) {
		
		Bitwise();
	}

}
