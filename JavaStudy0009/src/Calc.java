class calc {
	public static int abs(int a) {
		return a>0? a: -a;
	}
	public static int max(int a, int b) {
		return a > b? a:b;
	}
	public static int min(int a, int b) {
		return a<b?a:b;
	}
}
public class Calc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calc.abs(-5));
		System.out.println(calc.max(10,8));
		System.out.println(calc.min(-3, -8));
	}

}
