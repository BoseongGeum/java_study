import java.util.Scanner;

public class Seoson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12)을 입력하세요: ");
		int month = sc.nextInt();
		
		switch(month){
			
			case 3:case 4:case 5:
				System.out.println("It's spring.");
				break;
			case 6: case 7: case 8:
				System.out.println("It's summer.");
				break;
			case 9: case 10: case 11:
				System.out.println("It's fall.");
				break;
			case 12: case 1: case 2:
				System.out.println("It's winter.");
				break;
			default:
				System.out.println("error!");
		}
		
		sc.close();
	}

}
