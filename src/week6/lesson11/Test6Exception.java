package week6.lesson11;

public class Test6Exception {
	public class MyException extends Exception {
		public MyException(String message) {
			super(message);
		}

		@Override
		public String getMessage() {
			return "MyException: " + super.getMessage();
		}
	}
}
