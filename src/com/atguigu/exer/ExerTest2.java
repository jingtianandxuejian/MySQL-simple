package com.atguigu.exer;

/*
 要求：(1)创建Person类的对象，设置该对象的name、age和sex属性，调用study方法，
 输出字符串“studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
(2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

 */
public class ExerTest2 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "班长";
		p.age = 18;
		p.sex = 1;
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();
		
		Person p2 = new Person();
		p2.age = 16;
		p2.name = "大谢飞";
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
