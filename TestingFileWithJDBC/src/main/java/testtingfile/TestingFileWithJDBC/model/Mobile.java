package testtingfile.TestingFileWithJDBC.model;

public class Mobile {
	private int id;
	private String name;
	private double purchase;
	private double sell;

	public Mobile(int id, String name, double purchase, double sell) {
		super();
		this.id = id;
		this.name = name;
		this.purchase = purchase;
		this.sell = sell;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", purchase=" + purchase + ", sell=" + sell + "]";
	}

}
