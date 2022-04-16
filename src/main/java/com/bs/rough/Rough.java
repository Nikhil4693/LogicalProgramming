package com.bs.rough;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rough {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Nikhil Wadatkar", "Ankur Khanna", "Dhanu Khanna");

		List<Object> fullnames = list.stream().filter(str -> str.contains("Khanna")).collect(Collectors.toList());
		System.out.println(fullnames);
	
	}

}
