package com.atguigu.exer;

/*
3.1 ��д��������һ��method�������ڷ����д�ӡһ��10*8 �ľ��Σ���main�����е��ø÷�����

3.2 �޸���һ��������method�����У�����ӡһ��10*8�ľ����⣬�ټ���þ��ε��������������Ϊ��������ֵ��
��main�����е��ø÷��������շ��ص����ֵ����ӡ��

3.3 �޸���һ��������method�����ṩm��n���������������д�ӡһ��m*n�ľ��Σ�
������þ��ε������ ������Ϊ��������ֵ����main�����е��ø÷��������շ��ص����ֵ����ӡ��

 */
public class ExerTest3 {

	public static void main(String[] args) {
		
		ExerTest3 test = new ExerTest3();
		int area = test.method(20,8);
		System.out.println(area);
		test.method(5,20);
	}

	/*
	public void method() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	*/
	
	/*
	public int method() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		return 10 * 8;
	}
	*/
	
	public int method(int m,int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		return m * n;
	}
}
