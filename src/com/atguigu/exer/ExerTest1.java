package com.atguigu.exer;


/*
 * ��дһ��ѧ���࣬��һ����ʦ��
 * 
 */
public class ExerTest1 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "С��";
		stu.age = 18;
		stu.major = "���˽���";
		stu.interests = "������Ȥ";
		int stuScore = stu.getScore();
		
		Student stu2 = new Student();
		stu2.name = "С��";
		stu2.age = 18;
		stu2.major = "���˽���";
		stu2.interests = "������Ȥ";
		int stu2Score = stu.getScore();
		//���󣺼���ѧ�����ܳɼ�
		System.out.println(stuScore + stu2Score);
		
		/*
		String str = stu.say();
		System.out.println(str);
		
		System.out.println(stu.say());
		*/
		
		//System.out.println(stu.say()); //ע�⣺������õķ���û�з���ֵ����ֱ�Ӵ�ӡ
		
		Teacher t = new Teacher();
		t.age = 16;
		t.name = "��ʦ";
		t.teachAge = 20;
		t.course = "��ѧ";
		t.say();
	}
}

class Student{
	
	//��ʾ��ֵ
	String name = "С��";
	int age = 18;
	String major = "���˽���";
	String interests = "������Ȥ";
	int score;
	
	//����ѧ���ĸ�����Ϣ
	
	public void say(){
		System.out.println(name + " " + age + " " + major + " " + interests);
	}
	
	public int getScore(){
		return score;
	}
	
	
	/*
	public String say(){
		return name + " " + age + " " + major + " " + interests;
	}
	*/
}

class Teacher{
	String name;
	int age;
	int teachAge;
	String course;
	
	public void say(){
		System.out.println(name + age + teachAge + course);
	}
}
