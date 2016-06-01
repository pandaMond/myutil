package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	/**
	 * 判断字符串是为空
	 * 
	 * @param variable
	 * @return 如果为空则返回true,如果不为空这返回false
	 */

	public boolean isblank(String variable) {
		if (variable == null || "".equals(variable)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断字符串不为空
	 * 
	 * @param variable
	 * @return 如果不为空返回true,如果为空返回false;
	 */

	public boolean isNotblank(String variable) {
		if (variable != null || !("".equals(variable))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断中英文混合的长度
	 * 
	 */
	public Integer getlength(String str) {
		String leng = str.replaceAll("/[^\\x00-\\xff]/g", "a");
		return leng.length();
	}

	/**
	 * 字符串中提取纯数字
	 */
	public Double getNumber(String str) {
		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str.trim());

		Double num = Double.valueOf(m.toString());
		return num;
	}

}
