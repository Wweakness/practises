//找倒数第k个结点
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
		
	}
	
}
public class Practise20{
	public  ListNode istNodeFindKthToTail(ListNode head,int k){
		int a=0;
		ListNode cur=head;
		while(cur!=null){
			cur=cur.next;
			a++;
		}
		if(a<k){
			return null;
		}
		else{
			int n=a-k;
			ListNode kth=head;
			for(int i=0;i<n;i++){
				kth=kth.next;
			}
			return kth;
		}
	}
}