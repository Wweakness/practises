//把一个链表分成 比k小的放k前面，比k大的放k后面
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Practise30{
	public static Node cut(Node head,int k){
		Node cur=head;
		Node small=null;
		Node slast=null;
		Node big=null;
		Node blast=null;
		while(cur!=null){
			cur=cur.next;
			if(cur.val<=k){
				if(small==null){
					small=cur;
				}else{
					slast.next=cur;
					slast=cur;
				}
				
			}else{
				if(big==null){
					big=cur;
				}else{
					blast.next=cur;
					blast=cur;
				}
			}
			
		}
		if(small==null){
			return big;
		}
		else if(big==null){
			return small;
		}
		else{
			small.next=big;
			big.next=null;
			return small;
		}
	}
	private static Node createOrderList(){
		Node n1=new Node(3);
		Node n2=new Node(5);
		Node n3=new Node(1);
		Node n4=new Node(1);
		Node n5=new Node(2);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		return n1;
	}
	public static void main(String[] args){
		Node rhead=createOrderList();
		Node c=cut(rhead,2);
		for(Node a=c;a!=null;a=a.next){
			System.out.println(a);
		}
	}
		
}