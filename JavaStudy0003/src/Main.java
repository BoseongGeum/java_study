import java.util.Scanner;

public class Main {

	public static void Hello() {
		System.out.printf("Hello");
	}
	
	public static void HelloWorld() {
		System.out.printf("Hello World");
	}
	
	public static void HelloWorld2() {
		System.out.printf("Hello\nWorld");
	}
	
	public static void Hello2() {
		System.out.printf("'Hello'");
	}
	
	public static void HelloWorld3() {
		System.out.printf("\"Hello World\"");
	}
	
	public static void special() {
		System.out.printf("\"!@#$%%^&*()\"");
	}
	
	public static void fileroot() {
		System.out.printf("\"C:\\Download\\hello.cpp\"");
	}
	
	public static void my_int1() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n);
		sc.close();
	}
	
	public static void my_string1() {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		System.out.println(x);
		sc.close();
	}
	
	public static void my_float1() {
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		System.out.printf("%f", x);
		sc.close();
	}
	
	public static void my_int2() {
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		System.out.println(n + " " + m);
		sc.close();
	}
	
	public static void my_string2() {
		Scanner sc = new Scanner(System.in);
		
		String x, y;
		x = sc.next();
		y = sc.next();
		
		System.out.println(y + " " + x);
		sc.close();
	}
	
	public static void my_float2() {
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		System.out.printf("%.2f", x);
		sc.close();
	}
	
	public static void my_int3() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(n+" "+n+" "+n);
		sc.close();
	}
	
	public static void time() {
		Scanner sc = new Scanner(System.in);
		
		String time;
		
		time = sc.next();
		
		System.out.println(time);
		sc.close();
	}
	
	public static void today() {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		
		String[] day = time.split("\\.");
		String a = day[0];
		int year = Integer.parseInt(a);
		String b = day[1];
		int month = Integer.parseInt(b);
		String c = day[2];
		int date = Integer.parseInt(c);
		
		System.out.printf("%04d.%02d.%02d", year, month, date);
		sc.close();
	}
	
	public static void number() {
		Scanner sc = new Scanner(System.in);
		
		String time = sc.next();
		
		String[] day = time.split("-");
		String a = day[0];
		String b = day[1];
		
		System.out.printf(a+b);
		sc.close();
	}
	
	public static void my_string3() {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		
		System.out.println(x);
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_string3();
	}

}
