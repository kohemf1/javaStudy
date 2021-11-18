package prac;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Patten {

	public static void main(String[] args) {
		// 주민번호 등록시 년도와 성별 출력
		Scanner sc = new Scanner(System.in);
		
		String pattern = "\\d{6}\\-[1-4]\\d{6}";
		String val = sc.nextLine();
		boolean regex = Pattern.matches(pattern, val);
		System.out.println(regex);
		
		char gender = val.charAt(7);
		String year;
		String month;
		String date;
		String result = null;
		char year1 = val.charAt(0);
		char year2 = val.charAt(1);
		char month1 = val.charAt(2);
		char month2 = val.charAt(3);
		char date1 = val.charAt(4);
		char date2 = val.charAt(5);
		if(regex = true) {
			if(gender == '1') {
				year = "19"+year1+year2;
				month = ""+ month1 + month2;
				date = ""+ date1 + date2;
				result = year+"년"+month+"월"+date+"일"+"/남자";
			}else if(gender == '3' ) {
				year = "20"+year1+year2;
				month = ""+ month1 + month2;
				date = ""+ date1 + date2;				
				result = year+"년"+month+"월"+date+"일"+"/남자";
			}else if(gender == '2' ) {
				year = "19"+year1+year2;
				month = ""+ month1 + month2;
				date = ""+ date1 + date2;				
				result = year+"년"+month+"월"+date+"일"+"/여자";
			}else if(gender == '4' ) {
				year = "20"+year1+year2;
				month = ""+ month1 + month2;
				date = ""+ date1 + date2;				
				result = year+"년"+month+"월"+date+"일"+"/여자";
			}			
		}
		System.out.println(result);
	}
		
}


