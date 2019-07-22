public class Practise{
	public static int max(int[] array){
		int maxValue=array[0];
		for(int item : array){
			if(item>maxValue){
			maxValue=item;
			}
			
		}
		return maxValue;
	}
	
	public static void main(String[] args){
		int[]array={1,2,3,4,5};
		int maxValue=max(array);
	    System.out.println("最大值是"+maxValue);
	}
}
