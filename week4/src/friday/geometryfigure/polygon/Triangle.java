package friday.geometryfigure.polygon;

import friday.geometryfigure.LineSegment;
import friday.geometryfigure.Point;

public final class Triangle extends Polygon {

	public Triangle(Point lowerLeft, Point lowerRight, Point pik) {
		super(lowerLeft, lowerRight, pik, pik);
		if (pik.getX() == lowerLeft.getX()) {
			throw new IllegalArgumentException("Points are on the same axis.");
		}
	}

	public Triangle(Triangle triangle) {
		this(triangle.getBaseLeft(), triangle.getBaseRight(), triangle
				.getBaseLeftTop());
	}

	@Override
	public float getPerimeter() {
		return getLeft().getLength() + getRight().getLength()
				+ getBase().getLength();
	}

	@Override
	public float getArea() {
		return 0.5f * getBase().getLength() * getHeight();
	}

	@Override
	public Point getCenter() {
		float x = (getBaseLeft().getX() + getBaseRight().getX() + getBaseLeftTop()
				.getX()) / 3;
		float y = (getBaseLeft().getY() + getBaseRight().getY() + getBaseLeftTop()
				.getY()) / 3;
		return new Point(x, y);
	}

	private Point getBaseMiddle() {
		return new Point(getBaseRight().getX() - (getBase().getLength() / 2),
				getBaseLeft().getY());
	}

	private float getHeight() {
		return new LineSegment(getBaseMiddle(), getBaseLeftTop()).getLength();
	}

	public static void main(String[] args) {
		Triangle tr = new Triangle(new Point(2, 0), new Point(8, 0), new Point(
				4, 4));
		System.out.println(tr.getHeight());
		System.out.println(tr.getCenter());
		System.out.println(tr);
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("(height: %.1f,base: %.1f)]", getHeight(),
						getBase().getLength());
	}
}
