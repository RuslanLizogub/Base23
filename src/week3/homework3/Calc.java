package week3.homework3;

public class Calc {
	AbstractProcessor proc;

	public Calc(AbstractProcessor pr) {
		proc = pr;
	}

	public void inSymv(char c) {
		proc.inputChar(c);
		proc.printResult();
	}
}
