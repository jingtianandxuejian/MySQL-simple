package com.atguigu.java2;

/*
 * 
 * �����һ��������
 * 
 */
public class ArrayUtils {

	//�����е������
	public int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
	//�����е���С��
	public int getMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
	
	//���
	public int getSum(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//ƽ����
	public int getAvg(int[] arr){
		int sum = getSum(arr);
		return sum / arr.length;
	}
	
	//����
	public void sort(int[] arr,String sort){
		/*
		 * sort.equals("asc")
		 * 
		 * ��asc��.equals(sort)
		 */
		if("asc".equals(sort)){ //����
			//����ð��
			for(int i = 0 ; i < arr.length - 1 ; i++){
				for(int j = 0 ; j < arr.length - 1 - i; j++){
					if(arr[j] > arr[j+1]){
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}else if("desc".equals(sort)){ //����
			for(int i = 0 ; i < arr.length - 1 ; i++){
				for(int j = 0 ; j < arr.length - 1 - i; j++){
					if(arr[j] < arr[j+1]){
//						int temp = arr[j];
//						arr[j] = arr[j + 1];
//						arr[j + 1] = temp;
						
						//swap(arr,j,j+1);
						
						swap(arr[j],arr[j+1]); //����������Ϊ�������е�Ԫ�أ�Ԫ��ֵ�ǻ����������ͣ�
					}
				}
			}
			
		}else{
			System.out.println("����ʽ����");
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
	//��ת
	public void reverse(int[] arr){
		for(int i = 0,j = arr.length - 1; i < arr.length / 2; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	//����
	public int[] copy(int[] arr){
		int[] c = new int[arr.length];
		for(int i = 0 ; i < arr.length; i++){
			c[i] = arr[i];
		}
		return c;
	}
	
	//����
	public void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
}
