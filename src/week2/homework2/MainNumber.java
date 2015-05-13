package week2.homework2;

public class MainNumber {

	public static void main(String[] args) {
		Number a = new Number(77);
		Number b = new Number(8);
		Number c = a.add(b);
		Number d = b.sub(a);
		Number e = a.mul(b);
		Number div = b.div(a);
		Number pow = a.pow(b);
		Number fact = a.fact();
		Number mod = a.mod(b);
		System.out.println(c.get());
		System.out.println(d.get());
		System.out.println(e.get());
		System.out.println(div.get());
		System.out.println(pow.get());
		System.out.println(fact.get());
		System.out.println(mod.get());
	}
}
