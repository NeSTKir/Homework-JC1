package by.academy.homework.test1;

public class Test1 {
	private int x;
	private int y;

	public Test1() {
	}

	public Test1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void druken(int a, int b) {
		System.out.println("total = " + a + " number =" + b);
	}

	public static void sum(int a, int b) {
		int s;
		s = a + b;
		System.out.println("Sum of numbers = " + s);
		return;
	}

	public static void change(int a, int b) {
		a = 25;
		b = 35;
		return;
	}

	public static int max(int m, int n) {
		if (m > n) {
			return m;
		}
		return n;
	}

	public static void main(String[] args) {

		Test1 good = new Test1();

		int a;

		druken(1,4);

		good.x = 3;
		good.y = 5;

		a = max(good.x, good.y);

		change(good.x, good.y);

		sum(1, 5);

		System.out.println("max =" + a);

	}
}