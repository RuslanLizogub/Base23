package week4.lesson8;

public class Local {
	//Local 
	 public static void main(String[] args){
	  final String name1 = "Name1";
	  String name2 = "Name2";
	  //Локальный класс-доступ к полям обрамляющего класса(с учетом static и non-static) и к 
	  //локальным переменным обрамляющего метода обьявленными final 
	  class InnerLocal{
	   public void func(){
	    
	    //System.out.println(name1 +" "+ nameStatic);
	    //System.out.println(name2);//error
	  }
	  }
	 }
}
