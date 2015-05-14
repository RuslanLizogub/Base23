package week2.homework2;

/*
 * Написать класс фирма (hw2.Firm), содержащий имя, адрес, зарплатный счет (сумма), сотрудников.
 У каждого сотрудника (hw2.Employee) есть имя, фамилия, ставка зарплаты (сумма), его личный карточный счет (сумма), год поступления на работу, месяц поступления на работу, пол, отдел.
 Класс фирма должен выполнять следующие функции:
 - Вывести всех сотрудников фирмы на экран (метод void printAllEmployees())
 - Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника, сумму равную зарплате сотрудника, с главного счета фирмы) (метод void giveSalaryForAll())
 - Пересчитать всем сотрудникам дни отпуска (всем кто проработал больше 6 месяцев, по 2 дня за каждый отработанный месяц) (метод void calcVocations())
 */
public class Firm {
	String name;
	String addres;
	int salaryAccount;
	
	Employee employee1 = new Employee("Vasia","Kozlov",1200,2000,2010,6,"male","Dev");
	Employee employee2 = new Employee("Kolia","Petrov",1500,3000,2011,5,"male","Sale");
	Employee employee3 = new Employee("Dima","Griwko",2200,4000,2013,3,"male","Qa");
	
	void printAllEmploees(){
		System.out.println(employee1.name);
	}
}
