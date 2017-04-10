package com.learn;

import java.util.Optional;

public class OptionalBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> gender = Optional.of("MALE");
		
		String ans1 = "Yes";
		String ans2 = null;
		
		System.out.println("Non empty optional : " + gender);
		System.out.println("Non-empty optional : gender value : " + gender.get());
		System.out.println("Empty optional  " + Optional.empty());
		
		System.out.println("ofnullable on non-empty optional " + gender.ofNullable(ans1));
		System.out.println("ofnullable on empty optional "  + gender.ofNullable(ans2));
		
		
		System.out.println("of of non empty value -->" + Optional.of(ans1));
		
		System.out.println("of of empty --> " + Optional.of(ans2));
	}

}
