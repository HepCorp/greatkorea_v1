package co.greatkorea.www.visitor.service;

import java.util.Date;

public class VisitorVO {
	private int visitor_no;
	private String contents;
	private String write_id;
	private int member_no;
	private String input_ip;
	private Date input_dt;

	public VisitorVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisitorVO(int visitor_no, String contents, String write_id, int member_no, Date input_dt) {
		super();
		this.visitor_no = visitor_no;
		this.contents = contents;
		this.write_id = write_id;
		this.member_no = member_no;
		this.input_dt = input_dt;
	}

	public int getVisitor_no() {
		return visitor_no;
	}

	public void setVisitor_no(int visitor_no) {
		this.visitor_no = visitor_no;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWrite_id() {
		return write_id;
	}

	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public Date getInput_dt() {
		return input_dt;
	}

	public void setInput_dt(Date input_dt) {
		this.input_dt = input_dt;
	}

	public String getInput_ip() {
		return input_ip;
	}

	public void setInput_ip(String input_ip) {
		this.input_ip = input_ip;
	}

	@Override
	public String toString() {
		return "VisitorVO [visitor_no=" + visitor_no + ", contents=" + contents + ", write_id=" + write_id
				+ ", member_no=" + member_no + ", input_ip=" + input_ip + ", input_dt=" + input_dt + "]";
	}

}
