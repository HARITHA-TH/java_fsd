package javainterface;

public class Hotell {
	private String adharCard;
	public String name;
	public String Location;
	public String email;
	public Hotell(String adharCard, String name, String location, String email) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.Location = location;
		this.email = email;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
