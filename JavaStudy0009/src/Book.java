import java.util.Scanner;

public class Book {

	String title;
	String author;
	void show() {
		System.out.println(title + " " + author);
	}
	
	/*public Book() {
		this("", "");
		System.out.println("생성자 호출됨");
	}*/
	
	public Book(String title) {
		this(title, "작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title; 
		if (author.equals("?")){
			this.author = "작가미상";
		}
		else {
			this.author = author;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, author;
		Scanner sc = new Scanner(System.in);
		System.out.print("b1 name: ");
		name = sc.next();
		System.out.print("b1 author: ");
		author = sc.next();
		Book b1 = new Book(name, author);
		System.out.print("b2 name: ");
		name = sc.next();
		System.out.print("b2 author: ");
		author = sc.next();
		Book b2 = new Book(name, author);
		b1.show();
		b2.show();
		sc.close();
	}
}
