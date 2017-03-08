package delta.monstarz.shared.model;

import java.awt.Point;

/**
 * @author bradcarter
 */
public class Segment {

//	private Point position;
	private int x;
	private int y;
	private int rotation;

	public Segment(int x, int y, int pRotation) {
//		position = pPosition;
		this.x = x;
		this.y = y;
		rotation = pRotation;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRotation() {
		return rotation;
	}
}
