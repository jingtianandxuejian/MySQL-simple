package com.atguigu.exer2;

/*
 * ��������,�����ж��������ࣺPerson��PersonTest�ࡣ�������£�
    ��setAge()�����˵ĺϷ�����(0~130)����getAge()�����˵����䡣
    ��PersonTest����ʵ����Person��Ķ���b������setAge()��getAge()���������Java�ķ�װ�ԡ�

 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setAge(-30);
		//System.out.println(p.getAge());
	}
}


class Person{
	
	private int age;
	
	public void setAge(int a){
		
		if(a >=0 && a <=130){ //����͵���������
			age = a;
			return; //������ǰ����
		}
			
		System.out.println("���������ͷǷ��������ǻ�����");
		
		
	}
	
	public int getAge(){
		return age;
	}
}
