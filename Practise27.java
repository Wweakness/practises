//将一组数组奇书放在偶数前面，无需关心变化后的数据是否有序
public class Practise27{
	public static void main(String[] args){
		int[] array={1,2,3,4,5,6,7,8,9};
		Change(array);
		print(array);
	}
	public static void Change(int[] arr){
		if(arr==null||arr.length<=1){
			return;
		}
		int a=arr.length-1;
		int temp;
		for(int i=0;i<arr.length;i++){
			//找到奇数
			if(arr[i]%2!=0){
				continue;
			}
			for(;a>=0;a--){
				if(i>=a){
					return;
				}
				//找到偶数
				if(arr[a]%2==0){
					continue;
				}
				temp=arr[i];
		arr[i]=arr[a];
		arr[a]=temp;
		break;
			}
	    
		}
		
	}
	public static void print(int[] array){
		if(array==null||array.length==0){
			return;
		}
		StringBuilder stringBuffer=new StringBuilder();
		for(int i=0;i<array.length;i++){
			stringBuffer.append(array[i]);
			if(i!=array.length-1){
				stringBuffer.append(",");
			}
		}
		System.out.println(stringBuffer.toString());
	}
}
