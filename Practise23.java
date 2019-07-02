//找倒数第k个结点，方法二：双引用遍历
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}
public class Practise23{
	public ListNode istNodeFindKthToTai2(ListNode head,int k){
		ListNode front=head;
		ListNode back=head;
		for(int i=0;i<=k;i++){
			if(front==null){
				return null;
			}
			front=front.next;
		}
		while(front!=null){
			front=front.next;
			back=back.next;
		}
		return back;
	}
}