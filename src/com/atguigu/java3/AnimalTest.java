package com.atguigu.java3;

/*
 * 
 * 面向对象的三大特性之一：封装性
 * 
 * 为什么要使用封装性？
 * 		当我们创建对象的时候 会“对象.属性”的方式给属性设置值，给属性设置值的时候往往只有数据类型和数值范围的限制。
 *   但是在实际问题中，往往我们会有更多的限制。而这些限制在属性的声明处无法加以限制。所以我们采用如下的方式
 *   1.给属性设置（设置和获取的方法） ：通过以方法的形式给属性赋值并加以限制条件或者调用属性的值。
 *   2.把属性私有化：只是通过设置方法的方式并不能阻止“对象.属性”的调用
 * 
 * 封装性的体现（狭义上）：
 *   1.私有化属性，给属性设置方法（设置和获取属性的方法）
 * 封装性的体现（广义上）：
 *   1.私有化属性：四种权限修饰符- pirvate 缺省的 protected public
 *      权限修饰符可以修饰 ：属性，方法，构造器，内部类  。
 *      类只能用public和缺省的
 *   2.对属性添加设置和获取的方法：方法内可以加以限制条件。
 */
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
//		a.age = -18;
//		a.name = "旺财";
//		a.legs = 5;
//		a.show();
//		a.sleep();
		
		/*a.name = "狗蛋";
		a.age = 2;
		a.setLegs(5);
		//a.legs = 5;
		//a.show();
		System.out.println(a.getLegs());*/
		
		
	}
}

class Animal{
	
	private String name;
	private int age;//属性的限制：数据类型
	//哥们这是狗腿请写偶数
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
	
	//通过调用方法给属性设置值
	public void setLegs(int l){
		//对腿加以限制条件
		if(l > 0 && l % 2 == 0){
			legs = l;
		}
		
		System.out.println("哥们你想害我呀，输入非法了！！！");
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
		System.out.println("动物站着睡");
	}
}
