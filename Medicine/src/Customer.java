
public class Customer {
	private long id;
	private String name;
	private byte age;
	private Medicine[] medicines;

	public Customer(long id, String name, byte age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public Customer(long id, String name, byte age, Medicine[] medicines) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.medicines = medicines;
	}

	public Customer() {
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

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Medicine[] getMedicines() {
		return medicines;
	}

	public void setMedicines(Medicine[] medicines) {
		this.medicines = medicines;
	}

}
