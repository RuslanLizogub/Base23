package week3.homework3;
/*
 *  Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()
 */
public class MainWing {

	public static void main(String[] args) {
		Plane plane1 = new Plane(100, 100);
		plane1.takeoff();
		int[][] coordinates = null;
		plane1.selectRoute(coordinates);
		plane1.printRoute();
	}

}
