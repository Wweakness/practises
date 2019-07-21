//二分查找
public class Practise3{
	public static int binarySearch(int[] array,int key){
        int left=0;
        int right=array.length-1;
        int mid=(left+right)/2;
		while(left<=right){
		if(key<array[mid]){
			right=mid-1;
		}
		else if(key>array[mid]){
		    left=mid+1;
		}
		else {
		    key=array[mid];
			return mid;
		}
		}
		return -1;
	}
	
	
	public static void main(String[] args){
		int[] array={2,3,4,5,6,7,8};
		int c=binarySearch(array,3);
		System.out.printf("3的坐标是%d",c);
	}
}
	