package week1.lesson2;

import java.io.FileReader;
import java.util.Scanner;

/*
 *  Task4.
	1) Написать метод, который в качестве параметра принимает имя файла.
	Метод возвращает двухмерный массив (String): имена переменных и значение.
	
	В файле набор переменных указаны так:
	;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe]; 
	Существуют правила форматирования текста в файле:
	 - имя переменной всегда стоит между симвоами ';' и '='
	 - значение переменной всегда идет после знака '=' и заключено в квадратные кавычки
	 - все что идет после квадратных кавычек до ';' являются служебными символами и в данной задаче они игнорируются
	
	2) В мейне:
	- создать массив, 
	- считать с консоли имя файла, 
	- передать его в метод 1
	- полученный массив передать в метод 2 (ВЫВОД НА ЭКРАН)
 */
public class Task4 {
	public static void main(String[] args) throws Exception{  
		String fileName = "variable.txt";
	    caesarCipter(fileName);
	}
	
	public static void caesarCipter(String fileName) throws Exception{  
		FileReader fr = new FileReader(fileName);
		  Scanner scan = new Scanner(fr);
		  String text = "";
		  int j = 0;
		  while (scan.hasNextLine()) {
			  if(j == 0){
				  text = text + scan.nextLine();
				  j = j + 1;
			  }else{
				  text = text + "\n" + scan.nextLine();
			  }
		  }
		scan.close();
		System.out.println(text);
	}
}
