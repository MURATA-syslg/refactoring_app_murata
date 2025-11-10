package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.db.DBController;
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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int menuNo = 0;

		do {
			// メニューの表示
			System.out.println(ConstantMsg.SYSTEM_MENU_BAR);
			System.out.println(ConstantMsg.SYSTEM_MENU_VIEW_EMPLOYEES);
			System.out.println(ConstantMsg.SYSTEM_MENU_SEARCH_BY_NAME);
			System.out.println(ConstantMsg.SYSTEM_MENU_SEARCH_BY_DEPTID);
			System.out.println(ConstantMsg.SYSTEM_MENU_INSERT);
			System.out.println(ConstantMsg.SYSTEM_MENU_UPDATE);
			System.out.println(ConstantMsg.SYSTEM_MENU_DELETE);
			System.out.println(ConstantMsg.SYSTEM_MENU_QUIT);
			System.out.print(ConstantMsg.SYSTEM_MENU_INPUT_MENUNO);

			// メニュー番号の入力
			menuNo = Integer.parseInt(br.readLine());

			String deptId;

			// 機能の呼出
			switch (menuNo) {
			case 1:
				// 全件表示機能の呼出
				DBController.findAllEmployees();
				break;

			case 2:
				// 社員名検索
				System.out.print(ConstantMsg.INPUT_EMP_NAME);

				// 検索機能の呼出
				DBController.findEmployeeByName();
				break;

			case 3:
				// 検索する部署IDを入力
				System.out.print(ConstantMsg.INPUT_DEPT_ID);
				deptId = br.readLine();

				// 検索機能の呼出
				DBController.findEmployeeByDeptId(deptId);
				break;

			case 4:
				// 登録する値を入力
				System.out.print(ConstantMsg.INPUT_EMP_NAME);
				String emp_name = br.readLine();
				System.out.print(ConstantMsg.INPUT_GENDER);
				String gender = br.readLine();
				System.out.print(ConstantMsg.INPUT_BIRTHDAY);
				String birthday = br.readLine();
				System.out.print(ConstantMsg.INPUT_DEPT_ID);
				deptId = br.readLine();

				// 登録機能の呼出
				DBController.insertEmployee(emp_name, gender, birthday, deptId);
				break;

			case 5:
				// 更新する社員IDを入力
				System.out.print(ConstantMsg.INPUT_UPDATE_EMP_ID);

				// 更新する値を入力する
				String empId = br.readLine();

				// 更新機能の呼出
				DBController.updateEmployeeById(empId);
				System.out.println(ConstantMsg.COMPLETE_UPDATE_EMP_INFO);

				break;

			case 6:
				// 削除する社員IDを入力
				System.out.print(ConstantMsg.INPUT_DELETE_EMP_ID);

				// 削除機能の呼出
				DBController.deleteEmployeeById();
				break;

			}
		} while (menuNo != 7);
		System.out.println(ConstantMsg.QUIT_SYSTEM);
	}
}
