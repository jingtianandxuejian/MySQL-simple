package com.atguigu.java;

/*
 * 
 * ֵ����
 * 
 * 
 */
public class ValueTransfer {

	public static void main(String[] args) {
		
		//��һ
		int m = 10;
		int n = m;
		n = 5;
		System.out.println(m);
		
		//����
		Order o1 = new Order();
		o1.id = 10;
		Order o2 = o1;
		o2.id = 20;
		System.out.println(o1.id);
		
	}
	
}

class Order{
	int id;
}
