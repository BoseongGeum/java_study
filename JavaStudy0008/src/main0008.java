import java.util.Scanner;
import java.util.InputMismatchException;

public class main0008 {

	public static void main(String[] args) {
		main0008 m = new main0008();
		m.ex3();
		
	}
	public void sum() {
		int i, s = 0;
		
		for (i = 1; i <= 10; i ++) {
			s += i;
			System.out.print(i);
			
			if (i < 10) {
				System.out.print(" + ");
			}
			else {
				System.out.print(" = ");
				System.out.println(s);
			}
		}
	}
	
	public void ave() {
		Scanner sc = new Scanner(System.in);
		
		int n, count = 0;
		double s = 0;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while ((n = sc.nextInt()) != 0){
			count += 1;
			s += n;
			}
		
		System.out.println("수의 개수는 " + count +"개이며 평균은 " + s / count + "입니다.");
		sc.close();
		}
	
	public void dowhile() {
		char a = 'a';
		do {
			System.out.print(a);
			a = (char)(a + 1);
		} while(a <= 'z');
		
		}
	
	public void Break() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("if you input 'exit', program will finish.");
		while (true) {
			System.out.print(">>> ");
			String n = sc.next();
			
			if (n.equals("exit")) {
				System.out.println("...closing...");
				break;
			}
		}
		sc.close();
	}
	
	public void googoodan() {
		
		for (int i = 1; i < 10; i ++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
	
	public void sum5() {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		
		for (int i = 1; i <= 5; i ++) {
			int n = sc.nextInt();
			s += n;
			}
		System.out.println(s);
		sc.close();
		}
	
	public void sum3() {
		int s = 0;
		
		for (int i = 1; i <= 100; i ++) {
			if (i % 3 == 0) {
				s += i;
			}
		}
		System.out.println(s);
	}
	
	public void ave2() {
		Scanner sc = new Scanner(System.in);
		double s = 0;
		int a[] = new int[5];
		
		System.out.println("Input 5 integers.");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println("The average is " + s / a.length);
		sc.close();
		}
	
	public void foreach() {
		
		int ia[] = {1,2,3,4,5};
		int s = 0;
		for(int k : ia) {
			s += k;
		}
		System.out.println(s);
		
		String sa[] = {"apple","pear","cherry","banana","strawberry","grape"};
		for(String j : sa) {
			System.out.print(j + ' ');
		}
	}
	
	public void scoreave() {
		
		double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum = 0;
		int y = score.length;
		int t = score[0].length;
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < t; j++) {
				sum += score[i][j];
			}
		}
		System.out.println("4년 전체 평점 평균은 " + sum / (y*t));
		}
	
	int[] makearray() {
		int temp[] = new int[4];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = i;	
		}
		return temp;
	}
	
	public void exception() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		try {
			System.out.println(n / m);
		}
		catch (ArithmeticException e){
			System.out.println("error");
		}
		finally {
			sc.close();
		}
	}
	
	public void exception2() {
		Scanner sc = new Scanner(System.in);
		int n = 0, s = 0;
		
		for (int i = 1; i <= 3; i ++) {
			System.out.print(i + " >> ");
			
		try {
			n = sc.nextInt();
		}
		catch (InputMismatchException e){
			System.out.println("error");
			sc.next();
			i--;
			continue;
		}
		s += n;
		}
		System.out.println(s);
		sc.close();
	}
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int num[] = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			}
		for (int k : num) {
			m = (m>k)?m:k;
		}
		System.out.println(m);
		sc.close();
	}
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		int c = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			}
		for (int k : num) {
			if (k % 2 == 1) {
				c += 1;
			}
		}
		System.out.println(c);
		sc.close();
	}
	
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		while(true) {
			System.out.print("과목 이름 >> ");
			String n = sc.next();
			if (n.equals("그만")) {
				break;
			}
			for (int i = 0; i <= score.length; i++) {
				if (i == score.length) {
					System.out.println("없는 과목입니다.");
					}
				else if (n.equals(course[i])) {
					System.out.println(n + "의 점수는 "+ score[i]);
					break;
				}
				
			}	
		}
		sc.close();
	}
}