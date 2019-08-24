//求链表中间结点 
class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class Practise13{
	public static Node middleNode(Node head){
		//遍历求链表长度
		int length=0;
		for(Node cur=head;cur!=null;cur=cur.next){
			length++;
		}
		//找到中间结点
		Node node=head;
		for(int i=0;i<length/2;i++){
			node=node.next;
		}
		return node;
		
	}
	public static Node creat(){
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		Node f=new Node(6);
		Node g=new Node(7);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		return a;
	}
	public static void main(String[] args){
		Node cc=creat();
		System.out.println(middleNode(cc).val);
	}
}
