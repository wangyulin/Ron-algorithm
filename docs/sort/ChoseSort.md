#选择排序算法
	
    选择排序算法在排序算法里面来说也是逻辑比较简单的排序算法。
    
###选择排序原理
也很好理解，一下以使用按从小到大的顺序为例来说明：

* n个记录的数据，可以进行n-1趟选择排序的遍历便可得到有序结果。
* 在初始状态下，无序区域R[1...n],有序区域为空[]
* 第一趟遍历排序，在无序区域R[1...n]中查找最小的记录R[key],得到后便将R[key]和无序区域第一个元素交换，这样R[1...1]和R[2...n]分别为有序区域和无序区域.
* 在无序区域进行第i趟遍历，查找最小元素，找到之后和无序区域第一个元素交换。
* 进行n-1趟遍历之后可得到有序区域为n，无序区域为空的结果，整个排序完成。

如下示例：

原始数据：  ［93,84,7,24,46,97,88,79,66,59］

第一轮遍历后：［7,84,93,24,46,97,88,79,66,59］

一下以此类推：

［7,24,93,84,46,97,88,79,66,59］

［7,24,46,84,93,97,88,79,66,59］

［7,24,46,59,93,97,88,79,66,84］

［7,24,46,59,66,97,88,79,93,84］

［7,24,46,59,66,79,88,97,93,84］

［7,24,46,59,66,79,84,97,93,88］

［7,24,46,59,66,79,84,88,93,97］

［7,24,46,59,66,79,84,88,93,97］

［7,24,46,59,66,79,84,88,93,97］

####选择排序算法分析

* 关键元素比较次数
  无论初始状态数据为有序还是无序，第i轮需要进行n－i次比较，因此总的比较次数为：
  	+ n(n-1)/2 ＝ O(n<sup>2</sup>)
  	
* 记录的移动次数
  初始为有序时，移动次数为0
  初始反序时，每次交换需移动三次3(n-1)
  
* 选择排序的平均时间复杂度
	-  O(n<sup>2</sup>)
