package friday.geometryfigure.roundshape;

import friday.geometryfigure.Point;

public class Ellipse extends RoundShape {

	public Ellipse(float majorAxis, float minorAxis) {
		super(majorAxis, minorAxis);
	}

	public Ellipse(Ellipse ellipse) {
		this(ellipse.getMajorAxis(), ellipse.getMinorAxis());
	}

	@Override
	public Point getLeftVertex() {
		return new Point(-getMajorAxis(), 0);
	}

	@Override
	public Point getRightVertex() {
		return new Point(getMajorAxis(), 0);
	}

	@Override
	public Point getUpperVertex() {
		return new Point(0, getMinorAxis());
	}

	@Override
	public Point getLowerVertex() {
		return new Point(0, -getMinorAxis());
	}

	@Override
	public float getPerimeter() {
		float longAxis = getMajorAxis();
		float shortAxis = getMinorAxis();
		return (float) (Math.PI * (3 * (shortAxis + longAxis) - Math
				.sqrt((3 * shortAxis + longAxis) * (3 * longAxis + shortAxis))));
	}

	@Override
	public float getArea() {
		return (float) (Math.PI * (getMinorAxis()) * (getMajorAxis()));
	}

	@Override
	public Point getCenter() {
		return new Point(0, 0);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
