package friday.geometryfigure;

public final class Point implements AreaLessable {
	private float x;
	private float y;
	private static Point point = new Point();

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point point) {
		this(point.x, point.y);
	}

	public static Point display() {
		return point;
	}

	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = result * 23 + Float.hashCode(x);
		result = result * 23 + Float.hashCode(y);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x == other.x && y == other.y)
			return true;
		return false;
	}

	public static LineSegment add(Point p1, Point p2) {
		return new LineSegment(p1, p2);
	}

	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	@Override
	public void displayCenter() {
		System.out.println(this);
	}
}
