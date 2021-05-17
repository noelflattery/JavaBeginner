package com.android;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>intList=Stream.
							generate(()->(int)(Math.random()*10)).
							limit(10)
							.collect(Collectors.toList());
		System.out.println(intList);
	//	List<Integer>intList=new ArrayList<Integer>(streamInts);
		List<Integer>firstList=new ArrayList<>();
		Stream.
		generate(()->(int)(Math.random()*10)).
		filter((n)->n>0).
		limit(10).
		peek((n)->{
			System.out.println("number is "+n);
			firstList.add(n);}).
		map((n)->n*2).
		collect(Collectors.toList()).
		stream().
		forEach((n)->System.out.println("double the number is "+n));
		
		Stream.
		generate(()->(int)(Math.random()*10)).
		filter(n->n>0).
		distinct().
		limit(9).
		forEach(System.out::println);
		
		

	}
	
	

}
