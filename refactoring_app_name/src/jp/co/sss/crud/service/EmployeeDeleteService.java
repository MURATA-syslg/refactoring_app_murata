package jp.co.sss.crud.service;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.EmployeeEmpIdReader;
import jp.co.sss.crud.util.ConstantValue;

/**
 * 社員情報削除用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeDeleteService {

	public static void deleteEmployeeById() throws SystemErrorException {
		// 対象の値を入力する
		String empId = EmployeeEmpIdReader.inputEmployeeId(ConstantValue.MENU_FIND_EMPLOYEES_BY_NAME);
		// 社員情報削除処理の呼び出し
		EmployeeDAO.deleteEmployeeById(empId);
	}
}
