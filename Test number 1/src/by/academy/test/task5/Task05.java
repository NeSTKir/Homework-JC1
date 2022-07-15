package by.academy.test.task5;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mas = { 1, 3, 8, 7, 4, 9, 10, 5, 11, 16, 12 };

		method(mas);

	}

	public static void method(int[] mas) {
		int max;
		max = 0;
		int number;
		number = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				System.out.print("mas [" + i + "] = " + mas[i] + "; ");
			} else {
				++number;
			}
		}
		System.out.println();
		System.out.print("N = " + number);
		return;
	}

}
