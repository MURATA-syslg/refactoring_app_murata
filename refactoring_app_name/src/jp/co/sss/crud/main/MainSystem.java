package jp.co.sss.crud.main;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.io.MenuNoReader;
import jp.co.sss.crud.service.EmployeeAllFindService;
import jp.co.sss.crud.service.EmployeeDeleteService;
import jp.co.sss.crud.service.EmployeeFindByDeptIdService;
import jp.co.sss.crud.service.EmployeeFindByEmpNameService;
import jp.co.sss.crud.service.EmployeeRegisterService;
import jp.co.sss.crud.service.EmployeeUpdateService;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {

		int menuNo = 0;

		do {

			// メニュー番号の入力
			menuNo = MenuNoReader.inputMenuNo();

			// 機能の呼出
			switch (menuNo) {
			case 1:
				// 全件表示機能の呼出
				EmployeeAllFindService.findAllEmployees();
				break;

			case 2:

				// 検索機能の呼出
				EmployeeFindByEmpNameService.findEmployeeByName();
				break;

			case 3:

				// 検索機能の呼出
				EmployeeFindByDeptIdService.findEmployeeByDeptId();
				break;

			case 4:

				// 登録機能の呼出
				EmployeeRegisterService.insertEmployee();
				break;

			case 5:

				// 更新機能の呼出
				EmployeeUpdateService.updateEmployeeById();
				break;

			case 6:

				// 削除機能の呼出
				EmployeeDeleteService.deleteEmployeeById();
				break;

			}
		} while (menuNo != 7);
		System.out.println(ConstantMsg.MSG_QUIT_SYSTEM);
	}
}
