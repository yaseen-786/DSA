package com.dsa.demo;

import java.util.Iterator;

public class StackImplementation<item> implements Iterable<item> {
	private int size = 0 ;
	private item[] arr = arr = (item[]) new Object[1];
	public StackImplementation() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	private void resize(int max) {
		item[] temp;
		temp = (item[]) new Object[max];
		for(int  i=0;i<size;i++) {
			temp[i]=arr[i];
		}
		arr = temp;
		
	}
	
	public void push(item i)
	{
		if(arr.length==size)resize(2*arr.length);
		arr[size++]=i;
	}
	
	public item  pop() {
		item i = arr[--size];
		arr[size] = null;
		if(size>0  &&  size==arr.length/4)resize(arr.length/2);
		return  i;
	}

	@Override
	public Iterator<item> iterator() {
		// TODO Auto-generated method stub
		return  new  iteratorarray();
	}
	
	private class  iteratorarray   implements Iterator<item >{
		private int  i = size;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i>0;
		}

		@Override
		public item next() {
			// TODO Auto-generated method stub
			return arr[--i];
		}
		
		
		
	}

	
	

}
