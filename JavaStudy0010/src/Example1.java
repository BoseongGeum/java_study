class Point {
	private int x, y;
	public Point(){ }
	public Point(int x, int y){ this.x = x; this.y = y; }
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	protected void move(int x, int y){ this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String s) {
	super(x, y); this.color = s;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String s) {
		this.color = s;
	}
	public String toString() {
		return this.color + "색 점의 좌표는 (" + this.getX() + ", " + this.getY() + ")";
	}
}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다");
	}

}
