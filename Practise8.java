//依次遍历原链表中的每个结点，头插到新链表中
class Node{
	int val;
	Node next;
}
public class Practise8{
public static Node reverseList(Node head){
	Node newList=null;
	Node cur=head; 
	while(cur!=null){
		//因为一会儿cur.next会变化，所以提前保存它的值
		Node next=cur.next; 
		//头插
		cur.next=newList;
		newList=cur;
		//让cur往后遍历
		cur=next;
	}
	return newList;
}

}