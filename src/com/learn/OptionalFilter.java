package com.learn;

import java.util.Optional;

public class OptionalFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();
		
		System.out.println(gender.filter(g -> g.equals("male")));
		System.out.println(gender.filter(g -> g.equalsIgnoreCase("MALE")));
		System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("male")));
	}

}
