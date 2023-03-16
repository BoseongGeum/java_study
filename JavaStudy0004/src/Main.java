import java.util.Scanner;

public class Main {
	
	public static void print() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(s);
		
		sc.close();
		}
	
	public static void float_split() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] point = s.split("\\.");
		String a = point[0];
		System.out.println(a);
		String b = point[1];
		System.out.println(b);
		
		sc.close();
		}
	
	public static void English() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			System.out.printf("\'%s\'%n", s.substring(i, i+1));
		}
		
		sc.close();
		}
	
	public static void printInt() {
		Scanner sc = new Scanner(System.in);
		
		int j = sc.nextInt();
		for(int i = 4; i > -1; i--) {
			int k = (j / (int)Math.pow(10, i)) * (int)Math.pow(10, i);
			System.out.printf("[%d]%n", k);
			j -= k;
		}
		
		sc.close();
		}
	
	public static void printMinute() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] time = s.split(":");
		int m = Integer.parseInt(time[1]);
		System.out.println(m);
		
		sc.close();
		}
	
	public static void printDate() {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String[] date = s.split("\\.");
		String y = date[0];
		String m = date[1];
		String d = date[2];
		System.out.println(d+'-'+m+'-'+y);
		
		sc.close();
		}
	
	public static void printInt2() {
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextLong();
		
		System.out.println(i);
		
		sc.close();
		}
	
	public static void printDouble() {
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextDouble();
		
		System.out.printf("%.11f", i);
		
		sc.close();
		}
	
	public static void printInt3() {
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextLong();
		
		System.out.println(i);
		
		sc.close();
		}
	
	public static void octal() {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.printf("%o", i);
		
		sc.close();
		}
	
	public static void hexadecimal() {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		System.out.printf("%X", i);
		
		sc.close();
		}
	
	public static void oc_to_de() {
		Scanner sc = new Scanner(System.in);
		
		String i = sc.next();
		
		int j = Integer.parseInt(i, 8);
		
		System.out.println(j);
		
		sc.close();
		}
	
	public static void he_to_oc() {
		Scanner sc = new Scanner(System.in);
		
		String i = sc.next();
		
		int j = Integer.parseInt(i, 16);
		
		System.out.printf("%o", j);
		
		sc.close();
		}
	
	public static void AskiiNumber() {
		Scanner sc = new Scanner(System.in);
		
		char i = sc.next().charAt(0);
		int j = (int)i;
		System.out.println(j);
		
		sc.close();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AskiiNumber();
	}

}
