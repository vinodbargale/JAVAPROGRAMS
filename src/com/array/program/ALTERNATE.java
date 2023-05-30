package com.array.program;

public class ALTERNATE {
	public static void main(String[] args) {
	int [] a= {1,3,5,7,11,13,17,23,29};

	for(int i=a.length-1;i>=0;i--) {
		
		
		if(i==0) {
			System.out.println(a[i]);
		}
		else {
			System.out.println(a[i]);
			i--;
		}
	}
	 
	
	
}
}