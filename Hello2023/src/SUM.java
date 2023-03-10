import java.util.Scanner;

public class SUM {

	public static int Sum(int i, int j) {
		return i + j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int s = Sum(i, j);
		System.out.println(s);
		
	}

}
