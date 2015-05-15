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
	
	void setSalaryAccount(int s){
		salaryAccount = s;
	}
	int getSalaryAccount(){
		return salaryAccount;
	}
	
	Employee employee1 = new Employee("Vasia","Kozlov",1200,2000,2014,6,"male","Dev");
	Employee employee2 = new Employee("Kolia","Petrov",1500,3000,2015,1,"male","Sale");
	Employee employee3 = new Employee("Dima","Griwko",2200,4000,2013,12,"male","Qa");
	
	//количество дней отпуска каждого сотрудника
	void calcVocations(){
		int countMonthEmployee1 = (2015 * 12 + 5) - (employee1.yearOfAcquisition * 12 + employee1.monthOfAcquisition);
		int countMonthEmployee2 = (2015 * 12 + 5) - (employee2.yearOfAcquisition * 12 + employee2.monthOfAcquisition);
		int countMonthEmployee3 = (2015 * 12 + 5) - (employee3.yearOfAcquisition * 12 + employee3.monthOfAcquisition);
		System.out.println("Количество месяцев отпуска у сотрудника employee1 = " + countMonthEmployee1);
		System.out.println("Количество месяцев отпуска у сотрудника employee2 = " + countMonthEmployee2);
		System.out.println("Количество месяцев отпуска у сотрудника employee3 = " + countMonthEmployee3);
	}
	
	void giveSalaryForAll(){
		//выдача зп employee1
		if(this.salaryAccount >= employee1.salaryAmount){
			employee1.cardAccount = employee1.cardAccount + employee1.salaryAmount;//зачисляем зп на счет работника
			this.salaryAccount = this.salaryAccount - employee1.salaryAmount;//вычитаем со счета фирмы выданную зп
			System.out.println("На счет сотрудника " + employee1.name + " зачисленно " + employee1.salaryAmount + "грн.");
		}else{
			System.out.println("Недостаточно денег на балансе фирмы для выдачи ЗП.");
		}
		//выдача зп employee2
		if(this.salaryAccount >= employee2.salaryAmount){
			employee2.cardAccount = employee2.cardAccount + employee2.salaryAmount;//зачисляем зп на счет работника
			this.salaryAccount = this.salaryAccount - employee2.salaryAmount;//вычитаем со счета фирмы выданную зп
			System.out.println("На счет сотрудника " + employee2.name + " зачисленно " + employee2.salaryAmount + "грн.");
		}else{
			System.out.println("Недостаточно денег на балансе фирмы для выдачи ЗП.");
		}
		//выдача зп employee3
		if(this.salaryAccount >= employee3.salaryAmount){
			employee3.cardAccount = employee3.cardAccount + employee3.salaryAmount;//зачисляем зп на счет работника
			this.salaryAccount = this.salaryAccount - employee3.salaryAmount;//вычитаем со счета фирмы выданную зп
			System.out.println("На счет сотрудника " + employee3.name + " зачисленно " + employee3.salaryAmount + "грн.");
		}else{
			System.out.println("Недостаточно денег на балансе фирмы для выдачи ЗП.");
		}
	}
	
	void printAllEmploees(){
		System.out.println("Информация о сотрудниках.\n");
		System.out.println("Имя: " + employee1.name + ".\n" + 
							"Фамилия: " + employee1.surname + ".\n" + 
							"Ставка зарплаты(сумма): " + employee1.salaryAmount + ".\n" + 
							"Личный карточный счет(сумма): " + employee1.cardAccount + ".\n" + 
							"Год поступления на работу: " + employee1.yearOfAcquisition + ".\n" +
							"Месяц поступления на работу: " + employee1.monthOfAcquisition + ".\n" + 
							"Пол: " + employee1.gender + ".\n" +
							"Отдел: " + employee1.department + ".");
		System.out.println("---------------------------------");
		
		System.out.println("Имя: " + employee2.name + ".\n" + 
				"Фамилия: " + employee2.surname + ".\n" + 
				"Ставка зарплаты(сумма): " + employee2.salaryAmount + ".\n" + 
				"Личный карточный счет(сумма): " + employee2.cardAccount + ".\n" + 
				"Год поступления на работу: " + employee2.yearOfAcquisition + ".\n" +
				"Месяц поступления на работу: " + employee2.monthOfAcquisition + ".\n" + 
				"Пол: " + employee2.gender + ".\n" +
				"Отдел: " + employee2.department + ".");
		System.out.println("---------------------------------");
		
		System.out.println("Имя: " + employee3.name + ".\n" + 
				"Фамилия: " + employee3.surname + ".\n" + 
				"Ставка зарплаты(сумма): " + employee3.salaryAmount + ".\n" + 
				"Личный карточный счет(сумма): " + employee3.cardAccount + ".\n" + 
				"Год поступления на работу: " + employee3.yearOfAcquisition + ".\n" +
				"Месяц поступления на работу: " + employee3.monthOfAcquisition + ".\n" + 
				"Пол: " + employee3.gender + ".\n" +
				"Отдел: " + employee3.department + ".");
		System.out.println("---------------------------------");
	}
}
