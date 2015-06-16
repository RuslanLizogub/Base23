package week7.lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Kindergarten {
	public static void main(String[] args) {
		Friend gena = new Friend("Gena");
		Friend shpokl = new Friend("Shapoklyak");
		Cheburashka finderFriends = new Cheburashka();
		finderFriends.setName("Cheburashka");
		finderFriends.setMainFriend(gena);
		finderFriends.setFriend(shpokl);
		System.out.println(finderFriends.toString());
		serToFile(finderFriends);
		Cheburashka obj = serFromFile();
		System.out.println(obj.toString());
	}

	public static void serToFile(Cheburashka obj) {
		try (FileOutputStream fos = new FileOutputStream("cheburashka.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Cheburashka serFromFile() {
		Cheburashka objRet = null;
		try (FileInputStream fis = new FileInputStream("cheburashka.out");
				ObjectInputStream oin = new ObjectInputStream(fis);) {
			try {
				objRet = (Cheburashka) oin.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return objRet;

	}
}
