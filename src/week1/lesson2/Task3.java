package week1.lesson2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Task3. Шифр Цезаря с ключом например 3.
   Написать метод, который принимает имя файла и шифрует содержимое файла шифром Цезаря.
   Реализовать Шифрование (каждый символ смещается по таблице символов на 3 элемента вправо А в D)
   и Дешифрование (каждый символ смещается по таблице символов на 3 элемента влево E в B)
   Например: abe15 -> cdh48
   Изначально файл содержит несколько строк. Пробеллы и переходы на следующую строку не шифруются.
 */
public class Task3 {
	public static void main(String[] args) throws Exception{
		  String fileName = "caesarText.txt";
		  int key = 3;
		  caesarCipter(fileName,key);// создает в текущей дериктории текстовый файл caesarCipter.txt и записывает туда щифр по указанному ключю
	}
	
	public static void caesarCipter(String fileName,int key) throws Exception{
		// читаем содержимое с файла и заносим в строку  
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
		  
		  // создаем строку с текстовыми и числовыми символами
		  String submbolForCipter = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыь0123456789 " + "\n";
		  
		  //создаем строку со смещением по ключу
		  String valueOnKey = "";
		  for(int i = 0; i < submbolForCipter.length(); i++){
			  valueOnKey = valueOnKey + submbolForCipter.charAt((i + key)%submbolForCipter.length());
		  }
		  
		  //проверяем елементы текста по отношению к submbolForCipter и подставляем значения по индексу с valueOnKey 
		  String result = "";
		  for (int i = 0; i < text.length(); i++){
			  int indexSubmbolForCipter = submbolForCipter.indexOf(text.charAt(i));
			  if (indexSubmbolForCipter > -1){
				  result = result + valueOnKey.charAt(indexSubmbolForCipter);
			  }
		  }
		  
		  // возврат данных в указанный файл
		  FileWriter fw = new FileWriter("caesarCipter.txt");
		  fw.write(result);
		  fw.flush();
		  fw.close();
	}
}
