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
public class MainFraction {
	
	public static void main(String[] args) {
		Fraction a = new Fraction(3.133);
		Fraction b = new Fraction(5.342);
		Fraction add = a.add(b);
		Fraction sub = a.sub(b);
		Fraction mul = a.mul(b);
		Fraction div = a.div(b);
		String toString = a.toString();
		System.out.println(add.getFrac());
		System.out.println(sub.getFrac());
		System.out.println(mul.getFrac());
		System.out.println(div.getFrac());
		System.out.println(toString);
		a.print();
		b.print();
	}
}
