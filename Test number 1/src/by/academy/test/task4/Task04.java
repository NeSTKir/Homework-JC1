package by.academy.test.task4;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

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

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.println("mas[" + i + "] = " + mas[i] + "; ");
		}

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % 2 != 0) && ((mas[i] / mas[i]) == 1)) {
				System.out.println("number of the prime number = " + i + "; ");
			}
		}
	}

}
