package jp.co.sss.crud.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員ID入力処理用のサービスクラス
 * 
 * @author 村田智大
 */
public class EmployeeEmpIdReader {

	public static String inputEmployeeId(int menuNo) throws SystemErrorException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		switch (menuNo) {
		case 1: {
			System.out.print(ConstantMsg.MSG_INPUT_UPDATE_EMP_ID);
			try {
				return br.readLine();
			} catch (IOException e) {
				throw new SystemErrorException(ConstantMsg.MSG_SYSTEM_ERROR, e);
			}
		}
		case 2: {
			System.out.print(ConstantMsg.MSG_INPUT_DELETE_EMP_ID);
			try {
				return br.readLine();
			} catch (IOException e) {
				throw new SystemErrorException(ConstantMsg.MSG_SYSTEM_ERROR, e);
			}
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + menuNo);
		}
		// 更新対象の社員ID入力

	}
}
