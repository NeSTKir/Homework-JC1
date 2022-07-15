package by.academy.test.task2;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 0;
		int[] mas;

		n = querynumbers(n);
		mas = new int[n];
		method(mas);

	}

	public static int querynumbers(int n) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Skolko elementov budet w massive > ");
		n = sc.nextInt();
		System.out.println("n = " + n);
		return n;

	}

	public static void method(int[] mas) {
		int number;
		number = 0;
		int result;
		result = 0;

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
		}

		for (int i = 0; i < mas.length; i++) {
			if (((mas[i] > 15) || (mas[i] < 2))) {
				number = number + 1;
			}
		}
		System.out.println("number = " + number);

		for (int i = 0; i < mas.length; i++) {
			if (((mas[i] % 5) == 4)) {
				result = result + mas[i];
			}
		}
		System.out.println("result = " + result);

	}
}
