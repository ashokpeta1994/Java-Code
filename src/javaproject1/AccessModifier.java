package javaproject1;

public class AccessModifier {

	String fn;
	public String ln;
	private String dob;
	protected int age;

	public static void main(String[] args) {

		AccessModifier am = new AccessModifier();
		am.fn = "Ashok";
		am.ln = "Peta";
		am.setDob("08 June 1994");
		am.age = 28;
		

	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	

}
