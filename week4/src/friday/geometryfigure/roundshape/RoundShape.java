package friday.geometryfigure.roundshape;

import friday.geometryfigure.GeometryFigure;
import friday.geometryfigure.Point;

public abstract class RoundShape implements GeometryFigure {
	private float majorAxis;
	private float minorAxis;

	public RoundShape(float majorAxis, float minorAxis) {
		this.majorAxis = majorAxis;
		this.minorAxis = minorAxis;
	}

	public RoundShape(RoundShape shape) {
		this(shape.majorAxis, shape.minorAxis);
	}

	public abstract Point getLeftVertex();

	public abstract Point getRightVertex();

	public abstract Point getUpperVertex();

	public abstract Point getLowerVertex();

	public float getMajorAxis() {
		return majorAxis;
	}

	public void setMajorAxis(float majorAxis) {
		this.majorAxis = majorAxis;
	}

	public float getMinorAxis() {
		return minorAxis;
	}

	public void setMinorAxis(float minorAxis) {
		this.minorAxis = minorAxis;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+ String.format("[(height: %.1f, width: %.1f)]", majorAxis,
						minorAxis);
	}
}
