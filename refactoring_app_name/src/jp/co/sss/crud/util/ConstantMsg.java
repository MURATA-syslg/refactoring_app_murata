package jp.co.sss.crud.util;

/**
 * メッセージをまとめたクラス
 * 
 * @author 村田智大
 * 
 */
public class ConstantMsg {

	/** インスタンス化を禁止 */
	private ConstantMsg() {
	}

	public static final String SYSTEM_MENU_BAR = "=== 社員管理システム ===";

	public static final String SYSTEM_MENU_VIEW_EMPLOYEES = "1.全件表示";

	public static final String SYSTEM_MENU_SEARCH_BY_NAME = "2.社員名検索";

	public static final String SYSTEM_MENU_SEARCH_BY_DEPTID = "3.部署ID検索";

	public static final String SYSTEM_MENU_INSERT = "4.新規登録";

	public static final String SYSTEM_MENU_UPDATE = "5.更新";

	public static final String SYSTEM_MENU_DELETE = "6.削除";

	public static final String SYSTEM_MENU_QUIT = "7.終了";

	public static final String SYSTEM_MENU_INPUT_MENUNO = "メニュー番号を入力してください：";

	public static final String MSG_INPUT_EMP_NAME = "社員名:";

	public static final String MSG_INPUT_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";

	public static final String MSG_INPUT_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";

	public static final String MSG_INPUT_BIRTHDAY = "生年月日(西暦年/月/日):";

	public static final String MSG_INPUT_UPDATE_EMP_ID = "更新する社員の社員IDを入力してください：";

	public static final String MSG_EMPLOYEE_UPDATE = "社員情報を更新しました";

	public static final String MSG_INPUT_DELETE_EMP_ID = "削除する社員の社員IDを入力してください：";

	public static final String MSG_QUIT_SYSTEM = "システムを終了します。";

	public static final String MSG_NO_MATCHING_USER = "該当者はいませんでした";

	public static final String MSG_RECORD_OUTPUT_HEADER = "社員ID\t社員名\t性別\t生年月日\t部署名";

	public static final String MSG_NO_ANSWER = "回答なし";

	public static final String MSG_GENDER_MALE = "男性";

	public static final String MSG_GENDER_FEMALE = "女性";

	public static final String MSG_GENDER_OTHER = "その他";

	public static final String MSG_DEPARTMENT_SALES = "営業部";

	public static final String MSG_DEPARTMENT_ACCOUNTING = "経理部";

	public static final String MSG_DEPARTMENT_GENERAL_AFFAIRS = "総務部";

	public static final String MSG_EMPLOYEE_REGISTERED = "社員情報を登録しました";

	public static final String MSG_EMPLOYEE_DELETED = "社員情報を削除しました";

}
