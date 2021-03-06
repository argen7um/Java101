package friday.vector;

import java.util.Arrays;

public class Vector implements ScalarOperations, VectorOperations {
	private float[] coordinates;

	public Vector(float... coordinates) {
		this.coordinates = coordinates;
	}

	public Vector(Vector vector) {
		this(vector.coordinates);
	}

	public float getCoordinate(int index) {
		return coordinates[index];
	}

	public void setCoordinate(int index, float newCoordinate) {
		coordinates[index] = newCoordinate;
	}

	@Override
	public Vector add(Vector vector) {
		float[] result = new float[coordinates.length];
		for (int i = 0; i < coordinates.length; i++) {
			result[i] = vector.coordinates[i] + coordinates[i];
		}
		return new Vector(result);

	}

	@Override
	public Vector subtract(Vector vector) {
		float[] result = new float[coordinates.length];
		for (int i = 0; i < coordinates.length; i++) {
			result[i] = vector.coordinates[i] - coordinates[i];
		}
		return new Vector(result);

	}

	@Override
	public float dotProduct(Vector vector) {
		float result = 0;
		for (int i = 0; i < coordinates.length; i++) {
			result += (vector.coordinates[i] * coordinates[i]);
		}
		return result;
	}

	@Override
	public void add(float by) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subtract(float by) {
		// TODO Auto-generated method stub

	}

	@Override
	public void multiply(float by) {
		// TODO Auto-generated method stub

	}

	@Override
	public void divide(float by) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return Arrays.toString(coordinates);
	}

	public static void main(String[] args) {
		Vector v1 = new Vector(1, 2, 5, 6, 7);
		Vector v2 = new Vector(1, 2, 666, 6, 7);
		System.out.println(v1.add(v2));
		System.out.println(v1.dotProduct(v2));
		System.out.println(v1.subtract(v2));
	}
}
