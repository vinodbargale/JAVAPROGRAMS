package Imp_program;

import java.util.Arrays;

public class Sortedbubble {
	public static void main(String[] args) {
		int a[]= {2,8,7,6,3,5};
		System.out.println("Array before sorting:"+Arrays.toString(a));
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				
				
			}
			
		}
		
	}
	System.out.print("Array After sort:"+Arrays.toString(a));
	}

}
