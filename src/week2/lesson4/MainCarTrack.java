package week2.lesson4;

public class MainCarTrack {
	public static void main(String[] args) {
		Track track = new Track("AAA 111");
		Track track2 = new Track("AAA 222");
		Car car1 = new Car("111","black");
		Car car2 = new Car("222","yellow");
		Car car3 = new Car("333","white");
		
		car1.move();
		car2.move();
		car3.move();
		
		track.roll();
		track2.roll();
		
		track.roll();
		
		track.stop();
		track2.stop();
		
		track2.stop();
	}
}
