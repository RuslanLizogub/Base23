package week7.lesson13;

import java.io.Serializable;

class Cheburashka implements Serializable {
	private String name = "Cheburashka";
	private transient Friend mainFriend;
	private Friend friend;

	@Override
	public String toString() {
		return "Cheburashka [name=" + name + ", mainFriend=" + mainFriend
				+ ", friend=" + friend + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend getMainFriend() {
		return mainFriend;
	}

	public void setMainFriend(Friend mainFriend) {
		this.mainFriend = mainFriend;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

}
