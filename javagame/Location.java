package game;

import java.util.Scanner;

abstract class Location {
	private Player player;
	private String name;
	public static Scanner input = new Scanner(System.in);

	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}
public static boolean onLocation() {
	return true;
}
	
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}