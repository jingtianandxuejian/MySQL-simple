package com.atguigu.exer;

/*
 * �����������ı�̷����������Circle����Բ�����
 */
public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 2.0; //��Բ�İ뾶����ֵ
		double area = c.getArea();
		System.out.println(area);
		
//		double area2 = c.getArea(3.0);
//		System.out.println(area2);
	}
}

class Circle{
	
	double radius;
	
	//����Բ�����
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	/*
	 * ���ȣ������������˵�������������ǲ��Եģ���Ϊ�Ѿ����˰뾶����������ֵ�������ִ�������һ���뾶
	 * ��ô���Ժ�����ԭ����Ҫ��һ��
	 * 
	 * ����ϲ�����
	 */
	/*
	public double getArea(double r){
		return Math.PI * r * r;
	}
	*/
}
