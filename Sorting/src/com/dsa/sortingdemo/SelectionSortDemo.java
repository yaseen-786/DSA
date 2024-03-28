package com.dsa.sortingdemo;

public class SelectionSortDemo {
	

		
	public static boolean isLess(Comparable a, Comparable b){
		return a.compareTo(b)<0;
	}
	public static void swap(Comparable[] a,int i,int j) {
		Comparable T = a[i];
		a[i] = a[j];
		a[j] = T;
	}
	public static void sort(Comparable a[]) {
		for(int i=0;i<a.length;i++) {
			int min = i;
			
			for(int j = i+1 ;j<a.length;j++) {
				if(isLess(a[j],a[min])) min = j;
			}
			swap(a,i,min);
		}
	}
	public static void show(Comparable a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	

	public static void main(String[] args) {
	//String[] s = {"java","is","very","cool","progrmming","zo","a"}	;
	String[]s = {"S","O","R","T","E","X","A","M","P","L","E"};
	sort(s);
	show(s);
	
	}
}
