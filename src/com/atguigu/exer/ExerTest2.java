package com.atguigu.exer;

/*
 Ҫ��(1)����Person��Ķ������øö����name��age��sex���ԣ�����study������
 ����ַ�����studying��������showAge()������ʾageֵ������addAge()�����������age����ֵ����2�ꡣ
(2)�����ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��

 */
public class ExerTest2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "�೤";
		p.age = 18;
		p.sex = 1;
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();
		
		Person p2 = new Person();
		p2.age = 16;
		p2.name = "��л��";
		p2.sex = 0;
		p2.study();
		p2.showAge();
		p2.addAge(2);
		p2.showAge();
	}
}

class Person{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println(name + " studying");
	}
	
	public void showAge(){
		System.out.println(name + " " + age);
	}
	
	public int addAge(int i){
		return age += i;
	}
}
