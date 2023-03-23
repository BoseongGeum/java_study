import java.util.Scanner;

public class Main {

	public static void bitwiseand() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.print(a & b);
		s.close();
	}
	
	public static void bitwiseor() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.print(a | b);
		s.close();
	}
	
	public static void bitwisexor() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.print(a ^ b);
		s.close();
	}
	
	public static void ternary() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a>b?a:b);
		s.close();
	}
	
	public static void ternary2() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);
		s.close();
	}
	
	public static void if1() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.println(a);
		}
		if (b % 2 == 0) {
			System.out.println(b);
		}
		if (c % 2 == 0) {
			System.out.println(c);
		}
		
		s.close();
	}
	
	public static void if2() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
			
		}
		if (b % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if (c % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		s.close();
	}
	
	public static void if3() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if (a > 0) {
			System.out.println("plus");
		}
		else {
			System.out.println("minus");
		}
		
		if (a % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		s.close();
	}
	
	public static void if4() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		if (a > 89) {
			System.out.println("A");
		}
		else if (a > 69) {
			System.out.println("B");
		}
		else if (a > 39) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		s.close();
	}
	
	public static void switch1() {
		Scanner s = new Scanner(System.in);
		
		char a = s.next().charAt(0);
		
		switch(a) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
		s.close();
	}
	
	public static void switch2() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		switch(a) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		default:
			System.out.println("fall");
		}
		s.close();
	}
	
	public static void goto1() {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		while (a != 0) {
			System.out.println(a);
			a = s.nextInt();
		}
		
		s.close();
	}
	
	public static void goto2() {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int a = s.nextInt();
			System.out.println(a);
		}
		
		s.close();
	}
	
	public static void goto3() {
		Scanner s = new Scanner(System.in);
		
		for (int i = s.nextInt(); i != 0;) {
			System.out.println(i);
			i = s.nextInt();
		}
		
		s.close();
	}
	
	public static void goto4() {
		Scanner s = new Scanner(System.in);
		
		for (int i = s.nextInt(); i > 0; i--) {
			System.out.println(i);
		}
		
		s.close();
	}
	
	public static void goto5() {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		while (i > 0) {
			System.out.println(--i);
		}
		
		s.close();
	}
	
	public static void goto6() {
		Scanner s = new Scanner(System.in);
		
		char i = s.next().charAt(0);
		int n = (int)i;
		char c = 'a';
		
		do {
			System.out.println(c);
			c++;
		} while((int)c <= n);
		
		s.close();
	}
	
	public static void goto7() {
		Scanner s = new Scanner(System.in);
		
		int i, j = s.nextInt();
		
		for(i = 0; i <= j; i ++) {
			System.out.println(i);
		}
		s.close();
	}
	
	public static void evensum() {
		Scanner s = new Scanner(System.in);
		
		int i, j = s.nextInt();
		int sum = 0;
		
		for(i = 0; i <= j; i += 2) {
			sum += i;
		}
		
		System.out.println(sum);
		s.close();
	}
	
	public static void stringprint() {
		Scanner s = new Scanner(System.in);
		
		for (char i = 'a'; i != 'q';) {
			i = s.next().charAt(0);
			System.out.println(i);
		}
		s.close();
	}
	
	public static void intsum() {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i;
		int sum = 0;
		for (i = 1; sum < n; i++) {
			sum += i;
		}
		
		System.out.println(i-1);
		s.close();
	}
	
	public static void main(String[] args) {
		intsum();
	}

}