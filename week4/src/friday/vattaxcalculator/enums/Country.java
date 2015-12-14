package friday.vattaxcalculator.enums;


public enum Country {
	BULGARIA(0), ENGLAND(1, CurrencyCourse.BRITISH_POUND), GERMANY(2,
			CurrencyCourse.EURO), SPAIN(3, CurrencyCourse.EURO), ITALY(4,
			CurrencyCourse.EURO), AUSTRIA(5, CurrencyCourse.EURO), AUSTRALIA(6,
			CurrencyCourse.AUSTRALIAN_DOLLAR);
	private int id;
	private CurrencyCourse course;

	private Country(int id) {
		this.id = id;
	}

	private Country(int id, CurrencyCourse course) {
		this.id = id;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public double getCourse() {
		return course.getCourse();
	}
}
