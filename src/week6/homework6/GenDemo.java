package week6.homework6;

public class GenDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
		
		iOb.showType();
		
		int v = iOb.getOb();
		System.out.println("значение: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<String>("Обобщенный текст");
		strOb.showType();

		String str = strOb.getOb();
		System.out.println("Значение: " + str);
	}

}
