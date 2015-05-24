package week4.homework4;

// Task3. Написать метод, который считает факториал для числа n.
public class Task3Recursion {
	public static void main(String[] args) {
		factorial(5);
	}

	public static int factorial(int k) {
		int result;
		
		if (k == 0 || k == 1){
			return 1;
		}
		result = factorial(k - 1) * k;
	
		System.out.println(result);
		
		return result;
	}
}
