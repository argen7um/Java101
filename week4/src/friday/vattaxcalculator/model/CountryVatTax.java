package friday.vattaxcalculator.model;

import friday.vattaxcalculator.database.DataBaseCountrys;
import friday.vattaxcalculator.enums.Country;

public final class CountryVatTax {
	private int countryId;
	private double vatRate;
	private boolean isDefault;
	private String currency;

	public CountryVatTax(int id, double vatRate, boolean isDefault,
			String currency) {
		countryId = id;
		this.vatRate = vatRate;
		this.isDefault = isDefault;
		this.currency = currency;
	}

	public String getCountryName(int id) {
		return Country.values()[id].name();
	}

	public double getVatRate() {
		return vatRate;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public int getCountryId() {
		return countryId;
	}

	public static CountryVatTax defaultCountry() {
		for (CountryVatTax el : new DataBaseCountrys().getDataBase()) {
			if (el.isDefault) {
				return el;
			}
		}
		return null;
	}

	public String getCurrency() {
		return currency;
	}
}