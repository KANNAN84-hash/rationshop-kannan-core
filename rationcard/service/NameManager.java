package rationcard.service;

import java.util.ArrayList;
import java.util.List;

import rationcard.validator.MemberValidator;

public class NameManager {
	private NameManager() {
		super();
	}

	static List<String> familyMembers = new ArrayList<String>();
	static {
		familyMembers.add("Rajendran");
		familyMembers.add("Vinoth");

	}

	/**
	 * here the new member is added
	 * 
	 * @param name the member to add
	 */
	public static boolean addMemberName(String name) {
		boolean isValid = false;

		if (!(familyMembers.contains(name)) && (MemberValidator.isAlphabet(name))) {
			familyMembers.add(name);
			isValid = true;
		}
		return isValid;

	}

	/**
	 * here the exist member is removed
	 * 
	 * @param name the member to be removed
	 */
	public static boolean removeMemberName(String name) {
		boolean isValid = false;

		int index = familyMembers.indexOf(name);
		if (index != -1) {
			familyMembers.remove(index);
			isValid = true;
		}
		return isValid;

	}

	/**
	 * exist name gets updated to the new name
	 * 
	 * @param name1 exist name
	 * @param name2 new name to update
	 */
	public static boolean updateMemberName(String name1, String name2) {
		boolean isValid = false;
		int index = familyMembers.indexOf(name1);
		if (index != -1) {
			familyMembers.set(index, name2);
			isValid = true;
		}
		return isValid;
	}

	/**
	 * It checks whether the particular member is Present
	 * 
	 * @param name name to be checked
	 */
	public static boolean isNamePresent(String name) {
		boolean exist = false;
		int index = familyMembers.indexOf(name);
		if (index != -1) {
			exist = true;
		}
		return exist;

	}

	/**
	 * Display all the members in the list
	 */
	public static List<String> displayMembersName() {
		return familyMembers;
	}

}
