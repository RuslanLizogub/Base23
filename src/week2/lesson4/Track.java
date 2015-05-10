package week2.lesson4;

/*
 * 2) Создать класс Track()(String number;)
 Методы:
 roll() - начать катиться( не должен повторно катиться, если уже катится)
 stop() - остановить качение( не должен повторно остановиться, если уже остановлено) 
 В мейне: 
 - создать два объекта прицепов
 - оба катим, 
 - первый пытаемся катить еще раз
 - все прицепы останавливаем
 - второй опять останавливаем
 */
public class Track {
	private Car car;
	private String number;
	int status = 1;// 0 - катится, 1 - стоит

	public Track (String number){
		this.number = number;
	}
	
	public void roll(){
		   if(status == 1){
			   System.out.println("Прицеп с номером " + number + " покатился.");
			   status = 0;
		   }else{
			   System.out.println("Прицеп с " + number + " не могу катится так как уже качусь.");
		   }
	}
	
	public void stop(){
		   if(status == 0){
			   System.out.println("Прицеп с номером " + number + " остановился.");
			   status = 1;
		   }else{
			   System.out.println("Прицеп с " + number + " не могу остановится так как уже стою.");
		   }
	}

}
