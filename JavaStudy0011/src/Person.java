import java.util.Scanner;

public class Person {
	private String name;
	private int [] number;
	
	public Person(String name) {
	this.name = name; this.number = new int[3];
	}
	
	public String toString() {
		return "[" + this.name + "] : <Enter>";
	}
	
	public void selectNumber() { 
		for (int x = 0; x < 3; x++) {
			int n = (int) (Math.random() * 3 + 1);
			this.number[x] = n;
		}
		for (int x = 0; x < 3; x++) {
			System.out.print(this.number[x] + " ");
		}
	}
	
	public boolean checkWin() { 
		if (this.number[0] == this.number[1] && this.number[1] == this.number[2]) {
			return true;
		}
		else return false;
	}
	
	public boolean game() {
		Scanner sc = new Scanner(System.in);
		System.out.print(this.toString()); 
		sc.nextLine();         
		selectNumber();
		if (checkWin()) {
			System.out.println("\t"+ this.name + "님이 이겼습니다.!!!"); 
			return true;
		}
		else {
			System.out.println("\t아쉽군요!"); 
			return false;
		}
	}
}
