package by.academy.test.task3;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double a;
		double b;
		double h;
		x = 0;
		a = 1;
		b = 10;
		h = 1;
		y = 0;

		method(x, a, b, h, y);
	}

	public static void method(double x, double a, double b, double h, double y) {

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for (x = a; x <= b; x = x + h) {
			y = Math.tan(x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
		return;

	}

}
