package week3.lesson5;

public class Figura {
	private double xPos;
	private double yPos;
	private double sideA;

	public Figura() {
	}

	public double getPerimetr() {
		return 0;
	}

	public double getSquare() {
		return 0;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double a) {
		sideA = a;
	}

	public Figura(double x, double y, double a) {
		xPos = x;
		yPos = y;
		sideA = a;
	}
}
