package friday.geometryfigure.polygon;

import friday.geometryfigure.LineSegment;
import friday.geometryfigure.Point;

public final class Rectangle extends Polygon {

	private LineSegment upperVertice;

	public Rectangle(Point leftTop, Point baseRight) {
		super(new Point(baseRight.getX(), leftTop.getY()), baseRight, leftTop,
				new Point(baseRight.getX(), leftTop.getY()));
		if (leftTop.getX() == baseRight.getX()) {
			throw new IllegalArgumentException("Points are on the same axis.");
		}
		upperVertice = new LineSegment(getBaseLeftTop(), getBaseRightTop());
	}

	public Rectangle(Rectangle rect) {
		this(rect.getBaseLeftTop(), rect.getBaseRight());
	}

	public LineSegment upperVertice() {
		return upperVertice;
	}

	@Override
	public float getPerimeter() {
		return (2 * upperVertice.getLength()) + (2 * getLeft().getLength());
	}

	@Override
	public float getArea() {
		return upperVertice.getLength() * getRight().getLength();
	}

	@Override
	public Point getCenter() {
		return new Point((getBaseLeft().getX() + getBaseLeftTop().getX()) / 2,
				(getBaseLeft().getY() + getBaseRight().getY()) / 2);
	}

	@Override
	public String toString() {
		return super.toString()
				+ String.format("(%.1f,%.1f)]", upperVertice.getLength(),
						getRight().getLength());
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(new Point(1, 5), new Point(10, 3));
		System.out.println(rect);
		System.out.println(rect.getCenter());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (getBaseRight() == null) {
			if (other.getBaseRight() != null)
				return false;
		} else if (!getBaseRight().equals(other.getBaseRight()))
			return false;
		if (getBaseLeftTop() == null) {
			if (other.getBaseLeftTop() != null)
				return false;
		} else if (!getBaseLeftTop().equals(other.getBaseLeftTop()))
			return false;
		return true;
	}
}
