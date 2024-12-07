package exceptionhandling;

//"Assignment 140:Write a program on encapsulation "
public class EncapsulationEx1 {

	private String un = "contact@grotechminds";
	private int otp = 3223;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getUn() {
		return un;

	}

	public void setUn(String un) {
		this.un = un;

	}

	public static void main(String[] args) {
		EncapsulationEx1 e1 = new EncapsulationEx1();
		e1.setUn("BhavyaSMurthy");
		System.out.println(e1.getUn());
		e1.setOtp(8797);
		System.out.println(e1.getOtp());
	}

}
