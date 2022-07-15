package by.academy.test.task1;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double result;
		result = 0;
		x = 2;
		y = 2;

		method(x, y, result);
	}

	public static void method(double x, double y, double result) {

		result = (1 + Math.sin(x + y) * Math.sin(x + y))
				/ (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2))) + x);

		System.out.println("Result of the funtion =  " + result);
		return;

	}

}
