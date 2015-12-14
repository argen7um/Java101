package friday.geometryfigure.polygon;

import friday.geometryfigure.GeometryFigure;
import friday.geometryfigure.LineSegment;
import friday.geometryfigure.Point;

public abstract class Polygon implements GeometryFigure {

	private Point baseLeft;
	private Point baseRight;
	private Point baseLeftTop;
	private Point baseRightTop;
	private LineSegment left;
	private LineSegment right;
	private LineSegment base;

	public Polygon(Point baseLeft, Point baseRight, Point baseLeftTop,
			Point baseRightTop) {
		this.baseLeft = baseLeft;
		this.baseRight = baseRight;
		this.baseLeftTop = baseLeftTop;
		this.baseRightTop = baseRightTop;
		left = new LineSegment(baseLeft, baseLeftTop);
		right = new LineSegment(baseRight, baseRightTop);
		base = new LineSegment(baseLeft, baseRight);
	}

	public Point getBaseLeft() {
		return baseLeft;
	}

	public void setBaseLeft(Point baseLeft) {
		this.baseLeft = baseLeft;
	}

	public Point getBaseRight() {
		return baseRight;
	}

	public void setBaseRight(Point baseRight) {
		this.baseRight = baseRight;
	}

	public Point getBaseLeftTop() {
		return baseLeftTop;
	}

	public void setBaseLeftTop(Point baseLeftTop) {
		this.baseLeftTop = baseLeftTop;
	}

	public Point getBaseRightTop() {
		return baseRightTop;
	}

	public void setBaseRightTop(Point baseRightTop) {
		this.baseRightTop = baseRightTop;
	}

	public LineSegment getLeft() {
		return left;
	}

	public void setLeft(LineSegment left) {
		this.left = left;
	}

	public LineSegment getRight() {
		return right;
	}

	public void setRight(LineSegment right) {
		this.right = right;
	}

	public LineSegment getBase() {
		return base;
	}

	public void setBase(LineSegment base) {
		this.base = base;
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + getBaseRight().hashCode();
		hash = hash * 23 + getBaseLeftTop().hashCode();
		return hash;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[(x:" + getBaseLeftTop()
				+ ", y:" + getBaseRight() + "), ";
	}
}
