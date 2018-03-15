package com.atguigu.java3;

/*
 * 
 * 同一个包下测试权限修饰符
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student stu = new Student();
		System.out.println(stu.name); //缺省的
		System.out.println(stu.namePublic); //public
		//System.out.println(stu.namePrivate);
		stu.say(); //缺省的
		stu.sayPublic();//public
		
	}
}
