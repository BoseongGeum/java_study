import  java.util.Scanner;

public class sumNave {

	public static double sum(double i, double j, double k) {
		
		double s = i + j + k;
		return s;
	}
	
	public static double ave(double s) {
		return s / 3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double i = sc.nextInt();
		double j = sc.nextInt();
		double k = sc.nextInt();
		
		double s = sum(i, j, k);
		double a = ave(s);
		
		System.out.println(s);
		System.out.println(a);
	}

}
