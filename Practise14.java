//找到x结点 大于x的放x后面，小于x的放前面//有错，找错
class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
}
class Solution{
	public 	Node partition(Node head,int x){
		Node small=null;
		Node big=null;
		Node last1=null;
		Node last2=null;
		//cur=cur.next的目的是让cur指向cur原来的下一个结点
		for(Node cur=head;cur!=null;cur=cur.next){
			if(cur.val<x){
					if(small==null){
						small=cur;
					}
					else{
						last1.next=cur;
					}
					last1=cur;
				}
				
			
			else{
					if(big==null){
						big=cur;
					}
					else{
						last2.next=cur;
					}
					last2=cur;
				}
			
		}
		
		if(small==null){
			return big;
		}
		else{
			small.next=big;
		
		}
		return small;
	}

}
public class Practise14{
	
}