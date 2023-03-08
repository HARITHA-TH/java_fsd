/**
 * 
 */
package javainterface;

/**
 * @author Administrator
 *
 */
public class Customer {

	private String regid;
	public String name;
	public int phno;
	public String email;
	public String loc;
	public Customer(String regid, String name, int phno, String email, String loc) {
		super();
		this.regid = regid;
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Customer [regid=" + regid + ", name=" + name + ", phno=" + phno + ", email=" + email + ", loc=" + loc
				+ "]";
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
}


