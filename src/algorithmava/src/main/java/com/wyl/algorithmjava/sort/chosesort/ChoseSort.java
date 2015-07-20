package com.wyl.algorithmjava.sort.chosesort;

/**   
 * @Title: ChoseSort.java 
 * @Package com.wyl.algorithmjava.sort.chosesort 
 * @Description: 选择排序逻辑简易代码
 * @author Ron Wang<jieyebing@gmail.com>  
 * @date Jul 20, 2015 3:25:04 PM 
 * @version V1.0   
 */

public class ChoseSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//从小到大排序
		int [] original = {93,84,7,24,46,97,88,79,66,59};
		
		for(int i = 0; i < original.length; i ++) {
			int minIndex = i;
			for(int j=i+1 ;j < original.length ; j++) {
				if(original[j] < original[minIndex]) {
					minIndex = j;
				}
			}
			int temp = original[i];
			original[i] = original[minIndex];
			original[minIndex] = temp;
		}
		
		for(int e=0;e<original.length;e++) {
			System.out.print(original[e] + ",");
		}
		System.out.println();

	}

}
