package com.atguigu.exer;

/*
 * 利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 2.0; //给圆的半径设置值
		double area = c.getArea();
		System.out.println(area);
		
//		double area2 = c.getArea(3.0);
//		System.out.println(area2);
	}
}

class Circle{
	
	double radius;
	
	//返回圆的面积
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	/*
	 * 首先：在这个类中来说这个方法的设计是不对的，因为已经有了半径并且设置了值，但是又传入了另一个半径
	 * 那么明显和我们原来的要求不一致
	 * 
	 * 设计上不合理
	 */
	/*
	public double getArea(double r){
		return Math.PI * r * r;
	}
	*/
}
