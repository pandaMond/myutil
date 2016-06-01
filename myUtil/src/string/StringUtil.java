package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	/**
	 * �ж��ַ�����Ϊ��
	 * 
	 * @param variable
	 * @return ���Ϊ���򷵻�true,�����Ϊ���ⷵ��false
	 */

	public boolean isblank(String variable) {
		if (variable == null || "".equals(variable)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж��ַ�����Ϊ��
	 * 
	 * @param variable
	 * @return �����Ϊ�շ���true,���Ϊ�շ���false;
	 */

	public boolean isNotblank(String variable) {
		if (variable != null || !("".equals(variable))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * �ж���Ӣ�Ļ�ϵĳ���
	 * 
	 */
	public Integer getlength(String str) {
		String leng = str.replaceAll("/[^\\x00-\\xff]/g", "a");
		return leng.length();
	}

	/**
	 * �ַ�������ȡ������
	 */
	public Double getNumber(String str) {
		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str.trim());

		Double num = Double.valueOf(m.toString());
		return num;
	}

}
