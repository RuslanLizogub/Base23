package week2.lesson3;

public class Car {
	private String color;
	private String marka;
	private String number;
	private static int count = 0;

	public void setColor(String color) { // сеттер
		if (color.equals("Black"))
			this.color = color;
		if (color.equals("Red"))
			this.color = color;
		if (color.equals("White"))
			this.color = color;
	}

	public String getColor() { // геттер
		return color;
	}

	public Car() {
		this("AA 1111 AA");
	}

	public Car(String number) {
		this(number, "Black");
	}

	public Car(String number, String color) {
		this.number = number;
		setColor(color);
		count++;
	}

	public static int getCount() {
		return count;
	}

	// --------------
	public void setMarka(String marka) { // сеттер
		if (marka.equals("BMW"))
			this.marka = marka;
	}

	public String getMarka() { // геттер
		return marka;
	}

	// --------------
	public void setNumber(String number) { // сеттер
		if (number.equals("AAA 999"))
			this.number = number;
	}

	public String getNumber() { // геттер
		return number;
	}
}
