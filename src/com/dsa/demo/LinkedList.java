package com.dsa.demo;

public class LinkedList<T> {
	public Node head;
	 class Node{
		 T data;
		 Node nextnode;
		public Node(T data) {
			super();
			this.data = data;
		}
		
		
		
		
	}
	 /*       ************************ Inserting in  LinkedList **********************          */
	public LinkedList<T> insert(LinkedList<T> list,T data) {
		Node node = new Node(data);
		if(list.head==null) {
			
			list.head = node;
		}
		else {
			Node last = list.head;
			while(last.nextnode!=null) {
				last = last.nextnode;
			}
			last.nextnode = node;
		}
		return list;
	}
	/*       ************************ Inserting At Begining of LinkedList **********************          */
	public LinkedList<T> insertatBegining(LinkedList<T> list,T data){
		Node node = new Node(data);
		if(list.head==null) {
			
			list.head = node;
		}
		else {
			node.nextnode = list.head;
			list.head = node;
		}
		return list;
	}
	
		/*       ************************ Transversing LinkedList **********************          */
	public void printLinkedList(LinkedList<T> list) {
		if(list.head==null) {
			System.out.println("Linked List Empty Add elements into it");
		}
		else {
				Node n = list.head;
				int count = 0;
			while(n!=null) {
				System.out.println("Node->"+count +"->"+n.data);
				count ++;
				n = n.nextnode;
			}
		}
	}
	/*       ************************ Size Of LinkedList **********************          */
	public int sizeOfLinkedList(LinkedList<T> list) {
		Node n = list.head;
		int count = 0;
	while(n!=null) {
		//System.out.println("Node->"+count +"->"+n.data);
		count ++;
		n = n.nextnode;
	}
	return count;
	}
	/*       ************************ Inserting Value At a Particular index in a LinkedList **********************          */
	public LinkedList<T> insertValueAtIndex(LinkedList<T> list,int index,T data){
		if(index==0) insertatBegining(list, data);
		if(index==list.sizeOfLinkedList(list)) insert(list, data);
		if(index>0 && index<list.sizeOfLinkedList(list)) {
			Node indexnode = new Node(data);
			Node n = list.head;
			Node currentnode = null;
			Node previousnode = null;
			int count = 0;
			while(n!=null) {
				System.out.println("Node->"+count +"->"+n.data);
				if(count==index) {
					currentnode = n;
				}
				if(count==index-1) {
					previousnode = n;
				}
				count ++;
				n = n.nextnode;
			}
			previousnode.nextnode=indexnode;
			indexnode.nextnode = currentnode;
			
		}
		return list;
		
	}
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		//list.printLinkedList(list);
		list.insert(list, 1);
		list.insert(list, 4);
		list.insert(list, 8);
		//list.printLinkedList(list);
		list.insertatBegining(list, 5);
		//list.printLinkedList(list);
		list.insertValueAtIndex(list, 2, 6);
		list.printLinkedList(list);
	}
}
