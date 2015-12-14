package friday.vattaxcalculator;

import java.util.List;

import friday.vattaxcalculator.database.DataBaseCountrys;
import friday.vattaxcalculator.exceptions.NotSupportedCountryException;
import friday.vattaxcalculator.model.CountryVatTax;

public class VatTaxCalculator {
	List<CountryVatTax> database;

	public VatTaxCalculator(DataBaseCountrys coutrysDataBase) {
		database = coutrysDataBase.getDataBase();
	}

	public double calculateTax(double netPrice, int countryId)
			throws NotSupportedCountryException {
		try {
			CountryVatTax country = database.get(countryId);
			double countryVatRate = country.getVatRate();
			String currency = country.getCurrency();
			System.out.printf("%s VAT ==> %.1f%%%n",
					country.getCountryName(countryId), countryVatRate);
			System.out.printf("Product price: %.1f%s%n", netPrice, currency);
			System.out.printf("Total price: %.1f%s%n",
					(netPrice * (1 + (countryVatRate / 100))), currency);
			return netPrice * (1 + (countryVatRate / 100));
		} catch (Exception e) {
			throw new NotSupportedCountryException(
					"VATTAX calculator isn't supported this country id");
		}
	}

	public double calculateTax(double price)
			throws NotSupportedCountryException {
		try {
			double countryVatRate = CountryVatTax.defaultCountry().getVatRate();
			System.out.println("Default VAT " + countryVatRate + "%");
			System.out.println("Product price " + price);
			System.out.print("Total price ");
			return price * (1 + (countryVatRate / 100));
		} catch (Exception e) {
			throw new NotSupportedCountryException("Default option is off");
		}
	}

	public static void main(String[] args) {
		VatTaxCalculator calc = new VatTaxCalculator(new DataBaseCountrys());
		// this example throws NotSupportedCountryException
		// System.out.println(calc.calculateTax(100, 9));
		calc.calculateTax(100, 6);
		System.out.println(calc.calculateTax(100));
	}
}
