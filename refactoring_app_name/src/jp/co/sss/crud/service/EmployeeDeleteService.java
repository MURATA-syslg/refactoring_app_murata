package jp.co.sss.crud.service;

import java.io.IOException;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.io.EmployeeEmpIdReader;

/**
 * 社員情報削除用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeDeleteService {

	public static void deleteEmployeeById() throws IOException {
		// 対象の値を入力する
		String empId = EmployeeEmpIdReader.inputEmployeeId(2);
		// 社員情報削除処理の呼び出し
		EmployeeDAO.deleteEmployeeById(empId);
	}
}
