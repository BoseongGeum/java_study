import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public Rectangle(int width, int height) {
		this.width = width; this.height = height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); int h = sc.nextInt();
		Rectangle rec = new Rectangle(w, h);
		
		System.out.println(rec.getArea());
		sc.close();
	}

}
