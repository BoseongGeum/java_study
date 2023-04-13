import java.util.Scanner;

public class GamblingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GamblingGame gg = new GamblingGame();
		gg.go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번째 선수 이름 >> ");
		String fstr = sc.next();
		System.out.print("2번째 선수 이름 >> ");
		String sstr = sc.next();
		
		Person p1 = new Person(fstr);
		Person p2 = new Person(sstr);
		
		while (true) {
		if (p1.game()) break;
		if (p2.game()) break;
		}
		sc.close();
	}

}
