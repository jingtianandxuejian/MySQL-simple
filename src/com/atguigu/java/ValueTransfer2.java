package com.atguigu.java;

/*
 * 
 * 形参（形式参数）：方法的参数
 * 实参（实际参数）：调用方法的时候，实际给方法的参数传递的变量，值。
 */
public class ValueTransfer2 {

	public static void main(String[] args) {
		
		/*
		ValueTransfer2 transfer2 = new ValueTransfer2();
		int a = 10;
		transfer2.say("aa", a); //实参
		*/
		
		//例一
		int m = 10;
		int n = 5;
		/*
		int temp = m;
		m = n;
		n = temp;
		*/
		System.out.println("m=" + m + " n=" + n);
		ValueTransfer2 transfer2 = new ValueTransfer2();
		transfer2.swap(m, n); //进行数据交换
		System.out.println("m=" + m + " n=" + n);
		
		//例二
		User u1 = new User();
		u1.a = 5;
		u1.b = 10;
		System.out.println("a = " + u1.a + " b= " + u1.b);
		transfer2.swap(u1);
		System.out.println("a = " + u1.a + " b= " + u1.b);
		
		
	}
	
	//值传递：如果是引用数据类型，那么传递的是对象的地址值
	public void swap(User u1){
		int temp = u1.a;
		u1.a = u1.b;
		u1.b = temp;
	}
	
	//值传递：如 果是基本数据类型，那么传递的是具体的值
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp;
	}
	
	public void say(String name,int age){//形参
		
	}
}

class User{
	int a;
	int b;
}


