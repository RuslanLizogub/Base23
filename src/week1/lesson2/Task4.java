package week1.lesson2;

import java.io.FileReader;
import java.util.ArrayList;
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
		String variableSet[][];
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine();
		variableSet = arrayString(fileName);
	    outInConsole(variableSet);
	}
	
	public static void  outInConsole(String[][] variableSet){  
		int lengthVariableSet = variableSet.length;
		for(int i = 0; i < lengthVariableSet; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(variableSet[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static String[][] arrayString(String fileName) throws Exception{  
		FileReader fr = new FileReader(fileName);
		Scanner scan = new Scanner(fr);
		String text = scan.nextLine();
		scan.close();
		
		//достаем масив переменных
		String[] oneIteration = text.split(";");
		int lengthOneIteration = oneIteration.length;
		ArrayList<String> variableName = new ArrayList<>();
		for(int i = 1; i < lengthOneIteration; i++){
			String variable = "";
			variable = oneIteration[i];
			String[] twoIteration = variable.split("=");
			variableName.add(twoIteration[0]);
		}
	
		//достаем масив значений переменных
		String[] twoIteration = text.split("\\[");
		int lengthTwoIteration = twoIteration.length;
	
		ArrayList<String> variableValue = new ArrayList<String>();
		for(int i = 0; i < lengthTwoIteration; i++){
			String variable2 = "";
			variable2 = twoIteration[i];
			if(variable2.indexOf(']') >= 0){
			String[] twoIteration1 = variable2.split("]");
			    if(twoIteration1.length > 0){
				variableValue.add(twoIteration1[0]);
			    }
			}
		}
	
		
		//Помещаем значения в динамический масив и возвращаем его
		int lengthVariableName = variableName.size();
		int lengthVariableValue = variableValue.size();
		
		String[][] result;
		result = new String[lengthVariableName][2];
		for(int i = 0;i < lengthVariableName; i++){
			for(int j = 0;j < 2; j++){
				if(j == 0){
					result[i][j] =  variableName.get(i);	
				}else{
					result[i][j] =  variableValue.get(i);
				}
			} 
		}
		
		return result;
	}
}
