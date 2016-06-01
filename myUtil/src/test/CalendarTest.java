package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import calendar.CalendarUtil;

public class CalendarTest {
    public static void main(String []ages){
    	CalendarUtil calendarutil=new CalendarUtil();
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
    	Calendar c=Calendar.getInstance();
    List<Date>	list=calendarutil.oneDayBetween(c);
          System.out.println(sdf.format(list.get(0)));
    	  System.out.println(sdf.format(list.get(1)));
      }
    	
    	
    	

}
