package friday.vattaxcalculator.database;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import friday.vattaxcalculator.enums.Country;
import friday.vattaxcalculator.model.CountryVatTax;

public final class DataBaseCountrys implements Iterable<CountryVatTax> {

	private List<CountryVatTax> countryVat;

	public DataBaseCountrys() {
		countryVat = new ArrayList<>();
		countryVat.add(new CountryVatTax(0, 20, true, "lv."));
		countryVat.add(new CountryVatTax(1, 20, false, "pounds"));
		countryVat.add(new CountryVatTax(2, 19, false, "euro"));
		countryVat.add(new CountryVatTax(3, 21, false, "euro"));
		countryVat.add(new CountryVatTax(4, 22, false, "euro"));
		countryVat.add(new CountryVatTax(5, 20, false, "euro"));
		countryVat.add(new CountryVatTax(6, 10, false, "usd"));
	}

	public static Country getCountry(int id) {
		return Country.values()[id];
	}

	public List<CountryVatTax> getDataBase() {
		DataBaseCountrys db = new DataBaseCountrys();
		return db.countryVat;
	}

	@Override
	public Iterator<CountryVatTax> iterator() {
		return countryVat.iterator();
	}
}
