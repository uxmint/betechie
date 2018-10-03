package bean;

public class IndexaaBean {
	private String E_Email_ID;
	private int phone_number;
	
	
	
	public IndexaaBean() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IndexaaBean(String e_Email_ID) {
		super();
		E_Email_ID = e_Email_ID;
	}



	public IndexaaBean(String e_Email_ID, int phone_number) {
		super();
		E_Email_ID = e_Email_ID;
		this.phone_number = phone_number;
	}



	public String getE_Email_ID() {
		return E_Email_ID;
	}



	public void setE_Email_ID(String e_Email_ID) {
		E_Email_ID = e_Email_ID;
	}



	public int getPhone_number() {
		return phone_number;
	}



	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	
	
	

}
