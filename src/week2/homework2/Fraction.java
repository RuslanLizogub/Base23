package week2.homework2;
/*
 * Написать класс дробь (hw2.Fraction), выполняющий следующие действия:
	- сложение дробей (метод Fraction add(Fraction frac))
	- вычитание (метод Fraction sub(Fraction frac))
	- умножение (метод Fraction mul(Fraction frac))
	- деление (метод Fraction div(Fraction frac))
	- приведение к строке(метод String toString())
	- вывод (метод void print())
 */
public class Fraction {
	double frac;
	
	public void setFrac(double f){
		frac = f;
	}
	public double getFrac(){
		return frac;
	}
	
	public Fraction(double f){
		frac = f;
	}
	
	public Fraction add(Fraction frac){
		double add = this.frac + frac.getFrac();
		Fraction addObj = new Fraction(add);
		return addObj;
	}
	
	public Fraction sub(Fraction frac){
		double sub = this.frac - frac.getFrac();
		Fraction addObj = new Fraction(sub);
		return addObj;
	}
	
	public Fraction mul(Fraction frac){
		double mul = this.frac * frac.getFrac();
		Fraction addObj = new Fraction(mul);
		return addObj;
	}
	
	public Fraction div(Fraction frac){
		double div = this.frac / frac.getFrac();
		Fraction addObj = new Fraction(div);
		return addObj;
	}
	
	public String toString(){
		double div = this.frac;
		String str = Double.toString(div);
		return str;
	}
	
	public void print(){
		System.out.println(frac);	
	}

}
