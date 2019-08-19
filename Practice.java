//用循环和递归调用两种方法求阶乘


public class Practice{
	public static long factorial1(int n){
		if(n==0||n==1){
			return 1;
		}
		return factorial1(n-1)*n;
	}
	public static long factorial2(int n){
		long fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args){
		int n=12;
		//通过递归
		long fact1 = factorial1(n);
		//通过循环
		long fact2 = factorial2(n);
		System.out.printf("阶乘是%d%n",fact1);
		System.out.printf("阶乘是%d%n",fact2);
	}
	
	
}