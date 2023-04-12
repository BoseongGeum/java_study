abstract class Calculator{
	public abstract int add(int a,int b);
	public abstract int substract(int a, int b);
	public abstract double average(int[] a);
}

class GoodCalc extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int substract(int a, int b) {
		return a>b?a-b:b-a;
	}
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / (double)a.length;
	}
}

public class abstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc gc = new GoodCalc();
		System.out.println(gc.add(3, 4));
		System.out.println(gc.substract(3, 8));
		System.out.println(gc.average(new int[] {1,2,3,4}));
	}

}
