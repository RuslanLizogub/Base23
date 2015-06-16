package week7.lesson13;

import java.io.Serializable;

class Friend implements Serializable {
	private String name;

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
