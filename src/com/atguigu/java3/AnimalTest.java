package com.atguigu.java3;

/*
 * 
 * ����������������֮һ����װ��
 * 
 * ΪʲôҪʹ�÷�װ�ԣ�
 * 		�����Ǵ��������ʱ�� �ᡰ����.���ԡ��ķ�ʽ����������ֵ������������ֵ��ʱ������ֻ���������ͺ���ֵ��Χ�����ơ�
 *   ������ʵ�������У��������ǻ��и�������ơ�����Щ���������Ե��������޷��������ơ��������ǲ������µķ�ʽ
 *   1.���������ã����úͻ�ȡ�ķ����� ��ͨ���Է�������ʽ�����Ը�ֵ�����������������ߵ������Ե�ֵ��
 *   2.������˽�л���ֻ��ͨ�����÷����ķ�ʽ��������ֹ������.���ԡ��ĵ���
 * 
 * ��װ�Ե����֣������ϣ���
 *   1.˽�л����ԣ����������÷��������úͻ�ȡ���Եķ�����
 * ��װ�Ե����֣������ϣ���
 *   1.˽�л����ԣ�����Ȩ�����η�- pirvate ȱʡ�� protected public
 *      Ȩ�����η��������� �����ԣ����������������ڲ���  ��
 *      ��ֻ����public��ȱʡ��
 *   2.������������úͻ�ȡ�ķ����������ڿ��Լ�������������
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
//		a.age = -18;
//		a.name = "����";
//		a.legs = 5;
//		a.show();
//		a.sleep();
		
		/*a.name = "����";
		a.age = 2;
		a.setLegs(5);
		//a.legs = 5;
		//a.show();
		System.out.println(a.getLegs());*/
		
		
	}
}

class Animal{
	
	private String name;
	private int age;//���Ե����ƣ���������
	//�������ǹ�����дż��
	private int legs; 
	
	
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
	
	//ͨ�����÷�������������ֵ
	public void setLegs(int l){
		//���ȼ�����������
		if(l > 0 && l % 2 == 0){
			legs = l;
		}
		
		System.out.println("�������뺦��ѽ������Ƿ��ˣ�����");
	}
	
	public int getLegs(){
		return legs;
	}
	
	private void say(){
		System.out.println("say");
	}
	
	public void show(){
		System.out.println(name + " age = " + age + " legs = " + legs);
	}
	
	public void sleep(){
		System.out.println("����վ��˯");
	}
}
