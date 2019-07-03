package data_structure;


class  Node {
	int data;//used to store data
	Node nextAdd;//used to point next node same as pointer
}
class singleLinkLists {
	Node head;//created a first node(head node)
	public void insert(int data) {
		Node node=new Node();//allocating memory for node
		node.data= data; //storing data in the node
		node.nextAdd=null; //same as address in c
		if(head==null) {    
			head=node;//checking is it first node or we have to insert a new node elsewhere if condition true head is pointing to first node//
		}
		else {
			Node n=head;//creating a new node which starts from head node//
			while(n.nextAdd!=null) {//finding last node condition//
				n=n.nextAdd;//next node till condition got false and we jump out of loop//
			}
			n.nextAdd=node;//then we declare next node to be our new node//
		}
	}
	public void show() {//method to show the nodes//
		Node node = head;//getting output from head
		while(node.nextAdd!=null) {
			System.out.println(node.data);//till null is not found
			node= node.nextAdd;
		}
		System.out.println(node.data);//printing null node
	}
	public void insertAtStart(int data) {//inserting element at start i.e changing the head node
		Node node =new Node();
		node.data=data;
		node.nextAdd=null;
		node.nextAdd=head;//previous head will be the next node 
		head=node;//current node will be head
	}
	public void insertAt(int index,int data ) {//use to insert at specific location
		Node node=new Node();
		node.data=data;
		node.nextAdd=null;
		if(index==0) {
			insertAtStart(data);
		}
		else {
		 Node n=head;//use this code to goto the specific location -1
		 for(int i=0;i<index-1;i++) {
			 n=n.nextAdd;
		 }
		 node.nextAdd=n.nextAdd;//new node location will be next address
		 n.nextAdd=node;
	}
	}
	public void deleteAt(int index) {//use to delete
		if(index==0) {
			head=head.nextAdd;//if index is o then new head will be next to head
		}
		else {
			Node n=head;
			Node n1= null;
			for(int i=0;i<index-1;i++) {//line 48
				n=n.nextAdd;
			}
			n1=n.nextAdd;//marking index node as n1  
			n.nextAdd=n1.nextAdd;//replacing address of next of deleted("spandan") node with n node address
			n1=null;//nullifying n1 node
			System.out.println("Spandan sparsh");
		}
	}
}
public class linked_lists {

	public static void main(String[] args) {
		singleLinkLists list=new singleLinkLists();
		list.insert(23);
		list.insert(3);
		list.insert(2);
		list.insert(7);
		list.insertAtStart(25);
		list.show();
		list.insertAt(2, 14);
		list.deleteAt(3);
		list.show();
	}

}
