package com.fullmusic.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DateUtil {
	
	public static void main(String[] args) {
		String crrd = DateFormat.getDateInstance().format(new Date());
		String xq = DateUtil.getWeekOfDate(DateUtil.getAssDate(crrd));

		List<String> list = new ArrayList<>();
		list.add(crrd+","+xq);
		int i = 0;
		while(i<4){
			i++;
			crrd = DateUtil.getSpecifiedDayAfter(crrd);
			xq = DateUtil.getWeekOfDate(DateUtil.getAssDate(crrd));
			list.add(crrd+","+xq);
		}
		System.out.println(list);
	}

	/**
	 * 获取星期几
	 * @param date
	 * @return
	 */
	public static String getWeekOfDate(Date date) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}
	/**
	 * 获取指定日期的后一天
	 * @param specifiedDay
	 * @return
	 */
	public static String getSpecifiedDayAfter(String specifiedDay){
		Calendar c = Calendar.getInstance();
		Date date=null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setTime(date);
		int day=c.get(Calendar.DATE);
		c.set(Calendar.DATE,day+1);

		String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		return dayAfter;
	}
	/**
	 * 获取指定日期的前一天
	 * @param specifiedDay
	 * @return
	 */
	public static String getSpecifiedDayBefore(String specifiedDay){
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Date date=null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setTime(date);
		int day=c.get(Calendar.DATE);
		c.set(Calendar.DATE,day-1);

		String dayBefore=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		return dayBefore;
	}
	/**
	 * 获取指定日期Date
	 * @param date
	 * @return
	 */
	public static Date getAssDate(String date){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = null;
		try {
			myDate = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		return myDate;
	}

	/**
	 * 获取当天凌晨
	 * @return
	 */
	public static Date getCurrDate(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		Date zero = calendar.getTime();
		return zero;
	}

	/**
	 * 获取今天每月的第一天和最后一天
	 * @return
	 */
	public static Map<String,String>getMonthInterval(){
		//获取当年
		Calendar cale = null;
		cale = Calendar.getInstance();
		int year =cale.get(Calendar.YEAR);
		List<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
		int i = 0;
		HashMap<String,String> map = new HashMap<String,String>();
		while(i<12) {
			i++;
			System.out.println(getDateFirstDay(year+"",i+"")+","+getDateLastDay(year+"",i+""));
			map.put(i+"month", getDateFirstDay(year+"",i+"")+","+getDateLastDay(year+"",i+""));
		}
		return map;
	}

	/**
	 *  获取当月第一天
	 * @param year
	 * @param month
	 * @return
	 */
	public static String getDateFirstDay(String year,String month) {
		  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
	      //获取前月的第一天
	      Calendar   calendar=Calendar.getInstance();//获取当前日期 
	      calendar.set(Calendar.YEAR, Integer.parseInt(year));
	      calendar.set(Calendar.MONTH, Integer.parseInt(month));
	      calendar.add(Calendar.MONTH, -1);
	      calendar.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
	      return format.format(calendar.getTime());
	}
	/**
	 * 获取当月最后一天
	 * @param year
	 * @param month
	 * @return
	 */
	public static String getDateLastDay(String year, String month) {
	      Calendar calendar = Calendar.getInstance();
	      // 设置时间,当前时间不用设置
	      calendar.set(Calendar.YEAR, Integer.parseInt(year));
	      calendar.set(Calendar.MONTH, Integer.parseInt(month));
	      calendar.set(Calendar.DAY_OF_MONTH, 0);
	      DateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
	      return format.format(calendar.getTime());
	}
	
	public static void test() {
		// 获取当前年份、月份、日期  
        Calendar cale = null;  
        cale = Calendar.getInstance();  
        int year = cale.get(Calendar.YEAR);  
        int month = cale.get(Calendar.MONTH) + 1;  
        int day = cale.get(Calendar.DATE);  
        int hour = cale.get(Calendar.HOUR_OF_DAY);  
        int minute = cale.get(Calendar.MINUTE);  
        int second = cale.get(Calendar.SECOND);  
        int dow = cale.get(Calendar.DAY_OF_WEEK);  
        int dom = cale.get(Calendar.DAY_OF_MONTH);  
        int doy = cale.get(Calendar.DAY_OF_YEAR);  
  
        System.out.println("Current Date: " + cale.getTime());  
        System.out.println("Year: " + year);  
        System.out.println("Month: " + month);  
        System.out.println("Day: " + day);  
        System.out.println("Hour: " + hour);  
        System.out.println("Minute: " + minute);  
        System.out.println("Second: " + second);  
        System.out.println("Day of Week: " + dow);  
        System.out.println("Day of Month: " + dom);  
        System.out.println("Day of Year: " + doy);  
  
        // 获取当月第一天和最后一天  
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        String firstday, lastday;  
        // 获取前月的第一天  
        cale = Calendar.getInstance();  
        cale.add(Calendar.MONTH, 0);  
        cale.set(Calendar.DAY_OF_MONTH, 1);  
        firstday = format.format(cale.getTime());  
        // 获取前月的最后一天  
        cale = Calendar.getInstance();  
        cale.add(Calendar.MONTH, 1);  
        cale.set(Calendar.DAY_OF_MONTH, 0);  
        lastday = format.format(cale.getTime());  
        System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);  
  
        // 获取当前日期字符串  
        Date d = new Date();  
        System.out.println("当前日期字符串1：" + format.format(d));  
        System.out.println("当前日期字符串2：" + year + "/" + month + "/" + day + " "  
                + hour + ":" + minute + ":" + second);  
	}
}
