package week4.lesson8;

/*
 * Task1. Написать рекурсивный метод, который принимает в качестве параметров k.
 Метод выводит числа от k до 2.
 */
public class Task1Recursion {
	public static void main(String[] args) {
		recursion(5);
	}

	public static void recursion(int k) {
		System.out.println(k);
		if (k > 2) {
			recursion(k - 1);
		}
	}
}
