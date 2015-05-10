package week2.lesson3;
/*
 * Задача 4. Написать класс число (MyInteger). 
  Хранить значение в поле private int value, соответсвенно к полю геттер и сеттер.
  Реализовать метод plus.
class MainMyInteger{
 public static void main(String[] args){
  MyInteger a = new MyInteger(10);
  MyInteger b = new MyInteger(20);
  MyInteger c = a.plus( b );
  System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue())
 }
}
 */
public class MyInteger {
	private int value;
	public void MyInteger(){
		//this.value = value;
		value = 10;
	}
	
	int getValue() {
    	return value * value;
    }
	/*
	public void setValue(int value){ //сеттер
		this.value = value;
	}
	public int getValue(){ //геттер
		 return value;
	}
	*/

}
