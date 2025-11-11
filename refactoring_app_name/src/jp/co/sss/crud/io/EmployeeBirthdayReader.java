package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 誕生日入力用処理のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeBirthdayReader {

	public static String inputEmployeeBirthday() throws SystemErrorException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 誕生日入力
		System.out.print(ConstantMsg.MSG_INPUT_BIRTHDAY);
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYSTEM_ERROR, e);
		}
	}
}
