package com.learn;

import java.util.Optional;

public class Java8Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java8Optional tester = new Java8Optional();
		
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(tester.sum(a,b));
		
	}
	
	public Integer sum(Optional<Integer> a,Optional<Integer> b){
		
		System.out.println("first param is present " + a.isPresent());
		System.out.println("second param is present " + b.isPresent());
		
		Integer value1 = a.orElse(new Integer(1));
		
		Integer value2 = b.get();
		
		return value1 + value2;
		
	}
}
