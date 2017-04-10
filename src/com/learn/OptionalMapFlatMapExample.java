package com.learn;

import java.util.Optional;

public class OptionalMapFlatMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Optional<String> nonEmptyGender = Optional.of("Male"); 
		Optional<String> emptyGender = Optional.empty();
		
		System.out.println("Non empty optional " + nonEmptyGender.map(String::toUpperCase));
		System.out.println("Empty option " + emptyGender.map(String::toUpperCase));
		
		Optional<Optional<String>> nonEmptyOptionaGender = Optional.of(Optional.of("male"));
		
		System.out.println("optional value " + nonEmptyOptionaGender);
		System.out.println("optional.map"  + nonEmptyOptionaGender.map(gender -> gender.map(String::toUpperCase)));
		System.out.println("optional flat map " + nonEmptyOptionaGender.flatMap(gender -> gender.map(String::toUpperCase)));

	}

}
