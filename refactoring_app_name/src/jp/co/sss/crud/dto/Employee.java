package jp.co.sss.crud.dto;

import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;

public class Employee {

	private int empId;

	private String empName;

	private int gender;

	private String birthday;

	private int deptId;

	private Department department;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		String gender_ja = "";
		if (this.gender == 1) {
			gender_ja = ConstantMsg.MSG_GENDER_MALE;
		} else if (this.gender == 2) {
			gender_ja = ConstantMsg.MSG_GENDER_FEMALE;
		}

		if (this.gender == ConstantValue.GENDER_NO_ANSWER) {
			gender_ja = ConstantMsg.MSG_NO_ANSWER;
		} else if (this.gender == ConstantValue.GENDER_MALE) {
			gender_ja = ConstantMsg.MSG_GENDER_MALE;
		} else if (this.gender == ConstantValue.GENDER_FEMALE) {
			gender_ja = ConstantMsg.MSG_GENDER_FEMALE;
		} else if (this.gender == ConstantValue.GENDER_OTHER) {
			gender_ja = ConstantMsg.MSG_GENDER_OTHER;
		}
		return empId + "\t" + empName + "\t" + gender_ja + "\t" + birthday + "\t" + department.getDeptName();
	}
}
