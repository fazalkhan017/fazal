package com.practice;

public class NearestValue {
//	Given a number n, find the closest number to n in an array.
	public static void main(String[] args) {
		int n=500;
		int closest =Integer.MAX_VALUE;
		int[] a = {1,45,677,584};
		for(int i =0;i<a.length;i++) {
			if(a[i]>n&&a[i]<closest) {
				closest =a[i];
			}
		}
		
		if(closest==Integer.MAX_VALUE) {
			System.out.println("false");
		}
		else {
			System.out.println(closest);
		}
	}

}
