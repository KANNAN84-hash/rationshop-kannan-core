package rationcard.model;

import java.time.LocalDate;

public class MemberDetails {

	private String name;
	private Integer age;
	private LocalDate dob;
	private long phNo;

	public MemberDetails() {
		super();
	}

	public MemberDetails(String name, Integer age, LocalDate dob, long phNo) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phNo = phNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	/**
	 * @return the phNo
	 */
	public long getPhNo() {
		return phNo;
	}

	/**
	 * @param phNo the phNo to set
	 */
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "MemberDetail [name=" + name + ", age=" + age + ", dob=" + dob + ", phNo=" + phNo + "]";
	}

}
