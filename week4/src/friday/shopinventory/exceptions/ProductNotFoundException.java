package friday.shopinventory.exceptions;

public class ProductNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException() {
		super("Product not Found!");
	}
}
