package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 性別入力処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeGenderReader {

	public static String inputEmployeeGender() throws SystemErrorException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 性別入力
		System.out.print(ConstantMsg.MSG_INPUT_GENDER);
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new SystemErrorException(ConstantMsg.MSG_SYSTEM_ERROR, e);
		}
	}
}
