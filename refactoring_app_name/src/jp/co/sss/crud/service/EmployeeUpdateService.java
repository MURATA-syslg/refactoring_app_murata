package jp.co.sss.crud.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.io.EmployeeBirthdayReader;
import jp.co.sss.crud.io.EmployeeDeptIdReader;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.io.EmployeeGenderReader;
import jp.co.sss.crud.io.EmployeeNameReader;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員情報更新処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeUpdateService {

	public static void updateEmployeeById() throws IOException, ClassNotFoundException, SQLException, ParseException {
		// 更新する値を入力する
		String empId = EmployeeEmpIdReader.inputEmployeeId(1);
		String empName = EmployeeNameReader.inputEmployeeName();
		String gender = EmployeeGenderReader.inputEmployeeGender();
		String birthday = EmployeeBirthdayReader.inputEmployeeBirthday();
		String deptId = EmployeeDeptIdReader.inputEmployeeDeptId();

		// 更新処理の呼び出し
		EmployeeDAO.updateEmployeeById(empId, empName, gender, birthday, deptId);

		System.out.println(ConstantMsg.MSG_EMPLOYEE_UPDATE);
	}
}
