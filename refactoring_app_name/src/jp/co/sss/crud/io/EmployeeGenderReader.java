package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 性別入力処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeGenderReader {

	public static String inputEmployeeGender() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 性別入力
		System.out.print(ConstantMsg.MSG_INPUT_GENDER);
		return br.readLine();
	}
}
