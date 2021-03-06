package friday.geometryfigure.roundshape;

import friday.geometryfigure.Point;

public final class Circle extends Ellipse {

	public Circle(float radius) {
		super(radius, radius);
	}

	public Circle(Circle circle) {
		this(circle.getMajorAxis());
	}

	public float getPerimeter() {
		return (float) (2 * Math.PI * getMajorAxis());
	}

	@Override
	public float getArea() {
		return super.getArea();
	}

	@Override
	public Point getCenter() {
		return super.getCenter();
	}

	@Override
	public String toString() {
		return String.format("Circle[(height: %.1f, width: %.1f)]",
				getMajorAxis(), getMajorAxis());
	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.getArea());
		// make copy of c
		Circle c2 = new Circle(c);
		System.out.println(c2);
		Ellipse el = new Ellipse(10, 5);
		System.out.println(el.getPerimeter());
	}
}
