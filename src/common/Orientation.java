package common;

import java.io.*;

public class Orientation {
	public static final Orientation HORIZONTAL = new Orientation(1);
	public static final Orientation VERTICAL = new Orientation(2);

	private int value;
	private Orientation(int v) { value = v;}

	protected Object readResolve() throws ObjectStreamException {
		if (value == 1) return Orientation.HORIZONTAL;
		if (value == 2) return Orientation.VERTICAL;
		return null;
	}
}
