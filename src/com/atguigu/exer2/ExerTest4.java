package com.atguigu.exer2;
/*
 4.������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�score(int)��
  ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ������ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��

��ʾ��
1) �����������Math.random()������ֵ����double;  
2) ��������ȡ����Math.round(double d)������ֵ����long��

 */
public class ExerTest4 {

	public static void main(String[] args) {
		Student[] stus = new Student[20];
		
		for(int i = 0; i < 20 ; i++){
			Student stu = new Student();
			//stus[i] = new Student();
			stu.number = i + 1;
			
			//���1 - 6
			int random = (int) (Math.random() * 6 + 1); //0.0 - 1.0  0.999999
			stu.state = random;
			
			//�ɼ� 0 - 100
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
	int state; //�����
	int score;//�����
}
