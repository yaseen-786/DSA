package com.dsa.demo;

import java.util.Arrays;

public class BinarySearch {
	public static int rank(int key, int[] a)
	 { // Array must be sorted.
	 int lo = 0;
	 int hi = a.length - 1;
	 while (lo <= hi)
	 { // Key is in a[lo..hi] or not present.
	 int mid = lo + (hi - lo) / 2;
	 System.out.println(mid);
	 if (key < a[mid]) {hi = mid - 1; System.out.println(hi);}
	 else if (key > a[mid]) {lo = mid + 1;System.out.println(lo);}
	 else return mid;
	 }
	 return -1;
	 }
	 public static void main(String[] args)
	 {
	 int[] arr = new int[]{10, 11, 12, 16 ,18, 23, 29, 33 ,48 ,54, 57, 68, 77, 84, 98};
	 Arrays.sort(arr);
	 int i = rank(23, arr);
	 if ( i< 0) System.out.println("key not found");
	 else System.out.println("Key found at index "+i);
	 
	 }
	 }
		
