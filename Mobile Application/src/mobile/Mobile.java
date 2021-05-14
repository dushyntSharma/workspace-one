package mobile;

public class Mobile {
	private long id;
	private String model;
	private double price;
	private String date;

	public Mobile() {
		super();
	}

	public Mobile(long id, String model, double price, String date) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
