package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 部署ID入力処理用クラス
 * 
 * @author 村田智大
 */
public class EmployeeDeptIdReader {
	public static String inputEmployeeDeptId() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 検索する部署IDを入力
		System.out.print(ConstantMsg.MSG_INPUT_DEPT_ID);
		return br.readLine();
	}

}
