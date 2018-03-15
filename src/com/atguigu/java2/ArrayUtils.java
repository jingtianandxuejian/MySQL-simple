package com.atguigu.java2;

/*
 * 
 * 数组的一个工具类
 * 
 */
public class ArrayUtils {

	//数组中的最大数
	public int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	//数组中的最小数
	public int getMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//求和
	public int getSum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//平均数
	public int getAvg(int[] arr){
		int sum = getSum(arr);
		return sum / arr.length;
	}
	
	//排序
	public void sort(int[] arr,String sort){
		/*
		 * sort.equals("asc")
		 * 
		 * “asc”.equals(sort)
		 */
		if("asc".equals(sort)){ //升序
			//升序：冒泡
			for(int i = 0 ; i < arr.length - 1 ; i++){
				for(int j = 0 ; j < arr.length - 1 - i; j++){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}else if("desc".equals(sort)){ //降序
			for(int i = 0 ; i < arr.length - 1 ; i++){
				for(int j = 0 ; j < arr.length - 1 - i; j++){
					if(arr[j] < arr[j+1]){
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
						
						//swap(arr,j,j+1);
						
						swap(arr[j],arr[j+1]); //交换错误，因为是数组中的元素（元素值是基本数据类型）
					}
				}
			}
			
		}else{
			System.out.println("排序方式错误");
		}
		
	}
	
	public void swap(int i,int j){
		int temp = i;
		i = j;
		j = temp;
	}
	
	public void swap(int[] arr,int i,int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	//反转
	public void reverse(int[] arr){
		for(int i = 0,j = arr.length - 1; i < arr.length / 2; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	//复制
	public int[] copy(int[] arr){
		int[] c = new int[arr.length];
		for(int i = 0 ; i < arr.length; i++){
			c[i] = arr[i];
		}
		return c;
	}
	
	//遍历
	public void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
}
