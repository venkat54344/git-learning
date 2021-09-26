package com.venkat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1,"venkat"));
		list.add(new Student(1,"venkat1"));
		list.add(new Student(3,"venkat2"));
		
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(Student::getStId, Student::getStName,(oldValue,newValue)->newValue));
		System.out.println(map);
	}

}
