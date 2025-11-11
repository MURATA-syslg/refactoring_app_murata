package jp.co.sss.crud.service;

import java.sql.SQLException;
import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.io.ConsoleWriter;

/**
 * 社員情報の全件検索処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeAllFindService {

	/**
	 * 全ての社員情報を検索
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void findAllEmployees() throws SystemErrorException {
		List<Employee> serachedEmployees;

		serachedEmployees = EmployeeDAO.findAllEmployees();
		ConsoleWriter.showEmployees(serachedEmployees);

		return;
	}
}
