package com.sdp.adapterEveryday;

public class EmployeeLdap {

	private String cn;
	private String surname;
	private String givenname;
	private String mail;

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenname() {
		return givenname;
	}

	public void setGivenname(String givenname) {
		this.givenname = givenname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "EmployeeLdap [cn=" + cn + ", surname=" + surname + ", givenname=" + givenname + ", mail=" + mail + "]";
	}

	public EmployeeLdap(String cn, String surname, String givenname, String mail) {
		super();
		this.cn = cn;
		this.surname = surname;
		this.givenname = givenname;
		this.mail = mail;
	}

}
