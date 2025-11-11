package jp.co.sss.crud.exception;

/**
 * 独自例外管理クラス
 * 
 * @author 村田智大
 */
public class SystemErrorException extends Exception {

	public SystemErrorException(String message, Throwable cause) {
		super(message, cause);
	}
}
