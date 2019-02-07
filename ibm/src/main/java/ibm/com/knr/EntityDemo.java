package ibm.com.knr;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ibm_tbl", schema = "SYSTEM")
public class EntityDemo {
	@Id
	@Column(name = "NAME")
	private String name;
	@Column(name = "FNAME")
	private String fname;
	@Column(name = "MNAME")
	private String mname;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DOB")
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date dob;
	@Column(name = "STATE")
	private String state;
	@Column(name = "DISTIC")
	private String distic;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "PNUMBER")
	private Long pnumber;
	@Column(name = "SINGLE")
	private String single;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistic() {
		return distic;
	}

	public void setDistic(String distic) {
		this.distic = distic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPnumber() {
		return pnumber;
	}

	public void setPnumber(Long pnumber) {
		this.pnumber = pnumber;
	}

	public String getSingle() {
		return single;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public EntityDemo(String name, String fname, String mname, String gender, Date dob, String state, String distic,
			String email, Long pnumber, String single) {
		super();
		this.name = name;
		this.fname = fname;
		this.mname = mname;
		this.gender = gender;
		this.dob = dob;
		this.state = state;
		this.distic = distic;
		this.email = email;
		this.pnumber = pnumber;
		this.single = single;
	}

	public EntityDemo() {

	}

}

