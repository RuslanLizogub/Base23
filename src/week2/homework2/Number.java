package week2.homework2;
/*
 *  Написать класс число (hw2.Number), выполняющий следующие операции:
 - получение примитива (метод int get())
 - сложение (метод Number add(Number num))
 - вычитание (метод Number sub(Number num))
 - умножение (метод Number mul(Number num))
 - деление (метод Number div(Number num))
 - возведение в степень (метод Number pow(Number exponent))
 - вычисление факториала (метод Number fact())
 - вычисление остатка от деления (метод Number mod(Number num)) 
 */
public class Number {
	private int value;
	public void set(int k){
		value = k;
	}
	public int get(){
		return value;
	}
	public Number(int k){
		value = k;
	}
	public Number add(Number num){
		int summa = this.value + num.get();
		Number objNum = new Number(summa);
		return objNum;
	}
	
	public Number sub(Number num){
		int sub = this.value - num.get();
		Number objNum = new Number(sub);
		return objNum;
	}
	
	public Number mul(Number num){
		int mul = this.value * num.get();
		Number objNum = new Number(mul);
		return objNum;
	}

	public Number div(Number num){
		int mul = this.value / num.get();
		Number objNum = new Number(mul);
		return objNum;
	}

	public Number pow(Number exponent){
		double powDouble = Math.pow(this.value,exponent.get());
		int pow = (int) powDouble;
		Number objNum = new Number(pow);
		return objNum;
	}
	
	public Number fact(){
		int fact = this.value;
		int result = 1;
		for(int i = 1; i <= fact; i++){
			result = result * i;
		}
		Number objNum = new Number(result);
		return objNum;
	}
	
	public Number mod(Number num){
		int pow = this.value % num.get();
		Number objNum = new Number(pow);
		return objNum;
	}
}
