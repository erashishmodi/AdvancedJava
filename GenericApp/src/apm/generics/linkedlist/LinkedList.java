package apm.generics.linkedlist;

public class LinkedList {
	public static void main(String argss[])
	{
		Node <String> node1=new Node<String>("Ashish");
		Node <String> node2=new Node<String>("Bhautik");
		Node <String> node3=new Node<String>("Bhavesh");
		Node <String> node4=new Node<String>("Jayesh");
		Node <String> node5=new Node<String>("Rudra");
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
		Node<String> dummy;
		dummy=node1;
		while(!(dummy.next==null))
		{
			dummy=dummy.next;
			System.out.println(dummy.getData());
		}
		
		
		
	}

}
