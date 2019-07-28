public class Practise25{
	public static void bubbleSort(int[] array){
		for(int i=0;i<array.length;i++){
			//需要经过array.length次冒泡
			//所谓冒泡过程
			//在无序区间内，经过两两比较，把最大的数冒泡至最后
			boolean isSwapped = false;
			//无序：[0,array.length-i)
			//有序：[array.length-i,array.length)
			//进行冒泡过程，遍历整个无序区间
			for(int j=0;j<array.length-i;j++){
				//冒泡过程中，保证大的数在后边
				if(array[j]>array[j+1]){
					swap(array,j,j+1);
					isSwapped=true;
				}
			}
			//如果一次完整的冒泡过程中一次交换都没有发生
			//表明数组已有序，所以排序完成
			if(!isSwapped){
				return;
			}
		}
	}
	public static void swap(int[] array,int a, int b){
		int t=array[a];
		array[a]=array[b];
		array[b]=t;
	}
}