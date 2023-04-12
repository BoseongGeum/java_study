public class Circle {

	int radius;
	String name;
	
	/*public Circle() {
		this.radius = 1;
		this.name = "";
	}*/
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
}
	
	public static void main(String[] args) {
		/*Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);*/
		
		/*Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + area);
		
		Circle donut = new Circle();
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + area);*/
		
		Circle[] c = new Circle[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)(c[i].getArea()) + " ");
		}
	}
}
	

