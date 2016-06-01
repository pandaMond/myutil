package calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

public class CalendarUtil {

	/**
	 * 
	 * 获取当前时间所在的星期时间
	 * 
	 */
	public List<Calendar> oneDayWeek(Calendar c) {
		if (c==null) {
			System.out.println("传入对象为空值ֵ");
			return null;
		}
		List<Calendar> daylist = new ArrayList<Calendar>();
		Integer days = c.get(c.DAY_OF_WEEK);
		c.add(c.DATE, -days);
		for (int i = 0; i < 7; i++) {
			c.add(c.DATE, 1);
			daylist.add(c);
		}
		return daylist;
	}

	/**
	 * 获取当天的最大值和最小值
	 * 
	 * @param c
	 * @return
	 */
	public List<Date> oneDayBetween(Calendar c) {
		if (c == null) {
			System.out.println("传入对象为空值");
			return null;
		}
		List<Date> dayTime = new ArrayList<Date>();
		c.set(c.HOUR, 0);
		c.set(c.MINUTE, 0);
		c.set(c.SECOND, 0);
		
		Date start = c.getTime();
		c.add(c.DAY_OF_MONTH,1);
		c.add(c.SECOND,-1);
		Date end = c.getTime();
		dayTime.add(start);
		dayTime.add(end);
		return dayTime;
	}

}
