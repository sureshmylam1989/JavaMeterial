package com.date.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		DateTimeFormatter asd = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		System.out.println(LocalDateTime.now().format(asd));
	}

}
