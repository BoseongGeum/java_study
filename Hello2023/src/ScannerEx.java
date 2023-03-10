import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		String city = sc.next();
		System.out.println("당신의 이름은 " + city + "입니다.");
		int age = sc.nextInt();
		System.out.println("당신의 이름은 " + age + "입니다.");
		double weight = sc.nextDouble();
		System.out.println("당신의 이름은 " + weight + "입니다.");
		boolean single = sc.nextBoolean();
		System.out.println("당신의 이름은 " + single + "입니다.");
		
	}

}
