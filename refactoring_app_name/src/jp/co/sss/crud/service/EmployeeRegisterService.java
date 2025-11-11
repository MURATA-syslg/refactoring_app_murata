package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.EmployeeBirthdayReader;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.EmployeeGenderReader;
import jp.co.sss.crud.io.EmployeeNameReader;

/**
 * 社員情報登録処理のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeRegisterService {

	public static void insertEmployee() throws SystemErrorException {

		// 登録する値を入力
		String empName = EmployeeNameReader.inputEmployeeName();
		String gender = EmployeeGenderReader.inputEmployeeGender();
		String birthday = EmployeeBirthdayReader.inputEmployeeBirthday();
		String deptId = EmployeeDeptIdReader.inputEmployeeDeptId();

		// 登録処理呼び出し
		EmployeeDAO.insertEmployee(empName, gender, birthday, deptId);
	}
}
