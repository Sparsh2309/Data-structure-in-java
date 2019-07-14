package data_structure;
class Node
{
int data;
Node left;
Node right;
}
class DoubleLL
{
	Node head;
	public void insert(int data) 
	{
		Node node=new Node();
		node.data=data;
		node.left=null;
		node.right=null;
		if(head==null) 
		{
			head=node;
		}
		else 
		{
			Node n=head;
			while(n.right!=null) 
			{
				n=n.right;
			}
			n.right=node;
			node.left=n;
		}
	}
	public void show() 
	{
		Node node = head;//getting output from head
		while(node.right!=null) 
		{
			System.out.println(node.data);//till null is not found
			node= node.right;
	    }
		System.out.println(node.data);//printing null node
	}	
	public void insertAtStart(int data) {//inserting element at start i.e changing the head node
		Node node =new Node();
		node.data=data;
		node.left=null;
		node.right=head;//previous head will be the next node 
		head.left=node;
		head=node;//current node will be head
	}
	public void count() 
	{
		Node node=head;
		int count=0;
		while(node.right!=null)
		{
			count++;
			node=node.right;
		}
		count=count + 1;
		System.out.println("Number of nodes are: "+count);
	}
	public void insertAt(int index,int data ) {//use to insert at specific location
		Node node=new Node();
		node.data=data;
		node.right=null;
		node.left=null;
		if(index==0) {
			insertAtStart(data);
		}
		else {
		 Node n=head;//use this code to goto the specific location -1
		 for(int i=0;i<index-1;i++) {
			 n=n.right;
		 }
		 node.right=n.right;//new node location will be next address
		 n.right=node;
		 node.left=n;
	}
	}
	public void deleteAt(int index) {//use to delete
		if(index==0) {
			head=head.right;//if index is 0 then new head will be next to head
		}
		else {
			Node n=head;
			Node n1= null;
			
			for(int i=0;i<index-1;i++) {//line 48
				n=n.right;
			}
			n1=n.right;//marking index node as n1  
			n.right=n1.right;//replacing address of next of deleted("spandan") node with n node address
			n1=n1.right;
			n1.left=n;//nullifying n1 node
			System.out.println("Spandan sparsh");
		}
	}
	
}
public class DLL {

	public static void main(String[] args) {
		DoubleLL list=new DoubleLL();//test code
		list.insert(23);
		list.insert(3);
		list.insert(2);
		list.insert(72);
		list.count();
		list.show();
		list.insertAtStart(33);
		list.show();
		list.count();
		list.insertAt(2, 12);
		list.show();
		list.deleteAt(2);
		list.show();

	}
}