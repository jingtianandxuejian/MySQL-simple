package com.atguigu.java3;

/*
 * 
 * ͬһ�����²���Ȩ�����η�
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student stu = new Student();
		System.out.println(stu.name); //ȱʡ��
		System.out.println(stu.namePublic); //public
		//System.out.println(stu.namePrivate);
		stu.say(); //ȱʡ��
		stu.sayPublic();//public
		
	}
}
