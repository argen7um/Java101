package friday.sortbygrade;

import java.util.Arrays;

public class Student {
	private String firstName;
	private int id;
	private double[] grades;
	private double sum;

	public Student(String firstName, int id) {
		this.firstName = firstName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSum() {
		return sum;
	}

	public void setGrades(double... grades) {
		this.grades = grades;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", id=" + id + ", grades="
				+ Arrays.toString(grades) + ", sum=" + sum + "]";
	}
	
}
