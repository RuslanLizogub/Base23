package week3.homework3;

public class TestProcessor extends AbstractProcessor {

	@Override
	public void inputChar(char c) {
		System.out.println("Введено " + c);
		setResult(c - (int) ('0')/* getResult()+1 */);
	}
}
