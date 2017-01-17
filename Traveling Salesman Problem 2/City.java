
public class City {
	private int XPOS, YPOS;
	private String name;

	public City(String n, int x, int y) {
		XPOS = x;
		YPOS = y;
		name = n;
	}

	public int getX() {
		return XPOS;
	}

	public int getY() {
		return YPOS;
	}

	public void setX(int xi) {
		XPOS = xi;
	}

	public void setY(int yi) {
		YPOS = yi;
	}

	public double Distance(City other) {
		int deltaX = other.XPOS - this.XPOS;
		int deltaY = other.YPOS - this.YPOS;
		double distance = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
		return distance;
	}

	public String toString() {
		String City = "";
		City = City + name + ":" + XPOS + "," + YPOS;
		return City;
	}
}
