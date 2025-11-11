package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * メニューNo入出力処理用クラス
 * 
 * @author 村田智大
 */
public class MenuNoReader {

	public static int inputMenuNo() throws SystemErrorException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

		try {
			return Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYSTEM_ERROR, e);
		}
	}
}
