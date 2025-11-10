package jp.co.sss.crud.util;

/**
 * 値の名称をまとめたクラス
 * 
 * @author 村田智大
 */
public class ConstantValue {
	/** インスタンス化を禁止 */
	private ConstantValue() {
	}

	public static final String COLUMN_EMP_ID = "emp_id";

	public static final String COLUMN_EMP_NAME = "emp_name";

	public static final String COLUMN_GENDER = "gender";

	public static final String COLUMN_BIRTHDAY = "birthday";

	public static final String COLUMN_DEPT_NAME = "dept_name";

	public static final String COLUMN_DEPT_ID = "dept_id";

	public static final String DATE_FORMAT_SLASH = "yyyy/MM/dd";

	public static final int GENDER_NO_ANSWER = 0;

	public static final int GENDER_MALE = 1;

	public static final int GENDER_FEMALE = 2;

	public static final int GENDER_OTHER = 3;

	public static final int DEPARTMENT_SALES_ID = 1;

	public static final int DEPARTMENT_ACCOUNTING_ID = 2;

	public static final int DEPARTMENT_GENERAL_AFFAIRS_ID = 3;

}
