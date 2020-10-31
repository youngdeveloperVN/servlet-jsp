package com.vn.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegularExpression {
	
	final static String SQL_SELECT = "4";
	static String PATTERN = "\\d+";
	public static void main(String[] args) {
		
		
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(SQL_SELECT);
		if(Pattern.matches(PATTERN, SQL_SELECT)) {
			System.out.println("match");
			String[] item = pattern.split(SQL_SELECT);
			for (String string : item) {
				System.out.println(string);
			}
		}
	}
}
