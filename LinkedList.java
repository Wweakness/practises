class Node{
	public int value;//保存结点中的数据
	public Node next;//指向下一结点的引用
	
	public Node(int value){
		this.value=value;
		this.next=null;
	}
	
}
public class LinkedList{
	public static void displayLinkedList(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){//遍历链表
			System.out.printf("(%d)-->",cur.value);
		}
		System.out.printf("null");
	}
	public static Node createdLinkList(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		return n1;
		
		
	}
	//头插
public static Node pushFront(Node head,int value){
	//申请新结点
	Node newNode=new Node(value);//申请一个结点
	//更新newNode的next
	newNode.next=head;
	//更新head
	//head=newNode;//做了没问题，但实际没有产生任何影响，通常不做
	return newNode;
}
//尾插
public static Node pushBack(Node head,int value){//重点
	//对空链表尾插
	if(head==null){
		return pushFront(head,value);
	}
	//对非空链表尾插
	else{
		//申请新结点，并且让next=null
		Node newNode=new Node(value);
		//找到当前的最后一个结点
		Node last=getLast(head);
		//让当前最后一个结点的next=newNode
		last.next=newNode;
		return head;
		
	}
}
public static Node getLast(Node head){
	Node cur=head;
	while(cur!=null){
		cur=cur.next;
	}
	return cur;
}
//头删
public static Node popFront(Node head){
	if(head==null){
		System.out.println("参数不合法，无法删除空链表的结点");
		return null;
	}else{
		return head.next;
		
	}
}
public static Node popBack(Node head){
	if(head==null){
		System.out.println("参数不合法，无法删除空链表的结点");
		return null;
	}
	if(head.next==null){
		//链表只有一个结点
		//视为头删解决
		//释放最后一个结点又GC负责
		return null;
	}else{
		//找倒数第二个结点
		Node lastLast=getLastLast(head);
		//让倒数第二个结点的next=null
		lastLast.next=null;
		//释放最后一个结点又GC负责
		return head;
	}
}
private static Node getLastLast(Node head){
	Node node=head;
	while(node.next.next!=null){
		node=node.next;
	}
	return node;
}

public static void main(String[] args){
	Node head=createdLinkList();
	displayLinkedList(head);
	head=pushFront(head,100);
	displayLinkedList(head);
	head=pushBack(head,666);
	displayLinkedList(head);
	
	head=null;
	displayLinkedList(head);
	head=pushBack(head,1);
	head=pushBack(head,2);
	head=pushBack(head,3);
	
	head=pushBack(head,4);
	head=pushBack(head,5);
	displayLinkedList(head);
	
	head=popFront(head);
	head=popFront(head);
	head=popFront(head);
	displayLinkedList(head);//4--->5
	head=popBack(head);
	displayLinkedList(head);//4--->null
	head=popBack(head);
	displayLinkedList(head);//null
	
	
	
	
	}
}