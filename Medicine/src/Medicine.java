
public class Medicine {
	private String name;
	private int quantity;
	private double pricePerUnit;

	public Medicine(String name, int quantity, double pricePerUnit) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
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
