package co.greatkorea.www.member.service;

import java.util.Date;

public class MemberVO {
	private int member_no;
	private String user_name;
	private String user_email;
	private String user_id;
	private String user_pwd;
	private boolean email_yn;
	private String input_ip;
	private Date input_dt;
	private Date last_dt;

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberVO(int member_no, String user_name, String user_email, String user_id, String user_pwd,
			boolean email_yn, String input_ip, Date input_dt, Date last_dt) {
		super();
		this.member_no = member_no;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.email_yn = email_yn;
		this.input_ip = input_ip;
		this.input_dt = input_dt;
		this.last_dt = last_dt;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public boolean isEmail_yn() {
		return email_yn;
	}

	public void setEmail_yn(boolean email_yn) {
		this.email_yn = email_yn;
	}

	public String getInput_ip() {
		return input_ip;
	}

	public void setInput_ip(String input_ip) {
		this.input_ip = input_ip;
	}

	public Date getInput_dt() {
		return input_dt;
	}

	public void setInput_dt(Date input_dt) {
		this.input_dt = input_dt;
	}

	public Date getLast_dt() {
		return last_dt;
	}

	public void setLast_dt(Date last_dt) {
		this.last_dt = last_dt;
	}

	@Override
	public String toString() {
		return "MemberVO [member_no=" + member_no + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_id=" + user_id + ", user_pwd=" + user_pwd + ", email_yn=" + email_yn + ", input_ip="
				+ input_ip + ", input_dt=" + input_dt + ", last_dt=" + last_dt + "]";
	}

}
