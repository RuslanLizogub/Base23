package week3.lesson5;

public class Triangle extends Figura {
	private double sideB;
	private double sideC;
	public Triangle(double sideA,double sideB) {
		super(sideA, sideB, sideB);
		this.sideB = sideB;
	}

	@Override
	public double getPerimetr(){
		double perimetr;
		perimetr = this.sideB + this.sideC + super.getSideA();
		return perimetr;
	}
	@Override
	public double getSquare(){
		double square;
		square = (this.sideB * super.getSideA()) / 2;
		return square;
	}
}
