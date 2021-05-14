package day3;

public class Patient {
	private String name;
	private int days;
	private String illness;
	private long amount;
	private String treated;

	public Patient() {
		super();

	}

	public Patient(String name, int days, String illness, long amount, String treated) {
		super();
		this.name = name;
		this.days = days;
		this.illness = illness;
		this.amount = amount;
		this.treated = treated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getTreated() {
		return treated;
	}

	public void setTreated(String treated) {
		this.treated = treated;
	}

}
