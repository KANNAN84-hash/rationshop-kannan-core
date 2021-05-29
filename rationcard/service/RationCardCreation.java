package rationcard.service;

import java.time.LocalDate;
import java.util.List;
import rationcard.exception.AdditionException;
import rationcard.exception.DataException;
import rationcard.model.MemberDetails;
import rationcard.validator.MemberValidator;
import java.util.ArrayList;

public class RationCardCreation {
	private RationCardCreation() {
		super();

	}

	static List<MemberDetails> userData = new ArrayList<MemberDetails>();// object data is created of type

	/**
	 * value is given to the data by creating the object and giving the names
	 * 
	 * @param name
	 * @param age
	 * @param dateOfBirth
	 * @param gender
	 * @throws AdditionException
	 */

	public static boolean addMemberData(String name, Integer age, LocalDate dob, long phNo) throws AdditionException {
		boolean isValid = false;
		MemberDetails obj = new MemberDetails(name, age, dob, phNo);

		String getName = obj.getName();
		int getAge = obj.getAge();
		LocalDate getDate = obj.getDob();
		long getPhNo = obj.getPhNo();
		try {
			isValid = true;

			RationCardCreation.isValidMemberDetails(getName, getAge, getDate, getPhNo);

			userData.add(obj);
		} catch (DataException e) {
			throw new AdditionException("Unable to add member");
		}
		return isValid;

	}

	/**
	 * Here it checks whether the given input name and age are correct
	 * 
	 * @param name        name of user
	 * @param age         age of user
	 * @param dateOfBirth dob of user
	 * @param gender      gender of user
	 * @return
	 * @throws DataException
	 */

	public static boolean isValidMemberDetails(String name, Integer age, LocalDate i, long phNo) throws DataException {
		boolean isValid = false;
		if (MemberValidator.isAlphabet(name) && MemberValidator.isNumber(age) && MemberValidator.isPhoneNum(phNo)) {
			isValid = true;
		} else {
			throw new DataException("InValid Data");
		}

		return isValid;
	}

	/**
	 * display the detail of the particular member
	 */
	public static List<MemberDetails> displayMember() {
		List<MemberDetails> arr = new ArrayList<MemberDetails>();
		for (MemberDetails memberDetail : userData) {

			arr.add(memberDetail);

		}
		return arr;
	}

}
