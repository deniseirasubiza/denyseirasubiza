package Denyse;

import java.sql.Date;

public class notification {
	private int id;
	private int userid;
	private String notificationtype;
	private String notificationmessage;
	private Date notificationdateandtime;
	private String notificationstatus;
	public notification(int id, int userid, String notificationtype, String notificationmessage,
			Date notificationdateandtime, String notificationstatus) {
		super();
		this.id = id;
		this.userid = userid;
		this.notificationtype = notificationtype;
		this.notificationmessage = notificationmessage;
		this.notificationdateandtime = notificationdateandtime;
		this.notificationstatus = notificationstatus;
	}
	public notification() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getNotificationtype() {
		return notificationtype;
	}
	public void setNotificationtype(String notificationtype) {
		this.notificationtype = notificationtype;
	}
	public String getNotificationmessage() {
		return notificationmessage;
	}
	public void setNotificationmessage(String notificationmessage) {
		this.notificationmessage = notificationmessage;
	}
	public Date getNotificationdateandtime() {
		return notificationdateandtime;
	}
	public void setNotificationdateandtime(Date notificationdateandtime) {
		this.notificationdateandtime = notificationdateandtime;
	}
	public String getNotificationstatus() {
		return notificationstatus;
	}
	public void setNotificationstatus(String notificationstatus) {
		this.notificationstatus = notificationstatus;
	}
	
	

}
