package week6.lesson11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test4Exception {
	public static void f() throws FileNotFoundException {
		FileReader fr = new FileReader("file1.txt");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
