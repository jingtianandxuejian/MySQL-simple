package com.atguigu.java4;

import com.atguigu.java3.Student;

/*
 * 不同包下测试四种权限修饰符
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.namePublic ); //public
		//System.out.println(student.name); //缺省的
		student.sayPublic();
		//student.say();//缺省的
	}
}
