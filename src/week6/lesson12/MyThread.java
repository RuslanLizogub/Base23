package week6.lesson12;

public class MyThread extends Thread{
	private String name;
	public MyThread(String n){
		name = n;
	}
	@Override
	public void run(){
		for (int i = 0; i < 2000; i++) {
			System.out.println(name+"_"+i);
		}
	}
}
