class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
		public void moveUp() {
			this.z += 1;
		}
		public void moveDown() {
			this.z -= 1;
		}
		public void move(int x, int y, int z) {
			move(x, y);
			this.z = z;
		}
		public String toString() {
			return "점의 좌표는 (" + this.getX() + ", " + this.getY() +", " + z + ")";
		}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3은 x, y, z축의 값
		System.out.println(p.toString() + "입니다.");

		p.moveUp(); // z축으로 위로 1만큼 이동
		System.out.println(p.toString() + "입니다.");

		p.moveDown(); // z축으로 아래로 1만큼 이동
		p.move(10, 10); // x, y축 좌표를 (10, 10)으로 이동
		System.out.println(p.toString() + "입니다.");

		p.move(100, 200, 300); // x, y, z축 좌표를 (100, 200, 300)으로 이동
		System.out.println(p.toString() + "입니다.");
	}

}
