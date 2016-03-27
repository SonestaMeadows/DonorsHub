/**
 * 
 */
package com.hub.DonorsHub.beans;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pandeyk
 *
 */
public class Donor {
	private String userName;
	private String password;
	private String id;
	private String address;
	private long mobileNUmber;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNUmber() {
		return mobileNUmber;
	}
	public void setMobileNUmber(long mobileNUmber) {
		this.mobileNUmber = mobileNUmber;
	}
		
}
