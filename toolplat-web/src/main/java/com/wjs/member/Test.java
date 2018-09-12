package com.wjs.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("9999-12-31 23:59:59").getTime());
		
		System.out.println(new Date(253402271999L));
	}
}

