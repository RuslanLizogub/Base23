package week6.homework6;

public class Gen<T> {
	T ob;
	
	Gen (T ob){
		this.ob = ob;
	}
		
	T getOb(){
		return ob;
	}
	
	void showType(){
		System.out.println("Типом Т является " + ob.getClass().getName());
	}
}
