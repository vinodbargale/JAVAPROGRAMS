package Fibonaci;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int a[]= {20,12,10,13,17,15};
		
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]<a[j+1]) {
				
				int temp =a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		
	}
		}System.out.println("Array after sorting:"+Arrays.toString(a));
	
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	



}}