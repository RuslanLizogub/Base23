package week3.homework2;

public class Calc {
	 AbstractProcessor proc;
	 public Calc(AbstractProcessor pr){
	  proc = pr;
	 }
	 public void inSymv(char c){
	  proc.inputChar ( с );
	  proc.printResult();
	 }
	}

