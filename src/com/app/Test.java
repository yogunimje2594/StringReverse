package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Collections.reverse(list);
		System.out.println(list);
		
		list.forEach(System.out::println);
		for(Integer l:list) {
			System.out.println(l);
			
			int a=10;
		}
	}
	 
	 
}