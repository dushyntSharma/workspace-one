package inventory;

public class Product {
	private long id;
	private String name;
	private int quantity;
	private double pricePerUnit;

	public Product(long id, String name, int quantity, double pricePerUnit) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

}
