package com.dsa.sortingdemo;

public class InsertionSortDemo {

	public static boolean isLess(Comparable a, Comparable b) {
		return a.compareTo(b)<0;
	}
	public static void swap(Comparable[] a,int i,int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void show(Comparable[] a) {
		for(Comparable val:a) {
			System.out.print(val);
		}
	}
	public static void sort(Comparable[] a) {
		for(int i = 1;i<a.length;i++) {
			for(int j=i;j>0 && isLess(a[j],a[j-1]);j--) {
				 {
					 System.out.println(a[j]+"<->"+a[j-1]);
					swap(a,j,j-1);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		//String[] s = {"java","is","very","cool","progrmming","zo","a"}	;
		String[]s = {"S","O","R","T","E","X","A","M","P","L","E"};
		sort(s);
		show(s);
		
		}
}
