package com.atguigu.java4;

/*
 * 
 * һ�����������췽����
 * 
 * �����ã�1.������Ķ���  2.�������е����Խ��г�ʼ��
 * 
 * ����ʽ��Ȩ�����η�  �������β��б�{}
 * 
 * ��˵����
 * 		1.�������������û����ʾ�Ķ��幹��������ôϵͳĬ�ϵĸ������ṩһ���޲εĹ�����
 *      2.���������������ʾ�Ķ����˹���������ôϵͳ�Ͳ����ٸ������ṩ�޲εĹ�����
 *      3.һ�����п���������������������������֮�乹������
 *      
 * �� ���Եĸ�ֵ��ʽ
 *   1.Ĭ��ֵ
 *   2.��ʾ��ֵ
 *   3.��������ֵ
 *   4.����.����/����.���� ��ֵ
 *   
 *   ˳����ʲô��
 *   1 -> 2 -> 3 -> 4
 *   
 */
public class PersonTest {

	public static void main(String[] args) {
		
		/*
		Person p = new Person("baby",18);
		p.setName("־��");
		p.show();
		*/
		
		Person pp = new Person("С��");
		pp.setName("ԲԲ");
		pp.show();
	}
}

//һ�㵱���󴴽��ɹ�֮ǰ���Ƕ�������ʼ������������Ժ�и�ֵ
class Person{
	
	private String name = "С��"; //��ʾ��ֵ
	private int age;
	
	//������
	
	public Person(){
		//System.out.println("bbb");
	}
	
	
	public Person(String n){
		name = n;
	}
	
	//�����ڹ���������һЩ��ʼ���Ĳ���
	public Person(String n,int a){
		say();
		name = n;
		age = a;
	}
	
	public void show(){
		System.out.println(name + " " + age);
	}
	
	public void say(){
		System.out.println("С������˵��������");
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
