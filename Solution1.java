//在一组整数数组中找到两个数相加等于给定值，返回这两个数的下标
import java.util.Arrays;
public class Solution1{
	public static int[] twoSum(int[] array,int k){
		int sum=0;
		int[] a=new int[2];
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				sum=array[i]+array[j];
				if(sum==k){
					a[0]=i;
					a[1]=j;
				
				}
			}
		}
		return a;
	}
	public static void main(String[] args){
		int[] arr={2,4,5,6,7};
		int d=9;
		System.out.println(Arrays.toString(twoSum(arr,d)));
		
	}
	
}