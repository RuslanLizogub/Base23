package week6.lesson11;

public class Test2Exception {
	public static void main(String[] args) {
		int x = 10;
		// int y = 0;
		double y = 0;
		try {
			double res = x / y;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println("ОШИБКА !!!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
