package com.atguigu.java4;

import com.atguigu.java3.Student;

/*
 * ��ͬ���²�������Ȩ�����η�
 */
public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.namePublic ); //public
		//System.out.println(student.name); //ȱʡ��
		student.sayPublic();
		//student.say();//ȱʡ��
	}
}
