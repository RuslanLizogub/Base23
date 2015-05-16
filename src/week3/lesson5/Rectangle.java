package week3.lesson5;

public class Rectangle extends Figura {
	private double sideB;

	public Rectangle(double x, double y, double a, double b) {
		super(x, y, a);
		sideB = b;
		// super(x,y,a);
	}

	public Rectangle() {

	}

	@Override
	public double getPerimetr() {
		return (getSideA() + sideB) * 2;
	}

	@Override
	public double getSquare() {
		return (getSideA() * sideB);
	}
}
