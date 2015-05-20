package week3.homework3;
/*
 *  Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()
 */
class Plane extends Wing{
	private int[][] planeCoordinates;
	
	public Plane(int volumeFuelWing1, int volumeFuelWing2) {
		super(volumeFuelWing1, volumeFuelWing2);
	}
	
	public void takeoff(){
		if(super.getVolumeFuelWing1() < 20 || super.getVolumeFuelWing2() < 20){
			System.out.println("Недостаточно топлива для взлета");
		}else{
			System.out.println("Взлет произведен успешно!");
			super.setVolumeFuelWing1(super.getVolumeFuelWing1() - 20);
			super.setVolumeFuelWing2(super.getVolumeFuelWing2() - 20);
		}
	}
	
	public void selectRoute(int[][] coordinates){
		coordinates = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
            	coordinates[i][j] = (int) (Math.random() * 9);
            }
        }
        this.planeCoordinates = coordinates;
        System.out.println("Маршрут внесен в масив");
	}
	
	public void printRoute(){
		for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(this.planeCoordinates[i][j]);
            }
            System.out.println();
        }
	}
}
