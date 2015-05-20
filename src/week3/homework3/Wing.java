package week3.homework3;
/*
 *  Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()
 */
public class Wing {
	private int volumeFuelWing1;
	private int volumeFuelWing2;
	
	public int getVolumeFuelWing1() {
		return volumeFuelWing1;
	}
	public void setVolumeFuelWing1(int volumeFuelWing1) {
		this.volumeFuelWing1 = volumeFuelWing1;
	}
	public int getVolumeFuelWing2() {
		return volumeFuelWing2;
	}
	public void setVolumeFuelWing2(int volumeFuelWing2) {
		this.volumeFuelWing2 = volumeFuelWing2;
	}
	
	public Wing(int volumeFuelWing1, int volumeFuelWing2){
		this.volumeFuelWing1 = volumeFuelWing1;
		this.volumeFuelWing2 = volumeFuelWing2;
	}
}
