package Denyse;

public class venue {
	private int id;
	private String venuename;
	private String venueaddress;
	private String venuecapacity;
	private String venuefacilitie;
	private String venuecontactinformation;
	public venue(int id, String venuename, String venueaddress, String venuecapacity, String venuefacilitie,
			String venuecontactinformation) {
		super();
		this.id = id;
		this.venuename = venuename;
		this.venueaddress = venueaddress;
		this.venuecapacity = venuecapacity;
		this.venuefacilitie = venuefacilitie;
		this.venuecontactinformation = venuecontactinformation;
	}
	public venue() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVenuename() {
		return venuename;
	}
	public void setVenuename(String venuename) {
		this.venuename = venuename;
	}
	public String getVenueaddress() {
		return venueaddress;
	}
	public void setVenueaddress(String venueaddress) {
		this.venueaddress = venueaddress;
	}
	public String getVenuecapacity() {
		return venuecapacity;
	}
	public void setVenuecapacity(String venuecapacity) {
		this.venuecapacity = venuecapacity;
	}
	public String getVenuefacilitie() {
		return venuefacilitie;
	}
	public void setVenuefacilitie(String venuefacilitie) {
		this.venuefacilitie = venuefacilitie;
	}
	public String getVenuecontactinformation() {
		return venuecontactinformation;
	}
	public void setVenuecontactinformation(String venuecontactinformation) {
		this.venuecontactinformation = venuecontactinformation;
	}
	
	

}
