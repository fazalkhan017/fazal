package com.practice;

public class Minclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int min=Integer.MIN_VALUE;
			int n =24;
			int[] array = {14,65,21,34};
			for(int i =0;i<array.length;i++) {
				if(array[i]<n&&array[i]>min) {
					min=array[i];
				}
			}
			if(min==Integer.MIN_VALUE) {
				System.out.println(false);
			}
			else {
				System.out.println(min);
			}
	}

}
