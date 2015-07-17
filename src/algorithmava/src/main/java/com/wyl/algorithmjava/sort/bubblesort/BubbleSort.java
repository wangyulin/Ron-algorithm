/**   
* @Title: BubbleSort.java 
* @Package com.wyl.algorithmjava.sort.bubblesort 
* @Description: TODO
* @author Ron Wang<jieyebing@gmail.com>  
* @date Jul 17, 2015 11:11:56 PM 
* @version V1.0   
*/
package com.wyl.algorithmjava.sort.bubblesort;

/**   
 * @Title: BubbleSort.java 
 * @Package com.wyl.algorithmjava.sort.bubblesort 
 * @Description: 冒泡排序,优化过的冒泡排序算法
 * @author Ron Wang<jieyebing@gmail.com>  
 * @date Jul 17, 2015 11:11:56 PM 
 * @version V1.0   
 */

public class BubbleSort {

    public static void main(String[] args) {
		
	    int [] original = {93,84,7,24,46,97,88,79,66,59};//{93,84,7,24,46,97,88,79,66,59} {1,2,3,4,5,6,7,8,9,10}
		int count = 0;
		
		boolean flag = false;
		for(int i = 0 ; i<original.length ; i++) {
			flag = false;
			for(int j = 0; j < original.length - (i+1) ; j++) {
				if(original[j] > original[j+1]) {
					int temp = original[j];
					original[j] = original[j+1];
					original[j+1] = temp;
					flag = true;
				}
				count ++;
			}
			if(flag == false){
				break;
			}
		}
		System.out.println(count);
		for(int i = 0 ; i<original.length ; i++) {
			System.out.println(original[i]);
		}
		
	}
}
