public class AccountHolder {
	private int SSN;
	private String name;
	private long phone;
	private String address;
	
	public AccountHolder(int SSN, String name, long phone, String address) {
		this.SSN = SSN;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void SSNSet(int inputSSN ) {
		SSN = inputSSN;
	}
	public void nameSet(String inputName) {
		name = inputName;
	}
	public void phoneSet(long inputPhone) {
		phone = inputPhone;
	}
	public void addressSet(String inputAddress) {
		address = inputAddress;
	}
	public int SSNGet() {
		return SSN;
	}
	public String nameGet() {
		return name;
	}
	public long phoneGet() {
		return phone;
	}
	public String addressGet() {
		return address;
	}
}