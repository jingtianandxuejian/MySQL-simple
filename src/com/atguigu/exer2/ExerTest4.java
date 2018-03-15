package com.atguigu.exer2;
/*
 4.定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
  创建20个学生对象，学号为1到20，年级和成绩都由随机数确定，打印出3年级(state值为3）的学生信息。

提示：
1) 生成随机数：Math.random()，返回值类型double;  
2) 四舍五入取整：Math.round(double d)，返回值类型long。

 */
public class ExerTest4 {

	public static void main(String[] args) {
		Student[] stus = new Student[20];
		
		for(int i = 0; i < 20 ; i++){
			Student stu = new Student();
			//stus[i] = new Student();
			stu.number = i + 1;
			
			//年纪1 - 6
			int random = (int) (Math.random() * 6 + 1); //0.0 - 1.0  0.999999
			stu.state = random;
			
			//成绩 0 - 100
			double m = Math.random() * 100; //0 - 99.999999
			int round = (int) Math.round(m);
			stu.score = round;
			
			if(stu.state == 3){
				System.out.println(stu.number + " " + stu.state + " " +stu.score);
			}
		}
	}
}

class Student{
	
	int number;
	int state; //随机数
	int score;//随机数
}
