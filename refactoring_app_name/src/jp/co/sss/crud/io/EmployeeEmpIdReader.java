package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員ID入力処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeEmpIdReader {

	public static String inputEmployeeId(int menuNo) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch (menuNo) {
		case 1: {
			System.out.print(ConstantMsg.MSG_INPUT_UPDATE_EMP_ID);
			return br.readLine();
		}
		case 2: {
			System.out.print(ConstantMsg.MSG_INPUT_DELETE_EMP_ID);
			return br.readLine();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + menuNo);
		}
		// 更新対象の社員ID入力

	}
}
