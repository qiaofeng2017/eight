package com.atguigu.git.entities

public class Person {

	private Integer personId;
	private String personName;
	private int age;

	public void talk(){
		System.out.println("I'm talking.");
	}

	public void say(){
		System.out.println("say ...");
	}

	public void eat(){
		System.out.println("eat ...");
	}

}