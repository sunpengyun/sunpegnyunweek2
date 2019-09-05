package com.sunpengyun.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testGetDateByInitMonth() {
	    Calendar c = Calendar.getInstance();
	    c.set(2018, 7, 16);
	    Date date = DateUtils.getDateByInitMonth(c.getTime());
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String format = sdf.format(date);
	    System.out.println("得到的月初时间为:");
	    System.out.println(format);
	    
	}
	
	@Test
	public void getDateByFullMonth(){
			Scanner sc = new Scanner(System.in);
		    Calendar c = Calendar.getInstance();
			System.out.println("请输入年月日"); 
			c.set(2018,6,18);
			Date date = DateUtils.getDateByFullMonth(c.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = sdf.format(date);
			System.out.println(format);
			
	}

}
