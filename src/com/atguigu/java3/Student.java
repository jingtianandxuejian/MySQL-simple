package com.atguigu.java3;

public class Student {

	public String namePublic;
	private String namePrivate;
	String name;
	
	
	public void sayPublic(){
		System.out.println("sayPublic");
	}
	
	private void sayPrivate(){
		System.out.println("sayPrivate");
	}
	
	void say(){
		System.out.println("say");
	}
	
	public void sleep(){
		sayPrivate();
		System.out.println(namePrivate);
	}
}
