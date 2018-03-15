package com.atguigu.exer;


/*
 * 编写一个学生类，和一个教师类
 * 
 */
public class ExerTest1 {

	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "小苍";
		stu.age = 18;
		stu.major = "成人教育";
		stu.interests = "培养兴趣";
		int stuScore = stu.getScore();
		
		Student stu2 = new Student();
		stu2.name = "小泽";
		stu2.age = 18;
		stu2.major = "成人教育";
		stu2.interests = "培养兴趣";
		int stu2Score = stu.getScore();
		//需求：计算学生的总成绩
		System.out.println(stuScore + stu2Score);
		
		/*
		String str = stu.say();
		System.out.println(str);
		
		System.out.println(stu.say());
		*/
		
		//System.out.println(stu.say()); //注意：如果调用的方法没有返回值不能直接打印
		
		Teacher t = new Teacher();
		t.age = 16;
		t.name = "老师";
		t.teachAge = 20;
		t.course = "数学";
		t.say();
	}
}

class Student{
	
	//显示赋值
	String name = "小泽";
	int age = 18;
	String major = "成人教育";
	String interests = "培养兴趣";
	int score;
	
	//返回学生的个人信息
	
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
