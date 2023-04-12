import java.util.Scanner;

class StringStack implements Stack {
	private int cap; private String strStack[]; private int i = 0;
	
	public int length() {
		return i;
	}
	public int capacity() {
		return cap - length();
	}
	public String pop() {
		String s = strStack[length() - 1];
		strStack[length() - 1] = ""; i--;
		return s;
	}
	public Boolean push(String val) {
		if (this.capacity() == 0) return true;
		else {
			strStack[i] = val; i++; return false;
		}
	}
	public void stop() {
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int x = length(); x > 0; x--)
			System.out.print(pop() + " ");
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		this.cap = sc.nextInt();
		this.strStack = new String[cap];
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			
			if (str.equals("그만")) {
				stop(); break;
			}
			if (push(str)) {
				System.out.println("스택이 꽉차서 푸시 불가!");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		StringStack ss = new StringStack();
		ss.start();
	}
}
