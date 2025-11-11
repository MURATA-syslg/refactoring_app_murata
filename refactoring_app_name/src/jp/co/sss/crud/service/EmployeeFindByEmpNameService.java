package jp.co.sss.crud.service;

import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;
import jp.co.sss.crud.io.EmployeeNameReader;

/**
 * 社員名から社員情報の検索処理サービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeFindByEmpNameService {

	/**
	 * 社員名に該当する社員情報を検索
	 *
	 * @throws SystemErrorException エラーが発生した場合に送出
	 */
	public static void findEmployeeByName() throws SystemErrorException {
		List<Employee> serachedEmployees;

		serachedEmployees = EmployeeDAO.findEmployeeByName(EmployeeNameReader.inputEmployeeName());
		ConsoleWriter.showEmployees(serachedEmployees);

		return;
	}
}
