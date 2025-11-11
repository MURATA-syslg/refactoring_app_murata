package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員名入力処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeNameReader {

	public static String inputEmployeeName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 社員名入力
		System.out.print(ConstantMsg.MSG_INPUT_EMP_NAME);
		return br.readLine();
	}
}
