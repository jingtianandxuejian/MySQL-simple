package com.atguigu.java;

/*
 * 
 * �βΣ���ʽ�������������Ĳ���
 * ʵ�Σ�ʵ�ʲ����������÷�����ʱ��ʵ�ʸ������Ĳ������ݵı�����ֵ��
 */
public class ValueTransfer2 {

	public static void main(String[] args) {
		
		/*
		ValueTransfer2 transfer2 = new ValueTransfer2();
		int a = 10;
		transfer2.say("aa", a); //ʵ��
		*/
		
		//��һ
		int m = 10;
		int n = 5;
		/*
		int temp = m;
		m = n;
		n = temp;
		*/
		System.out.println("m=" + m + " n=" + n);
		ValueTransfer2 transfer2 = new ValueTransfer2();
		transfer2.swap(m, n); //�������ݽ���
		System.out.println("m=" + m + " n=" + n);
		
		//����
		User u1 = new User();
		u1.a = 5;
		u1.b = 10;
		System.out.println("a = " + u1.a + " b= " + u1.b);
		transfer2.swap(u1);
		System.out.println("a = " + u1.a + " b= " + u1.b);
		
		
	}
	
	//ֵ���ݣ�����������������ͣ���ô���ݵ��Ƕ���ĵ�ֵַ
	public void swap(User u1){
		int temp = u1.a;
		u1.a = u1.b;
		u1.b = temp;
	}
	
	//ֵ���ݣ��� ���ǻ����������ͣ���ô���ݵ��Ǿ����ֵ
	public void swap(int m,int n){
		int temp = m;
		m = n;
		n = temp;
	}
	
	public void say(String name,int age){//�β�
		
	}
}

class User{
	int a;
	int b;
}


