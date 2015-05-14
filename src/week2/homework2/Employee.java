package week2.homework2;
/*
 * Написать класс фирма (hw2.Firm), содержащий имя, адрес, зарплатный счет (сумма), сотрудников.
 У каждого сотрудника (hw2.Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), год поступления на работу, месяц поступления на работу, пол, отдел.
 Класс фирма должен выполнять следующие функции:
 - Вывести всех сотрудников фирмы на экран (метод void printAllEmployees())
 - Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника, с главного счета фирмы) (метод void giveSalaryForAll())
 - Пересчитать всем сотрудникам дни отпуска (всем кто проработал больше 6 месяцев, по 2 дня за каждый отработанный месяц) (метод void calcVocations())
 */
public class Employee {
	String name;
	String surname;
	int salaryAmount;
	int cardAccount;
	int yearOfAcquisition;
	int monthOfAcquisition;
	String gender;
	String department;
	
	public Employee(String name1,String surname1,int salaryAmount1,int cardAccount1,int yearOfAcquisition1,int monthOfAcquisition1,String gender1,String department1){
		name = name1;
		surname = surname1;
		salaryAmount = salaryAmount1;
		cardAccount = cardAccount1;
		yearOfAcquisition = yearOfAcquisition1;
		monthOfAcquisition = monthOfAcquisition1;
		gender = gender1;
		department = department1;
	}
	
	
}
