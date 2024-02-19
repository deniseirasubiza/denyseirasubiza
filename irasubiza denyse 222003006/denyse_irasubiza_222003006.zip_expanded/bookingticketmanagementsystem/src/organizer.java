
public class organizer {
	private int id;
	private String organizername;
	private String organizercontactinformation;
	private String organizerevents;
	public organizer(int id, String organizername, String organizercontactinformation, String organizerevents) {
		super();
		this.id = id;
		this.organizername = organizername;
		this.organizercontactinformation = organizercontactinformation;
		this.organizerevents = organizerevents;
	}
	public organizer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrganizername() {
		return organizername;
	}
	public void setOrganizername(String organizername) {
		this.organizername = organizername;
	}
	public String getOrganizercontactinformation() {
		return organizercontactinformation;
	}
	public void setOrganizercontactinformation(String organizercontactinformation) {
		this.organizercontactinformation = organizercontactinformation;
	}
	public String getOrganizerevents() {
		return organizerevents;
	}
	public void setOrganizerevents(String organizerevents) {
		this.organizerevents = organizerevents;
	}
	

}
