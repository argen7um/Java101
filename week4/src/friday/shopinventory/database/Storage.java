package friday.shopinventory.database;

import java.util.List;

import friday.shopinventory.model.Product;

public abstract class Storage {
	private ProductDataBase db = ProductDataBase.getInstance();

	public List<Product> getAllProducts() {
		return db.getAllProducts();
	}

	public List<Product> getAvailableProducts() {
		return db.getAvailableProducts();
	}
}
