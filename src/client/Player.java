package client;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

import core.GameObject;

public class Player extends GameObject implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = -6088251166673414031L;
	public static String choice;
	Color color = Color.RED;
	Point nameOffset = new Point(0, 5);

	boolean isReady;
	long lastAction = -1L;
	public int points = 0;

	public void setLastAction(Long l) {
		lastAction = l;
	}

	public long getTimeBetweenLastAction(Long compare) {
		return compare - lastAction;
	}

	public long getLastAction() {
		return lastAction;
	}

//	public void toggleChoiced() {
//		choiced = !choiced;
//	}

	public void setChoiced(String in) {
		Player.choice = in;
	}

	public String getChoiced() {
		return choice;
	}

	public void setReady(boolean r) {
		isReady = r;
	}

	public boolean isReady() {
		return isReady;
	}

	/**
	 * Gets called by the game engine to draw the current location/size
	 */
	@Override
	public boolean draw(Graphics g) {
		// using a boolean here so we can block drawing if isActive is false via call to
		// super
		if (super.draw(g)) {
			g.setColor(color);
			g.fillOval(position.x, position.y, size.width, size.height);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced", Font.PLAIN, 12));
			g.drawString("Name: " + name, position.x + nameOffset.x, position.y + nameOffset.y);
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Name: %s, p: (%d,%d), s: (%d, %d), d: (%d, %d), isAcitve: %s", name, position.x,
				position.y, speed.x, speed.y, direction.x, direction.y, isActive);
	}

}