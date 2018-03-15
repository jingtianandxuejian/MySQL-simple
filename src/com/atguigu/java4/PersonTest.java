package com.atguigu.java4;

/*
 * 
 * 一构造器（构造方法）
 * 
 * 二作用：1.创建类的对象  2.给对象中的属性进行初始化
 * 
 * 三格式：权限修饰符  类名（形参列表）{}
 * 
 * 四说明：
 * 		1.如果我们在类中没有显示的定义构造器，那么系统默认的给我们提供一个无参的构造器
 *      2.如果我们在类中显示的定义了构造器，那么系统就不会再给我们提供无参的构造器
 *      3.一个类中可以声明多个构造器，多个构造器之间构成重载
 *      
 * 五 属性的赋值方式
 *   1.默认值
 *   2.显示赋值
 *   3.构造器赋值
 *   4.对象.属性/对象.方法 赋值
 *   
 *   顺序是什么？
 *   1 -> 2 -> 3 -> 4
 *   
 */
public class PersonTest {

	public static void main(String[] args) {
		
		/*
		Person p = new Person("baby",18);
		p.setName("志玲");
		p.show();
		*/
		
		Person pp = new Person("小苍");
		pp.setName("圆圆");
		pp.show();
	}
}

//一般当对象创建成功之前我们都叫做初始化，创建完成以后叫赋值
class Person{
	
	private String name = "小泽"; //显示赋值
	private int age;
	
	//构造器
	
	public Person(){
		//System.out.println("bbb");
	}
	
	
	public Person(String n){
		name = n;
	}
	
	//可以在构造器中做一些初始化的操作
	public Person(String n,int a){
		say();
		name = n;
		age = a;
	}
	
	public void show(){
		System.out.println(name + " " + age);
	}
	
	public void say(){
		System.out.println("小玲玲在说话！！！");
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}
}
