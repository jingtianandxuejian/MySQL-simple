package com.atguigu.exer2;

/*
 * 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
    用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
    在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。

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
		
		if(a >=0 && a <=130){ //对年纪的限制条件
			age = a;
			return; //结束当前方法
		}
			
		System.out.println("您输入的年纪非法或者您是火星人");
		
		
	}
	
	public int getAge(){
		return age;
	}
}
