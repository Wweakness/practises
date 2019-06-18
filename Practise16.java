//复制复杂链表（含有random）
class Node{
	int val;
	Node next;
	Node random;
	Node(int val){
		this.val = val;
	}
}
public class Practise16{
	public Node CopyS (Node head){
		//1、复制链表 把新结点插到老结点后面
		Node cur=head;
		while(cur!=null){
			//复制新结点
			Node node=new Node(cur.val);
			//把新结点node插入到老结点cur的后面
			node.next=cur;
			cur.next=node;
		    cur=cur.next.next;//或cur=node.next
		}
		//2、random的复制
		cur=head;
		while(cur!=null){
			if(cur.random!=null){
				cur.next.random=cur.random.next;
			}else{
				cur.next.random=null;
			}
			cur=cur.next.next;
		}
		//3、拆分新旧链表
		cur=head;
		Node newHead=head.next;
		while(cur!=null){
			Node node=head.next;
			cur.next=node.next;
			if(cur.next!=null){
			node.next=cur.next.next;
			}
			cur=cur.next;
		}
		return newHead;
	}
}