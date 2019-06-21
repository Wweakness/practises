//数组中去掉最大和最小值，求平均值
public class Practise2{
	public static double average(int[] array){
		int max=array[0];
		//找最大值
		for(int item : array ){//遍历数组
			if(item>max)
				max=item;
		}
		//找最小值
		int min=array[0];
		for(int item : array ){
			if(item<min)
				min=item;
		}
		//去数组求和
		int sum=0;
		for(int item : array ){
			sum=sum+item;
		}
		return (double)(sum-max-min)/(array.length-2);//数组长度直接用array.length表述
	}
	public static void main(String[] args){
		int[] array={1,2,3,5,6};
		double c=average(array);
		System.out.printf("平均分是%4f%n",c);
	}
}

	
		