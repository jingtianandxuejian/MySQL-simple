package com.atguigu.java2;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1,-20,32,19,78};
		
		//求数组中的最大值
		ArrayUtils utils = new ArrayUtils();
		int max = utils.getMax(arr);
		System.out.println(max);
		
		int min = utils.getMin(arr);
		System.out.println(min);
		
		int sum = utils.getSum(arr);
		System.out.println(sum);
		
		int[] copy = utils.copy(arr);
		utils.print(copy);
		
		utils.sort(arr,"desc");
		utils.print(arr);
	}
}
