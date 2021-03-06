package friday.vattaxcalculator.database;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import friday.vattaxcalculator.exceptions.NotSupportedCountryException;
import friday.vattaxcalculator.model.Country;
import friday.vattaxcalculator.model.CurrencyCourse;

public class CountryManager implements Iterable<Map.Entry<Integer, Country>> {

	private Map<Integer, Country> countries;
	private static CountryManager instance = null;
	private Country mDefaultCountry;

	private CountryManager() {
		countries = new HashMap<>();
		countries.put(359, new Country("BULGARIA", 20, 359, true,
				CurrencyCourse.LV));
		countries.put(44,
				new Country("UK", 20, 44, false, CurrencyCourse.POUND));
		countries.put(39, new Country("GERMANY", 19, 39, false,
				CurrencyCourse.EURO));
		countries.put(34, new Country("AUSTRIA", 20, 34, false,
				CurrencyCourse.EURO));
		countries.put(49, new Country("ITALY", 21, 49, false,
				CurrencyCourse.EURO));
		countries.put(43, new Country("SPAIN", 22, 43, false,
				CurrencyCourse.EURO));
		countries.put(61, new Country("AUSTRALIA", 10, 61, false,
				CurrencyCourse.AUD));
		mDefaultCountry = initDefaultCountry();
	}

	public Country getCountry(int countryCode) {
		if (!countries.containsKey(countryCode)) {
			throw new NotSupportedCountryException("Not supported country!");
		}
		return countries.get(countryCode);
	}

	private Country initDefaultCountry() {
		for (Map.Entry<Integer, Country> entry : countries.entrySet()) {
			Country country = entry.getValue();
			if (country.isDefault()) {
				return country;
			}
		}
		return null;
	}

	public static CountryManager getInstance() {
		if (instance == null) {
			instance = new CountryManager();
		}
		return instance;
	}

	public Country getDefaultCountry() {
		return mDefaultCountry;
	}

	public void add(Country country) {
		countries.put(country.getCountryCode(), country);
	}

	public void changeDefault(Country country) {
		countries.put(
				mDefaultCountry.getCountryCode(),
				new Country(mDefaultCountry.getCountryName(), mDefaultCountry
						.getVat(), mDefaultCountry.getCountryCode(), false,
						mDefaultCountry.getCurrency()));
		countries.put(
				country.getCountryCode(),
				new Country(mDefaultCountry.getCountryName(), mDefaultCountry
						.getVat(), mDefaultCountry.getCountryCode(), true,
						country.getCurrency()));
	}

	public void remove(Country country) {
		countries.remove(country.getCountryCode());
	}

	@Override
	public Iterator<Entry<Integer, Country>> iterator() {
		return countries.entrySet().iterator();
	}
}
